package com.itheima.hf.homework.继承成员变量的访问特点04;

/*
    继承语法下成员变量的访问特点:
        1. 变量查找顺序: (就近原则)
             a. 先找局部位置
             b. 局部找不到,再找本类成员位置
             c. 本类成员找不到,再找父类成员位置
             d. 如果往上都找不到,就报错!

        2. 重名问题的解决:
             a. 当局部变量和成员变量重名:
                    直接通过变量名: 找局部变量
                    this.变量名: 找成员变量
             b. 当子类成员变量和 父类成员变量重名:
                    this.变量名: 找本类
                    super.变量名: 找父类
 */
public class Ye {
    int age = 99;
}

class Fu extends Ye {
    int age = 65;
}

class Zi extends Fu {
    int age = 30;
    public void method(){
        int age = 10;
        System.out.println(age);//局部有直接访问局部变量
        System.out.println(this.age);//this访问本类成员同名成员变量
        System.out.println(super.age);//super访问父类同名成员变量
        Ye ye = new Ye();
        System.out.println(ye.age);//想要访问父类的父类成员变量，直接new对象引用访问
    }

}
class Demo3{
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();
    }

}