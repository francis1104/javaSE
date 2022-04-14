package com.itheima.hf.homework.继承的特点03;

public class Fu {
    public  void drink(){
        System.out.println("喝酒...");
    }
}

class Zi extends Fu{
    public void playGame(){
        System.out.println("打游戏");
    }
}

class Sun extends Zi{
    public void tangTou(){
        System.out.println("烫头...");
    }
}

class Ge extends Fu{
    public void smoke(){
        System.out.println("抽华子");
    }

}