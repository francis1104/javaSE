package com.itheima.object.案例;

import java.util.ArrayList;

/*
某公司发放年终礼品，但hr在统计的时候发现有很多同姓名同年龄的员工，
所以决定对这一部分员工，发放【缘分大礼包】，其余员工发放【普通大礼包】，
请用技术手段，完成礼品的分发。

现有4个员工信息：
    张三，23
    李四，24
    张三，23
    张三，28
运行结果：
    Employee{name=张三,age=23}获得了缘分大礼包
    Employee{name=李四,age=24}获得了普通大礼包
    Employee{name=张三,age=23}获得了缘分大礼包
    Employee{name=张三,age=28}获得了普通大礼包
 */
public class Demo {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee("张三", 23));
        list.add(new Employee("李四", 24));
        list.add(new Employee("张三", 23));
        list.add(new Employee("张三", 28));

        //遍历集合把每一个元素的对象 e 拿出来
        for (int i = 0; i < list.size(); i++) {
            Employee e = list.get(i);
            //标记位:先假设所有人都拿普通大礼包
            boolean flag = false;

            //再次把e和每个元素比较
            for (int i1 = 0; i1 < list.size(); i1++) {
                Employee ee = list.get(i1);
                //除了自己,如果属性值相等
                if (e != ee && e.equals(ee)) {
                    //修改标记
                    flag = true;

                }
            }

            if (flag) {

                System.out.println(e + "获得了缘分大礼包");

            } else {

                System.out.println(e + "获得了普通大礼包");
            }


        }


    }
}


class Employee {
    private String name;
    private int age;

    public Employee() {
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (age != employee.age) return false;
        return name != null ? name.equals(employee.name) : employee.name == null;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
