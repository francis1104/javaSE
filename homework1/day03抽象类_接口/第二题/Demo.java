package com.itheima.day03抽象类_接口.第二题;
/*【编号：1009】现有两种事物，【手机】和【智能手机】
    【手机Phone】带有（属性:品牌brand,价格price）（行为:打电话call,发短信sendMessage,玩游戏playGame）
    【智能手机SmartPhone】需要在手机的功能之上，将打电话的功能做进一步增强（视频通话），请结合继承思想来设计两个类，
     另外，假设所有的手机都有属性屏幕的尺寸(int size)，而且假设所有手机的屏幕尺寸为6，该如何补齐下列代码？*/
public class Demo {
    public static void main(String[] args) {
        SmartPhone o = new SmartPhone("大米",2000);
        System.out.println("品牌：" +o.getBrand()+ ",价格：" + o.getPrice() + ",尺寸：" + o.getSize());
        o.call();
        o.sendMessage();
    }
}
