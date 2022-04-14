package com.itheima.lock锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {
    //票的数量
    private static int ticket = 100;

    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            try {
                lock.lock();
                if (ticket <= 0){
                    break;
                }else {
                    ticket--;
                    System.out.println(Thread.currentThread().getName()+"正在买票,还剩:"+ticket+"张票");
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }
    }
}
