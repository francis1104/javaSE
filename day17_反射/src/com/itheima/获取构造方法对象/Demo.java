package com.itheima.获取构造方法对象;

import java.lang.reflect.Constructor;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        //1. 获取Student类中所有公共的构造方法对象并遍历打印
        Class clazz = Class.forName("com.itheima.获取构造方法对象.Student");
        Constructor[] cons = clazz.getConstructors();
        for (Constructor<?> con : cons) {
            System.out.println(con);
        }
        System.out.println("------------------------------------------------");

        //2. 获取Student类中所有构造方法对象并遍历打印
        Constructor[] decons = clazz.getDeclaredConstructors();
        for (Constructor<?> decon : decons) {
            System.out.println(decon);
        }
        System.out.println("------------------------------------------------");

        //3. 获取Student类中公共的无参构造方法对象并打印
        Constructor cons1 = clazz.getConstructor();
        System.out.println(cons1);
        System.out.println("------------------------------------------------");

        //4. 获取Student类中公共的带参构造方法(String,int)对象并打印
        Constructor cons2 = clazz.getConstructor(String.class, int.class);
        System.out.println(cons2);
        System.out.println("------------------------------------------------");

        //5. 获取Student类中私有的带参构造方法(String)对象并打印
        Constructor decon = clazz.getDeclaredConstructor(String.class);
        System.out.println(decon);
    }
}
