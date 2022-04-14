package com.itheima.dao;

import com.itheima.domain.Student;

public interface BaseStudentDao {

    public boolean addStudent(Student stu);

    public Student[] findAllStudent();

    public int getIndex(String id);

    public boolean deleteStudent(String delId);

    public void updateStudent(Student stu);
}
