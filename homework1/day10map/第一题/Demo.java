package com.itheima.day10map.第一题;

import java.util.Collections;
import java.util.HashSet;

/*请将如下4个字符串数据["aaa"，"bbb"，"ccc"，"ddd"]，依次添加到HashSet集合中，并遍历查看存储结果。*/
public class Demo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        Collections.addAll(set,"aaa","bbb","ccc","ddd");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
