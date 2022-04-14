package com.itheima.day12IO.第三题;

import java.io.*;

/*在文件的读写操作中，可以自定义一个字节数组作为缓冲区，来提高读写的效率。而java也提供了内置缓冲区的缓冲流可以高效的一次读取很多字节。
请使用缓冲流完成如下需求：将"D:\\itcast\\mn.jpg"图片文件（也可以是其他图片文件）拷贝到当前模块目录下。*/
public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/francis/Desktop/截屏/whatif.png"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("homework/whatif.png"));

        int b;

        while ((b = bis.read()) != -1){
            bos.write(b);
        }

        bis.close();
        bos.close();
    }
}
