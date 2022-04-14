package com.itheima.myStream.stream终结方法;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"a","b","c","d","4");

        list.stream().forEach(s -> System.out.println(s));

        System.out.println("------------------------");

        System.out.println(list.stream().count());
    }
}
