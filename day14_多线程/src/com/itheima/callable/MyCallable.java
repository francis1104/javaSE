package com.itheima.callable;

import java.util.concurrent.Callable;
//线程任务类
//<String>泛型指定的是什么类型,
//未来call方法的返回值类型就应该是什么类型
//call方法中就要return该类型的具体值
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"表白"+i);
        }

        return "答应";
    }
}
