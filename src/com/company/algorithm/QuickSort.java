package com.company.algorithm;

import java.util.Arrays;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 快速排序
 * @date : 2021-02-24 21:34:43
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {5, 1, 4, 2, 3};
        quickSort(nums, 0, nums.length - 1);
        Arrays.stream(nums).forEach(System.out::println);
    }

    public static void quickSort(int[] a, int low, int height) {
        int i, j, t, temp;
        if (low > height) {
            return;
        }
        // 传过来的参数进行赋值
        temp = a[low];
        // 左侧指针
        i = low;
        // 右侧指针
        j = height;
        while (i != j) {
            // 顺序很重要，先从右边开始找
            while (a[j] >= temp && i < j) {
                j--;
            }
            // 再从左边找：小于基准数的数
            while (a[i] <= temp && i < j) {
                i++;
            }
            // 交换两个数在数组中的位置
            if (i < j) {
                t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        // a[i]给low的位置也就是0，就是基准数
        a[low] = a[i];
        // 基准数给a[i]
        a[i] = temp;

        // 递归基准值左侧数组
        quickSort(a, low, i - 1);
        // 递归基准值右侧数组
        quickSort(a, i + 1, height);
    }
}
