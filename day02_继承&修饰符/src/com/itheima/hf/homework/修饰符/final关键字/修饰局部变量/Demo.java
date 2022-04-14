package com.itheima.hf.homework.修饰符.final关键字.修饰局部变量;
/*
    被final修饰的变量: 只能赋值一次! 一旦赋值后,其值不能发生改变!    -- 自定义常量!
    自定义常量命名规范:
        1. 如果名称由一个单词组成,那么所有字母全大写!
        2. 如果名称由多个单词组成,那么单词与单词之间使用_下划线连接!
    被final修饰的变量:
        a. 如果是基本数据类型: 变量所记录的具体数据值不能发生改变!
        b. 如果是引用数据类型: 变量所记录的地址值不能发生改变!
 */
public class Demo {
    public static void main(String[] args) {
        final int AGE = 18;
        System.out.println("AGE = " + AGE);

        final Student STU = new Student();
        STU.setName("柳岩");
        STU.setName("李四");
        System.out.println(STU.getName());
    }
}
