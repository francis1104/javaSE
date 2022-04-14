package com.itheima.内部类01.局部内部类02;
/*
    局部内部类: 定义在方法局部位置的类!
    使用: 不能在外界访问. 只能在方法局部位置被访问!
 */
public class Demo {
    public static void main(String[] args) {
        Outer outer = new Outer();

        outer.method();
    }
}

class Outer{
    void method(){

        class Inner{
            public void method(){

                System.out.println("我是局部内部类的method方法");

            }

        }

        Inner i = new Inner();

        i.method();

    }

}