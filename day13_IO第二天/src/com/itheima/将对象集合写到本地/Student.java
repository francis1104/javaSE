package com.itheima.将对象集合写到本地;

import java.io.Serializable;

//如果想要这个类的对象能被序列化,那么这个类必须要实现一个接口.Serializable
//Serializable 接口的意义
//称之为是一个标记性接口,里面没有任何的抽象方法
//只要一个类实现了这个Serializable接口,那么就表示这个类的对象可以被序列化.

public class Student implements Serializable {


    //手动定义出序列号,未来序列化就不会动态计算了
    private static final long serialVersionUID = 8683452581122892189L;


    private transient String id;//瞬态关键字修饰的变量不参与序列化
    private String name;
    private String age;
    private String birthday;

    public Student() {
    }

    public Student(String id, String name, String age, String birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return id+","+name+","+age+","+birthday;
    }
}
