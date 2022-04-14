package com.itheima.service;

import com.itheima.dao.StudentDao;
import com.itheima.domain.Student;

public class StudentService {
    StudentDao dao = new StudentDao();

    public boolean addStudent(Student stu) {
        return dao.addStudent(stu);
    }

    public Student[] findAllStudent() {
        return dao.findAllStudent();
    }

    public boolean deleteStudent(String delId) {
        return dao.deleteStudent(delId);
    }

    public boolean isExist(String id) {
        int index = dao.getIndex(id);

        return index != -1;

    }

    public void updateStudent(Student stu) {
        dao.updateStudent(stu);
    }
}
