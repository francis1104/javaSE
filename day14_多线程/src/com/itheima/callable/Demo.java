package com.itheima.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        MyCallable mc = new MyCallable();

        FutureTask<String> ft1 = new FutureTask<>(mc);
        FutureTask<String> ft2 = new FutureTask<>(mc);

        Thread t1 = new Thread(ft1);
        t1.setName("柳岩-------------");
        Thread t2 = new Thread(ft2);
        t2.setName("杨幂");

        t1.start();
        t2.start();

        String s1 = ft1.get();
        System.out.println(s1);
        String s2 = ft2.get();
        System.out.println(s2);
    }
}
