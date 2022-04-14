package com.itheima.包装类.integer;

public class Demo {
    public static void main(String[] args) {
        //手动装箱的两种方法
        System.out.println(Integer.valueOf("100"));
        System.out.println(Integer.valueOf(100));

        System.out.println(new Integer("100"));
        System.out.println(new Integer(100));

        //自动装箱
        Integer i3 = 100;
        //自动拆箱
        int i4 = i3;

        /*
            i3 = i3 + 200;
                1. jvm会先将i3自动拆箱成int类型的整数: 100;
                2. 拆完后的100和200 进行加法运算: 100 + 200 == 300
                3. i3 = 300: 这里300是int类型, i3是Integer类型, int直接赋值给Integer是自动装箱
        */
        i3 += 200;


        //细节: 因为i4是null,jvm在自动拆箱时调用其intValue()方法则会产生空指针异常
         i3 = null;
         //处理引用数据类型建议做非空校验
        if(i3 != null){
            i3 += 200;
            System.out.println(i3);
        }



    }
}
