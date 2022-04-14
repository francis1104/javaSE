package com.itheima.day15多线程.题目四;

import java.util.Random;

/*有一个抽奖池，里面存放了一些固定金额的奖金
int[] prizePool = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
此时，有两个人A和B轮流在奖箱中随机抽奖（即A抽一次-->B抽一次-->A抽一次-->B抽一次...），
直到所有的奖金都被抽出，每次抽奖耗时1秒。请编写程序，使用两个线程模拟两人的抽奖过程，输出结果如下（金额的顺序随机）：
A抽出奖金600
B抽出奖金1000
A抽出奖金900
B抽出奖金300
A抽出奖金500
B抽出奖金200
A抽出奖金700
B抽出奖金100
A抽出奖金800
B抽出奖金400*/
public class Demo {
    public static void main(String[] args) {

        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new B());

        t1.setName("A");
        t2.setName("B");

        t1.start();
        t2.start();
    }
}

class Game  {

    static int[] prizePool = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

    static boolean order = true;

}


