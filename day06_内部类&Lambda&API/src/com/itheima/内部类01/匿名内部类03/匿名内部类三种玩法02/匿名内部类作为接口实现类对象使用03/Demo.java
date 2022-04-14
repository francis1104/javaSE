package com.itheima.内部类01.匿名内部类03.匿名内部类三种玩法02.匿名内部类作为接口实现类对象使用03;
/*
    匿名内部类作为接口实现类对象使用:
        匿名内部充当接口的实现类对象!
        也就是new关键字后面跟的是接口名!
 */
public class Demo {
    public static void main(String[] args) {
        //需求: 创建一个Swim的实现类对象,并调用实现类对象的swim方法!
        //匿名内部类玩法
        //第一步: JVM根据匿名内部类格式编译生成Swim的实现类.class
        //第二步: JVM根据new关键字创建实现类对象
        //多态: 接口引用, 接收实现类对象!
        Swim dog = new Swim(){

            @Override
            public void swim() {
                System.out.println("狗狗学会了仰泳..");
            }
        };

        dog.swim();


    }
}
