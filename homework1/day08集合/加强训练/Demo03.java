package com.itheima.day08集合.加强训练;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*马冬梅一次性购买了5本书，请定义一个List集合，存储以下书名：
“JavaEE企业级开发指南”，”Oracle高级编程”，”Oracle从入门到精通”， ”Java架构师之路”，“Java核心思想”。

请编程实现以下功能：
    1  使用迭代器遍历所有元素，并打印
    2  筛选书名小于10个字符的，并打印
    3  筛选书名中包含“Java”的，并打印
    4  如果书名中包含“Oracle”，则删掉此书。删掉后，打印集合中的所有书名。
     (注意：以上功能写在一个main()方法中，每一个功能单独实现)*/
public class Demo03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"JavaEE企业级开发指南","Oracle高级编程","Oracle从入门到精通", "Java架构师之路","Java核心思想");

        Iterator<String> it = list.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("-----小于10字符的书-----");

        for (String s : list) {
            if (s.length()<10){
                System.out.println(s);
            }
        }

        System.out.println("------包含Java的-----");

        for (String s : list) {
            if (s.contains("Java")) {
                System.out.println(s);
            }

        }

        /*for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("Oracle")) {
                list.remove(i);
                i--;
            }
        }*/

        list.removeIf((String s)->{return s.contains("Oracle");});

        System.out.println("list = " + list);










    }
}
