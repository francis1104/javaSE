package com.itheima.day15多线程.题目一;

public class MyThread extends Thread{
    public void run(){
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName()+"输出:"+i);

        }
    }
}
