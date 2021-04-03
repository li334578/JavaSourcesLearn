package com.company.JavaSourceLearn.algorithm;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 汉诺塔问题
 * @date : 2021-02-24 20:23:16
 */
public class TowerOfHanoi {

    public static void main(String[] args) {
        hanoi(3, 'A', 'B', 'C');
    }


    /**
     * 汉诺塔算法
     *
     * @param n    共n个盘子
     * @param from 起始盘子
     * @param mid  中间盘子
     * @param to   目标盘子
     */
    public static void hanoi(int n, char from, char mid, char to) {
        if (n == 1) {
            System.out.println(String.format("把第 1 个盘子从 %s 移动到 %s", from, to));
        } else {
            // 前 n-1个盘子 移动到中间位置
            hanoi(n - 1, from, to, mid);
            // 移动第n个盘子
            System.out.println(String.format("把第 %d 个盘子从 %s 移动到 %s", n, from, to));
            // 前n-1个盘子移动到 目标位置
            hanoi(n - 1, mid, from, to);
        }
    }
}
