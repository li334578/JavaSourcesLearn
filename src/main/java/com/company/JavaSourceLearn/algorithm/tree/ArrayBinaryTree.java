package com.company.JavaSourceLearn.algorithm.tree;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 数组存储顺序二叉树
 * @date : 2021-03-08 20:25:00
 */
public class ArrayBinaryTree {
    /*
    * 顺序存储的情况，通常情况下只考虑完全二叉树。
        第n个元素的左子节点是2n+1
        第n个元素的右子节点是2n+2
        第n个元素的父节点是(n-1)/2
    * */
    int[] data;

    public ArrayBinaryTree(int[] data) {
        this.data = data;
    }

    public void frontShow() {
        frontShow(0);
    }

    public void frontShow(int index) {
        if (data == null || data.length == 0) {
            return;
        }
        // 先序遍历
        if (index > data.length - 1) {
            return;
        }
        System.out.println(data[index]);
        // 遍历左子树
        if (2 * index + 1 < data.length) {
            frontShow(2 * index + 1);
        }
        // 遍历右子树
        if (2 * index + 2 < data.length) {
            frontShow(2 * index + 2);
        }
    }
}
