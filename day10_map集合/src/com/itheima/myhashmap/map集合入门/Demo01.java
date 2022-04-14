package com.itheima.myhashmap.map集合入门;

import java.util.HashMap;
import java.util.Map;
/*
 * Map的基本使用
 *  map集合特点:
 *      元素是由键值对儿组成
 *      一个键,对应一个值,键唯一,值可以重复!
 *      所有map集合的实现类,其数据结构主要体现在键上!
 *      map集合没有索引
 */
public class Demo01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("heima001","小智");
        map.put("heima002","小美");
        map.put("heima003","大胖");
        //键相同,值覆盖
        map.put("heima003","打字");

        System.out.println(map);


    }
}
