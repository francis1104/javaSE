package com.itheima.file.判断和删除;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        //1. 判断当前模块下是否有abc文件夹,如果没有,则先创建
        File f1 = new File("day11_stream流&File/abc");
        if (!f1.exists()){
            f1.mkdirs();
        }

        //2. 在abc文件夹内,创建一个hello.java文件

        File f2 = new File(f1,"hello.java");
        f2.createNewFile();

        //3. 判断hello.java是否是文件
        System.out.println(f2.isFile());

        //4. 判断abc是否是文件夹
        System.out.println(f1.isDirectory());

        //5. 将hello.java这个文件的名字获取到并打印
        System.out.println(f2.getName());

        //6. 将hello.java这个文件删除
        f2.delete();

        //7. 将abc这个文件夹删除
        f1.delete();

    }
}
