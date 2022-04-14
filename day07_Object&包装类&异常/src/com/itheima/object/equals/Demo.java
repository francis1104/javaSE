package com.itheima.object.equals;

public class Demo {
    public static void main(String[] args) {
        Student stu = new Student("张三",23);
        Student stu2 = new Student("张三",24);

        System.out.println(stu.equals(stu2));
    }
}
