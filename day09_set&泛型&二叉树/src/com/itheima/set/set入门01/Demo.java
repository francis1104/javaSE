package com.itheima.set.set入门01;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set集合的基本使用
 *      1. 元素不能重复
 *      2. 没有索引
 *      3. 存取不一致
 */
public class Demo {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        set.add("ccc");
        set.add("aaa");
        set.add("aaa");
        set.add("bbb");

        Iterator<String> it = set.iterator();

        while (it.hasNext()){
            System.out.println(it.next());

        }

        System.out.println("------------------------");

        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("------------------------");

        set.forEach((String s)->{
            System.out.println("s = " + s);
        });
    }
}
