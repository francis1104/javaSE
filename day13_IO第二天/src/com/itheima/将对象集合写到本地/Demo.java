package com.itheima.将对象集合写到本地;

import java.io.*;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day13_IO第二天/d2.txt"));

        Student s1 = new Student("heima001","zhangsan","23","1991-11-11");
        Student s2 = new Student("heima002","lisi","24","1995-11-11");
        Student s3 = new Student("heima003","wangwu","25","1994-11-11");

        ArrayList<Student> list = new ArrayList<>();

        list.add(s1);
        list.add(s2);
        list.add(s3);

        oos.writeObject(list);

        oos.close();


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day13_IO第二天/d2.txt"));

        ArrayList<Student> list2 = (ArrayList<Student>) ois.readObject();

        for (Student stu : list2) {
            System.out.println(stu);
        }

        ois.close();
    }
}
