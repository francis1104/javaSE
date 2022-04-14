package com.itheima.Lambda.Lambda练习03.当接口方法既有参数又有返回值03;

/*
    当接口的抽象方法既有参数又有返回值
        lambda表达式的小括号中就需要同步的定义参数,
        大括号中就需要return指定类型的数据!
 */
public class Demo {
    public static void main(String[] args) {
        Inter res = (int a, int b) -> { return a + b; };

        System.out.println(res.add(10, 20));


    }
}

interface Inter {
    int add(int a, int b);
}