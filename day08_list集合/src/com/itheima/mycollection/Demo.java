package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

/*
    Collection接口中的共有常用方法:
        boolean add​(E e) : 添加元素。
        boolean contains​(Object o): 如果此集合包含指定的元素，则返回 true 。
        boolean isEmpty​() : 判断集合是否为空，为空则返回 true 。
        boolean remove​(Object o) : 根据元素本身删除集合中对应的内容。
        int size​(): 返回此集合中的元素个数。

        boolean removeIf(Object o): 根据条件删除集合中的元素
        void clear(): 清空集合中的元素
 */
public class Demo {
    public static void main(String[] args) {
        // 1. 基于接口多态创建Collection集合容器
        Collection<String> coll = new ArrayList<>();
        //2. 往集合中添加3个人名
        coll.add("龟田大郎");
        coll.add("龟田次郎");
        coll.add("龟田太郎");
        //2.1 获取一下集合的元素个数,做一个输出

        System.out.println(coll.size());

        //3. 判断当前集合容器中有没有龟田大郎, 有大朗就把龟田大郎干掉

        coll.remove("龟田大郎");

        //3.1 获取一下集合的元素个数,做一个输出

        System.out.println(coll.size());

        //4. 判断当前集合是否为空并打印

        System.out.println(coll.isEmpty());

        //5. boolean removeIf(Object o): 根据条件删除集合中的元素
        //需求: 如果集合中的元素包含"太"字, 那就将该元素从集合中删除

        coll.removeIf((String s)->{
            /*char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '太'){
                    return true;
                }
            }
            return false;*/

            return s.contains("太");

        });


        //6. 将集合清空
        coll.clear();

        //打印集合
        System.out.println(coll);
    }
}
