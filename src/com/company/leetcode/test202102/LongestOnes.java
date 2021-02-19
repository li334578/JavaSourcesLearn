package com.company.leetcode.test202102;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 1004. 最大连续1的个数 III
 * @date : 2021-02-19 19:45:33
 */
public class LongestOnes {

    public int longestOnes1(int[] A, int K) {
        int left = 0;//窗口左边的位置
        int maxWindow = 0;//窗口的最大值
        int zeroCount = 0;//窗口中0的个数
        for (int right = 0; right < A.length; right++) {
            if (A[right] == 0) {
                zeroCount++;
            }
            //如果窗口中0的个数超过了K，要缩小窗口的大小，直到0的个数
            //不大于K位置
            while (zeroCount > K) {
                if (A[left++] == 0)
                    zeroCount--;
            }
            //记录最大的窗口
            maxWindow = Math.max(maxWindow, right - left + 1);
        }
        return maxWindow;
    }

    public static void main(String[] args) {
        LongestOnes lo = new LongestOnes();
        int[] nums = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        System.out.println(lo.longestOnes1(nums, 3));
    }


}
