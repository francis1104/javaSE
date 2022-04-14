package com.itheima.接口.接口新特性03.默认方法;

/*
    接口的新特性:
        1. 默认方法: 使用default修饰, 有方法体的方法!
           作用: 解决接口功能升级问题!
 */
public class Demo {
    public static void main(String[] args) {
        InterImpl1 impl1 = new InterImpl1();
        impl1.method();
        impl1.show();
    }
}
