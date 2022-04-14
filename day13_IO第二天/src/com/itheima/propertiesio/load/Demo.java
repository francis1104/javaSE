package com.itheima.propertiesio.load;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class Demo {
    public static void main(String[] args) throws IOException {

        //void load​(Reader reader)                     将本地文件中的键值对数据读取到集合中
        //void store​(Writer writer, String comments)   将集合中的数据以键值对形式保存在本地

        Properties prop = new Properties();

        InputStreamReader fis = new InputStreamReader(new FileInputStream("day13_IO第二天/prop.properties"),"utf-8");

        //调用完了load方法后,文件中的键值对数据已经在集合中了.
        prop.load(fis);

        fis.close();

        System.out.println(prop);
    }
}
