package com.itheima.runnable;

public class Demo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr);
        t1.setName("柳岩----------");
        t1.start();

        Thread t2 = new Thread(mr);
        t2.setName("杨幂");
        t2.start();


    }
}
