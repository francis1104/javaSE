package com.itheima.泛型;

//就是一个泛型类
/*
    1. 类名后面的<>中可以写各种字符,规范建议使用E,,K,V等有标识意义的字符
    2. 定义泛型类时, 类型不确定, 创建泛型类的对象时T,类型才确定
    3. 泛型在使用的时候只能支持引用数据类型,不支持基本数据类型
 */
public class Demo {
    public static void main(String[] args) {

        Box<String> box = new Box<>();
        box.setElement("abc");
        System.out.println(box.getElement());


        Box<Integer> in = new Box<>();
        in.setElement(19);
        System.out.println(in.getElement());


    }
}

//自定义泛型类
class Box<E> {

    private E element;

    public E getElement() {

        return element;

    }

    public void setElement(E element) {

        this.element = element;

    }


}
