package com.itheima.多态前提条件01;
/*
    多态:
        面向对象三大特征之一. 描述的是事物的多种形态!
    多态的前提条件:
        1. 要有继承/实现关系!
        2. 要有方法的重写!
        3. 要有 父类引用指向子类对象! /  接口引用指向实现类对象!
 */
public class Demo {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Animal a = d1;
        System.out.println("a = " + a);
    }
}

class Animal{
    public void eat(){
        System.out.println("动物吃东西");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头.");
    }
}