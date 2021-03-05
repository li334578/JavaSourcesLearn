package com.company.algorithm;

import java.util.Arrays;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 插入排序
 * @date : 2021-03-01 20:45:27
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] nums = {5, 7, 3, 1, 0, 8, 9};
        insertSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void insertSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                int temp = nums[i];
                int j;
                for (j = i - 1; j >= 0 && temp < nums[j]; j--) {
                    nums[j + 1] = nums[j];
                }
                nums[j + 1] = temp;
            }
        }
    }
}
