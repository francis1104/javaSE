package com.itheima.注解.注解入门01;

import java.lang.reflect.Method;

@Anno1(a = 1 , name ="abc")//只有一个value属性可以省略 value=
public class Demo extends Fu{

    public static void main(String[] args) throws Exception {
        Class<Demo> clazz = Demo.class;

        Demo d1 = clazz.newInstance();

        Method method = clazz.getDeclaredMethod("method");

        method.setAccessible(true);

        method.invoke(d1);

//        method();
    }

    @Override                   //重写
    @Deprecated                 //过时
    @SuppressWarnings("all")    //压制警告
    public void method() {
        System.out.println("zi......");
        int a = 1;
    }


}

class Fu{
    public void method(){
        System.out.println("fu.....");
    }
}
