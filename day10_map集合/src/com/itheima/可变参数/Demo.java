package com.itheima.可变参数;

/*
    1. 可变参数,指的是参数的什么可以变?   -- 参数的个数可以灵活变化, 类型不能变
    2. 可变参数的本质是什么?              -- 其实就是一个数组.
    3. 使用可变参数有什么注意点?
         a. 一个方法,最多只能定义一个可变参数
         b. 如果定义可变参,可变参数必须放在方法形参的末尾.
 */
public class Demo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,};
        int sum = getSum("ABC", arr);

        System.out.println("sum = " + sum);

        System.out.println(getSum("abc", 1, 12, 3, 4, 5, 6));

    }

    private static int getSum(String abc, int... arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }

        return sum;
    }
}
