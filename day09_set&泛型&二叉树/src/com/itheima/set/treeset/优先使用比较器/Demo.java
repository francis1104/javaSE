package com.itheima.set.treeset.优先使用比较器;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

//需求:集合添加一些字符串,要求按字符串长度进行排序,如果长度一致,则按字典顺序排序.

public class Demo {
    public static void main(String[] args) {
        //自然排序能做的,比较器都能做,自然排序做不了的,比较器也能做.   -----基本上使用比较器.
        TreeSet<String> set = new TreeSet<>(
                new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        //主要条件:根据长度升序
                        int result = o1.length() - o2.length();
                        //次要条件:长度一致,根据字典顺序
                        result = result == 0 ? o1.compareTo(o2) : result;

                        return result;

                    }
                }
        );

        Collections.addAll(set,"c","ab","df","qwer");

        System.out.println(set);




    }
}
