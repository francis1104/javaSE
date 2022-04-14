package com.itheima.day03抽象类_接口.扩展作业.第一题;

public class Demo {
    public static void main(String[] args) {
        ChinaPeople chp = new ChinaPeople();
        System.out.println(chp.height);
        chp.setHeight(180);
        chp.height=182;
        chp.setWeight(120);
        chp.chinaGonngFu();
        chp.speakHello();
        AmericanPeople amp = new AmericanPeople();
        amp.americanBoxing();
        amp.speakHello();
    }
}

abstract class People{
    protected double height;
    protected double weight;
    public abstract void speakHello();
    public abstract void averageHeight();
    public abstract void averageWeight();


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
class ChinaPeople extends People{

    public void chinaGonngFu(){
        System.out.println("坐如钟,站如松,睡如弓");
    }
    @Override
    public void speakHello() {
        System.out.println("你好...");
    }

    @Override
    public void averageHeight() {
        System.out.println("平均身高一米八");
    }

    @Override
    public void averageWeight() {
        System.out.println("平均体重一百五");
    }
}

class AmericanPeople extends People{

    public void americanBoxing(){
        System.out.println("直拳...勾拳");
    }
    @Override
    public void speakHello() {
        System.out.println("hello...");
    }

    @Override
    public void averageHeight() {
        System.out.println("平均升高一米七");
    }

    @Override
    public void averageWeight() {
        System.out.println("平均体重一百八");
    }
}