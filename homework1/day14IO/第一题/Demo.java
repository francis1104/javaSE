package com.itheima.day14IO.第一题;

import java.io.FileWriter;
import java.io.IOException;

/*现获取到一段文本，如下：
String str = "流是一组有顺序的，有起点和终点的字节集合，是对数据传输的总称或抽象。即数据在两设备间的传输称为流，
                流的本质是数据传输，根据数据传输特性将流抽象为各种类，方便更直观的进行数据操作。";

需要将其保存到“D:\\IO流概念.txt”文件中，请编写程序实现（使用平台默认编码即可）。*/
public class Demo {
    public static void main(String[] args) throws IOException {
        String str = "流是一组有顺序的，有起点和终点的字节集合，是对数据传输的总称或抽象。即数据在两设备间的传输称为流， " +
                "流的本质是数据传输，根据数据传输特性将流抽象为各种类，方便更直观的进行数据操作。";

        FileWriter fw = new FileWriter("homework/IO流概念.txt");

        fw.write(str);

        fw.close();


    }
}
