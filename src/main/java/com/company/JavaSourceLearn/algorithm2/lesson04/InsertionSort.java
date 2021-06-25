package com.company.JavaSourceLearn.algorithm2.lesson04;

import java.util.Arrays;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 插入排序
 * @date : 2021-06-17 21:18:15
 */
public class InsertionSort {

    public void insertionSort(int[] nums) {
        if (nums == null || nums.length < 2) return;
        for (int i = 1; i < nums.length; i++) {
            for (int j = i - 1; j >= 0 && nums[j] > nums[j + 1]; j--) {
                swap(nums, j, j + 1);
            }
        }
    }

    public void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 35, 48, 1, 3, 20, 8, 0, 3, -1};
        InsertionSort bs = new InsertionSort();
        bs.insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

}
