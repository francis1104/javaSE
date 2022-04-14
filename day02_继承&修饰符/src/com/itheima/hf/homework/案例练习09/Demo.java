package com.itheima.hf.homework.案例练习09;
/*
结合继承的思想，分析下列需求并实现
定义项目经理类Manager 【属性：姓名 工号 工资 奖金】【行为：工作work】
定义程序员类Coder【属性：姓名 工号 工资】【行为：工作work】
要求：通过有参构造创建两个类的对象，并调用各自的work方法
运行结果：
姓名为:张三,工号为:9527,工资为:10000.0,的程序员正在编写代码
姓名为:李四,工号为:9528,工资为:15000.0,奖金为:2000.0,的项目经理正在管理程序员写代码
技巧:
    分析: 从子到父.
           子类:    项目经理类Manager【属性： 奖金】【行为：工作work】
                    程序员类Coder【属性：】【行为：工作work】
           父类:    员工Worker【属性：姓名 工号 工资】【行为：工作work】
    编码: 从父到子.
 */
public class Demo {
    public static void main(String[] args) {
        Coder cd = new Coder("张三","9527",10000);
        Manager mg = new Manager("李四","9528",15000,10000);
        mg.work();
        cd.work();
    }
}
