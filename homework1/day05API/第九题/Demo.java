package com.itheima.day05API.第九题;

/*某程序员编写了如下代码，想要测试该代码的执行时间。请帮忙计算methodA方法执行了多长时间？

    运行结果：
    1-1000之间的偶数和为：250500
    methodA的执行时间为：28*/
public class Demo {
    public static void main(String[] args) {
        /*
        	-----计算methodA方法执行了多长时间?-----
        */
        long start = System.nanoTime();
        methodA();
        long end = System.nanoTime();

        System.out.println("methodA的执行时间为：" + (end - start));
    }

    public static void methodA() {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("1-1000之间的偶数和为：" + sum);
    }
}
