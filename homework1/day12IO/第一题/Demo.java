package com.itheima.day12IO.第一题;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*请使用字节流，把“E:\itcast\窗里窗外.txt”文件，复制到模块目录下的“窗里窗外.txt”。*/
public class Demo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day12_IO第一天/a.txt");
        FileOutputStream fos = new FileOutputStream("homework/窗里窗外.txt");

        int b;

        while ((b = fis.read()) != -1) {
            fos.write(b);
        }

        fis.close();
        fos.close();

    }
}
