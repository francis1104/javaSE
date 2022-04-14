package com.itheima.抽象类02.抽象类入门01;
/*
    抽象类入门01:
        1. 抽象类02:  被abstract修饰的类! 一般都是设计为父类
        2. 抽象方法:  没有方法体,被abstract修饰的方法!
        3. 子类继承抽象父类: 要求重写父类中所有抽象方法!
 */
public abstract class TuXing {
    public abstract int getArea();
}

class SJX extends TuXing{

    @Override
    public int getArea() {
        return 66;
    }
}
