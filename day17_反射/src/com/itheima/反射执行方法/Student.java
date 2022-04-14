package com.itheima.反射执行方法;

public class Student {

    //公共的，有参有返回值
    private String function4(String name) {
        System.out.println("function4方法，有参有返回值,参数为" + name);
        return "aaa";
    }

    //私有的
    private String function3(String name) {
        System.out.println("function3方法，有参有返回值,参数为" + name);
        return "aaa";
    }


    //公共的，有参有返回值
    public String function2() {
        System.out.println("function2方法，无参有返回值");
        return "aaa";
    }

    //公共的，有参有返回值
    public void function1() {
        System.out.println("function1方法，无参无返回值");
    }
}
