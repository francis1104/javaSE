package com.itheima.day11阶段检测.第二题;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();


        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"诸葛亮","赵云");

        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"唐僧","孙悟空");

        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3,"武松","鲁智深");

        map.put("三国演义",list1);
        map.put("西游记",list2);
        map.put("水浒传",list3);

        Set<String> keySet = map.keySet();

        for (String s : keySet) {
            System.out.println(s);
            ArrayList<String> list = map.get(s);
            for (String s1 : list) {
                System.out.println("\t"+s1);

            }
        }


    }
}
