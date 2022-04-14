package com.itheima.dao;

import com.itheima.domain.Student;

import java.io.*;
import java.util.ArrayList;

public class OtherStudentDao implements BaseStudentDao {
    //学生数组
    private static ArrayList<Student> stus = new ArrayList<>();

    static {
        System.out.println("---------loading----------");
        reLoad6();

    }

    //库管中的添加方法
    public boolean addStudent(Student stu) {
        stus.add(stu);
        reSave6();
        return true;
    }

    //库管中查询学生方法
    public Student[] findAllStudent() {
        Student[] stus1 = new Student[stus.size()];

        for (int i = 0; i < stus.size(); i++) {
            stus1[i] = stus.get(i);
        }
        //看一下数组是否为空
        boolean em = isEmpty();
        //是空则把索引置为null
        if (em) {
            stus1 = null;
        }

        return stus1;
    }

    public boolean isEmpty() {
        //假设为空
        boolean flag = true;

        for (int i = 0; i < stus.size(); i++) {
            if (stus.get(i) != null) {
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
        for (int i = 0; i < stus.size(); i++) {
            //跳过空的位置
            if (stus.get(i) == null) {
                continue;
            }
            //id相同记录索引位置
            if (stus.get(i).getId().equals(id)) {
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
            stus.remove(index);
            reSave6();
            return true;
        }
    }

    public void updateStudent(Student stu) {
        //因为之前我们让用户输入的就是一个存在的id
        //除了id一致,其他信息都是新的
        //这里直接找对应索引位置
        int index = getIndex(stu.getId());
        //塞到对应位置
        stus.set(index, stu);
        reSave6();

    }

    //封装一个方法用来存档    基于普通字节输出流实现
    private void reSave() {
        try {

            FileOutputStream fos = new FileOutputStream("itheima-edu-info-text02/stu.txt");

            for (Student stu : stus) {
                fos.write(stu.toString().getBytes());
                fos.write(System.lineSeparator().getBytes());
            }

            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //封装一个方法用来读档    基于普通字节输入流实现
    private static void reLoad() {
        try {

            FileInputStream fis = new FileInputStream("itheima-edu-info-text02/stu.txt");

            byte[] bytes = new byte[1024 * 1024];

            int len = fis.read(bytes);

            String allStu = new String(bytes, 0, len);

            String[] stuMsg = allStu.split(System.lineSeparator());

            for (String s : stuMsg) {
                String[] stu = s.split(",");

                Student student = new Student(stu[0], stu[1], stu[2], stu[3]);

                stus.add(student);
            }

            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //封装一个方法用来存档    基于缓存字节输出流实现
    private void reSave2() {
        try {

            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("itheima-edu-info-text02/stu.txt"));

            for (Student stu : stus) {
                bos.write(stu.toString().getBytes());
                bos.write(System.lineSeparator().getBytes());
            }

            bos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //封装一个方法用来读档    基于缓存字节输入流实现
    private static void reLoad2() {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("itheima-edu-info-text02/stu.txt"));

            byte[] bytes = new byte[1024 * 1024];

            int len = bis.read(bytes);

            String allStu = new String(bytes, 0, len);

            String[] stuMsg = allStu.split(System.lineSeparator());

            for (int i = 0; i < stuMsg.length; i++) {
                String[] stu = stuMsg[i].split(",");

                Student student = new Student(stu[0], stu[1], stu[2], stu[3]);

                stus.add(student);
            }

            bis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //封装一个方法用来存档    基于字符输出流实现
    private void reSave3() {
        try {

            FileWriter fw = new FileWriter("itheima-edu-info-text02/stu.txt");

            for (Student stu : stus) {
                fw.write(stu.toString());
                fw.write(System.lineSeparator());
            }

            fw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //封装一个方法用来读档    基于字符输入流实现
    private static void reLoad3() {
        try {
            FileReader fr = new FileReader("itheima-edu-info-text02/stu.txt");

            char[] chars = new char[1024 * 1024];

            int len = fr.read(chars);

            String allStu = new String(chars, 0, len);

            String[] stuMsg = allStu.split(System.lineSeparator());

            for (String s : stuMsg) {
                String[] stu = s.split(",");

                Student student = new Student(stu[0], stu[1], stu[2], stu[3]);

                stus.add(student);
            }

            fr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //封装一个方法用来存档    基于缓存字符输出流实现
    private void reSave4() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("itheima-edu-info-text02/stu.txt"));

            for (Student stu : stus) {
                bw.write(stu.toString());
                bw.newLine();
            }

            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //封装一个方法用来读档    基于缓存字符输入流实现
    private static void reLoad4() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("itheima-edu-info-text02/stu.txt"));

            String stu;
            while ((stu = br.readLine()) != null) {
                String[] msg = stu.split(",");

                Student student = new Student(msg[0], msg[1], msg[2], msg[3]);

                stus.add(student);
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //封装一个方法用来存档    基于转换输出流实现
    private void reSave5(){
        try {
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("itheima-edu-info-text02/stu.txt"));

            for (Student stu : stus) {
                osw.write(stu.toString());
                osw.write(System.lineSeparator());
            }

            osw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //封装一个方法用来读档    基于转换输入流实现
    private static void reLoad5(){
        try {

            InputStreamReader isr = new InputStreamReader(new FileInputStream("itheima-edu-info-text02/stu.txt"));

            char[] chars = new char[1024 * 1024];

            int len = isr.read(chars);

            String allStu = new String(chars, 0, len);

            String[] stuMsg = allStu.split(System.lineSeparator());

            for (String stu : stuMsg) {

                String[] msg = stu.split(",");

                Student student = new Student(msg[0], msg[1], msg[2], msg[3]);

                stus.add(student);

            }

            isr.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //封装一个方法用来存档    基于序列化流实现
    private void reSave6(){
        try {

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("itheima-edu-info-text02/stu.txt"));

            oos.writeObject(stus);

            oos.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //封装一个方法用来读档    基于转换输入流实现
    private static void reLoad6(){
        try {

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("itheima-edu-info-text02/stu.txt"));

            ArrayList<Student> students = (ArrayList<Student>) ois.readObject();

            stus = students;

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
