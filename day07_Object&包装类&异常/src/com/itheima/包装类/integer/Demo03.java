package com.itheima.包装类.integer;

//需求：有一个字符串：“91 27 46 38 50”，把其中的每一个数存到int类型的数组中
//步骤:
//定义一个字符串
//把字符串中的数字数据存储到一个int类型的数组中
//遍历数组输出结果
public class Demo03 {
    public static void main(String[] args) {
        String str = "91 27 46 38 50";
        //以空格切割字符串

        String[] strs = str.split(" ");
        //定义长度为strs长度的int 数组

        int[] intArr = new int[strs.length];
        //遍历数组,转换为int

        for (int i = 0; i < strs.length; i++) {
            int i1 = Integer.parseInt(strs[i]);

            intArr[i] = i1;
        }
        //遍历打印

        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }

    }
}
