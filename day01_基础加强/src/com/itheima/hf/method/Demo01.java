package com.itheima.hf.method;

public class Demo01 {
    public static void main(String[] args) {
        print("hello",5);
    }
    public static void print(String msg,int num){
        for (int i = 0; i < num; i++) {
            System.out.println(msg);
        }
    }
}
