package com.itheima.day17反射.第一题;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
请使用反射技术，创建该类的对象，并为对象的属性赋值，然后反射调用显示信息的方法。
*/
public class Demo {
    public static void main(String[] args) throws Exception {
        //获取字节码对象
        Class clazz = Class.forName("com.itheima.day17反射.第一题.Student");

        //获取字节码实例对象
        Student student = (Student) clazz.newInstance();

        //通过字节码获取成员变量对象
        Field stuName = clazz.getDeclaredField("name");
        Field stuAge = clazz.getDeclaredField("age");

        //暴力反射
        stuName.setAccessible(true);
        stuAge.setAccessible(true);

        //设置成员变量
        stuName.set(student,"zhangsan");
        stuAge.set(student,23);

        //获取方法对象
        Method showInfo = clazz.getDeclaredMethod("showInfo");

        //调用方法
        showInfo.invoke(student);
    }
}
