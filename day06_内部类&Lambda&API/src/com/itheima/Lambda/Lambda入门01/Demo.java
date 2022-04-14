package com.itheima.Lambda.Lambda入门01;
/*
    Lambda入门
        1. 介绍: lambda表达式语法起源于匿名内部类,基于函数式编程思想
        2. 格式: ()->{}
                a. () 和接口中的抽象方法的()保持一致!
                b. -> 是固定格式,维持lambda风格!
                c. {} 写的是对接口中抽象方法的重写逻辑!
        3. 本质: 充当接口的实现类对象!

        函数式编程思想: 核心关注要做什么? 一切与核心无关的内容都尽可能简化!
                        追求的是格式的极致简洁!
 */
public class Demo {
    public static void main(String[] args) {
        //匿名内部类

        method(new Swim(){
            @Override
            public void swim() {
                System.out.println("游泳");
            }
        });

        //Lambda表达式
        method(()-> System.out.println("游泳..."));

    }


    public static void method(Swim s){

        s.swim();
    }

}

interface Swim{

    void swim();
}
