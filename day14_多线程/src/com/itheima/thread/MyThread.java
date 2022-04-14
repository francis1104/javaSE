package com.itheima.thread;

public class MyThread extends Thread{
    //重写run方法,run方法中的逻辑就是未来线程启动后要执行的逻辑
    @Override
    public void run() {
        //代码就是线程启动后执行的代码
        for (int i = 0; i < 100; i++) {
            System.out.println(super.getName()+"线程开启了"+i);
        }
    }
}
