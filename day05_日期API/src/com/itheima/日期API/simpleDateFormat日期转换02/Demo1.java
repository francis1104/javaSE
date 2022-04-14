package com.itheima.日期API.simpleDateFormat日期转换02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    SimpleDateFormat介绍:
        日期Date <---  SimpleDateFormat转换器  ---> 日期字符串String
    核心方法:
        1.  String  format(Date对象): 格式化. 将指定的日期对象,格式化转换为对应时间的日期字符串
        2.  Date parse(日期字符串String): 解析. 将指定的日期字符串, 转为对应时间的日期Date对象
                注意: 被解析的日期字符串格式一定要和解析模板匹配!否则会解析失败!  (ParseException)
 */
public class Demo1 {
    public static void main(String[] args) throws ParseException {
        //日期字符串
        String birthday = "2000-11-11";
        //需求:将birthday解析为对应的Date对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(birthday);
        System.out.println("date = " + date);
    }
}
