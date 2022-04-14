package com.itheima.day09set.第六题;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

/*现获取到一个字符串"90 -7 0 18 2 0 2 2 45 4"，其中的数据是空格间隔的一些数字，
请使用集合所学知识将字符串中的数值进行降序排序，但不要去除其中的重复数字。 */
public class Demo {
    public static void main(String[] args) {
        String s = "90 -7 0 18 2 0 2 2 45 4";
        String[] split = s.split(" ");

        TreeSet<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int result = Integer.parseInt(o2) - Integer.parseInt(o1);

                if (result == 0) {
                    return 1;
                }
                return result;

            }
        });

        for (String s1 : split) {
            set.add(s1);
        }

        System.out.println(set);
    }
}
