package com.company.JavaSourceLearn.algorithm;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 二分查找
 * @date : 2021-02-21 21:19:53
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int begin = 0;
        int end = array.length - 1;
        int mid;
        int resultIndex = -1;
        int target = 7;
        while (end >= begin) {
            mid = (begin + end) / 2;
            if (array[mid] == target) {
                resultIndex = mid;
                break;
            } else {
                if (array[mid] > target) {
                    end = mid - 1;
                } else {
                    begin = mid + 1;
                }
            }
        }
        System.out.println(resultIndex);
    }
}
