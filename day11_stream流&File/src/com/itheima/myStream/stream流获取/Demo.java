package com.itheima.myStream.stream流获取;

import java.util.*;
import java.util.stream.Stream;

/*
 * Stream流的获取
 单列集合 : 集合对象.stream();
 双列集合 : 不能直接获取,需要间接获取
 集合对象.keySet().stream();
 集合对象.entrySet().stream();
 数组     :
 Arrays.stream(数组名);
 同种数据类型的多个数据:
 Stream.of(数据1,数据2,数据3......);
 */
public class Demo {
    public static void main(String[] args) {
        //单列集合  将list转stream流并遍历打印流中的数据
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"hello","world","java");

        list.stream().forEach(s -> System.out.println(s));
        System.out.println("---------------------------------------------------");
        //双列集合  将map转为stream流并遍历打印流中的数据{使用两种方式}

        HashMap<String, Integer> map = new HashMap<>();

        map.put("zhangsan",23);
        map.put("lisi",24);
        map.put("wangwu",25);

        //方式一
        Set<String> keySet = map.keySet();
        keySet.stream().forEach(s -> System.out.println(s));

        //方式二
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        entries.stream().forEach((entry)->{
            System.out.println(entry);
        });

        System.out.println("---------------------------------------------------");
        //数组  将arr转为stream流并打印流中的数据
        int[] arr = {1,2,3,4,5,6,7};

        Arrays.stream(arr).forEach((s)->{
            System.out.println(s);
        });

        System.out.println("---------------------------------------------------");
        //同种类型数据的多个数据 将1,2,3,4,5转为stream流并打印流中的数据
        Stream.of(1,2,3,4,5).forEach((s)->{
            System.out.println(s);
        });


    }
}
