package com.itheima.API.decimal;

import java.math.BigDecimal;

public class Demo {
    public static void main(String[] args) {

        BigDecimal bd1 = new BigDecimal("0.1");//传String精确,传基本数据类型可能不精确
        BigDecimal bd2 = new BigDecimal("0.2");

        BigDecimal add = bd1.add(bd2);
        System.out.println("add = " + add);

        BigDecimal subtract = bd1.subtract(bd2);
        System.out.println("subtract = " + subtract);

        BigDecimal multiply = bd1.multiply(bd2);
        System.out.println("multiply = " + multiply);

        BigDecimal divide = bd1.divide(bd2);
        System.out.println("divide = " + divide);

    }
}
