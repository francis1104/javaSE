package com.itheima.day17反射.第二题;

public class Student {
    private String name;
    private int age;

    public Student() {
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 自行补充getters and setters

    // 显示信息的方法
    public void showInfo() {
        System.out.println(name + " - " + age);
    }
}