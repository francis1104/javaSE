package com.itheima.接口.接口入门01;
/*
    接口入门01:
        1. 定义接口: interface 接口名
        2. 使用接口:
               a. 先定义实现类 implements 接口
               b. 重写接口中的抽象方法
               c. 创建实现类对象使用!
       3. 作用: 用来定义后天行为规范! 是对类的行为的扩展!
 */
public class Demo {
    public static void main(String[] args) {
        Person pr = new Person();
        pr.swim();
        Dog dog = new Dog();
        dog.swim();
    }
}
