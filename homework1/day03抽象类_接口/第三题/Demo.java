package com.itheima.day03抽象类_接口.第三题;
/*【编号：1104】请对下列代码进行补充，打印出接口中的变量num, 随后调用method方法，
要求程序与最终运行结果吻合，（注意：打印num变量，不允许创建对象调用）
 */
public class Demo implements Inter{
    /*
     * 请编写程序, 打印出接口中的变量num, 随后调用method方法
     * 要求程序与最终运行结果吻合
     */
    public static void main(String[] args) {
        System.out.println(Demo.num);
        Demo d = new Demo();
        d.method();
    }

    @Override
    public void method() {
        System.out.println("method方法执行....");
    }
}

interface Inter {
    int num = 10;
    void method();
}
