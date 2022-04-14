package com.itheima.day08集合.第七题;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*2016年里约热内卢奥运会足球比赛，共有16只球队参赛，分别是巴西、阿根廷、丹麦、德国、葡萄牙、瑞典、斐济、
洪都拉斯、墨西哥、阿尔及利亚、尼日利亚、南非、伊拉克、日本、韩国、哥伦比亚。请使用所学集合知识，
编写程序把这16支球队随机分成四组，输出结果如下：
第1组：
哥伦比亚 韩国 伊拉克 葡萄牙
第2组：
阿尔及利亚 南非 斐济 尼日利亚
第3组：
阿根廷 墨西哥 日本 洪都拉斯
第4组：
瑞典 丹麦 德国 巴西*/
public class Demo {
    public static void main(String[] args) {
//        String s = "巴西、阿根廷、丹麦、德国、葡萄牙、瑞典、斐济、洪都拉斯、墨西哥、阿尔及利亚、尼日利亚、南非、伊拉克、日本、韩国、哥伦比亚";
//        String s1 = s.replaceAll("、", "\",\"");
//        System.out.println("s1 = " + s1);

        Random r = new Random();

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> newList = new ArrayList<>();

        Collections.addAll(list, "巴西", "阿根廷", "丹麦", "德国", "葡萄牙", "瑞典", "斐济", "洪都拉斯", "墨西哥", "阿尔及利亚", "尼日利亚", "南非", "伊拉克", "日本", "韩国", "哥伦比亚");
        //记录一下最大长度,防止删除元素改变for判断条件
        int size = list.size();

        for (int i = 0; i < size; i++) {
            //生成一个集合长度范围的索引
            int randomIndex = r.nextInt(list.size());
            //删除这个索引并拷贝到新集合
            String randomCountry = list.remove(randomIndex);

            newList.add(randomCountry);
        }

        int count = 1;
        System.out.println("第"+count+"组");
        for (int i = 0; i < newList.size(); i++) {

            if (i != 0 && i % 4 == 0) {
                System.out.println();
                count++;
                System.out.println("第"+count+"组");

            }
            System.out.print(newList.get(i)+" ");


        }


    }
}
