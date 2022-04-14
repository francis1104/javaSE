package com.itheima.内部类01.匿名内部类03.匿名内部类入门01;
/*
    匿名内部类入门
        1. 匿名内部类的使用前提:  存在一个类或者接口
        2. 格式: new 父类名/接口名(){
                        重写方法
                 }
        3. 本质: 匿名匿去的是子类名/实现类名!匿名内部类的整体充当的是子类对象/实现类对象!
 */
public class Demo {
    public static void main(String[] args) {

        //需求2: 创建一个Animal的子类(Cat类)对象,并调用子类对象的eat方法!
        //匿名内部类玩法
        //第一步: JVM根据匿名内部类格式编译生成Animal的子类.class
        //第二步: JVM根据new关键字创建子类对象
        //多态: 父类引用, 接收子类对象!
        Animal cat = new Animal(){

            @Override
            public void eat() {
                System.out.println("cat eat...");
            }
        };

        cat.eat();


    }
}
