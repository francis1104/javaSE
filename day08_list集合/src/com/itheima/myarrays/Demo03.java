package com.itheima.myarrays;

import java.util.ArrayList;
import java.util.Collections;

public class Demo03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");


        //批量添加
        Collections.addAll(list,"b","b");

        //1,数据类型一定是集合或者数组中元素的类型
        //2,str仅仅是一个变量名而已,在循环的过程中,依次表示集合或者数组中的每一个元素
        //3,list就是要遍历的集合或者数组.
        // 快捷键: list.for    list.iter  iter



        for (String s : list) {
            System.out.println(s);
        }


    }
}
