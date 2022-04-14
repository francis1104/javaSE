package com.itheima.output.字节输出流01;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        //1.创建字节输出流的对象 --- 告诉虚拟机我要往哪个文件中写数据了  -- true: 表示开启续写功能.
        /*
            输出流的特点: 文件存在: 默认会先清空文件原有内容. 然后再往里写本次要输出的内容.
                        文件不存在: 帮我们自动创建这个文件
         */
        FileOutputStream fos = new FileOutputStream("day12_IO第一天/a.txt",true);

        //2,写数据
        // 传递一个整数时,那么实际上写到文件中的,是这个整数在码表中对应的那个字符.
        fos.write(65);
        fos.write(66);
        fos.write(67);

        //3.释放资源
        fos.close();//告诉操作系统,我现在已经不要再用这个文件了.
    }
}
