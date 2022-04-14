package com.itheima.day03抽象类_接口.第四题;
/*【编号：1201】请补充下列代码，使测试类编译通过并运行。
已知代码材料*/
public class Demo {
    public static void main(String[] args) {
        Person p = getInstance();
        p.eat();
    }

    private static Person getInstance() {
        // 请补齐代码，使得编译通过，并在控制台输出(吃饭)
        Person p = new Person();
        return p;
    }

}

class Person {
    public void eat(){
        System.out.println("吃饭");
    }
}
