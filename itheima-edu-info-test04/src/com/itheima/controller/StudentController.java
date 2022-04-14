package com.itheima.controller;

import com.itheima.domain.Student;
import com.itheima.service.StudentService;
import com.itheima.util.AgeUtil;

import java.util.Scanner;

public class StudentController {
    private Scanner sc = new Scanner(System.in);
    private StudentService service = new StudentService();


    public void start() {

        while (true) {
            System.out.println("----学生管理----");
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
                    return;
                default:
                    System.out.println("您的输入有误..");
                    break;
            }

        }


    }

    private void updateStudent() {

        boolean res = service.isEmpty();
        if (res){

            System.out.println("暂无数据,添加后再试");

        }else {
            Student stu = getStudent(true);

            service.updateStudent(stu);

            System.out.println("修改成功");
        }


    }

    private void deleteStudent() {
        System.out.println("请输入要删除的学生ID");

        String delId = sc.next();

        System.out.println("确定要删除ID为"+delId+"的学生吗? Y(确定)/N(取消)");

        String option = sc.next();

        if ("y".equalsIgnoreCase(option)){

            boolean res = service.deleteStudent(delId);

            System.out.println(res ? "删除成功" : "删除失败");

        }else {
            System.out.println("已取消...");
        }


    }

    private void findAllStudent() {
        Student[] allStu = service.findAllStudent();

        boolean res = service.isEmpty();

        if (res) {
            System.out.println("暂无数据,请添加后再试");

        } else {
            System.out.println("ID  姓名  年龄  生日");

            for (Student student : allStu) {
                if (student == null) {
                    continue;
                }
                System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getBirthday());
            }
        }
    }

    private void addStudent() {
        Student stu = getStudent(false);

        boolean res = service.addStudent(stu);

        System.out.println(res ? "添加成功" : "添加失败");


    }

    private Student getStudent(boolean flag) {
        String id;
        while (true) {
            System.out.println("请输入学生id");
            id = sc.next();

            boolean res = service.isExist(id);

            if (res == flag) {
                break;
            }else {
                System.out.println("您的输入有误");
            }
        }


        System.out.println("请输入学生姓名");
        String name = sc.next();
//        System.out.println("请输入学生年龄");
//        String age = sc.next();
        System.out.println("请输入学生生日");
        String birthday = sc.next();

        String age = AgeUtil.getAge(birthday);

        return new Student(id, name, age, birthday);
    }
}
