package main.java.com.company.JavaSourceLearn.algorithm;

import java.util.Arrays;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 归并排序
 * @date : 2021-03-02 21:10:55
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {99, 88, 11, 22, 55, 77, 100, 0, 1, 5, 889};
        System.out.println(Arrays.toString(nums));
        mergeSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void mergeSort(int[] nums, int start, int end) {
        int middle = (start + end) / 2;
        if (start < end) {
            mergeSort(nums, start, middle);
            mergeSort(nums, middle + 1, end);
            merge(nums, start, middle, end);
        }
    }

    public static void merge(int[] nums, int start, int middle, int end) {
        // 合并数组
        // 存储临时数组
        int[] temps = new int[end - start + 1];
        // 记录第一个数组需要遍历的下标
        int i = start;
        // 记录第二个数组需要遍历的下标
        int j = middle + 1;
        // 记录临时数组中的下标位置
        int index = 0;
        while (i <= middle && j <= end) {
            // 第一个数组的数据
            if (nums[i] <= nums[j]) {
                temps[index] = nums[i];
                i++;
            } else {
                temps[index] = nums[j];
                j++;
            }
            index++;
        }
        // 处理剩余的数据
        while (i <= middle) {
            temps[index] = nums[i];
            i++;
            index++;
        }
        while (j <= end) {
            temps[index] = nums[j];
            j++;
            index++;
        }
        // 赋值回原数组
        for (int k = 0; k < temps.length; k++) {
            nums[k + start] = temps[k];
        }
    }
}
