package com.itheima.day08集合.加强训练;

import java.util.TreeSet;

/*有一串没有任何规律的字符串"kjsdneosjsakewoiqercnjnvz923nj4339ufd",现需要将字符串中重复的字符去掉，并且
进行自然排序后得到新的字符串，最后输出新的字符串。*/
public class Demo04 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        String s = "kjsdneosjsakewoiqercnjnvz923nj4339ufd";

        char[] chars = s.toCharArray();

        for (char c : chars) {
            set.add(c+"");
        }
        
        String newStr = "";
        
        for (String s1 : set) {
            newStr+=s1;
        }

        System.out.println("newStr = " + newStr);
    }
}
