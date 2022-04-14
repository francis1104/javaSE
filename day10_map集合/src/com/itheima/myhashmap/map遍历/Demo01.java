package com.itheima.myhashmap.map遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) {
        //创建集合并添加元素
        //HashMap在底层做数据存储时,只算键的哈希值,然后计算存入索引位置
        HashMap<String, String> map = new HashMap<>();

        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        map.put("4","4");
        map.put("5","5");
        //方式一:先获取得到所有键
        Set<String> keys = map.keySet();

        //遍历键集合得到每一个键
        for (String key : keys) {
            //通过键key,来获取到对应的值
            String value = map.get(key);

            System.out.println(key+"---"+value);

        }

        System.out.println("-----------------------------");
        //方式二:先拿到所有键和值的整体
        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry : entries) {

            System.out.println(entry.getKey()+"----"+entry.getValue());

        }


        System.out.println("-----------------------------");
        //方式三:通过forEach结合Lambda表达式实现

        map.forEach((String key, String value)->{
            System.out.println(key+"------"+value);
        });


    }
}
