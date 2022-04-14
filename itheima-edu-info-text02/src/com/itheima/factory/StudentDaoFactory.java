package com.itheima.factory;

import com.itheima.dao.BaseStudentDao;
import com.itheima.dao.OtherStudentDao;

public class StudentDaoFactory {

    public static BaseStudentDao getStudentDao(){
        return new OtherStudentDao();
    }
}
