package com.itheima.dao;

import com.itheima.domain.Student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class OtherStudentDao implements BaseStudentDao {

    private static ArrayList<Student> stus = new ArrayList<>();

    static {
        System.out.println("========================loading....=========================");
        reLoad();
    }


    //添加
    public boolean addStudent(Student stu) {
        stus.add(stu);
        reSave();
        return true;
    }

    //查询,直接返回数组
    public Student[] findAllStudent() {
        Student[] arrayStus = new Student[stus.size()];
        for (int i = 0; i < stus.size(); i++) {
            arrayStus[i] = stus.get(i);
        }
        return arrayStus;
    }

    //删除
    public boolean deleteStudent(String id) {
        for (int i = 0; i < stus.size(); i++) {
            //要删除的id和该元素对象id一致
            if (id.equals(stus.get(i).getId())) {
                //该元素位置置为null
                stus.remove(i);
                reSave();
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
        for (int i = 0; i < stus.size(); i++) {

            //如果这个元素对象id和传过来的id相等
            if (id.equals(stus.get(i).getId())) {
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
        for (int i = 0; i < stus.size(); i++) {

            if (stus.get(i).getId().equals(newStu.getId())) {
                stus.set(i, newStu);
                reSave();
            }
        }
    }

    //封装一个方法用来存档
    private void reSave(){

        try{
            FileOutputStream fos = new FileOutputStream("itheima-edu-info-test/stu.txt");

            for (int i = 0; i < stus.size(); i++) {
                fos.write(stus.get(i).toString().getBytes());
                fos.write(System.lineSeparator().getBytes());
            }

            fos.close();


        }catch (Exception e){
            e.printStackTrace();
        }

    }

    //封装一个方法用来读档
    private static void reLoad(){

        try {

            FileInputStream fis = new FileInputStream("itheima-edu-info-test/stu.txt");

            byte[] bytes = new byte[1024 * 1024];

            int len;

            len = fis.read(bytes);

            String allStu = new String(bytes, 0, len);

            String[] stuMsg = allStu.split(System.lineSeparator());

            for (int i = 0; i < stuMsg.length; i++) {
                String stu = stuMsg[i];
                String[] msg = stu.split(",");
                Student student = new Student(msg[0],msg[1],msg[2],msg[3]);
                stus.add(student);
            }


        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
