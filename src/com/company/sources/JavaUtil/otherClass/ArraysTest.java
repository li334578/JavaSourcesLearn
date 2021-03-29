package com.company.sources.JavaUtil.otherClass;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @Author: liwenbo
 * @Date: 29/3/2021
 * @Description:
 */
public class ArraysTest {
    public static void main(String[] args) {
        // 返回一个受指定数组支持的固定大小的列表
        List<Integer> list = Arrays.asList(1, 2, 3);
        int[] nums = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = Arrays.binarySearch(nums, 3);// index 3
        // 复制指定的数组 截取或填充0(如有必要)，以使副本具有指定的长度 其他类型用null填充
        int[] ints = Arrays.copyOf(nums, 5);
        int[] ints1 = Arrays.copyOf(nums, 12);
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(ints1));// 会填充0
        // 指定起始和终止的位置
        int[] ints2 = Arrays.copyOfRange(nums, 1, 5);
        // 如果两个数组包含相同数量的元素，并且两个数组中所有对应的元素对都相等，则认为两个数组相等。
        // 换句话说，如果两个数组包含相同顺序的相同元素，则它们相等。同样，如果两个数组引用都为null也认为两个数组相等
        boolean equals = Arrays.equals(ints1, ints2);
        Object[] objects1 = new Object[10];
        Object[] objects2 = new Object[10];
        // 会使用数组中元素的equals方法
        boolean b = Arrays.deepEquals(objects1, objects2);
        // 如果该数组包含其他数组作为元素，则哈希码基于其内容
        int i = Arrays.deepHashCode(objects1);
        // 返回指定数组的“深层内容”的字符串表示形式。
        String s = Arrays.deepToString(objects2);
        boolean[] booleans = new boolean[10];
        // 将指定的布尔值分配给指定的布尔数组的每个元素。
        Arrays.fill(booleans, true);
        int[] randomIntNums = new int[10];
        Random random = new Random();
        // 使用Random.nextInt 会填充同一个值十次
        Arrays.fill(randomIntNums, random.nextInt(10));
        // 返回指定数组的内容的hashCode码
        int i1 = Arrays.hashCode(nums);
        // 对指定的数组按照数字生谦虚进行排序
        Arrays.sort(nums);
        // object[],comparator
//        Arrays.sort(objects2, (t1, t2) -> t2.hashCode() - t1.hashCode());
        String[] strings = new String[]{"AB", "VDW", "WOPKF", "C"};
        Arrays.sort(strings, (item1, item2) -> item2.length() - item1.length());
        // toString
        System.out.println(Arrays.toString(strings));
    }
}
