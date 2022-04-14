package com.itheima.day06包装类_异常.第二题;
/*现获取到用户填写的3个年龄信息，但格式是以逗号分隔的字符串形式，例如："23,24,25"（直接定义字符串给出即可）。
  现需要求出这三个年龄的平均年龄，请编写程序实现，并将结果打印到控制台。
    运行结果：
    平均年龄为：24*/
public class Demo {
    public static void main(String[] args) {
        String[] s1 = "23,24,25".split(",");

        System.out.println("平均年龄为:"+(Integer.parseInt(s1[0]) + Integer.parseInt(s1[1]) + Integer.parseInt(s1[2])) / s1.length);
    }
}
