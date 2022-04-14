package com.itheima.hf.domain;

public class Computer {
    private CPU cpu = new CPU();
    public void show(){
        System.out.println("cpu型号:"+cpu.getBrand()+"cpu价格："+cpu.getPrice());
    }
}

class CPU{
    private String brand;
    private int price;

    public CPU() {
        System.out.println("cpu创建了。。。");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}