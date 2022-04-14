package com.itheima.runnable;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"线程开启了"+i);
        }
    }
}
