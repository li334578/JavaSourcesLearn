package com.company.JavaSourceLearn.leetcode.test202106;

/**
 * @Author: liwenbo
 * @Date: 2021年06月11日
 * @Description: 70 爬楼梯
 */
public class ClimbStairs {
    public static void main(String[] args) {
        ClimbStairs cs = new ClimbStairs();
        System.out.println(cs.climbStairs(3));
    }

    public int climbStairs(int n) {
        if (n <= 2) return n;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
