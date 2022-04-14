package com.itheima.抽象类02.抽象类细节02;

public abstract class Animal {
    public abstract void eat();
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头---");
    }
}

abstract class Dragon extends Animal{

}