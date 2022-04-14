package com.itheima.多态的三种表现形式.抽象类多态02;

/*抽象类多态:父类是个抽象类,子类必须要重写父类的抽象方法进行重写.*/
public class Demo {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.eat();
    }
}

abstract class Animal {
    public abstract void eat();
}

class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("狗吃骨头🦴");
    }
}