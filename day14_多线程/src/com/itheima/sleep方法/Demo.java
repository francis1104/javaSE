package com.itheima.sleep方法;

public class Demo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr);
        t1.start();
    }
}
