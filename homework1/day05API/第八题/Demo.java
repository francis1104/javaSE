package com.itheima.day05API.第八题;
/*请结合已有代码，补齐Outer中的代码，要求在控制台输出”HelloWorld”（必须使用匿名内部类）

    运行结果：
    HelloWorld*/
public class Demo {
    public static void main(String[] args) {
        Outer.method().show();
    }
}

interface Inter {
    void show();
}

class Outer {
    //补齐代码
    public static Inter method(){

        return new Inter() {
            @Override
            public void show() {
                System.out.println("HelloWorld");
            }
        };
    }
}

