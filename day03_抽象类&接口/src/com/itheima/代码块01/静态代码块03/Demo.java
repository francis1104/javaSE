package com.itheima.代码块01.静态代码块03;
/*
    静态代码块:
        格式: static{ }
        位置: 类中方法外, 成员位置
    执行时机: 随着类的加载而执行! 只执行1次!
        作用: 基于类的加载在静态代码块中实现系统数据的初始化加载动作! loading
 */


public class Demo {
    public static void main(String[] args) {
        Student stu = new Student();
        Student.method();
        

    }
}
class Student{
    static {
        System.out.println("loading------");
    }

    public Student() {
        System.out.println("无参构造.");
    }

    public Student(int a) {
        System.out.println("有参构造.");
    }

    public static void method(){
        System.out.println("静态方法-------");
    }
}