package com.company.JavaSourceLearn.algorithm2.lesson04;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-06-22 20:06:04
 */
public class SubjectTest {
    /*
     * 给定数组arr，和一个数num,把小于num的放左边 大于num的放右边
     * 额外空间复杂度O(1) 时间复杂度O(n)
     * */

    public void method1(int[] arr, int num) {
        if (arr == null || arr.length < 2) return;
        // 小于num的数的下标范围是 0,k
        int k = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < num) {
                k++;
                // 交换
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
    }

    public void method2(int[] arr, int num) {
    }

    public static void main(String[] args) {

    }

}
