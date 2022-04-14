package com.itheima.thread;

public class Demo {
    public static void main(String[] args) {
        //创建线程对象
        MyThread t1 = new MyThread();
        t1.setName("柳岩");

        MyThread t2 = new MyThread();
        t2.setName("杨幂");

        //开启线程
        t1.start();
        t2.start();

    }
}
