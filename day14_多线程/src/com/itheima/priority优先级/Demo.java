package com.itheima.priority优先级;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc = new MyCallable();
        //优先级:1-10 默认:5
        FutureTask<String> ft1 = new FutureTask<>(mc);

        Thread t1 = new Thread(ft1);
        t1.setName("飞机------------");
        t1.setPriority(10);
        t1.start();


        FutureTask<String> ft2 = new FutureTask<>(mc);

        Thread t2 = new Thread(ft2);
        t2.setName("坦克");
        t2.setPriority(1);
        t2.start();


        System.out.println(ft1.get());
        System.out.println(ft2.get());
    }
}
