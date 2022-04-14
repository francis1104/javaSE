package com.itheima.获取字节码对象;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException {

        //1.Class类中的静态方法forname("全类名")
            //全类名:包名+类名
        Class clazz = Class.forName("com.itheima.获取字节码对象.Student");
        //获取到的是Student类的字节码文件对象,又习惯称之为类对象
        System.out.println(clazz);

        //2.通过class属性来获取
        Class clazz2 = Student.class;
        System.out.println(clazz2);

        //3.利用对象的getclass方法获取
        Student stu = new Student();
        Class clazz3 = stu.getClass();
        System.out.println(clazz3);


        //由于一次程序运行过程中,一个类只会加载一次,字节码文件对象同样的也只有一份
        // 所以不管什么方式获取到的字节码文件对象都是同一个
        System.out.println(clazz == clazz2);
        System.out.println(clazz2 == clazz3);

    }
}
