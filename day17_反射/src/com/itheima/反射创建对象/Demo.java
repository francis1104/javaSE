package com.itheima.反射创建对象;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//需求: 要求创建一个Math类的对象, 通过对象.random()生成一个[1,100]随机整数
public class Demo {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1.先拿到字节码文件对象
        Class<Math> mathClass = Math.class;

        //获取构造器
        Constructor<Math> constructor = mathClass.getDeclaredConstructor();
        //暴力反射
        constructor.setAccessible(true);

        //基于构造器对象创建类的对象
        Math math = (Math) constructor.newInstance();

        int r = (int) (math.random()*100+1);
        System.out.println(r);

    }
}
