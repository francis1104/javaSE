package com.itheima.day00.API;

import java.util.Scanner;

/*已知数组：String[ ] stus = {"111", "222","333","444","555","666"}，请设计程序，实现如下效果：

~~~java
//正常查找：
请输入您要查找的人名：
444
444是系统中存储的第4个用户！

//非正常查找：
请输入您要查找的人名：
000
000不是系统中的用户！
~~~

要求使用两种方式实现：
​	1、二分查找--手写
​	2、通过Arrays.binarrySearch()实现*/
public class Demo03 {
    public static void main(String[] args) {
        String[] stus = {"111", "222", "333", "444", "555", "666"};
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您要查找的人名：");
        String i = sc.next();

        int index = getIndex(stus, i);

        if (index == -1) {
            System.out.println(i + "不是系统中的用户！");
        } else {

            System.out.println(i + "是系统中存储的第" + index + "个用户！");
        }


    }

    private static int getIndex(String[] stus, String i) {
        int index = -1;

        int max = stus.length - 1;

        int min = 0;

        for (; min <= max; ) {
            int mid = (max + min) / 2;

            if (i.equals(stus[mid])) {
                index = mid;
                break;
                //如果中间数小于给的数,就把中间数变成最小值-1
            } else if ( Integer.parseInt(stus[mid]) < Integer.parseInt(i)) {
                min = mid+1;
                //如果中间数大于给的数,就把中间数变成最大值-1
            } else if (Integer.parseInt(stus[mid]) > Integer.parseInt(i)) {
                max = mid-1;
            } else {
                break;
            }

        }

        return index;


    }
}
