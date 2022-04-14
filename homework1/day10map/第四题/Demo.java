package com.itheima.day10map.第四题;

import java.util.LinkedHashSet;
import java.util.Scanner;

/*现获取到用户输入的一段字符串（可从键盘录入），例如：aaaabbbcccccdd。
请编写程序获取其中无重复的字符组成一个新的字符串，即：abcd。请不要改变字符的输入顺序。*/
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        System.out.println("请输入一串字符串:");

        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            set.add(c);
        }

        StringBuilder s1 = new StringBuilder();
        for (Character c : set) {
            s1.append(c);
        }

        System.out.println(s1.toString());

    }
}
