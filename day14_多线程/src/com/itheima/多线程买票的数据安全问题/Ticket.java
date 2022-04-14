package com.itheima.多线程买票的数据安全问题;
/*
    多线程环境下出现数据安全问题的原因:
        1. 是多线程环境
        2. 有临界资源【多个线程操作同一份数据】
        3. 有多条语句操作临界资源
 */
public class Ticket implements Runnable {
    //票的数量
    private int ticket = 100;//临界资源

    @Override
    public void run() {
        while (true){
            //注意: 锁对象要唯一,通常我们会使用字符串常量.因为字符串常量在常量池中是唯一的
            //默认情况下,锁是打开的.
            // 当有任意一个线程进入后,锁会自动关闭
            // 只有进入的线程将同步代码块中的内容执行完毕了,锁才会重新打开
            synchronized ("abc"){
                if (ticket <= 0){
                    break;
                }else {
                    ticket--;
                    System.out.println(Thread.currentThread().getName()+"正在买票,还剩:"+ticket+"张票");
                }
            }
        }
    }
}
