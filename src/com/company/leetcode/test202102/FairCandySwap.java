package com.company.leetcode.test202102;

import java.util.Arrays;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 888. 公平的糖果棒交换
 * @date : 2021-02-01 20:08:37
 */
public class FairCandySwap {

    public int[] fairCandySwap(int[] A, int[] B) {
        int[] result = new int[2];
        // 求A数组的和
        int sumA = Arrays.stream(A).sum();
        // 求B数组的和
        int sumB = Arrays.stream(B).sum();
        // 求A、B数组的差
        int count = sumA - sumB;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                // A数组增加或减少的数量 A[i] - B[j]
                // B数组增加或减少的数量 B[j] - A[i]
                // A[i] - B[j]  - (B[j] - A[i]) = 2A[i] - 2B[j]
                // B[j] - A[i] - (A[i] - B[j]) = 2B[j] - 2A[i]
                if (count == 2 * (A[i] - B[j])) {
                    result[0] = A[i];
                    result[1] = B[j];
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FairCandySwap fairCandySwap = new FairCandySwap();
        int[] B = {2, 4};
        int[] A = {1, 2, 5}; // -2
        System.out.println(Arrays.toString(fairCandySwap.fairCandySwap(A, B)));
    }
}
