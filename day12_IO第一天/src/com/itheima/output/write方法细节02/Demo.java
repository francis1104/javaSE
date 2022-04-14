package com.itheima.output.write方法细节02;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("day12_IO第一天/a.txt");

        byte[] bys = {97,98,99};

        fos.write(bys);

        //一次写一个字节数组的一部分: 写出bys数组,从bys数组的1索引位置开始写,连着写2个字节出去
        fos.write(bys,1,2);

        //换行
        fos.write(System.lineSeparator().getBytes());//System.lineSeparator(): 返回当前操作系统对应的换行符!
        fos.write("静夜思".getBytes());//"\r\n":windows  "\r":mac  "\n":linux
//        fos.write("\n".getBytes());
        fos.write(System.lineSeparator().getBytes());//各系统通用换行,推荐使用
        fos.write("床前明月光".getBytes());
        fos.write(System.lineSeparator().getBytes());
        fos.write("疑似地上霜".getBytes());
        fos.write(System.lineSeparator().getBytes());
        fos.write("举头望明月".getBytes());
        fos.write(System.lineSeparator().getBytes());
        fos.write("低头思故乡".getBytes());


        fos.close();
    }
}
