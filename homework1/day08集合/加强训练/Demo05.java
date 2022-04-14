package com.itheima.day08集合.加强训练;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/*某it公司项目组总共有8名开发人员，分别是：
"SMITH"、"MARTIN"、"ALLEN"、"SCOTT"、"TURNERS"、"KING"、"MILLER"、"JONES"
项目经理SMITH为了让大家能够快速相互认识，所以决定让团队人员都做一个自我介绍，自我介绍的顺序是：名字越
短越先自我介绍，名字长度一致，那么就按字符串的自然顺序自我介绍。*/
public class Demo05 {
    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int result = o1.length() - o2.length();

                return result==0? o1.compareTo(o2):result;
            }
        });

        Collections.addAll(set,"SMITH","MARTIN","ALLEN","SCOTT","TURNERS","KING","MILLER","JONES");


        System.out.println(set);
    }
}
