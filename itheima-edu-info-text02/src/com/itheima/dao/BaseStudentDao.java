package com.itheima.dao;

import com.itheima.domain.Student;

public interface BaseStudentDao {


    //库管中的添加方法
    boolean addStudent(Student stu);

    //库管中查询学生方法
    Student[] findAllStudent();

    boolean isEmpty();

    int getIndex(String id);

    boolean deleteStudent(String delid);

    void updateStudent(Student stu);
}
