package com.itheima.文件上传;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class ThreadSocket implements Runnable {
    Socket threadSocket ;

    public ThreadSocket(Socket s) {
        threadSocket = s;
    }

    @Override
    public void run() {
        BufferedOutputStream bos = null;
        try {
            BufferedInputStream bis = new BufferedInputStream(threadSocket.getInputStream());
//            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day16_网络编程&基础加强/ServerDir/"+System.currentTimeMillis()+".png"));
            bos = new BufferedOutputStream(new FileOutputStream("day16_网络编程&基础加强/ServerDir/"+ UUID.randomUUID().toString() +".png"));

            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
                bos.flush();
            }

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(threadSocket.getOutputStream()));

            bw.write("上传成功");
            bw.newLine();
            bw.flush();


        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                threadSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
