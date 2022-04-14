package com.itheima.hf.homework.修饰符.static关键字;
/*
    static关键字: 静态的.
        可以用来修饰类的成员(成员变量/成员方法)!
    被static修饰后的特点:
        1. 被static修饰的成员属于类, 被该类的所有对象共享使用!
        2. 多了一种访问方式: 还支持通过 类名.成员 方式访问!
        3. 静态方法只能直接访问类中的静态成员!不能直接访问非静态成员!
            tips: 静态要想访问非静态, 必须创建对象访问!
           非静态方法可以访问静态也可以访问非静态!
        4. 静态方法中不能出现: this, super两个关键字!
    应用场景: 什么时候用static?
        1. 工厂模式, 2. 静态代码块, 3. 工具类!  4. 测试类方法!
 */
public class Demo {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "柳岩";
        stu.age = 23;
        stu.school = "传智大学";
        stu.show();

        Student stu1 = new Student();
        stu1.school = "清华大学";
        stu1.show();
    }
}

class Student {
    public String name;
    public int age;
    public static String school;

    public void show() {
        System.out.println(name + "..." + age + "..." + school);
    }
}