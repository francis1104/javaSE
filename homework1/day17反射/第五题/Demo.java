package com.itheima.day17反射.第五题;

import java.lang.reflect.Method;
import java.util.HashMap;

/*现获取到一个Map集合，集合中以属性名称对应属性值的方式存放了一个学生对象的信息，如下：
HashMap<String, Object> map = new HashMap<>();
map.put("id", "heima001");
map.put("name", "张三");
map.put("age", 23);
map.put("birthday", "1999-09-09");
这些信息与学生类（Student）中的属性一一对应
class Student {
    private String id;
    private String name;
    private Integer age;
    private String birthday;

    // getters and setters...
    // toString()...
}
请利用反射的知识，将集合中的属性值通过学生实体类的set方法，封装到一个学生对象中，并打印该对象展示。*/
public class Demo {
    public static void main(String[] args) throws Exception {
        HashMap<String, Object> map = new HashMap<>();
        map.put("id", "heima001");
        map.put("name", "张三");
        map.put("age", 23);
        map.put("birthday", "1999-09-09");

        Class clazz = Class.forName("com.itheima.day17反射.第五题.Student");

        Student student = (Student) clazz.newInstance();

        Method setId = clazz.getDeclaredMethod("setId", String.class);
        setId.setAccessible(true);
        setId.invoke(student,map.get("id"));

        Method setName = clazz.getMethod("setName", String.class);
        setName.invoke(student,map.get("name"));

        Method setAge = clazz.getMethod("setAge", Integer.class);
        setAge.invoke(student,map.get("age"));

        Method setBirthday = clazz.getMethod("setBirthday", String.class);
        setBirthday.invoke(student,map.get("birthday"));

        System.out.println(student);

    }
}
