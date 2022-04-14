package com.itheima.day09set.第一题;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/*2019年1月份的世界编程语言排行榜从高到低依次如下：
Java、C、Python、C++、Visual Basic .NET、JavaScript...
请将以上语言名称作为字符串元素，按顺序存入set集合中，并遍历查看。要求存储和遍历的顺序保持一致。*/
public class Demo {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 1;
            }
        });


        Collections.addAll(set,"Java","C","Python","C++","Visual Basic",".NET","JavaScript");

        set.forEach(s -> System.out.println(s));

    }
}
