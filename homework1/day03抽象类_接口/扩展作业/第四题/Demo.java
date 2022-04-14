package com.itheima.day03抽象类_接口.扩展作业.第四题;

/*1.请定义“员工(类)”：
        属性：姓名、性别、年龄(全部私有)
        行为：工作(抽象)
        无参、全参构造方法
        get/set方法
    2.请定义“绘画(接口)”
        抽象方法：绘画
    3.请定义“Java讲师类”继承自“员工类”
    4.请定义”UI讲师类”，继承自“员工类”，并实现“绘画”接口。

3.2 要求
	请按上述要求设计出类结构，并实现相关的方法，并进行调用测试*/
public class Demo {
    public static void main(String[] args) {
        JavaTeacher jt = new JavaTeacher("张三", "男", 23);
        UITeacher ut = new UITeacher("李四", "女", 24);
        ut.paint();
    }
}

interface Painting {
    void paint();
}

class UITeacher extends Worker implements Painting {

    public UITeacher() {
    }

    public UITeacher(String name, String sex, int age) {
        super(name, sex, age);
    }

    @Override
    public void paint() {
        System.out.println("UI讲师画画...");
    }
}

class JavaTeacher extends Worker {
    public JavaTeacher() {
    }

    public JavaTeacher(String name, String sex, int age) {
        super(name, sex, age);
    }
}

class Worker {
    private String name;
    private String sex;
    private int age;

    public Worker() {
    }

    public Worker(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}