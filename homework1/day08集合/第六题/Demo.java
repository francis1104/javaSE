package com.itheima.day08集合.第六题;

import java.util.ArrayList;
import java.util.Collections;

/*某程序员从网页中获取了一些字符串类型的QQ号码存入了列表ArrayList中，但忘记了做数字长度校验，
如下["123", "1234", "12345", "654123", "456789123", "1112222333444", "555555", ]。
QQ的长度只有5-10位才是有效号码，很显然有一些非法数据。请删除其中那些不符合条件的号码，并将合法数据遍历输出。
运行结果：
12345
654123
56789123
555555*/
public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "123", "1234", "12345", "654123", "456789123", "1112222333444", "555555");

        list.removeIf(s -> s.length() > 10 || s.length() < 5);

        System.out.println("list = " + list);
    }
}
