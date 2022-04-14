package com.itheima.Lambda.Lambda练习03.当接口的抽象方法有返回值02;
/*
    当接口的抽象方法有返回值,Lambda的大括号中要return该类型的数据!
 */
public class Demo {
    public static void main(String[] args) {
        Inter i = new Inter() {
            @Override
            public String method() {
                return "111";
            }
        };


        Inter i1 = () -> "111";


        System.out.println(i.method());
        System.out.println(i1.method());


    }
}

interface Inter{
    String method();
}
