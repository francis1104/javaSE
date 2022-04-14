package com.itheima.day15多线程.题目五;
/*有一个存放牛奶的箱子，送奶工将牛奶放入箱子，而用户从箱子中获取到牛奶，
假设箱子只能存储一瓶牛奶，请编写程序模拟牛奶的存储和获取过程。*/
public class Demo {
    public static void main(String[] args) {
        new Thread(()->{
            while (true){
                synchronized ("box"){
                    if (Box.num<=0){
                        break;
                    }else {
                        if (Box.box){
                            try {
                                "box".wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }else {

                            Box.box=true;
                            System.out.println("送奶工送牛奶......");
                            "box".notifyAll();
                        }

                    }
                }
            }
        }).start();

        new Thread(()->{
            while (true){
                synchronized ("box"){
                    if (Box.num<=0){
                        break;
                    }else {
                        if (Box.box){

                            Box.num--;
                            Box.box=false;
                            System.out.println("用户喝牛奶");
                            "box".notifyAll();


                        }else {
                            try {
                                "box".wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                    }
                }
            }
        }).start();
    }
}

class Box {
    static boolean box = false;

    static int num = 30;
}