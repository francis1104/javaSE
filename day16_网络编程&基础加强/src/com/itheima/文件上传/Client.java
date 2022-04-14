package com.itheima.文件上传;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10000);

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day16_网络编程&基础加强/ClientDir/b.png"));

        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());

        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
            bos.flush();
        }

        socket.shutdownOutput();


        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }

        bis.close();
        socket.close();


    }
}
