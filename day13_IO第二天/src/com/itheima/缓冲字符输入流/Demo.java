package com.itheima.缓冲字符输入流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        //字符缓冲输入流 = 普通字符输入流+缓冲区
        BufferedReader br = new BufferedReader(new FileReader("day13_IO第二天/user.txt"));

        //读取数据
        char[] chars = new char[1024];

        int len;

        while ((len = br.read(chars)) != -1){

            System.out.println(new String(chars,0,len));

        }




        br.close();
    }
}
