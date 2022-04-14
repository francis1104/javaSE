package com.itheima.day02继承.第六题;

/*分析事物的共性，并抽取出正确的继承体系
现有基础班老师（BaseTeacher）和就业班老师（WorkTeacher）两个类，两者都含有姓名和年龄两个属性，
还有一个讲课的行为teach，但不同的是，基础班老师的teach方法输出【基础班老师讲JavaSE】，
就业班老师的teach方法输出【就业班老师讲JavaEE】，请用代码实现。
运行结果：张三老师...23
        基础班老师讲JavaSE
        李四老师...24
        就业班老师讲JavaEE
*/
class Teacher{
    private String name;
    private int age;
    public void teach(){
        System.out.println("正在讲课。。。");
    }

    public void show(){
        System.out.println(name+"..."+age);
    }

    public Teacher() {
    }

    public Teacher(String name, int age) {
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

class BaseTeacher extends Teacher{
    public BaseTeacher() {
    }

    public BaseTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("【基础班老师讲JavaSE】");
    }
}

class WorkTeacher extends Teacher{
    public WorkTeacher() {
    }

    public WorkTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("【就业班老师讲JavaEE】");
    }
}
public class Demo6 {
    public static void main(String[] args) {
        BaseTeacher bt = new BaseTeacher("张三",23);
        bt.show();
        bt.teach();
        WorkTeacher wt = new WorkTeacher("李四",24);
        wt.show();
        wt.teach();
    }
}
