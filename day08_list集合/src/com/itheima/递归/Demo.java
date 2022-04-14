package com.itheima.递归;

/*
    递归: 方法自己调用自己
    递归的核心:
        1. 一定要有出口
        2. 要找准规律!       -- 每次调方法,都会让参数向出口靠近!
    注意: 递归不能太深,一定要出去.
 */
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
