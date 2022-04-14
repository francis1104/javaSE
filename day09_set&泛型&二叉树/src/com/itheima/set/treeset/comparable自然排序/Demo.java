package com.itheima.set.treeset.comparable自然排序;

import java.util.Iterator;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {

        TreeSet<Student> set = new TreeSet<>();

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 22);
        Student s3 = new Student("wangwu", 28);
        Student s4 = new Student("zhaoliu", 28);

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        for (Student student : set) {
            System.out.println(student);
        }

        System.out.println("------------");

        set.forEach(s-> System.out.println("s = " + s));

        System.out.println("------------");


        Iterator<Student> it = set.iterator();

        while (it.hasNext()){
            System.out.println(it.next());

        }

    }
}
