package com.itheima.list;

import java.util.ArrayList;
import java.util.List;

/*
    list集合的特点:
            1. 支持重复元素
            2. list集合有索引    -- 支持普通for遍历
            3. 存取有序
 */


public class Demo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("武大郎");        // 0
        list.add("潘金莲");        // 1
        list.add("西门庆");        // 2

        //需求1: 在潘金莲前面插一个武松

        list.add(1,"武松");

        //需求2: 将集合中的第一个元素删除掉

        list.remove(0);

        //需求3: 将潘金莲改为"柳岩"

        list.set(1,"柳岩");

        //需求4: 获取当前集合中第二个元素并打印

        list.get(1);

        System.out.println(list);



    }
}
