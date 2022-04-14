package com.itheima.注解.注解入门01;

public @interface Anno1 {
    //定义一个基本类型的属性
    public int a ();
    //定义一个String类型的属性
    public String name ();
    //定义一个Class类型的属性
    public Class clazz ()default Demo.class;
    //定义一个注解类型的属性
    //Anno2:理解为一个注解
    //@Anno2理解为一个注解的对象
    public Anno2 anno ()default @Anno2;
    //定义一个枚举类型的属性
    public Season season ()default Season.SPRING;

    //以上类型的一维数组
    public int[] arr ()default {1,2,3};
    //枚举数组
    public Season[] seasons ()default {Season.AUTUMN,Season.SPRING};
}
