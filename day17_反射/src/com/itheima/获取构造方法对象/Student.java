package com.itheima.获取构造方法对象;

public class Student {
    //私有的有参构造方法
    private Student(String name) {
        System.out.println("name的值为:" + name);
        System.out.println("private...Student...有参构造方法");
    }
    //公共的无参构造方法
    public Student() {
        System.out.println("public...Student...无参构造方法");
    }

    //公共的有参构造方法
    public Student(String name, int age) {
        System.out.println("name的值为:" + name + "age的值为:" + age);
        System.out.println("public...Student...有参构造方法");
    }

    public void show(){
        System.out.println("过时了...");
    }
}