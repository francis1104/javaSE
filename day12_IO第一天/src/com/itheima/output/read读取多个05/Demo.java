package com.itheima.output.read读取多个05;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day12_IO第一天/a.txt");

        int b;//临时变量,用来记录每次到的字节数据!
        /*
            1. 先执行fis.read(), 读取一次文件数据
            2. 将读到的字节数据赋值给b
            3. 判断b记录的数据值是否不等于 -1
            注意: -1 是结束标记,读到-1表示文件中已经没有有效数据了,都被读完了.
         */
        while ((b = fis.read()) != -1){
            System.out.println((char) b);
        }

        fis.close();
    }
}
