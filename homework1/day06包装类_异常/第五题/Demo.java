package com.itheima.day06包装类_异常.第五题;

import java.util.Scanner;

/*某程序员从控制台采集用户数据封装成Person对象，采集到的数据都是字符串，所以对于特殊的，数值数据需要特殊处理，
例如年龄就是int类型的，但用户输入的时候可能会出现失误，请结合所学知识，避免这种用户失误而导致后续代码不能执行。（从前台采集数据用Scanner模拟）
    运行结果：
    请输入姓名：
    张三
    请输入年龄：
    23a
    您输入的年龄格式有误，请重新输入！
    请输入年龄：
    ...
    您输入的年龄格式有误，请重新输入！
    请输入年龄：
    23
    输入完毕，信息为：
    Person{name=}*/
public class Demo {
    public static void main(String[] args) {
        Person p = new Person();

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入姓名:");
        String name = sc.next();
        p.setName(name);

        while (true) {
            try {
                System.out.println("请输入年龄:");
                String age = sc.next();
                Integer.parseInt(age);
                p.setAge(age);
                break;
            } catch (Exception e) {

                System.out.println("您输入的年龄格式有误,请重新输入");
            }
        }


        System.out.println("输入完毕,信息为:"+"\n"+p.toString());

    }
}
