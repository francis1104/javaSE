package com.itheima.接口.接口新特性03.默认方法;

public interface Inter {
    void method();
    public default void show(){
        System.out.println("我是接口中的默认方法");
    }
}

class InterImpl1 implements Inter{

    @Override
    public void method() {
        System.out.println("InterImpl1...method");
    }
}