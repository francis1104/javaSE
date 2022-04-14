package com.itheima.注解.注解使用02;

public class UseTest {

    //没有使用Test注解
    public void method(){
        System.out.println("method......");
    }

    //使用Test注解
    @Test
    public void method1(){
        System.out.println("method1......");
    }

    //使用Test注解
    @Test
    public void method2(){
        System.out.println("method2......");
    }
}
