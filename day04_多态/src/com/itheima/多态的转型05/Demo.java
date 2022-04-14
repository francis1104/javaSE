package com.itheima.多态的转型05;
/*
    多态转型练习
    发现问题: 多态的向下转型(强转)是有风险的: ClassCastException(类型转换异常!)
    解决问题: 通过 instanceof 关键字解决!
 */

public class Demo {
    public static void main(String[] args) {
        method(new Cat());
        method(new Dog());
    }
    //当方法管我们要一个接口类型的参数时,我们调用方法需要传递该接口的实现类对象!
    public static void method(Swim s){
        s.swim();
        //需求: 如果别人传过来的实现类对象是Dog,那么期望调用Dog中的lookHome方法
        // 判断s记录的对象类型是否是Dog类型, 是: 返回true, 不是: 返回false
        if (s instanceof Dog){
            Dog d =(Dog)s;
            d.lookHome();
        }
    }
}

interface Swim{
    void swim();
}

class Dog implements Swim{

    @Override
    public void swim() {
        System.out.println("狗学会了仰泳");
    }

    public void lookHome(){
        System.out.println("狗狗会看家");
    }
}

class Cat implements Swim{

    @Override
    public void swim() {
        System.out.println("猫学会了狗刨");
    }
}