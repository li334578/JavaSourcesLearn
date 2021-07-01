package com.company.JavaSourceLearn.algorithm2.lesson04;

import java.util.Arrays;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 对数器
 * @date : 2021-06-17 21:33:19
 */
public class Logarithm {

    public static int[] generateRandomArray(int size, int value) {
        // 生成长度随机的数组
        int[] arr = new int[(int) ((size + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((value + 1) * Math.random() - (int) (value * Math.random()));
        }
        return arr;
    }

    public static void yourSortMethod(int[] nums) {

    }

    public static void rightMethod(int[] arr) {
        Arrays.sort(arr);
    }

    public static int[] copyArray(int[] nums) {
        int[] arr = new int[nums.length];
        System.arraycopy(nums, 0, arr, 0, nums.length);
        return arr;
    }

    public static boolean isEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int testTimes = 500000;
        int size = 10;
        int value = 100;
        boolean succeed = true;
        for (int i = 0; i < testTimes; i++) {
            int[] arr1 = generateRandomArray(size, value);
            int[] arr2 = copyArray(arr1);
            int[] arr3 = copyArray(arr1);
            rightMethod(arr2);
            yourSortMethod(arr3);
            if (!isEqual(arr2, arr3)) {
                succeed = false;
                System.out.println(Arrays.toString(arr2));
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");
    }
}
