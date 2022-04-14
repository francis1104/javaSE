package com.itheima.反射操作成员变量;

public class Student {
    public String name;
    public int age;
    protected boolean gender;
    private int money = 300;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", money=" + money +
                '}';
    }
}
