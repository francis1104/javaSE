package com.itheima.day08集合.第五题;

import sun.jvm.hotspot.runtime.StubRoutines;

import java.util.ArrayList;
import java.util.Collections;

/*为方便管理，现需要将班级中学员的信息（学号、姓名、年龄）存储起来。
请使用所学集合知识将信息遍历打印。请使用foreach语句完成集合的遍历，效果如下：
姓名：吕布，学号：001，年龄：18
姓名：赵云，学号：002，年龄：19
姓名：典韦，学号：003，年龄：20
...*/
public class Demo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("吕布", "001", "18");
        Student s2 = new Student("赵云", "002", "19");
        Student s3 = new Student("典韦", "003", "20");

        Collections.addAll(list, s1, s2, s3);

        list.forEach(s -> System.out.println(s.toString()));


    }
}

class Student {
    private String name;
    private String id;
    private String age;

    public Student() {
    }

    public Student(String name, String id, String age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名：" + name + "，学号：" + id + "，年龄：" + age;
    }
}