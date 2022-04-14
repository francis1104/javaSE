package com.itheima.多态语法下的成员访问特点02;

/*
    多态语法下成员的访问特点:
        1. 成员变量: 编译看左边(父类), 运行也看左边(父类)
        2. 成员方法: 编译看左边(父类), 运行看右边(子类)
 */
public class Demo {
    public static void main(String[] args) {
        Animal d = new Dog();
        System.out.println(d.a);//10
        d.eat();//dog....eat....
    }
}

class Animal {
    public int a = 10;

    public void eat() {
        System.out.println("eat....");
    }
}

class Dog extends Animal {
    public int a = 200;

    @Override
    public void eat() {
        System.out.println("dog....eat....");
    }
}