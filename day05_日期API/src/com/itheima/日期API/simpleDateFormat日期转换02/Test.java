package com.itheima.日期API.simpleDateFormat日期转换02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
    案例需求: 设计一个程序,键盘录入生日,计算活了多少天和多少年!
    请输入您的生日:
    2000-11-11
    您已经来阳间旅游10000天了!
    您已经22岁了!
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入生日:");
        String birthday = sc.next();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(birthday);

        long day = (new Date().getTime() - date.getTime()) / 1000 / 60 / 60 / 24;

        long year = day / 365;

        System.out.println("您已经来阳间旅游" + day + "天了!");
        System.out.println("您已经" + year + "岁了!");


    }
}
