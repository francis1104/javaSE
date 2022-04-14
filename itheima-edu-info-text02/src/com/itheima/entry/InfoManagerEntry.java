package com.itheima.entry;

import com.itheima.controller.StudentController;

import java.util.Scanner;

public class InfoManagerEntry {
    public static void main(String[] args) {
        StudentController controller = new StudentController();
        while (true){
            //一级菜单
            System.out.println("-----黑马信息管理系统-----");
            System.out.println("1.管理学生");
            System.out.println("2.管理老师");
            System.out.println("3.退出");

            Scanner sc = new Scanner(System.in);
            String option = sc.next();

            switch (option) {
                case "1":
                    controller.start();
                    break;
                case "2":
                    System.out.println("管理老师..");
                    break;
                case "3":
                    System.out.println("感谢使用..");
                    //结束虚拟机
                    System.exit(0);
                default:
                    System.out.println("您的输入有误,请重新输入");

            }
        }
    }
}
