package com.itheima.set.hashset.哈希值;
/*
 * 哈希值
 *      1. 什么是哈希值?               就是一个10进制整数!
 *      2. 怎么获取对象的哈希值?       拿对象调用hashCode方法获取.
 *              在Object中hashCode方法: 根据对象的地址值来计算得出哈希值.
 *              子类重写hashCode方法: 根据对象的属性值来计算得出哈希值.
 */
public class HashSetTest {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("zhangsan", 23);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());


    }
}
