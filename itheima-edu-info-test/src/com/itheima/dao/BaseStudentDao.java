package com.itheima.dao;

import com.itheima.domain.Student;

public interface BaseStudentDao {
    //添加
    public boolean addStudent(Student stu);

    //查询,直接返回数组
    public Student[] findAllStudent();

    //删除
    public boolean deleteStudent(String id);

    //查找id是否存在
    public boolean isExists(String id);

    //修改
    public void updateStudent(Student newStu);
}
