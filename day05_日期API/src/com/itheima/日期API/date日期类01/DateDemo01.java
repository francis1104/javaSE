package com.itheima.日期API.date日期类01;

import java.util.Date;
/*
    Date的入门: Java提供的用来操作日期时间的类!
        1. 关于程序世界中时间的基础概念:
            a. 在编程行业中,时间原点: 1970年1月1日0时0分0秒   -- 因为这一天是C语言诞生.为了纪念
            b. 1秒 == 1000 毫秒
            c. 我们中国所处的位置是东八区, 和世界标准时间 (原子钟时间) 有8个小时的时差!

        2. Date对象的创建
            a. 无参构造: new Date():   表示当前日期(当前系统时间!)
            b. 带参构造: new Date(long time): 是在时间原点基础上,加上指定的毫秒值,计算得出的一个新的日期!
 */
public class DateDemo01 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        //时间原点前一小时
        Date d1 = new Date(-3600L*1000);
        System.out.println(d1);

    }
}
