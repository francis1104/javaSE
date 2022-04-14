package com.itheima.entry;

import com.itheima.controller.StudentController;

import java.util.Scanner;

public class InfoManagerEntry {
    public static void main(String[] args) {
        StudentController controller = new StudentController();
        while (true) {
            System.out.println("=====黑马信息管理系统=====");
            System.out.println("1.学生管理");
            System.out.println("2.老师管理");
            System.out.println("3.退出");

            Scanner sc = new Scanner(System.in);

            String option = sc.next();

            switch (option) {
                case "1":
                    controller.start();
                    break;
                case "2":
                    System.out.println("xs....");
                    break;
                case "3":
                    System.exit(0);
                    break;
                default:
                    System.out.println("您的输入有误");


            }
        }

    }
}
