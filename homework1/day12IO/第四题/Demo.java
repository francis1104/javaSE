package com.itheima.day12IO.第四题;

import java.io.*;

/*请使用缓冲流将D盘下的某个音频或者视频文件，拷贝到当前模块目录下，并计算拷贝过程消耗的时间，将时间（单位毫秒）打印到控制台。*/
public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/francis/Music/AppleMusicTop100/半岛铁盒.mp3"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("homework/半岛铁盒.mp3"));


        byte[] bytes = new byte[1024];
        int len;

        long start = System.currentTimeMillis();
        while ((len = bis.read(bytes)) !=-1){
            bos.write(bytes,0,len);
        }
        long end = System.currentTimeMillis();

        System.out.println("耗时:" + (end - start));
        bis.close();
        bos.close();

    }
}
