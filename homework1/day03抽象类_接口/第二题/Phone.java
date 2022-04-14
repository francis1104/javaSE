package com.itheima.day03抽象类_接口.第二题;

public class Phone {
    private String brand;
    private double price;
    private int size = 6;
    public void call(){
        System.out.println("call....");
    }
    public void playGame(){
        System.out.println("playgame....");
    }
    public void sendMessage(){
        System.out.println("sandmessage...");
    }

    public Phone() {
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

}
