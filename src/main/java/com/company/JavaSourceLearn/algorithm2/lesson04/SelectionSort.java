package com.company.JavaSourceLearn.algorithm2.lesson04;

import java.util.Arrays;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 选择排序
 * @date : 2021-06-17 21:02:45
 */
public class SelectionSort {

    public void selectionSort(int[] nums) {
        if (nums == null || nums.length < 2) return;
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i; j < nums.length; j++) {
                minIndex = nums[j] < nums[minIndex] ? j : minIndex;
            }
            if (minIndex != i) {
                swap(nums, i, minIndex);
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
        SelectionSort bs = new SelectionSort();
        bs.selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

}
