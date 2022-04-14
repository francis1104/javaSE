package com.itheima.day00.递归;
//递归计算5的阶乘
public class Demo {
    public static void main(String[] args) {
        int res = getNum(5);

        System.out.println("res = " + res);
    }

    private static int getNum(int i) {
        if (i == 1) {
            return 1;
        } else {

            return i * getNum(i - 1);
        }
    }
}
