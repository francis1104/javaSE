package com.itheima.day03抽象类_接口.第二题;

public class SmartPhone extends Phone{
    public void videoChat(){
        System.out.println("视频通话...");
    }

    public SmartPhone() {
    }

    public SmartPhone(String brand, double price) {
        super(brand, price);
    }

    @Override
    public void call() {
        super.call();
        System.out.println("视频通话");
    }
}
