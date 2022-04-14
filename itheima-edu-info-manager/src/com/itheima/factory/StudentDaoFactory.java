package com.itheima.factory;

import com.itheima.dao.BaseStudentDao;
import com.itheima.dao.OtherStudentDao;
import com.itheima.dao.StudentDao;

/*
    学生库管工厂:
        核心职责: 专门对外生产学生库管对象!
 */
public class StudentDaoFactory {

    //当方法的返回值类型是共有的接口/父类型时,方法中要返回的是接口的任意实现类对象/任意子类对象!
    public static BaseStudentDao getStudentDao(){
        return new OtherStudentDao();
    }
}
