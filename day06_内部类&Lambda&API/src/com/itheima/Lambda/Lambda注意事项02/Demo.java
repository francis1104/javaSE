package com.itheima.Lambda.Lambda注意事项02;
/*
    Lambda的注意事项
        1. 使用前提
            a. 必须存在一个接口
            b. 接口中必须有且仅有一个抽象方法
                tips: java中如果一个接口有且仅有一个抽象方法,这类接口就称之为: 函数式接口!
                      函数式接口,可以通过@FunctionalInterface用来校验

        2. 不能脱离上下文环境:
            Lambda表达式不能独立存在,必须让JVM知道Lambda是为哪个接口服务的!
 */
public class Demo {
    public static void main(String[] args) {
        Inter inter = new Inter() {
            @Override
            public void method(String msg) {
                System.out.println("收到:"+msg);
            }
        };


        inter.method("匿名内部类,马上吃饭!");

        //当接口的抽象方法有参数,那么Lambda小括号中也有定义相应个数参数

    }
}


@FunctionalInterface
interface Inter{
    void method(String msg);
}