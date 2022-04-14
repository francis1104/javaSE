package com.itheima.flush和close区别;

import java.io.FileWriter;
import java.io.IOException;

/*
    方法功能:
        flush()刷新流。刷新完毕之后，还可以继续写数据
        close()先刷新,再关闭流。释放资源。一旦关闭，就不能写数据,关闭之前先刷新
    应用场景:
        flush: 当对数据通信的实时性要求较高时.
        close: 当对数据通信的实时性要求不高时.
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day13_IO第二天/a.txt");

        fw.write("黑马程序员");
        fw.flush();

        fw.write("97");
        fw.flush();

        fw.close();
    }
}
