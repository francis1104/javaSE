package com.itheima.day10map.第九题;

import java.util.HashMap;

/*现获取到一段文本，如下：
wo ai heima wo ai java wo yao hao hao xue xi java
单词间以空格分隔，请编写程序统计这段文本中每个单词出现的次数。输出格式如下：
xi(1)java(2)yao(1)hao(2)wo(3)ai(2)heima(1)xue(1)*/
public class Demo {
    public static void main(String[] args) {
        String s ="wo ai heima wo ai java wo yao hao hao xue xi java";
        String[] s1 = s.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String str : s1) {
            if (map.containsKey(str)) {
                Integer num = map.get(str);
                num++;

                map.put(str,num);
            }else {
                map.put(str,1);
            }
        }

        map.forEach((key,value)->{
            System.out.print(key+"("+value+")");

        });

    }
}
