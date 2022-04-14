package com.itheima.dao;

import com.itheima.domain.Student;

public class StudentDao implements BaseStudentDao{
    //1. 创建一个数组容器,用来管理系统中的学生对象信息
    private static Student[] stus = new Student[5];    //stus ={stu,stu,null,null,null}

    //库管类中的添加学生功能
    public boolean addStudent(Student stu) {
        //2. 将stu存入系统容器中
        // 标记位思想: 假设数组已经存满了
        int index = -1;

        //遍历容器
        for (int i = 0; i < stus.length; i++) {
            //只要有一个索引位置为null
            if (stus[i] == null) {
                //修改标记
                index = i;
                break;
            }
        }

        //根据index的值来决定本次添加能否成功
        if (index == -1) {
            //存满了,则添加失败
            return false;
        } else {
            //将本次要添加的学生对象存入index记录的索引位置
            stus[index] = stu;
            //返回添加成功
            return true;
        }

    }

    //库管类中的查看学生功能
    public Student[] findAllStudents() {
        return stus;
    }

    //库管类中的删除学生功能
    public boolean deleteStudent(String delId) {
        // 1. 根据学号找到对应学生对象在容器中的索引位置
        int index = getIndex(delId);
        // 根据返回的索引决定能否删除成功
        if (index == -1) {
            //学号不存在,则删除失败,返回false
            return false;
        } else {
            //存在,才做删除: 将该索引位置置为null,返回true
            stus[index] = null;

            return true;
        }
    }

    //库管类中的修改学生功能
    public void updateStudent(String updateId, Student newStu) {
        //1. 根据要修改的学号,找对应学生在容器中的索引位置
        int index = getIndex(updateId);

        //2. 将index记录的索引位置使用newStu进行替换,达到修改效果
        stus[index] = newStu;
    }

    //封装一个方法: 根据学号查找对应学生对象在容器中的索引位置
    public int getIndex(String id) {
        //假设要查找的学号不存在!
        int index = -1;
        //遍历查找
        for (int i = 0; i < stus.length; i++) {
            //拿到每一个索引位置的元素
            Student stu = stus[i];
            //判断当前索引位置的元素不为null,并且当前学生对象的学号和我们要查找的学号是否一致
            if (stu != null && stu.getId().equals(id)) {
                //找到了就修改标记
                index = i;
                break;
            }
        }

        //返回index
        return index;
    }


}
