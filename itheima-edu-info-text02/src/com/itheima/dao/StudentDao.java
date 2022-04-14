package com.itheima.dao;

import com.itheima.domain.Student;

public class StudentDao implements BaseStudentDao {
    //学生数组
    private static Student[] stus = new Student[5];

    //库管中的添加方法
    public boolean addStudent(Student stu) {

        for (int i = 0; i < stus.length; i++) {
            //如果访问的元素是空
            if (stus[i] == null) {
                //把学生对象放在这个位置,返回true
                stus[i] = stu;
                return true;
            }
        }
        //放满了返回false
        return false;
    }

    //库管中查询学生方法
    public Student[] findAllStudent() {
        Student[] stus1 = StudentDao.stus;
        //看一下数组是否为空
        boolean em = isEmpty();
        //是空则把索引置为null
        if (em) {
            stus1 = null;
        }
        //把数组返回
        return stus1;
    }

    public boolean isEmpty() {
        //假设为空
        boolean flag = true;

        for (int i = 0; i < stus.length; i++) {
            if (stus[i] != null) {
                //不为空则修改标记
                flag = false;
                break;
            }
        }
        return flag;
    }

    public int getIndex(String id) {
        //假设索引不存在
        int index = -1;
        //遍历集合
        for (int i = 0; i < stus.length; i++) {
            //跳过空的位置
            if (stus[i] == null) {
                continue;
            }
            //id相同记录索引位置
            if (stus[i].getId().equals(id)) {
                index = i;
            }
        }
        //返回索引
        return index;
    }

    public boolean deleteStudent(String delid) {
        //获取索引
        int index = getIndex(delid);
        //返回如果是-1说明不存在
        if (index == -1) {
            return false;
        } else {
            stus[index] = null;
            return true;
        }
    }

    public void updateStudent(Student stu) {
        //因为之前我们让用户输入的就是一个存在的id
        //除了id一致,其他信息都是新的
        //这里直接找对应索引位置
        int index = getIndex(stu.getId());
        //塞到对应位置
        stus[index]=stu;

    }
}
