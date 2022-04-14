package com.itheima.Lambda.Lambda和匿名内部类区别05;
/*
    lambda和匿名内的区别:
        1. 使用前提区别:
            匿名内部类的前提: 存在一个类/接口,不管这个类/接口中有几个抽象方法!
            Lambda的前提: 必须存在一个函数式接口!
        2. 使用环境区别:
            匿名内部类可以独立存在!
            Lambda表达式在使用时必须有上下文,要告诉jvm当前Lambda服务于哪个接口!
        3. 原理区别:
            匿名内部类每new一次,底层就会编译生成一个对应的.class字节码文件!
            Lambda的字节码是在运行时动态生成,用完以后,动态销毁的!不会长期驻留在内存中!
 */
public class Demo {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            @Override
            public void eat() {
                System.out.println("狗吃骨头");
            }
        };

        dog.eat();

        new Swim() {
            @Override
            public void swim() {
                System.out.println("狗狗会狗刨");
            }

            @Override
            public void method() {
                System.out.println("狗狗会蛙泳");
            }
        }.method();

        Jump j = ()->{
            System.out.println("狗狗会跳圈");
        };

        j.jump();

    }
}

abstract class Animal{
    public abstract void eat();
}

interface Swim{
    void swim();

    void method();

}

interface Jump{
    void jump();
}
