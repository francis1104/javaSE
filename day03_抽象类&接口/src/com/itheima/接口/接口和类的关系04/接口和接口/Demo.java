package com.itheima.接口.接口和类的关系04.接口和接口;
//接口和接口的关键多继承
public class Demo implements Inter1 {


    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }
}
interface Inter1 extends Inter3,Inter2{
    void method1();
}
interface Inter2{
    void method2();
}
interface Inter3{
    void method3();
}