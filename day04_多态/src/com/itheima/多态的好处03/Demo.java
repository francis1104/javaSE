package com.itheima.多态的好处03;

/*
    饲养员类
        核心职责: 喂各种小动物吃饭
    发现问题:
        如果再多200种动物,对应的饲养员类中就要加200个方法.
        如果不小心挂掉100种动物,对应的饲养员类中就要减少100个方法.
        总结: 当前饲养员类的设计: 代码的维护性/拓展性/扩展性/延展性 太差!!!
    解决方案: 使用多态语法! 设计一个方法: 喂养所有动物!
    多态好处: 1.将方法的参数设计为父类型,未来调用方法时可以传递任意子类对象!
              从而提高程序: 维护性/拓展性/扩展性/延展性

            2.将方法的返回值类型设计为父类型,方法体中可以返回任意子类对象!
 */
public class Demo {
    public static void main(String[] args) {
        AnimalOperator o1 = new AnimalOperator();
        o1.useAnimal(new Dog());
        o1.useAnimal(new Cat());
        o1.useAnimal(new Monkey());
        o1.useAnimal(new Pig());
    }
}

class AnimalOperator {
    public void useAnimal(Animal a) {
        a.eat();
    }
}

abstract class Animal {
    public abstract void eat();
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃狗粮");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃小鱼");
    }
}

class Pig extends Animal {
    @Override
    public void eat() {
        System.out.println("猪吃白菜");
    }
}

class Monkey extends Animal {
    @Override
    public void eat() {
        System.out.println("猴子吃香蕉");
    }
}