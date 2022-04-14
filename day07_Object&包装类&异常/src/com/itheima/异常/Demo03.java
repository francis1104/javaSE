package com.itheima.异常;

public class Demo03 {
    public static void main(String[] args) {
        int[] arr = null;
        try {

            printArr(arr);
        } catch (NullPointerException e) {

            System.out.println("参数不能为null");
        }
    }

    private static void printArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }

    }
}
