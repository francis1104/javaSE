package com.itheima.sleep方法;
/*
    注意:
        如果一个类或者接口的方法定义上没有抛出异常
        那么这个类的子类或者接口的实现类在重写该方法时也不能抛异常,只能try...catch
 */
public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                for (int second = 0; second < 60; second++) {
                    System.out.println(hour+"时"+minute+"分"+second+"秒");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
