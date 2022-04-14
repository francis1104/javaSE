package com.itheima.hf.homework.继承入门01;
/*
    发现问题: 在Demo01和Demo02这两个类中,都出现了printMsg方法,
             在多个类中存在共性的冗余逻辑!
    解决: 使用继承优化!

    继承: 面向对象三大特征之一! 指的是让类和类之间产生子父类关系!
          子类继承父类,就可以直接使用父类中的非私有成员!
    好处: 提高多个子类之间的代码复用性!
 */
public class Demo {
    public static void print(String msg, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(msg);
        }
    }
}


