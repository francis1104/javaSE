package com.itheima.字符流输出入门;

import java.io.FileWriter;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day13_IO第二天/a.txt");
        //1.将字符'我'写到当前模块下的a.txt
        fw.write('我');
        //换行
        fw.write(System.lineSeparator());
        //2.将字符数组写入
        char[] chs = {'黑','马','程','序','员'};
        fw.write(chs);
        //3.将字符数组从1索引位置开始写入3个字符
        fw.write(chs,1,3);
        //4.写入字符串
        fw.write("键盘敲烂,月薪过万");
        //5.将字符串中"学习,天天"写到文件
        fw.write("好好学习,天天向上",2,5);
        //注意:字符流写数据时一定要记得关流,否则数据进不到文件
        fw.close();


    }
}
