package com.itheima.dao;

import com.itheima.domain.Student;

public class StudentDao implements BaseStudentDao{
    private Student[] arr = new Student[5];

    public boolean addStudent(Student stu) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = stu;
                return true;

            }
        }
        return false;

    }

    public Student[] findAllStudent() {
        return arr;
    }

    public int getIndex(String id) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != null && id.equals(arr[i].getId())) {

                index = i;
            }
        }

        return index;
    }

    public boolean deleteStudent(String delId) {
        int index = getIndex(delId);

        if (index == -1) {
            return false;
        } else {
            arr[index] = null;
            return true;
        }
    }

    public void updateStudent(Student stu) {
        String id = stu.getId();

        int index = getIndex(id);

        arr[index]=stu;

    }
}
