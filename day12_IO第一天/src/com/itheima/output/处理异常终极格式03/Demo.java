package com.itheima.output.处理异常终极格式03;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    1. finally 里面的代码什么时候执行?
            1.1 没有异常发生: try走完就走finally
            1.2 发生异常后,走catch,catch走完了还要走finally
            1.3 发生异常后,即便catch不住,也要走finally
                    结论: 一定会执行
    2. finally 里面的代码一定会执行吗?  -- 是的
 */
public class Demo {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("day12_IO第一天/a.txt");
            System.out.println(2 / 0);
            fos.write(97);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
