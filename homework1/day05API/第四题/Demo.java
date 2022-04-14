package com.itheima.day05API.第四题;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*请将字符串"2008-08-08"字符串，转换为日期对象，并将转换后的对象，以及毫秒值输出在控制台

       运行结果：
       Fri Aug 08 00:00:00 CST 2008
       毫秒值为：1218124800000*/
public class Demo {
    public static void main(String[] args) throws ParseException {
        String s = "2008-08-08";

        /*
           ----- 将字符串s转换为日期对象，并得到毫秒值.-----
         */

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdf.parse(s);

        System.out.println("d1 = " + d1);
        System.out.println(d1.getTime());
    }
}

