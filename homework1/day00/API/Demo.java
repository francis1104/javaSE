package com.itheima.day00.API;

/*已知数组：int[] arr  = {33,44,99,11,8,53}。设计程序，使用两种方式对数组排序，并将排序后的数组按以下格式输出：

    > [8，11， 33， 44， 53，99]

提示：1、冒泡方式；2、Arrays方式   */
public class Demo {
    public static void main(String[] args) {
        int[] arr = {33, 44, 99, 11, 8, 53};

        int[] arr1 = sort(arr);

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

    private static int[] sort(int[] arr) {
        //外层循环代表数组从0索引开始向后开始判断排序
        for (int i = 0; i < arr.length - 1 ; i++) {
            //内层循环代表挨个和后一位的元素作比较,如果左边的大于右边的则位置互换,arr.length-1-i 提高效率,
            // 一次循环就确定了一个最大值,后边的就不要再次比较了
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //异或位运算:一个数被同一个数异或两次还等于这个数
                if (arr[j] > arr[j + 1]) {

                    arr[j] = arr[j + 1] ^ arr[j];
                    arr[j + 1] = arr[j + 1] ^ arr[j];
                    arr[j] = arr[j + 1] ^ arr[j];
                }
            }

        }

        return arr;

    }
}
