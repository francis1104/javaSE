package com.itheima.hf.homework.修饰符.final关键字.修饰成员变量;
/*
    黄老板提出了两个期望:
        1.希望这个家庭出身的所有子孙后代都姓 "黄". 并且,后期不能改姓!
        2.希望这个家庭出身的所有子孙后代生下来是什么性别,就一辈子都用该性别.永远不能改变!
    核心结论:
        被final修饰的成员变量只能赋值一次! 但是赋值时机有两种情况:
            a. 直接在定义时就给值! 未来该类的所有对象该属性值都相同!
            b. 定义时不给值,在所有构造执行结束前对其赋值! 未来不同对象该属性值也可以不同!
 */
 class YelloFamily {
    public final String XING="黄";
    public final String sex;

    public YelloFamily(String sex) {
        this.sex = sex;
    }
}

public class Demo{
    public static void main(String[] args) {
        YelloFamily yf1 = new YelloFamily("男");
        System.out.println(yf1.XING);
        System.out.println(yf1.sex);

        YelloFamily yf2 = new YelloFamily("女");
        System.out.println(yf2.XING);
        System.out.println(yf2.sex);
    }

}

