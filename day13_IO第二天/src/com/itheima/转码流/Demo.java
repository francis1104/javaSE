package com.itheima.转码流;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        //创建输入输出流
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day13_IO第二天/a.txt"), "utf-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day13_IO第二天/a2.txt"),"GBK");

        //定义临时变量,充当传输载体
        char[] chars = new char[1024];

        int len;
        //循环读写
        while ((len = isr.read(chars)) != -1){
            osw.write(chars,0,len);
        }
        //关流
        isr.close();
        osw.close();
    }
}
