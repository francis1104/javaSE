package com.itheima.day15多线程.题目三;

/*某电影院目前正在上映国产大片，共有100张票，而它有3个窗口卖票，
请设计一个程序模拟该电影院卖票，并保证线程同步，不会出现错误的买票数据。*/
public class Demo {


    public static void main(String[] args) {
        Sell s1 = new Sell();
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s1);
        Thread t3 = new Thread(s1);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();


    }
}

class Sell implements Runnable{
    private static int count = 100;

    @Override
    public void run() {
        while (true) {
            synchronized ("abc") {
                if (count <= 0) {
                    break;
                } else {
                    count--;
                    System.out.println(Thread.currentThread().getName()+"正在卖票,还剩"+count+"张票");
                }
            }
        }
    }
}