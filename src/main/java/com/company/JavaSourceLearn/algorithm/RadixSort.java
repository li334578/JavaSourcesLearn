package com.company.JavaSourceLearn.algorithm;

import java.util.Arrays;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 基数排序
 * @date : 2021-03-03 20:36:42
 */
public class RadixSort {
    public static void main(String[] args) {
        // 暂时不支持负数
        int[] nums = {99, 22, 0, 54, 3, 78, 962, 123, 55, 33};
        radixSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void radixSort(int[] nums) {
        // 求数组的最大值
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        // 求循环次数
        int maxLength = String.valueOf(max).length();
        // 存储每个余数的二维数组
        int[][] temp = new int[10][nums.length];
        for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
            // 记录每个余数数组的下标  每次循环数据都要清零
            int[] counts = new int[10];
            // 求余数
            for (int num : nums) {
                int ys = num / n % 10;
                temp[ys][counts[ys]] = num;
                counts[ys]++;
            }
            // 放回原数组
            // 记录原数组的索引位置
            int index = 0;
            // 获取每个下标数组中的数据数
            for (int j = 0; j < counts.length; j++) {
                // 遍历下标数组
                for (int k = 0; k < counts[j]; k++) {
                    nums[index] = temp[j][k];
                    index++;
                }
            }
        }
    }
}
