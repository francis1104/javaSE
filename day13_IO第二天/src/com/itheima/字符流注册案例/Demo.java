package com.itheima.字符流注册案例;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //将键盘录入的用户名和密码保存到本地实现永久化存储
        //要求：一个用户的用户名和密码用等号连接,独占一行
        System.out.println("请输入用户名:");
        String username = sc.next();
        System.out.println("请输入密码:");
        String password = sc.next();

        FileWriter fw = new FileWriter("day13_IO第二天/user.txt");

        fw.write(username+"="+password);

        fw.write(System.lineSeparator());

        fw.close();



    }
}
