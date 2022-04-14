package com.itheima.内部类01.匿名内部类03.匿名内部类的练习03;
//匿名内部类的本质: 充当类的子类对象/ 充当接口的实现类对象!
public class Demo {
    public static void main(String[] args) {
        Swim s = new Swim() {
            @Override
            public void swim() {
                System.out.println("swim....");
            }
        };

        method(s);
    }
    //思考: 方法参数是接口类型时,调用方法需要传递什么?  -- 接口的实现类对象!
    public static void method(Swim s){

        s.swim();
    }
}
