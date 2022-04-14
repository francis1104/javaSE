package com.itheima.day14IO.第三题;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/*现已知有一个文件（文件保存在模块目录下names.txt）里面存储了班级同学的姓名，
每一个姓名占一行。请编写程序实现随机获取到其中一个同学的姓名。（随机点名器）*/
public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("homework/name.txt"));

        ArrayList<String> list = new ArrayList<>();

        String s;
        while ((s = br.readLine()) != null){

            list.add(s);
        }

        Random r = new Random();

        int randomNum = r.nextInt(list.size());

        System.out.println(list.get(randomNum));

    }
}
