package com.itheima.内部类01.成员内部类01.注意细节02.私有成员内部类;

/*
    私有成员内部类:
        内部类作为外部类的私有成员! 被private修饰!
    注意: 私有成员内部类不能在外界被直接访问了!
          要想访问私有成员内部类的东西, 只能在外部类的方法中创建私有
          成员内部类对象, 在测试类中间接访问!
 */
public class Demo {
    public static void main(String[] args) {
        //Computer.CPU c1  = new Computer().new CPU();
        Computer c  = new Computer();
        c.getCpu();


    }
}

class Computer {

    void getCpu(){
        CPU cpu = new CPU();
        cpu.method();
    }

    private class CPU extends Computer  {
        public void method(){

            System.out.println("私有内部类中的method方法");
        }

    }

}