package com.itheima.file.创建文件夹和文件;

import java.io.File;
import java.io.IOException;

//需求1: 创建File对象, 指向 D:\itheima\a.txt
//注意: File对象的创建仅仅只是在内存中创建了一个对象而已
// 这个file对象仅仅只是记录了我们指定的路径而已,这个路径可以存在,也可以不存在
public class Demo {
    public static void main(String[] args) throws IOException {
        File file = new File("day11_stream流&File/a.txt");
        //创建文件
        boolean result = file.createNewFile();
        System.out.println("result = " + result);

        //需求2:在itheima文件夹下创建一个文件
        //注意file既可以指向文件,也可以指向文件夹
        File file1 = new File("day11_stream流&File/itheima");
        //先创建文件夹
        file1.mkdirs();

        //再创建文件
        File file2 = new File(file1, "b.txt");
        file2.createNewFile();

        //需求3:再itheima文件夹下,创建一个文件:c.txt
        File file3 = new File(file1, "c.txt");
        file3.createNewFile();

        file.delete();
        file2.delete();
        file3.delete();
        file1.delete();

    }
}
