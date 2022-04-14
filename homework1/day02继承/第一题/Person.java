package com.itheima.day02继承.第一题;

public class Person {
    private String name; // 姓名
    private int age; // 年龄
    private String birthday; // 生日

    public Person() {
    }

    public Person(String name, int age, String birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    // 获取信息的方法
    public String getInfo() {
        return "Person[name=" + name + ", age=" + age + ", birthday=" + birthday + "]";
    }
    /*
    getters and setters请自行生成
    */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
