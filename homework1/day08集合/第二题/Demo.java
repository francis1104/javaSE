package com.itheima.day08集合.第二题;

import java.util.ArrayList;
import java.util.Collections;

/*现有如下字符串元素：["aaa", "bbb", "aaa", "aaa", "ccc", "bbb"]，
请将所有的元素按顺序存入集合中，并查看存储结果。请补充如下代码完成需求。
*/
public class Demo {
    public static void main(String[] args) {
        /*
        	... 需要补充的代码，定义集合，并存储元素
        */

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"aaa","bbb","aaa","aaa","ccc","bbb");

// 直接打印对象，由于重写了toString()，显示集合中的元素
        System.out.println(list);
    }
}
