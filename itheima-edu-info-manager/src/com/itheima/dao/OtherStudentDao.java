package com.itheima.dao;

import com.itheima.domain.Student;

import java.io.*;
import java.util.ArrayList;

/*
    OtherStudentDao: 升级为集合容器实现
    开闭原则: 对修改关闭, 对扩展开放!
 */
public class OtherStudentDao implements BaseStudentDao {
    //1. 创建一个数组容器,用来管理系统中的学生对象信息
    private static ArrayList<Student> stus = new ArrayList<Student>();

    static {

        System.out.println("...........loading............");
        reLoad5();
    }

    //库管类中的添加学生功能
    public boolean addStudent(Student stu) {
        stus.add(stu);
        reSave5();
        return true;
    }

    //库管类中的查看学生功能
    public Student[] findAllStudents() {
        //创建一个数组,让数组的长度和集合当前长度一致
        Student[] stuArray = new Student[stus.size()];

        //遍历集合,将集合的每一个索引位置的元素copy到数组对应索引位置
        for (int i = 0; i < stus.size(); i++) {
            stuArray[i] = stus.get(i);
        }

        return stuArray;
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
            //存在,才做删除
            stus.remove(index);
            reSave5();
            return true;
        }
    }

    //库管类中的修改学生功能
    public void updateStudent(String updateId, Student newStu) {
        //1. 根据要修改的学号,找对应学生在容器中的索引位置
        int index = getIndex(updateId);

        //2. 将index记录的索引位置使用newStu进行替换,达到修改效果
        stus.set(index, newStu);
        reSave5();
    }

    //封装一个方法: 根据学号查找对应学生对象在容器中的索引位置
    public int getIndex(String id) {
        //假设要查找的学号不存在!
        int index = -1;
        //遍历查找
        for (int i = 0; i < stus.size(); i++) {
            //拿到每一个索引位置的元素
            Student stu = stus.get(i);
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

    //封装一个方法,用来存档    -----基于普通字节流实现
    private void reSave() {

        try {
            //创建一个字节输出流对象
            FileOutputStream fos = new FileOutputStream("itheima-edu-info-manager/stu.txt");
            //遍历集合
            for (int i = 0; i < stus.size(); i++) {
                //获取每一个学生对象
                Student stu = stus.get(i);
                //把学生对象信息转换为字符串,再转换为字节数组,写入文本
                fos.write(stu.toString().getBytes());
                //写完一个学生的信息进行换行
                fos.write(System.lineSeparator().getBytes());

            }
            //关流
            fos.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    //封装一个方法,用来读档    -----基于普通字节流实现
    private static void reLoad() {
        try {
            //创建一个字节输入流对象
            FileInputStream fis = new FileInputStream("itheima-edu-info-manager/stu.txt");
            //创建一个大字节数组
            byte[] bytes = new byte[1024 * 1024];
            //把所有信息读到数组中,并记录有效字节个数
            int len = fis.read(bytes);
            //把所有学生信息转换为字符串
            String allMsg = new String(bytes, 0, len);
            //把字符串按照通用换行符分割,每一块都是一个学生的信息
            String[] allStuArr = allMsg.split(System.lineSeparator());
            //遍历这个字符串数组
            for (int i = 0; i < allStuArr.length; i++) {
                //把每一个学生信息拿出来
                String stuMsg = allStuArr[i];
                //再按照逗号分割  id name age birthday
                String[] msg = stuMsg.split(",");
                //把信息重新封装成学生对象
                Student student = new Student(msg[0], msg[1], msg[2], msg[3]);
                //添加进集合中
                stus.add(student);
            }
            //关流
            fis.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //存档                  -----基于缓冲字节流实现
    private void reSave1() {

        try {

            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("itheima-edu-info-manager/stu.txt"));

            for (int i = 0; i < stus.size(); i++) {
                Student stu = stus.get(i);

                bos.write(stu.toString().getBytes());

                bos.write(System.lineSeparator().getBytes());

            }

            bos.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //读档                  -----基于缓冲字节流实现
    private static void reLoad1() {
        try {

            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("itheima-edu-info-manager/stu.txt"));

            byte[] bytes = new byte[1024 * 1024];

            int len;

            len = bis.read(bytes);

            String allStr = new String(bytes, 0, len);

            String[] allstu = allStr.split(System.lineSeparator());

            for (int i = 0; i < allstu.length; i++) {

                String[] stu = allstu[i].split(",");

                Student student = new Student(stu[0], stu[1], stu[2], stu[3]);

                stus.add(student);
            }

            bis.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //存档                -------基于字符流实现
    private void reSave2() {
        try {

            FileWriter fw = new FileWriter("itheima-edu-info-manager/stu.txt");

            for (Student stu : stus) {
                fw.write(stu.toString());
                fw.write(System.lineSeparator());
            }

            fw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //读档                -------基于字符流实现
    private static void reLoad2() {
        try {

            FileReader fr = new FileReader("itheima-edu-info-manager/stu.txt");

            char[] chars = new char[1024 * 1024];

            int len;

            len = fr.read(chars);

            String allStr = new String(chars, 0, len);

            String[] allstu = allStr.split(System.lineSeparator());

            for (int i = 0; i < allstu.length; i++) {
                String[] stu = allstu[i].split(",");

                Student student = new Student(stu[0], stu[1], stu[2], stu[3]);

                stus.add(student);

            }

            fr.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //存档                -------基于缓冲字符流实现
    private void reSave3() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("itheima-edu-info-manager/stu.txt"));

            for (Student stu : stus) {

                bw.write(stu.toString());
                bw.newLine();

            }

            bw.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    //读档                -------基于缓冲字符流实现
    private static void reLoad3() {

        try {

            BufferedReader br = new BufferedReader(new FileReader("itheima-edu-info-manager/stu.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                String[] stu = line.split(",");

                Student student = new Student(stu[0], stu[1], stu[2], stu[3]);

                stus.add(student);

            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //存档                -------基于转码流
    private void reSave4(){
        try {

            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("itheima-edu-info-manager/stu.txt"));

            for (Student student : stus) {

                osw.write(student.toString());
                osw.write(System.lineSeparator());

            }

            osw.close();


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //读档                -------基于转码流
    private static void reLoad4(){
        try {

            InputStreamReader isr = new InputStreamReader(new FileInputStream("itheima-edu-info-manager/stu.txt"));

            char[] chars = new char[1024 * 1024];

            int len = isr.read(chars);

            String allStu = new String(chars, 0, len);

            String[] stuMsg = allStu.split(System.lineSeparator());

            for (int i = 0; i < stuMsg.length; i++) {
                String[] stu = stuMsg[i].split(",");

                Student student = new Student(stu[0], stu[1], stu[2], stu[3]);

                stus.add(student);
            }

            isr.close();


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //存档                -------基于序列化流
    private void reSave5(){
        try {

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("itheima-edu-info-manager/stu.txt"));

            oos.writeObject(stus);

            oos.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //读档                -------基于序列化流
    private static void reLoad5(){
        try {

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("itheima-edu-info-manager/stu.txt"));

            ArrayList<Student> students = (ArrayList<Student>) ois.readObject();

            stus=students;

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
