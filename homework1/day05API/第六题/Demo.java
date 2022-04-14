package com.itheima.day05API.第六题;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

/*某共公司产品经理要求App需要有3款主题样式，用户选择不同的主题，展示时间的格式也要有不同的风格，请编写代码实现该功能。
    运行结果：
    请选择主题：1.xxxx年xx月xx日，2.xxxx-xx-xx，3.xxxx/xx/xx
    1
    主题切换成功,当前时间为：2018年12月10日

    请选择主题：1.xxxx年xx月xx日，2.xxxx-xx-xx，3.xxxx/xx/xx
    4
    很抱歉，操作有误，已为您切换默认主题
    主题切换成功,当前时间为：2018年12月10日*/
public class Demo {
    public static void main(String[] args) {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd");
        Date d1 = new Date();
        String s1 = sdf1.format(d1);
        String s2 = sdf2.format(d1);
        String s3 = sdf3.format(d1);


        System.out.println("请选择主题：1.xxxx年xx月xx日，2.xxxx-xx-xx，3.xxxx/xx/xx");
        Scanner sc = new Scanner(System.in);
        String option = sc.next();

        switch (option){
            case "1":
                System.out.println("主题切换成功,当前时间为："+s1);
                break;
            case "2":
                System.out.println("主题切换成功,当前时间为："+s2);
                break;
            case "3":
                System.out.println("主题切换成功,当前时间为："+s3);
                break;
            default:
                System.out.println("很抱歉，操作有误，已为您切换默认主题");
                System.out.println("主题切换成功,当前时间为："+s1);
                break;
        }

    }
}
