package com.itheima.day00.匿名内部类_接口;

public class Demo02 {
    public static void main(String[] args) {
        //匿名内部类
        useInter(new InterA() {

            @Override
            public void show() {
                System.out.println("interA...show");
            }
        });

        //Lambda
        useInter(() -> System.out.println("interA..show"));

        //匿名内部类
        useInterB(new InterB() {

            @Override
            public void method(int num) {
                System.out.println(num);
            }
        });
        //Lambda
        useInterB(interA -> System.out.println(interA));

        //匿名内部类
        useInterC(new InterC() {

            @Override
            public String function() {
                return "aaa";
            }
        });

        //Lambda
        useInterC(() -> "aaa");

        //匿名内部类
        useInterD(new InterD() {

            @Override
            public int niubility() {
                return 1;
            }
        });

        //Lambda
        useInterD(() -> 1);

    }

    private static void useInterD(InterD interD) {
        System.out.println(interD.niubility());
    }

    private static void useInterC(InterC interC) {
        System.out.println(interC.function());
    }

    private static void useInterB(InterB interB) {
        interB.method(10);
    }

    private static void useInter(InterA interA) {
        interA.show();
    }
}

//InterA
interface InterA {
    public abstract void show();
}

//InterB
interface InterB {
    public abstract void method(int num);
}

//InterC
interface InterC {
    public abstract String function();
}

//InterD
interface InterD {
    public abstract int niubility();
}