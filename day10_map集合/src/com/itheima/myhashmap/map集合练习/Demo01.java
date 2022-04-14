package com.itheima.myhashmap.map集合练习;

import java.util.HashMap;
import java.util.Map;

public class Demo01 {
    public static void main(String[] args) {
        // 创建一个map集合,基于多态语法,new的是实现类: HashMap
        Map<String,String> map = new HashMap<>();
        //需求1: 向map集合中添加三组元素:  郭靖-->黄蓉   杨过-->小龙女   张无忌-->周芷若
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");
        map.put("张无忌","周芷若");

        //需求2: 将张无忌对应的值修改为赵敏

        map.put("张无忌","赵敏");

        //需求3: 将杨过-->小龙女从集合中移除

        map.remove("杨过");

        //需求4: 判断集合中是否包含键: 张无忌

        System.out.println(map.containsKey("张无忌"));

        //需求5: 判断集合中是否包含键: 尹志平

        System.out.println(map.containsKey("尹志平"));

        //需求6: 判断集合中是否包含值: 灭绝师太

        System.out.println(map.containsValue("灭绝师太"));

        //需求7: 将当前map集合的键值对个数输出到控制台

        System.out.println(map.size());

        //需求8: 判断当前map集合是否为空,将结果输出到控制台

        System.out.println(map.isEmpty());

        //需求9: 将当前map集合清空

        map.clear();

        //需求10: 再判断当前map集合是否为空,将结果输出到控制台

        System.out.println(map.isEmpty());

        System.out.println(map);
    }
}
