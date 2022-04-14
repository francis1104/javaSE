package com.itheima.file.案例.案例一;

import java.io.File;

//进入文件夹,获取这个文件夹里面所有的文件和文件夹的File对象,并把这些File对象都放在一个数组中返回.
//包括隐藏文件和隐藏文件夹都可以获取.
public class Demo {
    public static void main(String[] args) {
        File file = new File("/Users/francis/IdeaProjects/java_se");
        File[] files = file.listFiles();
        //注意事项:
        //1.当调用者是一个文件时             -- 返回null
        //2,当调用者是一个空文件夹时        -- 返回长度为0的数组
        //3.当调用者是一个有内容的文件夹时
        //4.当调用者是一个有权限才能进入的文件夹时  -- 返回null
        if (files != null) {
            for (File file1 : files) {
                System.out.println(file1);
            }
        }
        System.out.println(files.length);
    }
}
