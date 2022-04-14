package com.itheima.entry;

import com.itheima.controller.SubwayController;
import com.itheima.domain.Manager;

import java.util.ArrayList;
import java.util.Scanner;

public class AppManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SubwayController controller = new SubwayController();

        System.out.println("请输入用户名:");
        String inputId = sc.next();
        System.out.println("请输入姓名:");
        String inputName = sc.next();

        ArrayList<Manager> mList = controller.getAllManager();
        for (Manager manager : mList) {
            if (inputId.equals(manager.getId()) && inputName.equals(manager.getName())){
                System.out.println("登录成功...");
                //进入菜单
                controller.start();
                break;
            }
        }

        //到这说明用户名或密码错误
        System.out.println("登录失败...");

    }
}
