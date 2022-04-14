package com.itheima.代码块01.构造代码块02;
/*
    构造代码块02:
        格式: { }
        位置:  类中方法外, 成员位置
    执行时机: 每访问一次构造方法,都会先自动执行一下构造代码块中的内容!
        作用:  将多个构造方法中的重复逻辑提取到构造代码块中,写一份就行,提高代码的复用性!
 */
public class Demo {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student(1);

    }
}

class Student{
    {
        System.out.println("代码敲烂,月薪过万");
        System.out.println("代码敲烂,月薪过万");
        System.out.println("代码敲烂,月薪过万");
    }


    public Student() {
        System.out.println("无参构造...");
    }

    public Student(int a) {
        System.out.println("有参构造...");
    }
}