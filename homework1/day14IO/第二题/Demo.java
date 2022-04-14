package com.itheima.day14IO.第二题;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*现获取到一些人员的姓名信息，存储在ArrayList集合中，如下：
ArrayList<String> list = new ArrayList<>();
list.add("Tom");
list.add("Jerry");
list.add("Lucy");
list.add("Lily");
list.add("John");
list.add("Kevin");
请编程程序，将这些信息保存至当前模块下的name.txt文件中，每个名字占据一行的位置。*/
public class Demo {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Jerry");
        list.add("Lucy");
        list.add("Lily");
        list.add("John");
        list.add("Kevin");

        BufferedWriter bw = new BufferedWriter(new FileWriter("homework/name.txt"));

        for (String name : list) {
            bw.write(name);
            bw.newLine();
        }

        bw.close();
    }
}
