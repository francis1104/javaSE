package com.itheima.day17反射.第二题;

import java.lang.reflect.Field;

/*请编写一个方法getProperty，该方法接收两个参，第一个为Object类型的obj对象，第二个为String类型的propertyName，
返回值为Object类型，其作用是可以获取obj对象中名为propertyName的属性的值。在主方法中调用方法进行测试。*/
public class Demo {
    public static void main(String[] args) throws Exception {
        Student stu = new Student("zhangsan",23);

        Object name = getProperty(stu, "name");
        Object age = getProperty(stu, "age");

        System.out.println(name);
        System.out.println(age);
    }

    private static Object getProperty(Object obj, String propertyName) throws Exception {
        Class clazz = obj.getClass();

        Field field = clazz.getDeclaredField(propertyName);

        field.setAccessible(true);

        return field.get(obj);
    }
}