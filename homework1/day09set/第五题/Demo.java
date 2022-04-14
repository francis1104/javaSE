package com.itheima.day09set.第五题;

import java.util.Random;
import java.util.TreeSet;

/*彩票双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。红色球号码从1~33中选择；
蓝色球号码从1~16中选择；请结合集合所学知识，随机生成一注双色球号码，要求同色号码不重复。*/
public class Demo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        Random r = new Random();

        System.out.print("蓝球:");
        System.out.print(r.nextInt(16)+1);

        for (int i = 0; i < 6; i++) {
            int red = r.nextInt(33) + 1;
            boolean res = set.add(red);

            if (!res){
                i--;
            }

        }

        System.out.println(" "+"红球:" + set);


    }
}
