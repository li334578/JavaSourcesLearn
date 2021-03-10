package com.company.algorithm;

import java.util.Arrays;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 基数排序队列版
 * @date : 2021-03-03 20:36:42
 */
public class RadixQueueSort {
    public static void main(String[] args) {
        // 暂时不支持负数
        int[] nums = {99, 22, 0, 54, 3, 78, 962, 123, 55, 33};
        radixSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void radixSort(int[] nums) {
        // 求数组的最大值
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        // 求循环次数
        int maxLength = String.valueOf(max).length();
        // 存储每个余数的队列
        MyQueue[] temp = new MyQueue[10];
        // 为队列赋初值
        for (int i = 0; i < temp.length; i++) {
            temp[i] = new MyQueue();
        }
        for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
            // 求余数
            for (int num : nums) {
                int ys = num / n % 10;
                temp[ys].addElement(num);
            }
            // 放回原数组
            // 记录原数组的索引位置
            int index = 0;
            for (MyQueue myQueue : temp) {
                while (!myQueue.isEmpty()) {
                    // 出队
                    nums[index] = myQueue.poll();
                    index++;
                }
            }
        }
    }
}
