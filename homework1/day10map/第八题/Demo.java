package com.itheima.day10map.第八题;


import java.util.HashMap;

/*现需要将一些学生对象（属性包含姓名和年龄），与其地址，一一对应存储，并查看存储效果，要保证学生对象不重复，请编写程序实现以上需求，运行效果如下：
Student{name='小红', age=20}---北京海淀
Student{name='小黄', age=22}---北京朝阳
Student{name='小白', age=25}---北京海淀
Student{name='小蓝', age=23}---北京顺义
Student{name='小绿', age=21}---北京昌平*/
public class Demo {
    public static void main(String[] args) {
        HashMap<Student, String> map = new HashMap<>();

        Student s1 = new Student("小红", 20);
        Student s2 = new Student("小黄", 22);
        Student s3 = new Student("小白", 25);
        Student s4 = new Student("小蓝", 23);
        Student s5 = new Student("小绿", 21);

        map.put(s1,"北京海淀");
        map.put(s2,"北京朝阳");
        map.put(s3,"北京海淀");
        map.put(s4,"北京顺义");
        map.put(s5,"北京昌平");

        map.forEach((key,value)->{
            System.out.println(key+"---"+value);
        });

    }
}
