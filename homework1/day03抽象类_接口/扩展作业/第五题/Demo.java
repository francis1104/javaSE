package com.itheima.day03抽象类_接口.扩展作业.第五题;

public class Demo {
    public static void main(String[] args) {
        BMW b1 = new BMW();
        b1.setBrand("baoma");
        b1.gps();
    }
}

class Vehicle{
    private String brand;
    private double price;

    public Vehicle(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public Vehicle() {
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

    public void move(){

    }
}

interface Gps{
    void gps();
}

class BMW extends Vehicle implements Gps{


    public BMW(String brand, double price) {
        super(brand, price);
    }

    public BMW() {
    }

    @Override
    public void gps() {
        System.out.println("GPS running......");
    }
}