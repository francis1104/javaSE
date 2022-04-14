package com.itheima.myStream.案例;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
 * 现在有两个ArrayList集合，分别存储6名男演员名称和6名女演员名称，要求完成如下的操作
 * 1.男演员只要名字为3个字的前两人
 * 2.女演员只要姓杨的，并且不要第一个
 * 3.把过滤后的男演员姓名和女演员姓名合并到一起
 * 4.把上一步操作后的元素作为构造方法的参数创建演员对象,遍历数据
 * 演员类Actor，里面有一个成员变量，一个带参构造方法，以及成员变量对应的get/set方法
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<>();
        manList.add("张晋");
        manList.add("刘烨");
        manList.add("徐峥");
        //草原三剑客
        manList.add("贾乃亮");
        manList.add("陈羽凡");
        manList.add("王宝强");

        ArrayList<String> womanList = new ArrayList<>();
        womanList.add("郑爽");
        womanList.add("杨紫");
        womanList.add("关晓彤");
        womanList.add("张天爱");
        womanList.add("杨幂");
        womanList.add("赵丽颖");

        Stream<String> s1 = manList.stream().filter(number -> number.length() == 3).limit(2);

        Stream<String> s2 = womanList.stream().filter(name -> name.startsWith("杨")).skip(1);

        Stream<String> concat = Stream.concat(s1, s2);

        concat.forEach(name-> {
            Actor actor = new Actor(name);

            System.out.println(actor.getName());

        });


    }
}

class Actor{
    private String name;

    public Actor() {
    }

    public Actor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

