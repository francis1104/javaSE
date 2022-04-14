package com.itheima.myarrays;
//  int [] arr = {66, 44, 55, 22, 33};
//需求1: 将数组arr内容打印到控制台
//需求2: 对数组arr进行排序
//需求3: 将排序后的数组arr内容打印到控制台
//需求4: 求 22 在排序后的数组中的索引位置,基于二分查找实现

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {66, 44, 55, 22, 33};

        System.out.println(Arrays.toString(arr));

        //排序
        Arrays.sort(arr);

        //展示数组元素
        System.out.println(Arrays.toString(arr));

        //二分查找元素
        System.out.println(Arrays.binarySearch(arr, 22));

        //复制数组
        int[] arr2 = Arrays.copyOf(arr, 7);

        System.out.println(Arrays.toString(arr2));


    }
}
