package com.itheima.day03抽象类_接口.扩展作业.第二题;

public class Demo {
    public static void main(String[] args) {
        Wind w1 = new Wind();
        tune(w1);
        Brass b1 = new Brass();
        tune(b1);
    }

    private static void tune(Instrument i) {
        i.play();
    }
}

abstract class Instrument{
    public abstract void play();
}

class Wind extends Instrument{


    @Override
    public void play() {
        System.out.println("弹奏wind");
    }

    public void play2(){
        System.out.println("调用wind的play2");
    }
}

class Brass extends Instrument{

    @Override
    public void play() {
        System.out.println("弹奏brass");
    }

    public void play2(){
        System.out.println("调用brass的play2");
    }
}