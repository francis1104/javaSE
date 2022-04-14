package com.itheima.日期API.simpleDateFormat日期转换02;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
    SimpleDateFormat介绍:
        日期Date <---  SimpleDateFormat转换器  ---> 日期字符串String
    核心方法:
        1.  String  format(Date对象): 格式化. 将指定的日期对象,格式化转换为对应时间的日期字符串
 */
public class Demo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = sdf.format(date);
        System.out.println("str = " + str);

    }
}
