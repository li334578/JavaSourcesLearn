package com.company.algorithm.tree;

import java.util.Objects;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 二叉树
 * @date : 2021-03-04 20:34:26
 */
public class BinaryTree {

    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    /**
     * 先序遍历
     */
    public void frontShow() {
        root.frontShow();
    }

    /**
     * 中序遍历
     */
    public void midShow() {
        root.midShow();
    }

    /**
     * 后序遍历
     */
    public void afterShow() {
        root.afterShow();
    }

    /**
     * 先序遍历 根左右
     *
     * @param i 目标值
     * @return 结果结点 不存在返回null
     */
    public TreeNode frontSearch(Object i) {
        return root.frontSearch(i);
    }

    /**
     * 中序遍历 左根右
     *
     * @param i 目标值
     * @return 结果结点 不存在返回null
     */
    public TreeNode midSearch(Object i) {
        return root.midSearch(i);
    }

    /**
     * 后序遍历 左右根
     *
     * @param i 目标值
     * @return 结果结点 不存在返回null
     */
    public TreeNode afterSearch(Object i) {
        return root.afterSearch(i);
    }

    public void delete(Object i) {
        if (Objects.equals(root.value, i)) {
            root = null;
        } else {
            root.delete(i);
        }
    }
}
