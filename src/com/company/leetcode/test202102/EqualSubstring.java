package com.company.leetcode.test202102;

import java.util.Arrays;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 1208. 尽可能使字符串相等
 * @date : 2021-02-05 20:10:45
 */
public class EqualSubstring {
    public static void main(String[] args) {
        EqualSubstring es = new EqualSubstring();
//        System.out.println(es.equalSubstring("abcd", "bcdf", 3));
////        System.out.println(es.equalSubstring("abcd", "cdef", 3));
////        System.out.println(es.equalSubstring("abcd", "acde", 0));
////        System.out.println(es.equalSubstring("krrgw", "zjxss", 19));
        int[] nums = {-6662, 5432, -8558, -8935, 8731, -3083, 4115, 9931, -4006,
                -3284, -3024, 1714, -2825, -2374, -2750, -959, 6516, 9356, 8040,
                -2169, -9490, -3068, 6299, 7823, -9767, 5751, -7897, 6680, -1293,
                -3486, -6785, 6337, -9158, -4183, 6240, -2846, -2588, -5458, -9576,
                -1501, -908, -5477, 7596, -8863, -4088, 7922, 8231, -4928, 7636, -3994,
                -243, -1327, 8425, -3468, -4218, -364, 4257, 5690, 1035, 6217, 8880, 4127,
                -6299, -1831, 2854, -4498, -6983, -677, 2216, -1938, 3348, 4099, 3591,
                9076, 942, 4571, -4200, 7271, -6920, -1886, 662, 7844, 3658, -6562,
                -2106, -296, -3280, 8909, -8352, -9413,
                3513, 1352, -8825};
        System.out.println(Arrays.stream(nums).sum());
        // -10782
        System.out.println(-10782 + 8825 - 3513 - 1352);
        // -6822
        System.out.println(-6822 + 6662 + 3513);
        //
        System.out.println((double) 3533 / 90);
//        System.out.println(es.findSubArray(nums, 4));

    }

    public int equalSubstring(String s, String t, int maxCost) {
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        int result = 0;
        for (int i = 0; i < chars2.length; i++) {
            int count = 0;
            int temp = 0;
            for (int j = i; j < chars2.length; j++) {
                count = count + Math.abs(chars2[j] - chars1[j]);
                if (count <= maxCost) {
                    temp++;
                }
                result = Math.max(temp, result);
            }
        }
        return result;
    }
    // 643. 子数组最大平均数 I
    /*
    * [1,12,-5,-6,50,3]
4
    * */

    public double findSubArray(int[] nums, int k) {
        // 滑动窗口法
        int len = nums.length; // 数组长度
        int left = 0, right = 0; // 双指针
        int sums = 0; // 用于统计子区间是否有效
        int res = Integer.MIN_VALUE; // 用于保存最大的满足题目要求的数组长度
        while (right < len) {
            sums += nums[right];
            while (right - left >= k) {
                // 移动左指针 减去左指针对应位置的值
                sums -= nums[left];
                // 移动左指针
                left++;
            }
            res = Math.max(res, sums);
            right++;
        }
        return (double) res / k;
    }
}
