package com.itheima.day06包装类_异常.第九题;

import java.util.ArrayList;

/*某公司发放年终礼品，但hr在统计的时候发现有很多同姓名同年龄的员工，所以决定对这一部分员工，
发放【缘分大礼包】，其余员工发放【普通大礼包】，请用技术手段，完成礼品的分发。
现有4个员工信息：
张三，23
李四，24
张三，23
张三，28
运行结果：
Employee{name=张三,age=23}获得了缘分大礼包
Employee{name=李四,age=24}获得了普通大礼包
Employee{name=张三,age=23}获得了缘分大礼包
Employee{name=张三,age=28}获得了普通大礼包*/
public class Demo {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee("张三", "23"));
        list.add(new Employee("李四", "24"));
        list.add(new Employee("张三", "23"));
        list.add(new Employee("张三", "28"));

        for (int i = 0; i < list.size(); i++) {
            Employee e = list.get(i);
            boolean flag = false;

            for (int i1 = 0; i1 < list.size(); i1++) {
                if (e != list.get(i1) && e.equals(list.get(i1))) {
                    flag = true;
                }


            }
            if (flag){

                System.out.println(e.toString()+"获得了缘分大礼包");
            }else {

                System.out.println(e.toString()+"获得了普通大礼包");
            }

        }


    }
}

class Employee {
    private String name;
    private String age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        return age != null ? age.equals(employee.age) : employee.age == null;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public Employee() {
    }

    public Employee(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}