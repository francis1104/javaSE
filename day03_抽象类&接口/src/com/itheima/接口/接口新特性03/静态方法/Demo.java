package com.itheima.接口.接口新特性03.静态方法;

/*接口的新特性:
 *   静态方法:使用static修饰,有方法体的方法!
 *      作用:让方法的调用更直接,更简洁
 *
 * */
public class Demo {
    public static void main(String[] args) {
        InterImpl1 in1 = new InterImpl1();
        in1.method();
        Inter.show();
    }

}

interface Inter {
    void method();

    public static void show() {
        System.out.println("我是接口中的静态方法");
    }

}

class InterImpl1 implements Inter {

    @Override
    public void method() {
        System.out.println("ImterImpl1...method");
    }
}