package com.itheima.抽象类02.抽象类的使用03;
/*
抽象类的作用:
        1.阅读源码
        2.模板模式:
            将固定的内容在模板中写好,将变化的内容设计为抽象方法!

            设计模式:简单理解就是编程套路,可以理解为武学心法
            一共有23套非常牛逼的设计模式!常用的有8种.

*/
public class Demo {
    public static void main(String[] args) {
        LiuYan ly = new LiuYan();
        ly.eat();
        System.out.println("------------");
        YangMi ym = new YangMi();
        ym.eat();
    }
}
