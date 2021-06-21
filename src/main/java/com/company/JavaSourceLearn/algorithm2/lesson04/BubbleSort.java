package com.company.JavaSourceLearn.algorithm2.lesson04;

import java.util.Arrays;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 冒泡排序
 * @date : 2021-06-17 20:53:06
 */
public class BubbleSort {
    public void bubbleSort(int[] nums) {
        if (nums == null || nums.length < 2) return;
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
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
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

}
