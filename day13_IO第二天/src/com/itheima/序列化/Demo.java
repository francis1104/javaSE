package com.itheima.序列化;

import com.itheima.转码流.Student;

import java.io.*;

/*
    序列化： 将对象写到文件中过程.
    反序列化: 将文件中的对象读回内存
 */
public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        method1();
        method2();
    }


    //反序列化:将文件中的对象读回内存
    private static void method2() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day13_IO第二天/d.txt"));

        Student stu = (Student) ois.readObject();

        ois.close();

        System.out.println(stu);
    }


    //序列化:将对象写到文件
    private static void method1() throws IOException {
        Student stu = new Student("heima001","zhangsan","23","1993-11-11");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day13_IO第二天/d.txt"));

        oos.writeObject(stu);

        oos.close();
    }
}
