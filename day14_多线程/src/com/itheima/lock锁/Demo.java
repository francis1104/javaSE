package com.itheima.lock锁;

public class Demo {
    public static void main(String[] args) {
        Ticket t1 = new Ticket();

        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t1);
        Thread th3 = new Thread(t1);


        th1.setName("窗口一");
        th2.setName("窗口二");
        th3.setName("窗口三");

        th1.start();
        th2.start();
        th3.start();


    }
}
