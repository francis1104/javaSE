package com.itheima.service;

import com.itheima.dao.BaseStudentDao;
import com.itheima.dao.OtherStudentDao;
import com.itheima.dao.StudentDao;
import com.itheima.domain.Student;
import com.itheima.factory.StudentDaoFactory;

public class StudentService {
    /*
        现象: 如果要切换集合/数组实现, 需要改Service层代码的!   -- Service层和Dao层耦合性太高了!
        期望: 不管dao层是数组实现(StudentDao)还是切换成集合实现(OtherStudentDao),希望Service层代码可以不用改变!
        解耦: 通过工厂模式 + 多态解决!
     */
    private BaseStudentDao dao = StudentDaoFactory.getStudentDao();
    //private StudentDao dao = new StudentDao();
    //private OtherStudentDao dao = new OtherStudentDao();

    //业务员类中的添加学生功能
    public boolean addStudent(Student stu) {
        //创建库管对象,指挥库管对象进行添加学生操作
        return dao.addStudent(stu);
    }

    //业务员类中的查看学生功能
    public Student[] findAllStudents() {
        //1. 指挥库管对象,拿到所有学生数据
         /*
            两种情况:
                1. 系统中还没有数据:allStudents = {null,null,null,null,null} : 期望: 业务员能处理一下,直接返回一个null给我客服
                2. 系统中有数据:allStudents = {stu,null,null,null,null}: 期望: 业务员直接返回对象数组给客服
         */
        Student[] allStudents = dao.findAllStudents();

        //标记位: 假设系统中没有学生信息
        boolean flag = false;
        //遍历查找allStudents
        for (int i = 0; i < allStudents.length; i++) {
            if (allStudents[i] != null){
                //只要有一个索引位置不为null, 就修改标记位
                flag = true;
                break;
            }
        }
        //根据flag的值来决定给客服返回什么
        if (flag){
            return allStudents;
        }else{
            return null;        // null可以作为任意引用数据类型的默认值
        }
    }

    //业务员中的删除学生功能
    public boolean deleteStudent(String delId) {
        //指挥库管根据学号删除学生
        return  dao.deleteStudent(delId);
    }

    //业务员中的修改学生功能
    public void updateStudent(String updateId, Student newStu) {
        //指挥库管根据学号修改对应学生信息
        dao.updateStudent(updateId,newStu);
    }

    //业务员中的校验学号是否存在功能
    public boolean isExists(String id) {
        //指挥dao根据学号查询对应学生在容器中的索引
        int index = dao.getIndex(id);

        if (index == -1){
            //不存在,返回false
            return false;
        }else{
            //存在,返回true
            return true;
        }
        //return index != -1;

    }
}
