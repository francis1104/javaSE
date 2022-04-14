package com.itheima.day04多态.第五题;
/*请补充下列代码，在main方法中调用method方法，并编译通过，最终在控制台输出（狗吃肉，狗看家）*/
public class Demo {
    public static void main(String[] args) {
        // 请在此处调用method方法
        method(new Dog());
    }

    public static void method(Animal a){
        a.eat();
        ((Dog)a).watchHome();
    }
}

abstract class Animal {
    public abstract void eat();
}

class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    public void watchHome(){
        System.out.println("狗看家");
    }
}