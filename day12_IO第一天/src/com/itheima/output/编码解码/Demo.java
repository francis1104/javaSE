package com.itheima.output.编码解码;

//import com.sun.org.apache.xpath.internal.operations.String;

import sun.nio.cs.ext.GBK;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        method1();
        method2();
    }

    private static void method2() throws UnsupportedEncodingException {

        // String​(byte[] bytes)：
        //通过使用平台的默认字符集解码指定的字节数组来构造新的 String
        // String​(byte[] bytes, String charsetName)：
        //通过指定的字符集解码指定的字节数组来构造新的 String

        byte[] b1 = {-23, -69, -111, -23, -87, -84, -25, -88, -117, -27, -70, -113, -27, -111, -104};

        byte[] b2 = {-70, -38, -62, -19, -77, -52, -48, -14, -44, -79};

        String s1 = new String(b1,"utf-8");
        System.out.println(s1);

        String s2 = new String(b2, "gbk");
        System.out.println(s2);
    }


    private static void method1() throws UnsupportedEncodingException {

        // byte[] getBytes​()：
        //使用平台的默认字符集将该 String编码为一系列字节，将结果存储到新的字节数组中
        // byte[] getBytes​(String charsetName)：
        //使用指定的字符集将该 String编码为一系列字节，将结果存储到新的字节数组中

        String s = "黑马程序员";

        byte[] bytes1 = s.getBytes();

        System.out.println(Arrays.toString(bytes1));
        //[-23, -69, -111, -23, -87, -84, -25, -88, -117, -27, -70, -113, -27, -111, -104]

        byte[] bytes2 = s.getBytes("GBK");

        System.out.println(Arrays.toString(bytes2));
        //[-70, -38, -62, -19, -77, -52, -48, -14, -44, -79]
    }
}
