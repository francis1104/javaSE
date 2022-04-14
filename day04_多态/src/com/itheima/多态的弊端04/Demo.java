package com.itheima.多态的弊端04;
/*
    /*
    多态的弊端:
        由于多态语法下,成员的访问编译看左边(父类/父接口),
        所以不能直接访问子类/实现类中的特有成员!

    解决: 通过多态的向下转型(强制类型转换)解决!
        向下转型(强制类型转换): 将父类引用转成对应的子类类型!
        向上转型(多态默认格式): 父的接 子的!  大接小, 可以直接接受
 */

public class Demo {
    public static void main(String[] args) {
        Swim s = new Dog();
        s.swim();
//        s.lookHome();
    }
}

interface Swim{
    void swim();
}

class Dog implements Swim{

    @Override
    public void swim() {
        System.out.println("狗狗学会了游泳");
    }

    public void lookHome(){
        System.out.println("狗狗会看家");
    }
}