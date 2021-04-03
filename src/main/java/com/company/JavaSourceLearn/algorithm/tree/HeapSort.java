package com.company.JavaSourceLearn.algorithm.tree;

import java.util.Arrays;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 堆排序
 * @date : 2021-03-08 20:54:18
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] nums = {9, 6, 8, 7, 0, 1, 10, 4, 2};
        heapSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void heapSort(int[] nums) {
        // 开始位置是最后一个非叶子节点 即最后一个节点的父节点
        int start = (nums.length - 1) / 2;
        for (int i = start; i >= 0; i--) {
            maxHeap(nums, nums.length, i);
        }
        // 每次变成大顶堆之后 取出最大值
        for (int i = nums.length - 1; i > 0; i--) {
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;
            // 调整成大顶堆
            maxHeap(nums, i, 0);
        }
    }

    public static void maxHeap(int[] nums, int size, int index) {
        // 大顶堆
        // 取当前位置的值为max
        int max = index;
        // 左侧子树的值为
        int leftNode = 2 * index + 1;
        // 右侧子树的值为
        int rightNode = 2 * index + 2;
        if (leftNode < size && nums[max] < nums[leftNode]) {
            max = leftNode;
        }
        if (rightNode < size && nums[max] < nums[rightNode]) {
            max = rightNode;
        }
        if (max != index) {
            // 交换
            int temp = nums[max];
            nums[max] = nums[index];
            nums[index] = temp;
            maxHeap(nums, size, max);
        }
    }
}
