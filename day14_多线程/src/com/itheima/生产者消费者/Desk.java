package com.itheima.生产者消费者;
//临界资源
public class Desk {
    //状态:
    //false表示没数据
    //true表示有数据
    public static boolean flag = false;

    //总量
    public static int count = 30;
}
