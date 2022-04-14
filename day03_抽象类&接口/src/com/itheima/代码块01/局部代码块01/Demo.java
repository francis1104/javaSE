package com.itheima.代码块01.局部代码块01;
/*
    局部代码块:
        格式: { }
        位置:  方法内, 局部位置
        作用: 限制局部变量的生命周期,提高栈内存的利用率!
 */
public class Demo {
    public static void main(String[] args) {
        {
            int a = 10;
            System.out.println(a);
        }
        System.out.println("9998行代码逻辑,用不到变量a");


    }
}
