package com.itheima.day05API.第二题;

import java.math.BigDecimal;

/*现获取到用户填写的3个年龄信息，但格式是以逗号分隔的字符串形式，例如："23,24,25"（直接定义字符串给出即可）。现需要求出这三个年龄的平均年龄，请编写程序实现，并将结果打印到控制台。
运行结果：*/
public class Demo {
    public static void main(String[] args) {
        String[] split = "23,24,25".split(",");

        BigDecimal bd1 = new BigDecimal(split[0]);
        BigDecimal bd2 = new BigDecimal(split[1]);
        BigDecimal bd3 = new BigDecimal(split[2]);

        BigDecimal sum = bd1.add(bd2).add(bd3);

        int length = split.length;
        BigDecimal bd4 = new BigDecimal(length + "");

        BigDecimal avg = sum.divide(bd4);
        System.out.println("avg = " + avg);

    }
}
