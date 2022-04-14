package com.itheima.myclassloader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Demo {
    public static void main(String[] args) throws IOException {

        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();

        //获取系统类加载器的父加载器 --- 平台类加载器
        ClassLoader classLoader1 = systemClassLoader.getParent();

        //获取平台类加载器的父加载器 --- 启动类加载器
        ClassLoader classLoader2 = classLoader1.getParent();

        System.out.println("系统类加载器" + systemClassLoader);
        System.out.println("平台类加载器" + classLoader1);
        System.out.println("启动类加载器" + classLoader2);

        //利用参数去加载一个指定的文件
        //参数:文件路径
        //返回值:字节流
        //注意:这里的相对路径是相对于当前模块的src来说的
        Properties prop = new Properties();

        InputStream is = systemClassLoader.getResourceAsStream("prop.properties");

        prop.load(is);

        System.out.println(prop);

        is.close();
    }
}
