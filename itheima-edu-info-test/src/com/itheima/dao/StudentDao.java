package com.itheima.dao;

import com.itheima.domain.Student;

public class StudentDao implements BaseStudentDao {

    Student[] stus = new Student[5];

    //添加
    public boolean addStudent(Student stu) {
        for (int i = 0; i < stus.length; i++) {
            //遍历数组如果有空位就放对象进去
            if (stus[i] == null) {
                stus[i] = stu;
                //并返回true
                return true;
            }
        }
        //到这说明数组满了
        return false;
    }

    //查询,直接返回数组
    public Student[] findAllStudent() {
        return stus;
    }

    //删除
    public boolean deleteStudent(String id) {

        for (int i = 0; i < stus.length; i++) {
            //遍历数组如果索引位置元素存在  并且  要删除的id和该元素对象id一致
            if (stus[i] != null && id.equals(stus[i].getId())) {
                //该元素位置置为null
                stus[i] = null;

                return true;
            }
        }
        //要删除的元素不存在
        return false;

    }

    //查找id是否存在
    public boolean isExists(String id) {
        //假设要查找的索引不存在
        int index = -1;
        //遍历数组
        for (int i = 0; i < stus.length; i++) {
            //如果这个元素为null,跳过
            if (stus[i] == null) {
                continue;
            }
            //如果这个元素对象id和传过来的id相等
            if (id.equals(stus[i].getId())) {
                //记录id所在对象索引位置
                index = i;
            }
        }
        //不存在返回false
        if (index == -1) {
            return false;
        } else {
            //存在返回true
            return true;
        }
    }

    //修改
    public void updateStudent(Student newStu) {
        for (int i = 0; i < stus.length; i++) {
            //跳过空元素
            if (stus[i] == null) {
                continue;
            }

            if (stus[i].getId().equals(newStu.getId())) {
                stus[i] = newStu;
            }
        }
    }
}
