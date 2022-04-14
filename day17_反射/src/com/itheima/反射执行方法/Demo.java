package com.itheima.反射执行方法;

import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) throws Exception {
        //1.获取class对象
        Class clazz = Class.forName("com.itheima.反射执行方法.Student");

        //2.获取里面的method对象 function4
        Method method = clazz.getDeclaredMethod("function4", String.class);

        //2.1 暴力反射
        method.setAccessible(true);

        //3.运行function方法
        //3.1 创建一个Student对象,当做方法的调用者
        Student student = (Student) clazz.newInstance();

        //3.2运行方法:invoke:拿方法的一个参数作为真正的调用者
        //调用当前方法,拿后续的参数作为调方法是传递的实参
        Object result = method.invoke(student, "zhangsan");

        //4.打印返回值
        System.out.println(result);


    }
}
