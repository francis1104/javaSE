package com.itheima.set.hashset.demo;


import java.util.Collections;
import java.util.HashSet;

/*
 * 创建一个存储学生对象的集合，存储多个学生对象，使用程序实现在控制台遍历该集合
 * 要求：学生对象的成员变量值相同，我们就认为是同一个对象
 *
 *
 * 结论：
 *  如果HashSet集合要存储自定义对象，那么必须重写hashCode和equals方法。
 */
public class Demo01 {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();

        Student s1 = new Student("xiaohei",23);
        Student s2 = new Student("xiaohei",23);
        Student s3 = new Student("xiaomei",22);
        Student s4 = new Student("xiaomeimei",222);


        Collections.addAll(set,s1,s2,s3,s4);

        for (Student s : set) {
            System.out.println(s);
        }


    }
}
