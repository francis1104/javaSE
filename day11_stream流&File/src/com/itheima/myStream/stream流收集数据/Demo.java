package com.itheima.myStream.stream流收集数据;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        list.add(10);
        list.add(10);
        list.add(10);

        //filter负责过滤数据的.
        //collect负责收集数据.
        //获取流中剩余的数据,但是他不负责创建容器,也不负责把数据添加到容器中.
        //Collectors.toList() : 在底层会创建一个List集合.并把所有的数据添加到List集合中.
        List<Integer> list1 = list.stream().filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(list1);

        Set<Integer> set = list.stream().filter(number -> number % 2 == 0).collect(Collectors.toSet());

        System.out.println(set);


    }
}
