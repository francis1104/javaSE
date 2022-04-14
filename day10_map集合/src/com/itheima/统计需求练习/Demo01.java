package com.itheima.统计需求练习;

import java.util.HashMap;

/*
 * 字符串“aababcabcdabcde”
 * 请统计字符串中每一个字符出现的次数，并按照以下格式输出
 * 输出结果：
 * a（5）b（4）c（3）d（2）e（1）
 */
public class Demo01 {
    public static void main(String[] args) {
        String s = "sdfafasdfasfsdfailerbhgwwfiuhoefieowurearsfbhibalrhiefvbhaflsdecibdlrbferica";
        //1.定义一个HashMap集合
        HashMap<Character, Integer> map = new HashMap<>();
        //2.遍历字符串
        for (int i = 0; i < s.length(); i++) {
            //获取当前每一个索引位置的字符
            char code = s.charAt(i);
            //判断当前code在map中是否已经统计过
            if (map.containsKey(code)){
                //先将之前的次数取出
                Integer count = map.get(code);
                //将原有次数+1
                count++;
                //将加完后的次数重新设置会集合,键相同,值覆盖
                map.put(code,count);

            }else {
                //没有,说明字符第一次出现
                map.put(code,1);
            }

        }
        //遍历集合
        map.forEach((k,v)->{
            System.out.print(k+"("+v+")");
        });
    }
}
