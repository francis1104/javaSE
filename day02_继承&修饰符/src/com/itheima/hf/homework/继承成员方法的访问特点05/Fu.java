package com.itheima.hf.homework.继承成员方法的访问特点05;

public class Fu extends Object{
    public void smoke(){
        System.out.println("smoke");
    }
}

class Zi extends Fu{
    public void play(){
        System.out.println("play");
    }
}