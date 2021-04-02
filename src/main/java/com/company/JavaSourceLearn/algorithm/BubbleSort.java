package main.java.com.company.JavaSourceLearn.algorithm;

import java.util.Arrays;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 冒泡排序
 * @date : 2021-02-24 20:50:29
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] nums1 = {2, 15, 6, 7, 9, 1};
        bubbleSort(nums1);
        System.out.println("-------------------");
        bubbleSort2(nums1);
    }


    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] < nums[j]) {
                    // 交换
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        // 输出
        Arrays.stream(nums).forEach(System.out::println);
    }

    // 正确写法
    public static void bubbleSort2(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    // 交换
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        // 输出
        Arrays.stream(nums).forEach(System.out::println);
    }
}
