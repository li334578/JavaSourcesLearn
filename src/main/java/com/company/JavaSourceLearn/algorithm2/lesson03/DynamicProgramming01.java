package com.company.JavaSourceLearn.algorithm2.lesson03;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 动态规划
 * @date : 2021-06-07 20:14:09
 */
public class DynamicProgramming01 {

    // 青蛙跳问题
    public int[] method1(int n) {
        // 构建一个大小为n的数组
        int[] result = new int[n];
        // 初始值 result[0] = 0 result[1] = 1 result[2] = 2
        result[0] = 0;
        result[1] = 1;
        result[2] = 2;
        for (int i = 3; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result;
    }

    public int method2(int m, int n) {
        // 走到m,n点的方式为 f(m-1,n)+f(m,n-1)
        // 起始值 f(0,0) = 0 f(0,1) = 1 f(1,0) = 1
        if (m <= 0 || n <= 0) {
            return 0;
        }
        // 声明数组
        int[][] result = new int[m + 1][n + 1];
        // f(1,1) = f(0,1) + f(1,0)
        // 初始化数组
        for (int i = 0; i <= m; i++) {
            result[i][0] = 1;
        }

        for (int i = 0; i <= n; i++) {
            result[0][i] = 1;
        }

        for (int i = 1; i < result.length; i++) {
            for (int j = 1; j < result[i].length; j++) {
                result[i][j] = result[i - 1][j] + result[i][j - 1];
            }
        }
        return result[m - 1][n - 1];
    }

    public int method3(int[][] grid) {
        // grid[m][n] = grid[m-1][n] + grid[m][n-1]
        // grid[0][0]
        // 走到 0,0的最小值是 grid[0][0]
        int[][] result = new int[grid.length][grid[0].length];
        // 初始化
        result[0][0] = grid[0][0];

        for (int i = 1; i < grid[0].length; i++) {
            result[0][i] = result[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < grid.length; i++) {
            result[i][0] = result[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[i].length; j++) {
                result[i][j] = grid[i][j] + Math.min(result[Math.max(i - 1, 0)][j], result[i][Math.max(j - 1, 0)]);
            }
        }
        return result[grid.length - 1][grid[0].length - 1];
    }

    public static void main(String[] args) {
        DynamicProgramming01 dp = new DynamicProgramming01();
        System.out.println(dp.method2(1, 1));
        System.out.println(dp.method2(2, 2));
        System.out.println(dp.method2(3, 7));
        System.out.println("----------------");
//        int[][] nums = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int[][] nums = new int[][]{{1, 2, 3}, {4, 5, 6}};
        System.out.println(dp.method3(nums));
    }
}
