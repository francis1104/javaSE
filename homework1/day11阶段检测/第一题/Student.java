package com.itheima.day11阶段检测.第一题;

public class Student extends Person {

    private String id;

    @Override
    public void work() {
        System.out.println("xie zuo ye ...");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Student() {
    }


    public Student(String name, int age, String id) {
        super(name, age);
        this.id = id;
    }
}
