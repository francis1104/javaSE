package com.itheima.多态的三种表现形式.接口多态03;
/*
    多态:
        面向对象三大特征之一. 描述的是事物的多种形态!
    多态的前提条件:
        1. 要有继承/实现关系!
        2. 要有方法的重写!
        3. 要有 父类引用指向子类对象! /  接口引用指向实现类对象!

    接口多态: 左边定义接口类型, 右边创建实现类对象, 接口引用指向实现类对象!
              实现类必须要重写接口中的所有抽象方法!
 */
public interface Swim {
    void swim();
}

class Dog implements Swim{

    @Override
    public void swim() {
        System.out.println("狗狗学会了蛙泳");
    }
}

class Demo {
    public static void main(String[] args) {
        Swim s = new Dog();
        s.swim();
    }
}