package com.itheima.service;

import com.itheima.dao.SubwayDao;
import com.itheima.domain.Manager;
import com.itheima.domain.Subway;

import java.util.ArrayList;

public class SubwayService {
    private SubwayDao dao = new SubwayDao();
    public ArrayList<Subway> findAllSubways() {
        return dao.findAllSubways();

    }

    public boolean addSubway(Subway subway) {
        return dao.addSubway(subway);
    }

    public ArrayList<Manager> getAllManager() {
        return dao.getAllManager();
    }

    public boolean codeIsExist(String sbCode) {
        return dao.codeIsExist(sbCode);
    }
}
