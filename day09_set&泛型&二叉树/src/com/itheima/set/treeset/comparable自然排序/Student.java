package com.itheima.set.treeset.comparable自然排序;

public class Student implements Comparable<Student> {
    private String name;
    private int age;


    //拿当前对象:升序
    //拿已有对象:降序
    @Override
    public int compareTo(Student o) {
        //主要条件
        int result = this.age - o.age;
        //次要条件
        //String类compareto方法挨个比较字符串中字符的码表值,返回差值
        result = result == 0 ? o.name.compareTo(this.name) : result;

        return result;
    }

    public Student(String name) {
        this.name = name;
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
