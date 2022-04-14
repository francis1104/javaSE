package com.itheima.service;

import com.itheima.dao.BaseStudentDao;
import com.itheima.domain.Student;
import com.itheima.factory.StudentDaoFactory;

public class StudentService {
    //库管对象
    private BaseStudentDao dao = StudentDaoFactory.getStudentDao();

    //业务员添加学生方法
    public boolean addStudent(Student stu) {
        return dao.addStudent(stu);
    }

    //业务员查询学生方法
    public Student[] findAllStudent() {
        return dao.findAllStudent();
    }
    //判断id是否存在
    public boolean isExist(String id) {
        //调用查看索引方法
        int index = dao.getIndex(id);
        //id不存在返回true
        return index == -1;
    }
    //业务员删除学生方法
    public boolean deleteStudent(String delid) {
        return dao.deleteStudent(delid);
    }
    //业务员修改学生方法
    public void updateStudent(Student stu) {
        dao.updateStudent(stu);
    }
}
