package com.company.JavaSourceLearn.leetcode.test202106;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 279. 完全平方数
 * @date : 2021-06-11 20:37:27
 */
public class NumSquares {

    public int numSquares(int n) {
        double sqrt = Math.sqrt(n);
        int len = (int) sqrt;
        int[] arr = new int[len + 1];
        for (int i = 1; i <= len; i++) {
            arr[i] = i * i;
        }
        int counter = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            counter++;
            if (arr[i] == n) {
                break;
            } else {
                n = n - arr[i];
            }
        }
        return counter;
    }

    public int method2(int n){
        int[] dp = new int[n + 1]; // 默认初始化值都为0
        for (int i = 1; i <= n; i++) {
            dp[i] = i; // 最坏的情况就是每次+1
            for (int j = 1; i - j * j >= 0; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1); // 动态转移方程
            }
        }
        return dp[n];
    }


    public static void main(String[] args) {
        NumSquares ns = new NumSquares();
        System.out.println(ns.numSquares(13));
    }
}
