package com.itheima.day09set.第二题;

import java.util.Collections;
import java.util.TreeSet;

/*下面有一些程序员经常访问的IT网站（排名不分先后）：
itheima, chinaunix, itpub, csdn, 51cto, iteye...
请将以上网站名称作为字符串元素，按照字典顺序存入set集合中，并遍历查看结果*/
public class Demo {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        Collections.addAll(set,"itheima", "chinaunix", "itpub", "csdn", "51cto", "iteye");


        for (String s : set) {
            System.out.println(s);
        }
    }
}
