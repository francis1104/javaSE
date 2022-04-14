package com.itheima.API.math;

public class Demo {
    public static void main(String[] args) {
        //需求1: 求-3.14的绝对值并打印
        System.out.println(Math.abs(-3.14));
        //需求2: 求5.21向上取整后的结果并打印
        System.out.println(Math.ceil(5.21));
        //需求3: 求6.99向下取值后的结果并打印
        System.out.println(Math.floor(6.99));
        //需求4: 求5.49四舍五入后的结果并打印
        System.out.println(Math.round(5.49));
        //需求5: 求3的4次方结果并打印
        System.out.println(Math.pow(3,4));
        //需求6: 求(10,20)两个数中的较大值并打印
        System.out.println(Math.max(10, 20));
        //需求7: 求(10,20)两个数中的较小值并打印
        System.out.println(Math.min(10, 20));
        //需求8: 使用Math的随机数方法生成一个 [1,100] 之间的随机正整数并打印
        int num = (int)(Math.random()*100+1);
        System.out.println("num = " + num);
    }
}
