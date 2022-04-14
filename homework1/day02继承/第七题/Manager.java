package com.itheima.day02继承.第七题;

public class Manager extends Worker{
    private double bonus;

    @Override
    public void work() {
        System.out.println("姓名为:"+getName()+",工号为:"+getId()+",工资为:"+getSalary()+",奖金为:"+getBonus()+",的项目经理正在管理程序员写代码");
    }

    public Manager() {
    }

    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
