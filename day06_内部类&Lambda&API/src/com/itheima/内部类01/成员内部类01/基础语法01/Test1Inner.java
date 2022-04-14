package com.itheima.内部类01.成员内部类01.基础语法01;

/*
      内部类: 定义在类里面的类
      创建内部类对象的格式:
        外部类名.内部类名 对象名 = new 外部类对象().new 内部类对象();
   */
public class Test1Inner {
    public static void main(String[] args) {
        Outer.Inner i = new Outer().new Inner();
        // 内部类, 访问外部类成员, 可以直接访问, 包括私有
        System.out.println(i.num);

        i.show();
    }
}


class Outer {

    private int a = 10;

    class Inner {

        int num = 10;

        public void show() {

            System.out.println();

            System.out.println("a = " + a);


        }

    }

}
