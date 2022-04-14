package com.itheima.包装类.integer;

public class Demo02 {
    public static void main(String[] args) {
        //装箱: 就是把基本数据类型包装成一个对应的引用数据类型
        Integer i1 = Integer.valueOf(100);      // 手动装箱
        //jdk1.5的特性 --- 自动装箱
        //自动: Java底层会帮我们自动的调用valueOf方法.
        Integer ii1 = 100;
        //自动装箱: 就是把基本数据类型直接赋值给引用数据类型
        // jvm底层会自动帮我们完成类型的包装转换
        System.out.println(i1);

        //拆箱: 把一个包装类型 变成对应的基本数据类型
        int i2 = i1.intValue();   // 手动拆箱

        //jdk1.5的特性 --- 自动拆箱
        // jvm底层会自动帮我们拿i1调用intValue()进行拆箱,得到一个对应的基本数据类型
        int ii2 = i1;     //自动拆箱



        /*
            i3 = i3 + 200;
                1. jvm会先将i3自动拆箱成int类型的整数: 100;
                2. 拆完后的100和200 进行加法运算: 100 + 200 == 300
                3. i3 = 300: 这里300是int类型, i3是Integer类型, int直接赋值给Integer是自动装箱
         */
        Integer i3 = 100;
        i3 += 200;
        System.out.println("i3 = " + i3);


        //细节: 因为i4是null,jvm在自动拆箱时调用其intValue()方法则会产生空指针异常
        Integer i4 = null;
        if(i4 != null){
            i4 += 200;
            System.out.println(i4);
        }
    }
}
