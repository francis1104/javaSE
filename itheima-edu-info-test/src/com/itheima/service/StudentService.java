package com.itheima.service;

import com.itheima.dao.BaseStudentDao;
import com.itheima.dao.StudentDao;
import com.itheima.domain.Student;
import com.itheima.factory.StudentDaoFactory;

public class StudentService {
    BaseStudentDao dao = StudentDaoFactory.getStudentDao();

    //添加
    public boolean addStudent(Student stu) {
        return dao.addStudent(stu);
    }

    //查询
    public Student[] findAllStudent() {
        return dao.findAllStudent();
    }

    //删除
    public boolean deleteStudent(String id) {
        return dao.deleteStudent(id);
    }

    //判断id是否存在
    public boolean isExists(String id) {
        return dao.isExists(id);
    }

    //修改
    public void updateStudent(Student newStu) {
        dao.updateStudent(newStu);
    }
}
