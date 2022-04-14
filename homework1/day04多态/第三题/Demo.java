package com.itheima.day04多态.第三题;
/*
1. 定义USB接口:（开启功能）（关闭功能）
2. 定义笔记本类:（开机功能）（关机功能）
（定义使用USB设备的功能,要求:既能使用鼠标也能使用键盘,使用USB功能内部调用开启和关闭功能）
3. 定义鼠标类:要符合USB接口
4. 定义键盘类:要符合USB接口
5. 定义测试类:创建电脑对象,依次调用开机方法,使用USB设备, 关机方法

运行结果：
    笔记本开机
    连接鼠标的USB
    断开鼠标的USB
    连接键盘的USB
    断开键盘的USB
    笔记本关机
 */
public class Demo {
    public static void main(String[] args) {
        Conputer c1 = new Conputer();
        c1.open();
        c1.useUSB(new Mouse());
        c1.useUSB(new Keyboard());
        c1.close();
    }
}

interface USB{
    void open();
    void close();
}

class Conputer{
    public void open(){
        System.out.println("笔记本开机");
    }
    public void close(){
        System.out.println("笔记本关机");
    }
    public void useUSB(USB s){
        s.open();
        s.close();
    }
}

class Mouse implements USB{

    @Override
    public void open() {
        System.out.println("连接鼠标USB");
    }

    @Override
    public void close() {
        System.out.println("断开鼠标USB");
    }
}

class Keyboard implements USB{
    @Override
    public void open() {
        System.out.println("连接键盘USB");
    }

    @Override
    public void close() {
        System.out.println("断开键盘USB");
    }
}