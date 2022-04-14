package com.itheima.day10map.第七题;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*现已知世界杯举办的年份以及对应年份的冠军国家信息，数据如下：
("1930", "乌拉圭");
("1934", "意大利");
("1938", "意大利");
("1950", "乌拉圭");
("1954", "西德");
("1958", "巴西");
("1962", "巴西");
("1966", "英格兰");
("1970", "巴西");
("1974", "西得");
("1978", "阿根廷");
("1982", "意大利");
("1986", "阿根廷");
("1990", "西得");
("1994", "巴西");
("1998", "法国");
("2002", "巴西");
("2006", "意大利");
("2010", "西班牙");
("2014", "德国");
("2018", "法国");
请编写程序，可以根据年份查询该年份的冠军国家，也可以根据国家，查询该国家获得世界杯冠军的所有年份。运行效果如下：
请输入年份：
2018
2018年的世界杯冠军是：法国
请输入国家：
巴西
巴西获得世界杯的年份是：
1962
1994
1970
2002
1958
------如果输入的年份和国家没有匹配，输出如下------
请输入年份：
2017
2017年没有举办世界杯
请输入国家：
中国
中国没有获得过世界杯冠军*/
public class Demo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        map.put("1930", "乌拉圭");
        map.put("1934", "意大利");
        map.put("1938", "意大利");
        map.put("1950", "乌拉圭");
        map.put("1954", "西德");
        map.put("1958", "巴西");
        map.put("1962", "巴西");
        map.put("1966", "英格兰");
        map.put("1970", "巴西");
        map.put("1974", "西得");
        map.put("1978", "阿根廷");
        map.put("1982", "意大利");
        map.put("1986", "阿根廷");
        map.put("1990", "西得");
        map.put("1994", "巴西");
        map.put("1998", "法国");
        map.put("2002", "巴西");
        map.put("2006", "意大利");
        map.put("2010", "西班牙");
        map.put("2014", "德国");
        map.put("2018", "法国");

        System.out.println("请输入年份：");
        String year = sc.next();

        String country = map.get(year);

        if (country==null){
            System.out.println(year+"年没有举办世界杯");
        }else {
            System.out.println(year+"年的世界杯冠军是:"+country);
        }

        System.out.println("请输入国家:");

        String country2 = sc.next();

        if (map.containsValue(country2)) {
            System.out.println(country2+"获得世界杯的年份是:");
        }else {
            System.out.println(country2+"没有获得过世界杯冠军");
        }

        map.forEach((k,v)->{
            if (v.equals(country2)){
                System.out.println(k);
            }
        });


    }
}
