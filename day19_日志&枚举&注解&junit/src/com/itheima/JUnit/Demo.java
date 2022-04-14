package com.itheima.JUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Demo {

    /* 注意事项:
              1. 方法必须被public修饰
              2. 方法必须无参
              3. 方法必须返回值类型为void
    */
    @Before
    public void before() {
        System.out.println("before");
    }


    @After
    public void after() {
        System.out.println("after");
    }


    @Test
    public void add() {
//        System.out.println(2/0);
        int a = 10;
        int b = 10;

        int sum = a + b;
        System.out.println(sum);
    }
}
