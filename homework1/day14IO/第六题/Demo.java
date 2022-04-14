package com.itheima.day14IO.第六题;

import java.io.*;
import java.util.ArrayList;

/*对象序列化是一个用于将对象状态转换为字节流的过程，可以将其保存到磁盘文件中或通过网络发送到任何其他程序；
从字节流创建对象的相反的过程称为反序列化。 现已知学生实体类（Student），包含姓名和年龄属性。
请编写程序将若干学生对象保存到当前模块的下的object.txt文件中，保存成功后，还可以读取文件获取到这些学生对象。
提示：从文件中读取对象时，与读取其他数据不同，readObject方法是通过抛出异常（EOFException）来表示到达文件末尾的，
所以循环读取多个对象时，可以通过捕获该异常来结束读取。除了这种方式还可以怎样比较方便的将多个学生对象只读写一次，以避免此问题？*/
public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("homework/object.txt"));

        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("zhangsan","23");
        Student s2 = new Student("lisi","24");
        Student s3 = new Student("wangwu","25");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        oos.writeObject(list);

        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("homework/object.txt"));

        ArrayList<Student> students = (ArrayList<Student>) ois.readObject();

        for (Student stu : students) {

            System.out.println(stu);
        }

        ois.close();

    }
}
