package com.itheima.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/*
        1. 负责将线程任务提交到线程池
        2. 判断池子里是否有空闲的线程
                 有  :  直接安排一个空闲的线程来执行任务
                 没有 : 创建一个线程对象,并且安排这个线程对象去执行任务
        3. 线程执行完任务后,会被回收到线程池当中
  */
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; i++) {
            executorService.submit(()->{
                System.out.println(Thread.currentThread().getName()+"在执行了");
            });
        }

        executorService.shutdown();
    }
}
