package com.itheima.day15多线程.题目二;
/*请使用实现Runnable接口的方式实现多线程。要求开启两条线程，
每条线程执行的任务都是将1-100的数据打印一遍，并且在控制台可以看出是哪条线程打印的数据。*/
public class Demo {
    public static void main(String[] args) {
        MyRunnable mr1 = new MyRunnable();

        Thread t1 = new Thread(mr1);
        Thread t2 = new Thread(mr1);

        t1.start();
        t2.start();
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName()+"执行了"+i);

        }
    }
}