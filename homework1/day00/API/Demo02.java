package com.itheima.day00.API;

import java.util.Random;

/*现在黑马集团开年会，来了一些武林高手捧场。
分别是：张三丰，张无忌，周芷若，任我行，林青霞，柳岩。
这些高手决定通过抓阄，选出武林盟主，然后现在没有纸笔，所以拜托黑马请设计程序帮他们完成抓阄。实现如下效果：
~~~text
抽中：柳岩!，恭喜柳岩当选本届武林盟主！
~~~
要求使用两种方式完成，并使用System.currentTimeMilles分别计算出两种方式的耗时：

​	1、使用Random

​	2、使用Math.random*/
public class Demo02 {
    public static void main(String[] args) {
        String s = "张三丰，张无忌，周芷若，任我行，林青霞，柳岩";

        String[] sp = s.split("，");

        long start = System.nanoTime();
        getBoss2(sp);
        long end = System.nanoTime();

        System.out.println("Random类用时:"+(end-start));

        long start1 = System.nanoTime();
        getBoss(sp);
        long end1 = System.nanoTime();

        System.out.println("Math类用时:"+(end1-start1));


    }

    private static void getBoss2(String[] sp) {
        Random r = new Random();

        int i = r.nextInt(sp.length);

        System.out.println("抽中："+sp[i]+"!，恭喜"+sp[i]+"当选本届武林盟主！");
    }

    private static void getBoss(String[] sp) {
        int a = (int) (Math.random() * sp.length);

        System.out.println("抽中："+sp[a]+"!，恭喜"+sp[a]+"当选本届武林盟主！");
    }
}
