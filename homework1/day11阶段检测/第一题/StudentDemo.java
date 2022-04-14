package com.itheima.day11阶段检测.第一题;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class StudentDemo {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o2.getAge() - o1.getAge();

                result = result==0? o1.getId().compareTo(o2.getId()): result;

                return result;
            }
        });

        Student s1 = new Student("张三", 18, "heima001");
        Student s2 = new Student("李四", 18, "heima002");
        Student s3 = new Student("王五", 17, "heima003");

        Collections.addAll(set,s1,s2,s3);

        for (Student s : set) {
            System.out.println(s.getName()+"---"+s.getAge()+"---"+s.getId());
        }

    }
}
