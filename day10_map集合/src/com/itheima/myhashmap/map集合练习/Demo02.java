package com.itheima.myhashmap.map集合练习;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo02 {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();

        Student s1 = new Student("xiaohei", 23);
        Student s2 = new Student("dapang", 22);
        Student s3 = new Student("xiaomei", 28);

        map.put(s1,"江苏");
        map.put(s2,"北京");
        map.put(s3,"天津");

        Set<Student> keys = map.keySet();

        for (Student key : keys) {
            String value = map.get(key);

            System.out.println(key+"---"+value);
        }


        System.out.println("----------------------------------");

        Set<Map.Entry<Student, String>> entries = map.entrySet();

        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key+"---"+value);
        }
        System.out.println("----------------------------------");

        map.forEach((Student key,String value)->{
            System.out.println(key+"---"+value);
        });


    }
}
