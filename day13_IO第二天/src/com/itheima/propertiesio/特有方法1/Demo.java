package com.itheima.propertiesio.特有方法1;

import java.util.Properties;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        //设置集合的键和值,都是String类型,底层调用Hashtable方法put
        Properties prop = new Properties();
        prop.setProperty("江苏","南京");
        prop.setProperty("安徽","南京");
        prop.setProperty("山东","济南");

        System.out.println( prop);

        //使用此属性列表中指定的键搜索属性
        String value = prop.getProperty("江苏");

        System.out.println(value);

        //从该属性列表中返回一个不可修改的键集
        Set<String> keys = prop.stringPropertyNames();

        for (String key : keys) {
            String value1 = prop.getProperty(key);

            System.out.println(key+"="+value1);
        }

    }
}
