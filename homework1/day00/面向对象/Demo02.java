package com.itheima.day00.面向对象;
/*编写一个Animal类，具有属性：种类；具有功能：吃、睡。定义其子类Fish和Dog，
定义接口LookHome,LookHome中编写抽象方法lookHome()让实现类实现，
定义主类Test，在其main方法中分别创建其对象并测试对象的特性。 */
public class Demo02 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.lookhome();

        Fish f1 = new Fish();
        f1.eat();
    }
}

interface LookHome{

    void lookhome();


}


class Dog extends Animal implements LookHome{


    public Dog() {
    }

    public Dog(String kind) {
        super(kind);
    }

    @Override
    void eat() {
        System.out.println("dog...eat...");
    }

    @Override
    void sleep() {
        System.out.println("dog...sleep...");
    }

    @Override
    public void lookhome() {
        System.out.println("dog..lookhome..");
    }
}


class Fish extends Animal {

    @Override
    void eat() {
        System.out.println("fish...eat...");
    }

    @Override
    void sleep() {
        System.out.println("fish...sleep...");
    }

    public Fish() {
    }

    public Fish(String kind) {
        super(kind);
    }
}

abstract class Animal{

    private String kind;

    abstract void eat();
    abstract void sleep();

    public Animal() {
    }

    public Animal(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
