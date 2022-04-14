package com.itheima.entry;

import com.itheima.controller.StudentController;

import java.util.Scanner;

public class InfoManageEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentController controller = new StudentController();
        while (true) {
            System.out.println("======黑马信息管理系统======");
            System.out.println("1.管理学生");
            System.out.println("2.管理老师");
            System.out.println("3.退出");

            String option = sc.next();
            switch (option) {
                case "1":
                    controller.start();
                    break;
                case "2":
                    System.out.println("管理老师....");
                    break;
                case "3":
                    System.out.println("退出..");
                    System.exit(0);
                default:
                    System.out.println("您的输入有误");

            }
        }

    }
}
