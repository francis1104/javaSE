package com.itheima.Lambda.Lambda省略模式04;

/*
    lambda省略规则: (追求极致的简洁, 一切可推导的都是可省略的!)
        1. 不管参数有多少个,参数的类型都可以省略不写,要省略就都省略!
        2. 当我们的方法参数只有一个时,小括号可以省略不写!
        3. 当方法体只有一条语句时, 大括号可以省略,封号可以省略,有return,return也要省略!
            注意: 要省略就全部省略!
 */
public class Demo {
    public static void main(String[] args) {
        Inter i = msg -> System.out.println(msg);
        i.method("Hello,Lambda");


        Inter2 i2 = (a,b) -> a+b ;

    }
}

interface Inter {
    void method(String msg);
}


interface Inter2 {
    int add(int a, int b);
}