package com.itheima.dao;

import com.itheima.domain.Student;

public class StudentDao {
    private static Student[] stus = new Student[5];

    public boolean addStudent(Student stu) {
        for (int i = 0; i < stus.length; i++) {
            if (stus[i] == null) {
                stus[i] = stu;
                return true;
            }
        }
        return false;
    }

    public Student[] findAllStudent() {
        Student[] stuTemp = stus;
        if (isEmpty()) {
            stuTemp = null;
        }

        return stuTemp;
    }

    public boolean isEmpty() {

        boolean flag = true;

        for (int i = 0; i < stus.length; i++) {
            if (stus[i] != null) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public boolean deleteStudent(String delId) {
        int index = getIndex(delId);
        if (index == -1){
            return false;
        }else {
            stus[index] = null;
            return true;
        }
    }

    public int getIndex(String id) {
        int index = -1;

        for (int i = 0; i < stus.length; i++) {
            if (stus[i] != null && stus[i].getId().equals(id)){
                index = i;
                break;
            }
        }

        return index;
    }

    public void updateStudent(Student stu) {

        int index = getIndex(stu.getId());

        stus[index] = stu;
    }
}
