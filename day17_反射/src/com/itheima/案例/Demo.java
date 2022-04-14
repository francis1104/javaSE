package com.itheima.案例;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo {
    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();

        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("prop1.properties");

        InputStreamReader isr = new InputStreamReader(is, "utf-8");

        prop.load(isr);
        isr.close();

        Class clazz = Class.forName(prop.getProperty("className"));

        Object obj = clazz.newInstance();

        Method method = clazz.getDeclaredMethod(prop.getProperty("methodName"));

        method.setAccessible(true);

        method.invoke(obj);
    }
}
