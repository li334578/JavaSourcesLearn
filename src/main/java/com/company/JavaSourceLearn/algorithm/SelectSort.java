package main.java.com.company.JavaSourceLearn.algorithm;

import java.util.Arrays;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 选择排序
 * @date : 2021-03-01 21:16:36
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 9, 1, 0, 3, 2};
        selectSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void selectSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            // i位置和minIndex位置交换
            if (i != minIndex) {
                int temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;
            }
        }
    }
}
