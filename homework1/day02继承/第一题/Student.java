package com.itheima.day02继承.第一题;
/*观察发现，这两个类的结构太接近了，后者比前者仅多了一个属性，却需要重复定义其他内容。
请根据类的继承机制，帮助小李重新设计Student类。并测试获取Student对象的属性信息。*/
public class Student extends Person{

    private String school; // 所在学校

    public Student() {

    }

    public Student(String name, int age, String birthday, String school) {
        super(name, age, birthday);
        this.school = school;
    }

    // 获取信息的方法
    public String getInfo() {
        return "Student[name=" + getName() + ", age=" + getAge() + ", birthday=" + getBirthday() + ", school=" + school + "]";
    }
    /*
    getters and setters请自行生成
    */

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}

class Test{
    public static void main(String[] args) {
        Student stu = new Student("张三",23,"2000-10-10","黑马专修学院");
        System.out.println(stu.getInfo());

    }
}
