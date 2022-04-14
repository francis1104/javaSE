package com.itheima.day17反射.第四题;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Properties;

/*在当前模块目录下有properties格式的配置文件（直接准备好即可），内容如下：
className=com.itheima.Teacher
methodName=teach
同时，在com.itheima包下定义标准的JavaBean，名为Teacher，提供teach方法（无参无返回值，自定义即可）。
请读取该配置文件，使用反射技术，加载这个类，并运行配置的方法。*/
public class Demo {
    public static void main(String[] args) throws Exception {
        //获取一个类加载器
        ClassLoader loader = ClassLoader.getSystemClassLoader();

        //加载prop配置文件
        //className=com.itheima.day17反射.第四题.Teacher
        //methodName=teach
        InputStream is = loader.getResourceAsStream("prop.properties");

        //转个码
        InputStreamReader isr = new InputStreamReader(is, "utf-8");

        //创建properties对象并加载
        Properties prop = new Properties();
        prop.load(isr);

        //通过配置文件获取字节码对象
        Class clazz = Class.forName(prop.getProperty("className"));

        //通过配置文件获取方法
        Method method = clazz.getDeclaredMethod(prop.getProperty("methodName"));

        //暴力反射
        method.setAccessible(true);

        //执行方法
        method.invoke(clazz.newInstance());

    }
}
