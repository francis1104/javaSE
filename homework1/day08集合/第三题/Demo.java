package com.itheima.day08集合.第三题;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*顺序列表ArrayList中存储了如下字符串["hehe", "haha", "heihei", "gege", "gaga"]，请使用迭代器遍历集合，按顺序输出元素。*/
public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"hehe","haha","heihei","gege","gaga");

        Iterator<String> it = list.iterator();

        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
}
