package com.company.JavaSourceLearn.leetcode.test202106;

/**
 * @Author: liwenbo
 * @Date: 2021年06月11日
 * @Description: 53. 最大子序和
 */
public class MaxSubArray {

    public static void main(String[] args) {
        MaxSubArray ms = new MaxSubArray();
        System.out.println(ms.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max + nums[i], nums[i]);
            res = Math.max(res, max);
        }
        return res;
    }
}
