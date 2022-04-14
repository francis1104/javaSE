package com.itheima.object.toSting;
/*
    1. Object中toString方法返回的是对象的地址值
    2. 如果拿对象调用toString方法不想得到地址值,而是想得到属性值,此时需要重写toString().
    3. 打印一个对象,其实就是在打印这个对象调用toString方法后的返回值!
 */
public class Demo {
    public static void main(String[] args) {
        Student stu = new Student("张三", 23);

        System.out.println(stu.toString());
        System.out.println(stu);

        String a = new String("a");

    }
}
