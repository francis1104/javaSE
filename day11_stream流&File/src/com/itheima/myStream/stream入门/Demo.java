package com.itheima.myStream.stream入门;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"张三丰","张无忌","张翠山","王二麻子","张良","谢广坤");


        //Stream流
        list.stream().filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .forEach(s -> System.out.println(s));
    }
}
