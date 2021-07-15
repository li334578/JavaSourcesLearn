package com.company.JavaSourceLearn.leetcode.test202106;

import java.util.*;

/**
 * @Author: liwenbo
 * @Date: 2021年06月22日
 * @Description:
 */
public class CountAli {
    /*
    给定一个非负整数数组，你最初位于数组的第一个位置。
    数组中的每个元素代表你在该位置可以跳跃的最大长度。
    你的目标是使用最少的跳跃次数到达数组的最后一个位置。
    实例：
    输入：[2,3,1,1,7]
    解释：跳到最后一个位置的最小跳跃数是2
    从下标为0跳跃到下标为1位置，跳1步，然后跳3步到达数组的最后一个位置。
     */

    public static void main(String[] args) {
        CountAli c_t = new CountAli();
        int testTimes = 500000;
        int size = 10;
        int value = 100;
        boolean succeed = true;
        for (int i = 0; i < testTimes; i++) {
            int[] arr1 = generateRandomArray(size, value);
            int[] arr2 = copyArray(arr1);
            int[] arr3 = copyArray(arr1);
            if (c_t.countTimes(arr3) == c_t.jump(arr2)) {
                succeed = false;
                System.out.println(Arrays.toString(arr2));
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");
    }

    public static int[] copyArray(int[] nums) {
        int[] arr = new int[nums.length];
        System.arraycopy(nums, 0, arr, 0, nums.length);
        return arr;
    }

    public static int[] generateRandomArray(int size, int value) {
        // 生成长度随机的数组
        int[] arr = new int[(int) ((size + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((value + 1) * Math.random() - (int) (value * Math.random()));
            if (arr[i] <= 0) {
                arr[i] = -arr[i];
            }
        }
        return arr;
    }

    public int jump2(int[] nums) {
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }

    public int jump(int[] nums) {
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }

    public int countTimes(int[] arr) {
        if (arr.length < 2) return 1;
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <= arr[i]; j++) {
                Set<Integer> set;
                if (i + j < arr.length) {
                    if (map.containsKey(i + j)) {
                        set = map.get(i + j);
                    } else {
                        set = new HashSet<>();
                    }
                    set.add(i);
                    map.put(i + j, set);
                }
            }
        }
        return findRootCounter(map, arr.length - 1);
    }

    private int findRootCounter(Map<Integer, Set<Integer>> map, int target) {
        int counter = 1;
        if (map.get(target).contains(0)) {
            return counter;
        }
        int min = Integer.MAX_VALUE;
        for (Integer integer : map.get(target)) {
            min = Math.min(min, findRootCounter(map, integer));
        }
        return counter + min;
    }
}
