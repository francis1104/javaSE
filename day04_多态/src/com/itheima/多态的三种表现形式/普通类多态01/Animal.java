package com.itheima.多态的三种表现形式.普通类多态01;
/*
普通类多态:父类是个普普通通的类,这是子类可以不对父类方法进行重写.
 */
public class Animal {
    public void eat(){
        System.out.println("eat...");
    }
}

class Dog extends Animal{

}

class Demo {
    public static void main(String[] args) {
        Animal d = new Dog();
    }
}