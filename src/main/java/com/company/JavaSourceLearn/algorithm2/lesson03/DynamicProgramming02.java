package com.company.JavaSourceLearn.algorithm2.lesson03;

import java.util.Arrays;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 动态规划
 * @date : 2021-06-08 20:16:40
 */
public class DynamicProgramming02 {

//    // 给定两个单词 word1 和 word2，计算出将 word1 转换成 word2 所使用的最少操作数 。
//    public int method1(String word1, String word2) {
//        //  dp[i] [j]的含义为：当字符串 word1 的长度为 i，字符串 word2 的长度为 j 时，将 word1 转化为 word2 所使用的最少操作次数为 dp[i] [j]。
//        int m = word1.length();
//        int n = word2.length();
//        int[][] dp = new int[m + 1][n + 1];
//        // dp[0][0...n2]的初始值
//        for (int j = 1; j <= n; j++)
//            dp[0][j] = dp[0][j - 1] + 1;
//        // dp[0...n1][0] 的初始值
//        for (int i = 1; i <= m; i++) dp[i][0] = dp[i - 1][0] + 1;
//        // 通过公式推出 dp[n1][n2]
//        for (int i = 1; i <= m; i++) {
//            for (int j = 1; j <= n; j++) {
//                // 如果 word1[i] 与 word2[j] 相等。第 i 个字符对应下标是 i-1
//                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
//                    // 如果我们 word1[i] 与 word2 [j] 相等，这个时候不需要进行任何操作，显然有 dp[i] [j] = dp[i-1] [j-1]。
//                    dp[i][j] = dp[i - 1][j - 1];
//                } else {
//                    // 如果我们 word1[i] 与 word2 [j] 不相等
//                    /*
//                    （1）、如果把字符 word1[i] 替换成与 word2[j] 相等，则有 dp[i] [j] = dp[i-1] [j-1] + 1;
//                    （2）、如果在字符串 word1末尾插入一个与 word2[j] 相等的字符，则有 dp[i] [j] = dp[i] [j-1] + 1;
//                    （3）、如果把字符 word1[i] 删除，则有 dp[i] [j] = dp[i-1] [j] + 1;
//                    * */
//                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i][j - 1]), dp[i - 1][j]) + 1;
//                }
//            }
//        }
//        for (int[] ints : dp) {
//            System.out.println(Arrays.toString(ints));
//        }
//        return dp[m][n];
//    }

    public static void main(String[] args) {
        DynamicProgramming02 dp = new DynamicProgramming02();
//        System.out.println(dp.method2("horse", "ros"));
//        System.out.println(dp.method2("intention", "execution"));
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        dp.maxSubArray(nums);
        System.out.println(dp.maxSubArray2(nums));
    }

    public int method2(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m + 1][n + 1];
        // m=0 & n=0 时 不需要操作
        // n=0时 word1的每个字母都需要一步插入操作
        for (int i = 1; i <= m; i++) {
            dp[i][0] = i;
        }
        // m=0时 word2的每个字母都需要一步插入操作
        for (int i = 1; i <= n; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    // i,j = (i-1, j-1)
                    // 相同就等于 (i-1, j-1)的值
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    // 不相同就等于 前面三个值的最小值+1
                    dp[i][j] = 1 + Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]);
                }
            }
        }

        for (int[] ints : dp) {
            System.out.println(Arrays.toString(ints));
        }
        return dp[m][n];
    }


    // 最大子序和
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int[][] dp = new int[len][len];
        // dp[m,n]代表 从 m->n的和
        // len = 0时 dp = 0
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            dp[0][i] = nums[i] + dp[0][Math.max(i - 1, 0)];
            max = Math.max(dp[0][i], max);
        }
        for (int i = 1; i < len; i++) {
            for (int j = i; j < len; j++) {
                dp[i][j] = dp[i - 1][j] - dp[i - 1][i - 1];
                max = Math.max(dp[i][j], max);
            }
        }
        for (int[] ints : dp) {
            System.out.println(Arrays.toString(ints));
        }
        return max;
    }


    // 最大子序和
    public int maxSubArray2(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum = Math.max(num, sum + num);
            max = Math.max(sum, max);
        }
        return max;
    }

}
