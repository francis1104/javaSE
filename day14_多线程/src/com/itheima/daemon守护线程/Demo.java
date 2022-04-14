package com.itheima.daemon守护线程;
/*
    1. 如何设置守护线程：   线程对象.setDaemon(true)
    2. 守护线程守护的是什么线程？   所有普通线程!
    3. 守护线程什么时候退出?        所有普通线程都结束了, 守护线程即便还没有结束也要跟着退出.
 */
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            while (true){
                System.out.println("关某誓死追随大哥~~");
            }

        });


        Thread t2 = new Thread(()->{
            while (true){
                System.out.println("俺也一样~");
            }
        });
        //设置守护线程
        t1.setDaemon(true);
        t2.setDaemon(true);

        //启动守护线程
        t1.start();
        t2.start();

        Thread.sleep(10);
        //刘备线程
        for (int i = 0; i < 10; i++) {
            System.out.println("二弟,三弟,大哥去也~~");
        }
    }
}
