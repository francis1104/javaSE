package com.itheima.反射操作成员变量;

import java.lang.reflect.Field;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("com.itheima.反射操作成员变量.Student");

        Field field = clazz.getDeclaredField("money");

        field.setAccessible(true);

        Student student = (Student) clazz.newInstance();

        Object o = field.get(student);

        System.out.println(o);
    }
}
