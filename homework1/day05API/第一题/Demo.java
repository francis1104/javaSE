package com.itheima.day05API.第一题;

import java.math.BigDecimal;

/*现获取到两个字符串格式的数字：字符串23和字符串24。请编写程序，计算两个数字的和，并输出在控制台。
运行结果*/
public class Demo {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("23");
        BigDecimal bd2 = new BigDecimal("24");
        System.out.println(bd1.add(bd2));

    }
}
