package com.itheima.myarrays.四种遍历案例;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("zhagnsan",23);
        Student s2 = new Student("lisi",45);
        Student s3 = new Student("wangwu",256);
        Collections.addAll(list,s1,s2,s3);
        //普通for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }


        //增强for
        for (Student student : list) {
            System.out.println(student.toString());
        }


        //forEach
        list.forEach((Student s)->{
            System.out.println(s.toString());
        });


        //迭代器
        Iterator<Student> it = list.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
