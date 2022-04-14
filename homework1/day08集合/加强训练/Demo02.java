package com.itheima.day08集合.加强训练;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

/*某JavaEE班级共有80名学生，某一天进行了一次考试，考试成绩随机产生，范围是[30,100]，
包括30也包括100的**整数**。周老师想让小王同学设计呈现完成以下4个小需求：

1、直接打印所有学生的分数；

2、统计不及格的分数的数量，并最后打印。

3、计算平均分，并最后打印。

4、求出最高分，并最后打印；*/
public class Demo02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Random r = new Random();
        while (list.size() < 80) {
            int score = r.nextInt(71) + 30;
            list.add(score);
        }

        System.out.println("所有学生分数:" + list);

        int count = 0;
        for (Integer i : list) {
            if (i < 60) {
                count++;
            }
        }

        System.out.println("不及格学生个数:" + count);

        double sum = 0;
        for (Integer i : list) {
            sum += i;
        }

        System.out.println("学生平均分:"+(sum/list.size()));

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int result = o1.compareTo(o2);
                return result;
            }
        });

        Integer max = list.get(list.size() - 1);
        System.out.println("学生最高分:" + max);

    }
}
