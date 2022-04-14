package com.itheima.接口.接口入门01;

public interface Swim {
    public abstract void swim();
}

class Person implements Swim{

    @Override
    public void swim() {
        System.out.println("人学会了仰泳");
    }
}

class Dog implements Swim{

    @Override
    public void swim() {
        System.out.println("狗学会了狗刨");
    }
}