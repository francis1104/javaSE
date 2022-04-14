package com.itheima.myStream.stream练习;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "乔杉","林青霞", "张曼玉", "王祖贤", "柳岩", "张敏", "张无忌", "张三丰", "张翠山");
        //1. 将list中前6个人截取到一个Stream流中

        Stream<String> limitStream = list.stream().limit(6);
        //注意: 所有中间操作一旦对原始的流进行了处理,那么这个原始的流就不能再从新操作了!流的操作可以理解为一次性的
        //解决方案: 每次操作如果需要对原始的老流进行处理的话,建议通过集合重新获取流
        //2. 将list中后面3个截取到一个Stream流中

        Stream<String> skipStream = list.stream().skip(list.size()-3);

        //3. 将limitStream和skipStream进行合并

        Stream<String> concat = Stream.concat(limitStream, skipStream);

        //4. 将合并后的流中的重复数据清除掉

        Stream<String> distinct = concat.distinct();

        //5. 将当前流中以张开头的数据筛选出并打印

        distinct.filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));
    }
}
