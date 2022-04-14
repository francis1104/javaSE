package com.itheima.day08集合.加强训练;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*马冬梅所在的公司每月10号发工资，他们项目组的5个开发人员分别发了12811.12元、15335.5元、8625.6元、21288.26元、18637.78元。请完成以下需求：

1、请使用集合存储每个人的工资

2、财务部后来发现他们每个人都少发了200元补贴，现需要给他们补上，试着给集合中的元素都加200元。*/
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();

        Collections.addAll(list, 12811.12, 15335.5, 8625.6, 21288.26, 18637.78);

        System.out.println(list);

        Iterator<Double> it = list.iterator();

        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i)+200);
        }

        System.out.println(list);

    }
}
