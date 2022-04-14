package com.itheima.day10map.第三题;

import java.util.HashSet;
import java.util.Iterator;

/*以下代码完成的功能是遍历HashSet集合，打印每个字符串元素以及元素的长度。
但运行程序后出现异常，请排查错误原因并改正，以保证代码能够正确运行。*/
public class Demo {
    public static void main(String[] args) {
        // 1. 创建HashSet集合
        HashSet<String> hs = new HashSet<>();
        // 2. 添加数据到集合
        hs.add("itcast");
        hs.add("itheima");
        hs.add("javase");
        // 3. 迭代器遍历集合元素
        Iterator<String> it = hs.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.print(s+" ");
            System.out.println(s.length());
        }
    }
}
