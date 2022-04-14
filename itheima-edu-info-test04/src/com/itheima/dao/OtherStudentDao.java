package com.itheima.dao;

import com.itheima.domain.Student;

import java.util.ArrayList;

public class OtherStudentDao implements BaseStudentDao{
    private ArrayList<Student> arr = new ArrayList<>();

    public boolean addStudent(Student stu) {

        arr.add(stu);

        return true;

    }

    public Student[] findAllStudent() {
        Student[] arr2 = new Student[arr.size()];

        for (int i = 0; i < arr2.length; i++) {

            arr2[i] = arr.get(i);
        }

        return arr2;
    }

    public int getIndex(String id) {
        int index = -1;

        for (int i = 0; i < arr.size(); i++) {

            if (id.equals(arr.get(i).getId())) {

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
            arr.remove(index);
            return true;
        }
    }

    public void updateStudent(Student stu) {
        String id = stu.getId();

        int index = getIndex(id);

        arr.set(index,stu);

    }
}
