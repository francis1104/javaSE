package com.itheima.异常.案例;

import java.util.Scanner;

// 键盘录入学生的姓名和年龄,其中年龄为 18 - 25岁,
// 超出这个范围是异常数据不能赋值.需要重新录入,一直录到正确为止。
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        System.out.println("请输入姓名:");
        String name = sc.next();
        stu.setName(name);


        while (true) {
            try {
                System.out.println("请输入年龄:");
                String age = sc.next();
                int ageInt = Integer.parseInt(age);
                stu.setAge(ageInt);
                break;

            } catch (NumberFormatException e) {
                System.out.println("请输入一个整数");
            } catch (RuntimeException  e) {
                System.out.println("请输入一个符合范围的年龄");
            }
        }

        System.out.println(stu.toString());
    }
}
