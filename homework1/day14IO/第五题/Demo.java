package com.itheima.day14IO.第五题;

import java.io.*;
import java.util.ArrayList;

/*在当前模块目录下，有一个“maths.txt”文件（直接准备好即可），其中的文本内容如下：
5+5
10-5
2*3
20/4
...
每行一个算术表达式，每个式子都是使用加减乘除符号连接的两个数字，没有其他数据。
请编写程序将每个式子的结果计算出来，再写回这个文件中。程序执行后，文件中的内容为：
5+5=10
10-5=5
2*3=6
20/4=5
...*/
public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("homework/maths.txt"));


        ArrayList<String> result = new ArrayList<>();

        String s;
        while ((s = br.readLine()) != null) {


            if (s.contains("+")){
                String[] num = s.split("\\+");
                int res = Integer.parseInt(num[0]) + Integer.parseInt(num[1]);
                result.add(s+"="+res);
            }

            if (s.contains("-")){
                String[] num = s.split("-");
                int res = Integer.parseInt(num[0]) - Integer.parseInt(num[1]);
                result.add(s+"="+res);
            }

            if (s.contains("*")){
                String[] num = s.split("\\*");
                int res = Integer.parseInt(num[0]) * Integer.parseInt(num[1]);
                result.add(s+"+"+res);
            }

            if (s.contains("/")){
                String[] num = s.split("/");
                int res = Integer.parseInt(num[0]) / Integer.parseInt(num[1]);
                result.add(s+"="+res);
            }

        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("homework/maths.txt"));

        for (String s1 : result) {

            bw.write(s1);
            bw.newLine();
        }


        bw.close();

        br.close();
    }
}
