package com.itheima.day00.匿名内部类_接口;

/*定义一个函数式接口Animal，Animal中有抽象方法eat方法。

​		定义一个测试类，在测试类中定义方法useAnimal方法，形参Animal类型
​		在不定义新的类文件的前提下，调用useAnimal方法。
​		提示：使用2种方式使用useAnimal方法（1、匿名内部类 2、Lambda表达式）*/
public class Demo {
    public static void main(String[] args) {

        useAnimal(new Animal() {

            @Override
            public void eat() {
                System.out.println("eat....");
            }
        });

        useAnimal(() -> System.out.println("lambda...eat"));

    }

    private static void useAnimal(Animal animal) {
        animal.eat();
    }
}

@FunctionalInterface
interface Animal {
    void eat();
}
