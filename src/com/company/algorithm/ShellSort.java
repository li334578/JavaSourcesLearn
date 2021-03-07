package com.company.algorithm;

import java.util.Arrays;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 希尔排序
 * @date : 2021-03-02 20:40:44
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] nums = {1, 3, 8, 72, 1, 315, 10, 0, 4, 2};
        shellSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void shellSort(int[] nums) {
        // 遍历步长
        for (int i = nums.length / 2; i > 0; i /= 2) {
            // 遍历所有元素
            for (int j = i; j < nums.length; j++) {
                // 遍历本组元素
                for (int k = j - i; k >= 0; k -= i) {
                    if (nums[k] > nums[k + i]) {
                        int temp = nums[k];
                        nums[k] = nums[k + 1];
                        nums[k + 1] = temp;
                    }
                }
            }
        }
    }
}
