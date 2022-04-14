package com.itheima.controller;

import com.itheima.domain.Manager;
import com.itheima.domain.Subway;
import com.itheima.service.SubwayService;

import java.util.ArrayList;
import java.util.Scanner;

public class SubwayController {

    private SubwayService service = new SubwayService();
    private Scanner sc = new Scanner(System.in);

    public void start() {

        while (true) {
            System.out.println("=============北京地铁管理系统=============");
            System.out.println("1.查看地铁站");
            System.out.println("2.添加地铁站");
            System.out.println("3.退出");


            String option = sc.next();

            switch (option) {
                case "1":
                    findAllSubways();
                    break;
                case "2":
                    addSubway();
                    break;
                case "3":
                    System.out.println("欢迎下次使用!");
                    System.exit(0);
                default:
                    System.out.println("您的输入有误");
                    break;
            }
        }

    }
    //添加地铁
    private void addSubway() {
        String sbCode;
        while (true) {
            System.out.println("请输入地铁站编号:");
            sbCode = sc.next();

            boolean res = service.codeIsExist(sbCode);
            if (res) {
                System.out.println("编号不可用");
            } else {
                break;
            }
        }


        System.out.println("请输入地铁站名称:");
        String sbName = sc.next();
        System.out.println("请输入所属路线:");
        String sbRoute = sc.next();

        Subway subway = new Subway(sbCode, sbName, sbRoute);

        boolean res = service.addSubway(subway);

        System.out.println(res ? "添加成功" : "添加失败");

    }

    //查找地铁
    private void findAllSubways() {
        ArrayList<Subway> swlist = service.findAllSubways();

        if (swlist.size() == 0){
            System.out.println("暂无信息,请添加后再试...");

        }else {

            System.out.println("地铁站信息为:");
            for (Subway subway : swlist) {
                System.out.println(subway.toString());
            }
        }
    }

    public ArrayList<Manager> getAllManager() {

        return service.getAllManager();
    }
}
