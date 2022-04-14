package com.itheima.接口.接口新特性03.私有方法;

/*
  接口的新特性:
        私有方法:使用private修饰,有方法体的方法
           作用:封装默认方法/静态方法中重复的逻辑!

           JDK1.9才有....

*/
public interface Inter {
    public default void method01(){

        System.out.println("我是接口中的默认方法1");
    }



    public default void method02(){
        System.out.println("我是接口中的默认方法2");
    }

}
