package com.itheima.hf.homework.方法重写06;
/*
        Java中方法有两种特殊语法:
        1. 方法重载: 在同一个类中,多个方法之间, 方法名相同, 参数不同(个数,类型,顺序), 和返回值类型无关.
        2. 方法重写/覆盖: 在继承关系下, 子类中出现了和父类中一模一样的方法声明!
        方法声明/方法定义: public void smoke()
        */
public class Demo {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.drink();
        zi.smoke();

    }
}
class Zi extends Fu{
    public void drink(){
        super.drink();
        System.out.println("喝冰阔乐");
    }
    public void smoke(){
        System.out.println("大前门");
    }
}

class Fu{
    public void drink(){
        System.out.println("喝凉白开");

    }
    public void smoke(){
        System.out.println("华子");
    }
}