package com.itheima.案例;

public class Student {
    public void study(){
        System.out.println("学生爱学习");
    }
    private void play(){
        System.out.println("学生更爱打游戏");
    }
}

class Teacher {
    public void teach(){
        System.out.println("老师爱上课");
    }
    private void play(){
        System.out.println("老师也爱玩游戏");
    }
}

class Worker {
    public void work(){
        System.out.println("工人爱工作");
    }
    private void play(){
        System.out.println("工人更爱玩游戏");
    }
}