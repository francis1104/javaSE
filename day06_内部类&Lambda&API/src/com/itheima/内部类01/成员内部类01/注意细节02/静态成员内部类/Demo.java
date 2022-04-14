package com.itheima.内部类01.成员内部类01.注意细节02.静态成员内部类;
/*
    静态成员内部类:
        内部类作为外部类的静态成员! 被static修饰!
    注意: 静态成员内部类创建对象格式比较特殊:
            外部类名.内部类名  对象名 = new 外部类名.内部类目();
 */
public class Demo {
    public static void main(String[] args) {
        Computer.CPU c = new Computer.CPU();

        System.out.println(c.price);
    }
}

class Computer {

    static class CPU{

        int price =500;

    }
}