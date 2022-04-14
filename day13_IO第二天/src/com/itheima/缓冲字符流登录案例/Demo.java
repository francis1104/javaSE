package com.itheima.缓冲字符流登录案例;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入用户名:");
        String username = sc.next();
        System.out.println("请输入密码:");
        String password = sc.next();

        BufferedReader bf = new BufferedReader(new FileReader("day13_IO第二天/user.txt"));

        boolean flag = false;

        String realCount;

        while ((realCount = bf.readLine()) != null) {
            if (realCount.equals(username + "=" + password)) {
                flag = true;
                break;
            }
        }



        bf.close();


        System.out.println(flag ? "登录成功" : "登录失败");


    }
}
