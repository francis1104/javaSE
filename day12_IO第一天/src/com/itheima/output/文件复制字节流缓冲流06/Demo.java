package com.itheima.output.文件复制字节流缓冲流06;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        method04();
        long end = System.currentTimeMillis();

        System.out.println("耗时" + (end - start));
    }

    //利用普通字节流,一次读取一个字节  3MB 耗时6982
    private static void method01() throws IOException {

        //创建输入输出流对象
        FileInputStream fis = new FileInputStream("/Users/francis/Desktop/截屏/Spider-Man.png");
        FileOutputStream fos = new FileOutputStream("day12_IO第一天/a.png");
        //定义临时变量,充当传输载体
        int b;

        //循环读写
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }

        //关流,释放资源
        fis.close();
        fos.close();
    }

    //利用普通字节流,一次读取一个字节数组  3MB 耗时14
    private static void method02() throws IOException {
        //创建输入输出流对象
        FileInputStream fis = new FileInputStream("/Users/francis/Desktop/截屏/Spider-Man.png");
        FileOutputStream fos = new FileOutputStream("day12_IO第一天/a.png");
        //定义临时变量,充当传输载体
        byte[] bytes = new byte[1024];//未来读写的数据都会装在数组中
        int len;                      //维护每次读取到的有效字节个数

        //循环读写
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        //关流,释放资源
        fis.close();
        fos.close();
    }

    //利用缓冲字节流,一次读取一个字节  3MB 耗时129
    private static void method03() throws IOException {
        //创建输入输出流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/francis/Desktop/截屏/Spider-Man.png"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day12_IO第一天/a.png"));

        //定义临时变量,充当传输载体
        int b;

        //循环读写
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }

        //关流,释放资源
        bis.close();
        bos.close();
    }

    //利用缓冲字节流一次读写一个字节数组方式拷贝文件  3MB 耗时9
    private static void method04() throws IOException {
        //创建输入输出流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/francis/Desktop/截屏/Spider-Man.png"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day12_IO第一天/a.png"));
        //定义临时变量,充当传输载体
        byte[] bytes = new byte[1024];//未来读写的数据都会装在数组中
        int len;                      //维护每次读取到的有效字节个数

        //循环读写
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }

        //关流,释放资源
        bis.close();
        bos.close();
    }
}
