package com.itheima.day06包装类_异常.第七题;

/*请对Person类进行补充，保证程序运行后结果为：

        （不可修改main方法内部代码，只能操作Person类）
        运行结果：
        张三...23
        李四...24
        */
public class Demo {
    public static void main(String[] args) {
        // 创建对象，并初始化数据
        Person p1 = new Person("张三",23);
        Person p2 = new Person("李四",24);
        // 输出对象中数据
        System.out.println(p1.toString());
        System.out.println(p2);
    }
}

class Person {
    private String name;
    private int age;
    /*
        请补充代码！
    */

    @Override
    public String toString() {
        return name+"..."+age;
    }

    public Person() {
    }

    public Person(String name, int age) {
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
}

