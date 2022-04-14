package com.itheima.day02继承.第三题;
//请补充下列代码，使得程序按照顺序分别输出30 20 10。
class Fu {
    int num = 10;
}

class Zi extends Fu{
    int num = 20;
    public void method(){
        int num = 30;
        // 这里要求输出30
        System.out.println(num);
        // 这里要求输出20
        System.out.println(this.num);
        // 这里要求输出10
        System.out.println(super.num);
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.method();
    }
}