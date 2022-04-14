package com.itheima.API.system;

public class Demo {
    public static void main(String[] args) {
        // arraycopy(数据源数组, 起始索引, 目的地数组, 目的地数组开始放数据的索引, 拷贝个数) 数组copy
        int[] i1 = {11,22,33,44,55};
        int[] i2 = new int[10];

        System.arraycopy(i1,i1.length-2,i2,i2.length-2,2);

        for (int i = 0; i < i2.length; i++) {
            System.out.println(i2[i]);
        }

//        System.arraycopy(i1,0,i2,0,3);
//
//        for (int i = 0; i < i2.length; i++) {
//            System.out.println(i2[i]);
//        }
    }
}
