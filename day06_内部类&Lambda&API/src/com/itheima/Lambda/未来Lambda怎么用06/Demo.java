package com.itheima.Lambda.未来Lambda怎么用06;

import java.util.ArrayList;
/*
    Lambda到底怎么用：
        1. jdk8开始, 集合中提供了一些支持lambda的方法,非常好用!
        2. Stream流编程!
    总结: 未来当我们调用一个方法时,发现方法管我们要一个函数式接口,那我们就可以传递一个Lambda表达式!
 */
public class Demo {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("张三丰");
        list.add("张无忌");
        list.add("赵敏");

        //需求1: 将集合中名字长度 < 3 的元素删除!
        // removeIf方法底层,会自动遍历集合,将集合中的每个元素 逐个赋值给s!
        list.removeIf((String s) -> {
            return s.length() < 3;
        });

        //需求2: 遍历集合
        // forEach方法底层,会自动遍历集合,将集合中的每个元素 逐个赋值给s!
        list.forEach((String s )->{
            System.out.println("s = " + s);
        });

    }

}
