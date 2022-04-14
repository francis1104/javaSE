package com.itheima.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Demo {
    public static void main(String[] args) throws IOException {
        //1.创建客户端socket
        Socket socket = new Socket("127.0.0.1",10086);

        //2.通过socket对象获取输出流,基于输出流往外写数据
        OutputStream os = socket.getOutputStream();
        os.write("hello".getBytes());

        //关流,释放资源
        os.close();
        socket.close();
    }
}
