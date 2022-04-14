package com.itheima.controller;

import com.itheima.domain.Student;
import com.itheima.service.StudentService;

import java.util.Scanner;

public class StudentController {
    private Scanner sc = new Scanner(System.in);
    private StudentService service = new StudentService();

    //二级菜单
    public void start() {
        while (true) {
            System.out.println("===欢迎进入学生管理===");
            System.out.println("1.添加学生");
            System.out.println("2.查看学生");
            System.out.println("3.删除学生");
            System.out.println("4.修改学生");
            System.out.println("5.退出");

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
                    System.out.println("退出....");
                    return;
                default:
                    System.out.println("您的输入有误");
            }
        }


    }

    //修改学生方法
    private void updateStudent() {
        Student[] allStus = isNull();
        //如果数组为空,直接结束方法
        if (allStus == null) return;
        //从用户获取一个id存在的,新的学生对象
        Student newStu = getStudent(false);
        //指挥业务员把对象放进数组
        service.updateStudent(newStu);
        System.out.println("修改成功");


    }

    //删除对象的方法
    private void deleteStudent() {
        //获取需要删除的用户id
        System.out.println("请输入您要删除的Id");
        String id = sc.next();
        //进行二次确认
        System.out.println("确定要删除id为:" + id + "的学生吗? Y(确认)/N(取消)");
        String option = sc.next();
        //如果输入的是大写Y,进入删除逻辑
        if ("Y".equals(option)) {
            //指挥业务员删除
            boolean res = service.deleteStudent(id);
            System.out.println(res ? "删除成功" : "删除失败");
        } else {
            System.out.println("操作已取消..");
        }
    }

    //查看所有学生的方法
    private void findAllStudent() {
        Student[] allStus = isNull();
        //如果数组为空,直接结束方法
        if (allStus == null) return;
        //有数据打印表头
        System.out.println("ID\t姓名\t年龄\t生日");
        for (int i = 0; i < allStus.length; i++) {
            //遍历数组打印每一个元素
            Student stu = allStus[i];
            //跳过空的地方
            if (stu != null) {
                System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getBirthday());
            }
        }
    }

    //判断数组是否是空,是的话返回bull,不是则返回数组 的方法
    private Student[] isNull() {
        //把数组传上来
        Student[] allStus = service.findAllStudent();
        //假设数组没东西
        int index = -1;
        for (int i = 0; i < allStus.length; i++) {
            //数组中有对象记录索引位置
            if (allStus[i] != null) {
                index = i;
            }
        }
        //数组没数据 传null回去
        if (index == -1) {
            System.out.println("数据暂无,添加后再试..");
            return null;
        }
        return allStus;
    }

    //添加学生的方法
    private void addStudent() {
        //获取一个id不存在的对象
        Student stu = getStudent(true);
        //指挥业务员添加对象到数组
        boolean res = service.addStudent(stu);
        System.out.println(res ? "添加成功" : "添加失败");
    }

    //通过flag获取一个id存在或者不存在的对象 的方法
    private Student getStudent(boolean flag) {
        String id;

        while (true) {
            System.out.println("请输入学生id");
            id = sc.next();
            boolean exists = service.isExists(id);
            if (exists == flag) {
                System.out.println("学号不可用");
            } else {
                break;
            }
        }

        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        String age = sc.next();
        System.out.println("请输入学生生日");
        String birthday = sc.next();

        return new Student(id, name, age, birthday);
    }
}
