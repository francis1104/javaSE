package com.itheima.接口.接口组成02;

public interface Swim {
    public static final int NUM = 10;//默认公共静态常量
    public abstract void swim();
}

class Dog implements Swim{

    @Override
    public void swim() {
        System.out.println("狗学会了蛙泳");
    }
}