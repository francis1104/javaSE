package com.itheima.day14IO.第四题;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/*在当前模块目录下，有一个“msg.txt”文件（直接准备好即可），其中的文本内容保存了一个学生的信息，如下：
id=heima001
name=张三
age=23
school=黑马程序员
每条信息都是属性名称=属性值的格式，每条信息占据一行。
请编程读取文件中的内容，将等号前面的部分作为键，等号后面的部分作为值，存入map集合中。*/
public class Demo {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> hm = new HashMap<>();

        BufferedReader br = new BufferedReader(new FileReader("homework/msg.txt"));

        String s;
        while ((s = br.readLine()) != null) {
            String[] strs = s.split("=");

            hm.put(strs[0],strs[1]);
        }

        br.close();

        System.out.println(hm);


    }
}
