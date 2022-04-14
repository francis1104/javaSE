package com.itheima.拒绝策略;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*
    1. 什么时候拒绝: 任务数量 > 最大线程数 + 队列容量
    2. 怎么拒绝:
        a. AbortPolicy(丢弃多余任务并抛出异常)
        b. DiscardPolicy(丢弃多余任务不抛出异常)
        c. DiscardOldestPolicy(丢弃中间等待任务,优先处理最后进来的任务,不抛出异常)
        d. CallerRunsPolicy(出让多余任务,出让给有能力处理的线程去处理)
 */
public class Demo {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                1,
                2,
                2,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardOldestPolicy()
        );

        for (int i = 1; i <= 5; i++) {
            int y = i;
            pool.submit(()->{
                System.out.println(Thread.currentThread().getName()+"在执行了"+y);
            });

        }

        pool.shutdown();
    }
}
