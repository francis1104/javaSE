package com.itheima.dao;

import com.itheima.domain.Manager;
import com.itheima.domain.Subway;

import java.io.*;
import java.util.ArrayList;

public class SubwayDao {

    private static ArrayList<Subway> swList = new ArrayList<>();
    private static ArrayList<Manager> mList = new ArrayList<>();
    //程序运行时初始化管理人员和地铁信息
    static {
        System.out.println("=======load=======");
        try {
            loadSubwaysMsg();
            loadManagerMsg();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //查找地铁信息的方法
    public ArrayList<Subway> findAllSubways() {
        return swList;
    }

    //加载本地地铁信息
    private static void loadSubwaysMsg() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("itheima-subways-manager/subways.txt"));

        String line;
        while ((line = br.readLine()) != null){
            String[] allmsg = line.split(",");
//            System.out.println(allmsg.length);
            Subway subway = new Subway(allmsg[0], allmsg[1], allmsg[2]);

            swList.add(subway);
        }

        br.close();
    }

    //加载本地管理员信息
    private static void loadManagerMsg() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("itheima-subways-manager/managers.txt"));

        String line;
        while ((line = br.readLine()) != null){
            String[] allmsg = line.split(",");

            Manager manager = new Manager(allmsg[0], allmsg[1], allmsg[2], allmsg[3]);
            mList.add(manager);
        }

        br.close();
    }

    //把地铁信息添加到集合
    public boolean addSubway(Subway subway) {
        swList.add(subway);
        try {
            submitSubwaysMsg(subway);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    //用于把地铁信息存到本地
    private void submitSubwaysMsg(Subway subway) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("itheima-subways-manager/subways.txt", true));

        String code = subway.getSubwayCode();
        String name = subway.getSubwayName();
        String route = subway.getSubwayRoute();

        bw.write(code+","+name+","+route);
        bw.newLine();
        bw.flush();
        bw.close();
    }

    //获取管理人员信息
    public ArrayList<Manager> getAllManager() {
        return mList;
    }

    //查询地铁编号是否唯一
    public boolean codeIsExist(String sbCode) {
        boolean flag = false;
        for (Subway subway : swList) {
            if (subway.getSubwayCode().equals(sbCode)) {
                flag=true;
            }
        }
        return flag;
    }
}
