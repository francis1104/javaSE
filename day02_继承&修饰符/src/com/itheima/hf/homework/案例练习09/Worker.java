package com.itheima.hf.homework.案例练习09;

public class Worker {
    private String name;
    private String id;
    private double salary;

    public void work(){
        System.out.println("员工都要工作！");
    }

    public Worker() {
    }

    public Worker(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
