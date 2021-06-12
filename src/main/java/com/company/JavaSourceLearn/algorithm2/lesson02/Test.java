package com.company.JavaSourceLearn.algorithm2.lesson02;

import java.util.Arrays;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-06-06 15:54:54
 */
public class Test {

    public static void main(String[] args) {
        int[] data = {0, 1, 2, 3, 4, 5, 6, 2, 3, 9, 7, 10};
        System.out.println(Arrays.toString(data));
        CheckAndSet checkAndSet = new CheckAndSet(data);
//        System.out.println(checkAndSet.find3(8));
//        System.out.println(Arrays.toString(checkAndSet.getPre()));
//        System.out.println("--------------------------------");
//        System.out.println(checkAndSet.find(11));
//        System.out.println(Arrays.toString(checkAndSet.getPre()));
//        System.out.println("--------------------------------");
//        System.out.println(checkAndSet.find3(11));
//        System.out.println(Arrays.toString(checkAndSet.getPre()));
//        System.out.println("--------------------------------");
//        System.out.println(checkAndSet.find4(11));
//        System.out.println(Arrays.toString(checkAndSet.getPre()));
//        System.out.println("--------------------------------");
        checkAndSet.join(8, 11);
        System.out.println(Arrays.toString(checkAndSet.getPre()));
        System.out.println("--------------------------------");
        System.out.println(checkAndSet.find4(8));
        System.out.println(Arrays.toString(checkAndSet.getPre()));
        System.out.println("--------------------------------");
    }

    public int findCircleNum(int[][] isConnected) {
        // 构建并查集
        int length = isConnected.length;
        int[] data = new int[length];
        // 初始化并查集
        for (int i = 0; i < data.length; i++) {
            data[i] = i;
        }

        for (int i = 0; i < isConnected.length; i++) {
            // 只需要查询一半
            for (int j = i + 1; j < isConnected[i].length; j++) {
                if (isConnected[i][j] == 1) {
                    merge(data, i, j);
                }
            }
        }
        // 查询城市数
        int counter = 0;
        for (int i = 0; i < length; i++) {
            counter = data[i] == i ? counter + 1 : counter;
        }
        return counter;
    }

    private void merge(int[] data, int i, int j) {
        if (find(data, i) != find(data, j)) {
            // 将i的根指向j
            data[find(data, i)] = find(data, j);
        }
    }

    private int find(int[] data, int i) {
        return i == data[i] ? i : (data[i] = find(data, data[i]));
    }
}
