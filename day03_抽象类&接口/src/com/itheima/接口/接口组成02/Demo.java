package com.itheima.接口.接口组成02;
/*
    接口的组成(成员特点):
        1. 成员变量:  都是公共的静态常量!
                 默认情况下,JVM会在数据类型前面补充:  public static final. 你缺啥,JVM补啥

        2. 成员方法: jdk8以前, 接口中的成员方法都是公共抽象方法!
                默认JVM会补齐:  public abstract

        3. 构造方法: 接口没有构造!
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(Swim.NUM);

        Dog d = new Dog();
        d.swim();
    }
}
