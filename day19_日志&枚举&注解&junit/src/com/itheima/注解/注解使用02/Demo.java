package com.itheima.注解.注解使用02;


import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) throws Exception {
        //1.通过反射获取字节码对象
        Class<?> clazz = Class.forName("com.itheima.注解.注解使用02.UseTest");
        //创建类对象
        UseTest o = (UseTest) clazz.newInstance();
        //2.通过反射获取这个类中所有方法对象
        Method[] declaredMethods = clazz.getDeclaredMethods();

        //3.遍历数组,得到每一个方法对象
        for (Method method : declaredMethods) {

            //判断当前方法是否有指定的注解
            //参数:注解的字节码文件对象
            if (method.isAnnotationPresent(Test.class)) {
                //暴力反射
                method.setAccessible(true);

                method.invoke(o);
            }
        }
    }
}
