package com.itheima.内部类01.成员内部类01.基础语法01;

public class Demo {
    public static void main(String[] args) {

    }
}


class Computer{

    double price = 5000;

    class CPU{

        double price = 2000;

        public void show(){

            double price = 500;

            //需求1:打印500的price
            System.out.println("price = " + price);

            //需求1:打印2000的price
            System.out.println(this.price);

            //需求1:打印5000的price
            //方法1
            Computer com = new Computer();
            System.out.println(com.price);
            //方法2
            System.out.println(Computer.this.price);


        }

    }

}