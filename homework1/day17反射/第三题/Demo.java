package com.itheima.day17反射.第三题;

import java.lang.reflect.Field;

/*请编写一个方法setProperty，该方法可以接收三个参数，第一个为Object类型的obj对象，
    第二个为String类型的propertyName，第三个为Object类型的value，
    方法的作用是能够为obj对象中名为propertyName的属性的值设置为value。在主方法中调用方法进行测试。*/
public class Demo {
    public static void main(String[] args) throws Exception {
        Student stu = new Student("zhangsan", 23);

        setProperty(stu,"name","lisi");
        setProperty(stu,"age",24);

        stu.showInfo();
    }

    public static void setProperty(Object obj, String propertyName, Object value) throws Exception {
        Class clazz = obj.getClass();

        Field field = clazz.getDeclaredField(propertyName);

        field.setAccessible(true);

        field.set(obj,value);
    }
}
