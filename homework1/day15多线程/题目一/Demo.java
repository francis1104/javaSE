package com.itheima.day15多线程.题目一;
/*请使用继承Thread类的方式实现多线程。要求开启两条线程，
每条线程执行的任务都是将1-100的数据打印一遍，并且在控制台可以看出是哪条线程打印的数据。*/
public class Demo {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        mt1.start();
        mt2.start();


    }
}
