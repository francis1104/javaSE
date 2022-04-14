package com.itheima.day02继承.第七题;

public class Coder extends Worker {
    public Coder() {
    }

    public Coder(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("姓名为:"+getName()+",工号为:"+getId()+",工资为:"+getSalary()+",的程序员正在编写代码");
    }
}
