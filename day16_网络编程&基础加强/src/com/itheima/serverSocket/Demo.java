package com.itheima.serverSocket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo {
    public static void main(String[] args) throws IOException {
        //1.创建服务器端ServerSocket
        ServerSocket serverSocket = new ServerSocket(10086);

        //2.监听客户端连接
        Socket socket = serverSocket.accept();

        //3.通过监听到的客户端socket对象去获取输入流,读数据
        InputStream is = socket.getInputStream();

        byte[] bytes = new byte[1024];

        int len;

        while ((len = is.read(bytes)) != -1){
            System.out.println("接受到客户端数据"+new String(bytes,0,len));
        }

        //4.关流释放资源
        socket.close();
        serverSocket.close();
    }
}
