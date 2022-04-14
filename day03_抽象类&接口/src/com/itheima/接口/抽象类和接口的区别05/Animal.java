package com.itheima.接口.抽象类和接口的区别05;
/*
    接口和抽象类的区别:
        1. 语法层面
            a. 成员变量: 抽象类既可以有普通成员变量也可以有静态常量
                         接口中的成员变量只能定义成静态常量
            b. 成员方法: 抽象类既可以定义普通方法也可以定义抽象方法
                         接口中的成员方法都是抽象方法,jdk8以后推出了默认方法,静态方法,jdk9推出了私有方法
            c. 构造方法: 抽象类有构造! 接口没有构造!
        2. 设计层面
              抽象类是作为父类设计(理解为亲爹)!都是对子类先天共性行为的描述!类和类之间是单继承的特点!
              接口是作为后天行为规范设计(理解为老师)! 是对类的后天行为的补充约束!由不同的实现类给出不同的实现!
              类和接口之间是多实现的关系! 并且接口和接口之间是多继承的关系!
 */
public abstract class Animal {
    private int age;//抽象类的普通成员变量
    public static final int NUM = 1;//也可以有静态常量


    public void drink(){//抽象类的普通成员方法
        System.out.println("drink");
    }

    public abstract void eat();//抽象方法

    public Animal() {//抽象类有构造方法
    }

    public Animal(int age) {
        this.age = age;
    }


}

interface Swim{
    public static final int NUM = 1;//接口公共静态常量

    public abstract void Swim();//接口抽象方法
}

interface Jump{
    void jump();
}

class Dog extends Animal implements Swim,Jump{

    @Override
    public void eat() {

    }

    @Override
    public void Swim() {

    }

    @Override
    public void jump() {

    }
}

