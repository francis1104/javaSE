package com.itheima.service;

import com.itheima.dao.BaseStudentDao;
import com.itheima.domain.Student;
import com.itheima.factory.StudentDaoFactory;

public class StudentService {

    private BaseStudentDao dao = StudentDaoFactory.getStudentDao();

    public boolean addStudent(Student stu) {
        return dao.addStudent(stu);
    }

    public Student[] findAllStudent() {
        return dao.findAllStudent();
    }

    public boolean isEmpty() {

        boolean flag = true;

        Student[] allStu = dao.findAllStudent();

        for (Student student : allStu) {
            if (student != null) {
                flag = false;
            }
        }

        return flag;
    }

    public boolean isExist(String id) {

        int index = dao.getIndex(id);

        return index != -1;

    }

    public boolean deleteStudent(String delId) {
        return dao.deleteStudent(delId);

    }

    public void updateStudent(Student stu) {
        dao.updateStudent(stu);
    }
}
