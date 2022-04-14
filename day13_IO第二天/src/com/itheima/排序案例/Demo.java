package com.itheima.排序案例;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
//需求：读取文件中的数据，排序后再次写到本地文件
//1.要把文件中的数据读取进来。
public class Demo {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("day13_IO第二天/sort.txt"));
        //1.用缓冲字符输入流在本地 新建一个sort.txt 并输入一些用
        //  空格分割的数字,然后换行,把内容刷新一下
        bw.write("6 7 3 9 10 4 5 1");
        bw.newLine();
        bw.flush();

        BufferedReader br = new BufferedReader(new FileReader("day13_IO第二天/sort.txt"));
        //2.把这一行数字读取进来
        String s = br.readLine();
        //3.用空格切割
        String[] split = s.split(" ");

        Integer[] numbers = new Integer[split.length];
        //4.遍历字符串转换为数字放入准备好的Integer数组
        for (int i = 0; i < split.length; i++) {
            int num = Integer.parseInt(split[i]);

            numbers[i] = num;
        }
        //5.排序
        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        //6.重新写入本地
        bw.write(Arrays.toString(numbers));
        //7.关流
        bw.close();
        br.close();



    }
}
