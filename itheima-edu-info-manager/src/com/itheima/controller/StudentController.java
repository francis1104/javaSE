package com.itheima.controller;

import com.itheima.domain.Student;
import com.itheima.service.StudentService;
import com.itheima.util.AgeUtil;

import java.util.Scanner;

/*
    客服类核心职责:
        1. 接收用户请求
        2. 指挥业务员干活
        3. 根据业务员返回的结果数据,告诉用户结果信息
 */
public class StudentController {
    private Scanner sc = new Scanner(System.in);
    private StudentService service = new StudentService();

    //客服中的菜单功能入口
    public void start() {
        while (true) {
            //1. 展示学生管理系统二级功能菜单
            System.out.println("--------------欢迎来到学生管理系统------------");
            System.out.println("1. 添加学生");
            System.out.println("2. 删除学生");
            System.out.println("3. 修改学生");
            System.out.println("4. 查找学生");
            System.out.println("5. 退出");

            //2. 拿到用户的选项,进行系统功能路由
            String option = sc.next();

            switch (option) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    deleteStudent();
                    break;
                case "3":
                    updateStudent();
                    break;
                case "4":
                    findAllStudents();
                    break;
                case "5":
                    System.out.println("感谢使用学生管理系统,再见!");
                    return;
                default:
                    System.out.println("输入有误,请重试!");
                    break;
            }
        }
    }

    //客服类中的修改学生功能
    private void updateStudent() {
        //先判断一下系统中有没有数据,如果没有数据,则直接提示: 暂无数据,添加后重试! 有数据,才进行修改操作!
        Student[] allStudents = service.findAllStudents();
        if (allStudents == null){
            System.out.println("暂无数据,添加后重试!");
            return;
        }

        //1. 让用户录入要修改的学生信息
        System.out.println("请输入要修改的学生学号:");
        String updateId = inputStudentId(true);

        //调用inputStudentInfo方法,完成键盘录入学生信息,封装学生对象功能
        Student newStu = inputStudentInfo(updateId);

        //3. 指挥业务员进行修改业务
        service.updateStudent(updateId, newStu);

        //4. 根据业务员返回的结果来给用户一个对应的提示信息
        System.out.println("修改成功!");
    }

    //客服类中的删除学生功能
    private void deleteStudent() {
        //1. 拿到要删除的学生学号
        System.out.println("请输入要删除的学生学号:");
        String delId = sc.next();

        //因为删除是敏感操作,所以需要做一个二次确认
        System.out.println("您确定要删除学号为:"+delId+"的数据吗?  Y(确认)/N(取消)");
        String option = sc.next();
        if ("Y".equalsIgnoreCase(option)){
            //2. 指挥业务员根据学号删除对应的学生
            boolean res = service.deleteStudent(delId);

            //3. 根据业务员返回的结果来给用户一个对应的提示
            System.out.println(res ? "删除成功!" : "删除失败:请检查学号是否存在!");
        }else{
            System.out.println("已取消操作,手别抖~~");
        }
    }

    //客服类中的查看学生功能
    private void findAllStudents() {
        //1. 指挥业务员进行查询业务,拿到系统中的所有学生信息
        /*
            两种情况:
                1. 系统中还没有数据:allStudents = {null,null,null,null,null} : 期望: 业务员能处理一下,直接返回一个null给我客服
                2. 系统中有数据:allStudents = {stu,null,null,null,null}: 期望: 业务员直接返回对象数组给客服
         */
        Student[] allStudents = service.findAllStudents();

        if (allStudents == null) {
            System.out.println("系统暂无数据,请添加后重试!");
        } else {
            //有数据,则展示数据
            //先展示表头
            System.out.println("学号\t\t姓名\t年龄\t生日");
            for (int i = 0; i < allStudents.length; i++) {
                Student stu = allStudents[i];
                if (stu != null) {
                    System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t\t" + stu.getBirthday());
                }
            }
        }


    }

    //客服类中的添加学生功能
    private void addStudent() {
        //1. 让用户录入要添加的学生信息
        System.out.println("请输入要添加的学生学号:");
        String id = inputStudentId(false);

        //调用inputStudentInfo方法,完成键盘录入学生信息,封装学生对象功能
        Student stu = inputStudentInfo(id);

        //3. 指挥业务员进行添加学生的业务处理
        boolean res = service.addStudent(stu);

        //4. 根据业务员返回的结果给出相应的提示信息给用户
        System.out.println(res ? "添加成功!" : "添加失败!");
    }

    //封装一个方法: 专门来做键盘录入学生信息,封装学生对象并返回这个事
    private Student inputStudentInfo(String id){
        System.out.println("请输入学生姓名:");
        String name = sc.next();
        /*System.out.println("请输入学生年龄:");
        String age = sc.next();*/
        System.out.println("请输入学生出生日期【例如:1999-11-11】:");
        String birthday = sc.next();

        //调用年龄工具类, 根据生日自动计算年龄!
        String age = AgeUtil.getAge(birthday);

        //2. 封装新的学生对象
        Student stu = new Student(id,name,age,birthday);

        return stu;
    }

    //封装一个方法: 专门做键盘录入可用id并返回
    //boolean flag: 未来调用方法传递true,则返回一个存在的id给调用者.
    //boolean flag: 未来调用方法传递false,则返回一个不存在的id给调用者.
    private String inputStudentId(boolean flag){
        String id;
        while (true) {
            id = sc.next();
            /*
                假如: id不存在, 返回的exists是false
             */
            boolean exists = service.isExists(id);
            /*
                当且仅当exists的值和flag的值相等时,才会结束循环,返回id
             */
            if (exists == flag) {
                break;
            } else {
                System.out.println("当前学号不可用,请重新输入:");
            }
        }

        return id;
    }
}
