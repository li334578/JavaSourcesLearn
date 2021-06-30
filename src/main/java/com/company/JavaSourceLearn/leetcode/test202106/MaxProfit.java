package com.company.JavaSourceLearn.leetcode.test202106;

import java.util.Arrays;

/**
 * @Author: liwenbo
 * @Date: 2021年06月11日
 * @Description:
 */
public class MaxProfit {
    public static void main(String[] args) {
        MaxProfit mp = new MaxProfit();
        System.out.println(mp.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(mp.maxProfit(new int[]{7, 6, 4, 3, 1}));
        System.out.println(mp.maxProfit2(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(mp.maxProfit2(new int[]{7, 6, 4, 3, 1}));
    }

    public int maxProfit(int[] prices) {
        // 最大利润
        int max = 0;
        // 买入价
        int inPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] >= inPrice) {
                max = Math.max(prices[i] - inPrice, max);
            } else {
                inPrice = prices[i];
            }
        }
        return max;
    }

    public int maxProfit2(int[] prices) {
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];

        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], -prices[i]);
        }
        for (int[] ints : dp) {
            System.out.println(Arrays.toString(ints));
        }
        return dp[prices.length - 1][0];
    }
}
