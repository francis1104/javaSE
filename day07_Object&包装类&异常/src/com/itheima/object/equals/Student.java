package com.itheima.object.equals;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name+"..."+age;
    }

    @Override
    public boolean equals(Object o) {
        /*
            this: s1
            o:   s2
            student: s2
         */
        // 1. 比较双方地址值,地址值如果一样,则直接返回true
        if (this == o) return true;

        //2. 如果传过来的参数为null或者比较双方类型不一致,则直接返回false
        if (o == null || this.getClass() != o.getClass()) return false;

        //3. 将入参进行向下转型,转为当前类型!
        Student student = (Student) o;

        //4. 比较双方属性值
        if (this.age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }
}
