package com.itheima.生产者消费者;

public class Demo {
    public static void main(String[] args) {
        //
        new Thread(() -> {
            while (true) {
                synchronized ("桌子") {

                    if (Desk.count <= 0) {
                        break;
                    } else {
                        if (Desk.flag) {
                            try {
                                "桌子".wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        } else {
                            System.out.println("厨师正在生产汉堡~");
                            Desk.flag = true;
                            "桌子".notifyAll();
                        }
                    }

                }
            }

        }).start();


        new Thread(()->{
            while (true){
                synchronized ("桌子"){
                    if (Desk.count<=0){
                        break;
                    }else {
                        if (Desk.flag){
                            System.out.println("吃货正在吃汉堡");
                            Desk.count--;
                            Desk.flag=false;
                            "桌子".notifyAll();
                        }else {
                            try {
                                "桌子".wait();
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
