package com.itheima.controller;

import com.itheima.domain.Student;
import com.itheima.service.StudentService;
import com.itheima.util.AgeUtil;

import java.util.Scanner;

public class StudentController {
    private Scanner sc = new Scanner(System.in);
    //业务员对象
    private StudentService service = new StudentService();

    public void start() {
        while (true) {
            //二级菜单
            System.out.println("-----学生管理-----");
            System.out.println("1.添加学生");
            System.out.println("2.查询学生");
            System.out.println("3.删除学生");
            System.out.println("4.修改学生");
            System.out.println("5.退出..");

            String option = sc.next();
            switch (option) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    findAllStudent();
                    break;
                case "3":
                    deleteStudent();
                    break;
                case "4":
                    updateStudent();
                    break;
                case "5":
                    System.out.println("退出");
                    return;
                default:
                    System.out.println("您的输入有误..");
            }
        }


    }

    private void updateStudent() {
        //指挥业务员获取数组
        Student[] stus = service.findAllStudent();
        //判断数组是否为空,空则结束方法
        if (stus == null) {
            System.out.println("暂无数据请稍后查询");
            return;
        }
        //获取一个id存在的对象
        Student stu = getStudent(false);

        service.updateStudent(stu);

    }

    private void deleteStudent() {

        System.out.println("请输入要删除的id");
        String delid = sc.next();
        //二次确认
        System.out.println("确定吗?? Y(确定)/N(取消)");
        String option = sc.next();
        if ("y".equalsIgnoreCase(option)){

            boolean res = service.deleteStudent(delid);
            System.out.println(res?"删除成功":"删除失败");
        }else {
            System.out.println("已取消....");
        }

    }

    //客服查询所有学生方法
    private void findAllStudent() {
        //指挥业务员获取数组
        Student[] stus = service.findAllStudent();
        //判断数组是否为空,空则结束方法
        if (stus == null) {
            System.out.println("暂无数据请稍后查询");
            return;
        }
        System.out.println("id\t姓名\t年龄\t生日");
        for (int i = 0; i < stus.length; i++) {
            if (stus[i] != null) {
                Student stu = stus[i];
                System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getBirthday());
            }
        }
    }

    //客服添加学生的方法
    private void addStudent() {
        Student stu = getStudent(true);

        //指挥业务员把学生对象给库管添加
        //并返回一个布尔值看成没成功
        boolean res = service.addStudent(stu);
        System.out.println(res ? "添加成功!" : "添加失败!");
    }

    private Student getStudent(boolean flag) {
        String id;
        while (true) {
            //接受学生信息
            System.out.println("请输入学生id");
            id = sc.next();

            //判断学号是否存在,存在返回true,不存在返回false
            boolean res = service.isExist(id);
            if (res == flag) {

                break;
            } else {

                System.out.println("学号不可用");
            }

        }
        System.out.println("请输入学生姓名");
        String name = sc.next();
//        System.out.println("请输入学生年龄");
//        String age = sc.next();
        System.out.println("请输入学生生日");
        String birthday = sc.next();

        String age = AgeUtil.getAge(birthday);


        //封装成对象
        return new Student(id, name, age, birthday);
    }


}
