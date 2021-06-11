package com.company.JavaSourceLearn.leetcode.test202106;

/**
 * @Author: liwenbo
 * @Date: 2021年06月11日
 * @Description:
 */
public class MaxProduct {
    public static void main(String[] args) {
        MaxProduct mp = new MaxProduct();
        System.out.println(mp.maxProduct1(new int[]{0, -4, 2, -3, -4}));
//        System.out.println(mp.maxProduct2(new int[]{0, -4, 2, -3, -4}));
        System.out.println(mp.maxProduct2(new int[]{2, 3, -2, 4}));
    }

    public int maxProduct1(int[] nums) {
        int max = Integer.MIN_VALUE;
        int[][] dp = new int[nums.length][nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (i == j) {
                    dp[i][j] = nums[j];
                } else {
                    dp[i][j] = nums[j] * dp[i][j - 1];
                }
                max = Math.max(dp[i][j], max);
            }
        }
        return max;
    }


    public int maxProduct2(int[] nums) {
        int res = nums[0], min = nums[0], max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int currentMax = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            int currentMin = Math.min(Math.min(max * nums[i], min * nums[i]), nums[i]);
            res = Math.max(res, currentMax);
            max = currentMax;
            min = currentMin;
        }
        return res;
    }
}
