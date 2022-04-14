package com.itheima.hf.homework.继承成员方法的访问特点05;
/*
继承关系下成员方法的访问特点:
    拿对象调用方法,查找顺序:
        先去对象本类中找,没有再去父类中找

    注意:当一个类没有明确指定其父类时,默认JVM会让其继承Object
        java中任何一个类都直接或者间接继承自Object!
        是类层次的根类/超类/基类!
*
*/
public class Demo {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.smoke();
        zi.play();

        String res = zi.toString();
        System.out.println(res);
    }
}
