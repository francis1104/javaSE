package com.itheima.案例一;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);

        Socket s = ss.accept();

        InputStream is = s.getInputStream();
        int b;
        while ((b = is.read()) != -1){
            System.out.println((char) b);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream(), "utf-8"));

        bw.write("你谁啊?");
        bw.newLine();
        bw.flush();

        s.close();
        ss.close();

    }
}
