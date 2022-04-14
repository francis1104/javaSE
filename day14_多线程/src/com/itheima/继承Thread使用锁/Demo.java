package com.itheima.继承Thread使用锁;

public class Demo {
    public static void main(String[] args) {
        Ticket t1 = new Ticket();
        Ticket t2 = new Ticket();

        t1.setName("窗口一");
        t2.setName("窗口二");

        t1.start();
        t2.start();
    }
}
