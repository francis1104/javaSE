package com.itheima.异常;

public class Demo02 {
    public static void main(String[] args) {
        int[] arr = null;

        printArr(arr);


        System.out.println("998行代码...");
    }

    private static void printArr(int[] arr) {
        if (arr == null){
            //当参数为null时,手动创建一个异常对象,抛给了调用者
            throw new NullPointerException();

        }else {

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

        }

    }
}
