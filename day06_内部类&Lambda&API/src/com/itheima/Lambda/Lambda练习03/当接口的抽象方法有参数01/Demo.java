package com.itheima.Lambda.Lambda练习03.当接口的抽象方法有参数01;

public class Demo {
    public static void main(String[] args) {
        Inter inter = new Inter() {

            @Override
            public void method(String msg) {
                System.out.println("msg = " + msg);
            }
        };
        //当接口的抽象方法有参数,那么Lambda的小括号中也有定义相应个数和类型的参数!
        Inter inter2 = msg -> System.out.println("msg = " + msg);

        inter.method("111");
        inter2.method("111");

    }
}

interface Inter{

    void method(String msg);

}