package com.itheima.内部类01.匿名内部类03.匿名内部类三种玩法02.匿名内部类作为抽象类子类对象使用02;

/*
    匿名内部作为抽象类子类对象使用:
        匿名内部充当抽象父类的子类对象!
        也就是new关键字后面跟的类是一个抽象类!
 */
public class Demo {
    public static void main(String[] args) {

        //需求2: 创建一个Animal的子类(Cat类)对象,并调用子类对象的eat方法!
        //匿名内部类玩法
        //第一步: JVM根据匿名内部类格式编译生成Animal的子类.class
        //第二步: JVM根据new关键字创建子类对象
        //多态: 父类引用, 接收子类对象!
        Animal cat = new Animal(){

            @Override
            public void eat() {
                System.out.println("cat eat...");
            }
        };

        cat.eat();


    }
}
