package com.itheima.hf.method;

import java.util.Scanner;

/*//定义一个功能完成任意三个数的排序(升序), 并将排序后的结果存入一个数组中.
    例如: 请输入第一个数:
            666
          请输入第二个数:
            66.6
        请输入第三个数:
            778
        排序后的数据为: [66.6, 666, 778]
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第1个数");
        double num1 = sc.nextDouble();
        System.out.println("请输入第2个数");
        double num2 = sc.nextDouble();
        System.out.println("请输入第3个数");
        double num3 = sc.nextDouble();
        double[] sort = sort(num1, num2, num3);
        System.out.print("[");
        for (int i = 0; i < sort.length; i++) {
            if (i==sort.length-1){
                System.out.println(sort[i]+"]");
                break;
            }
            System.out.print(sort[i]+",");
        }

    }

    public static double[] sort(double num1,double num2, double num3) {
        double[] doubles = new double[3];
        double tempMax = (num1>num2)?num1:num2;
        double max = (tempMax>num3)?tempMax:num3;
        double tempMin = (num1<num2)?num1:num2;
        double min = (tempMin<num3)?tempMin:num3;
        double middle = (num1+num2+num3)-min-max;
        doubles[0]=min;
        doubles[1]=middle;
        doubles[2]=max;
        return doubles;
    }
}
