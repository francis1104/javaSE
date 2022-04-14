package com.itheima.day15多线程.题目四;

import java.util.Random;

class B implements Runnable{
    @Override
    public void run() {

        Random r = new Random();

        while (true) {
            synchronized ("abc") {
                //维护数组是否还有钱
                int flag = Game.prizePool.length;
                for (int i = 0; i < Game.prizePool.length; i++) {
                    //如果当前索引没钱,减一
                    if (Game.prizePool[i] == 0) {
                        flag--;
                    }
                }

                //如果没钱抽了游戏结束
                if (flag==0){
                    break;
                }else {
                    //有钱抽的话false B执行
                    if (Game.order){
                        try {
                            "abc".wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        int randomNum = r.nextInt(Game.prizePool.length);

                        if (Game.prizePool[randomNum] == 0){
                            continue;
                        }

                        System.out.println(Thread.currentThread().getName()+"抽出奖金"+Game.prizePool[randomNum]);

                        Game.order=true;

                        Game.prizePool[randomNum] = 0;

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        "abc".notifyAll();
                    }


                }


            }
        }

    }
}
