package com.itheima.day00.面向对象;
/*定义类Human，具有name、age、sex属性和speak、run、getInfo功能；定义其子类Man、Woman；
在主类Test中分别创建子类、父类和上转型对象，并测试其特性。*/
public class Demo01 {
    public static void main(String[] args) {
        Human h1 = new Man("zhagnsan",23,"nan");
        Human h2 = new Woman("lisi",24,"nv");

        System.out.println(h1.getInfo());
        System.out.println(h2.getInfo());

        h1.speak();
        h2.run();



    }
}

class Man extends Human{


    @Override
    public void speak() {
        System.out.println("man...speak...");
    }

    @Override
    public void run() {
        System.out.println("man...run...");
    }

    public Man() {
    }

    public Man(String name, int age, String sex) {
        super(name, age, sex);
    }
}


class Woman extends Human{


    @Override
    public void speak() {
        System.out.println("woman...speak...");
    }

    @Override
    public void run() {
        System.out.println("woman...run...");
    }

    public Woman() {
    }

    public Woman(String name, int age, String sex) {
        super(name, age, sex);
    }
}


abstract class Human{
    private String name;
    private int age;
    private String sex;


    public abstract void speak();
    public abstract void run();


    public String getInfo() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Human() {
    }

    public Human(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}