package com.itheima.myarrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        //迭代器创建默认指向集合0索引
        Iterator<String> it = list.iterator();

        //判断当前游标下方是否有数据
        while (it.hasNext()){

            //1获取当前游标下方数据
            //2将游标下移一位
            System.out.println(it.next());
        }

        //重置游标
        it = list.iterator();



    }
}
