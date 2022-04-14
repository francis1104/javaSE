package com.itheima.日期API.date日期类01;

import java.util.Date;

/*
    Date类的常用方法:
        1. getTime(): 获取当前日期对象对应的毫秒值【重点掌握】
        2. setTime(): 重置当前日期对象距离时间原点的毫秒值
 */
public class DateDemo02 {
    public static void main(String[] args) {
        Date d = new Date();

        //getTime():获取当前对象距离时间原点过了多少毫秒
        long time = d.getTime();
        System.out.println(time);
        //重置当前日期对象距离时间原点的毫秒值
        d.setTime(0);
        System.out.println(time);


    }
}
