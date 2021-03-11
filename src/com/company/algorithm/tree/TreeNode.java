package com.company.algorithm.tree;

import java.util.Objects;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 树结点
 * @date : 2021-03-04 20:31:59
 */
public class TreeNode {

    Object value;

    TreeNode leftNode;

    TreeNode rightNode;

    public TreeNode(Object value) {
        this.value = value;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }


    /**
     * 先序遍历
     */
    public void frontShow() {
        // 先当前节点
        System.out.println(this.value);
        // 左节点
        if (this.leftNode != null) {
            this.leftNode.frontShow();
        }
        // 右节点
        if (this.rightNode != null) {
            this.rightNode.frontShow();
        }
    }

    /**
     * 中序遍历
     */
    public void midShow() {
        if (this.leftNode != null) {
            this.leftNode.midShow();
        }
        System.out.println(this.value);
        if (this.rightNode != null) {
            this.rightNode.midShow();
        }
    }

    /**
     * 后序遍历
     */
    public void afterShow() {
        if (this.leftNode != null) {
            this.leftNode.afterShow();
        }
        if (this.rightNode != null) {
            this.rightNode.afterShow();
        }
        System.out.println(this.value);
    }

    /**
     * 先序遍历 根左右
     *
     * @param i 目标值
     * @return 结果结点 不存在返回null
     */
    public TreeNode frontSearch(Object i) {
        if (Objects.equals(this.value, i)) {
            return this;
        }
        TreeNode result = null;
        if (this.leftNode != null) {
            result = this.leftNode.frontSearch(i);
        }
        if (result != null) {
            return result;
        }
        if (this.rightNode != null) {
            result = this.rightNode.frontSearch(i);
        }
        return result;
    }

    /**
     * 中序遍历 左根右
     *
     * @param i 目标值
     * @return 结果结点 不存在返回null
     */
    public TreeNode midSearch(Object i) {
        TreeNode result = null;
        if (this.leftNode != null) {
            result = this.leftNode.midSearch(i);
        }
        if (result != null) {
            return result;
        }
        if (Objects.equals(this.value, i)) {
            return this;
        }
        if (this.leftNode != null) {
            result = this.rightNode.midSearch(i);
        }
        return result;
    }

    /**
     * 后序遍历 左右根
     *
     * @param i 目标值
     * @return 结果结点 不存在返回null
     */
    public TreeNode afterSearch(Object i) {
        TreeNode result = null;
        if (this.leftNode != null) {
            result = this.leftNode.afterSearch(i);
        }
        if (result != null) {
            return result;
        }
        if (this.rightNode != null) {
            result = this.rightNode.afterSearch(i);
        }
        if (result != null) {
            return result;
        }
        if (Objects.equals(this.value, i)) {
            return this;
        }
        return result;
    }

    public void delete(Object i) {
        // 记录父节点
        TreeNode parent = this;
        // 判断左
        if (parent.leftNode != null && Objects.equals(parent.leftNode.value, i)) {
            parent.leftNode = null;
            return;
        }
        // 判断右
        if (parent.rightNode != null && Objects.equals(parent.rightNode.value, i)) {
            parent.rightNode = null;
            return;
        }
        // 检查左树
        parent = this.leftNode;
        if (parent != null) {
            parent.delete(i);
        }
        parent = this.rightNode;
        // 检查右树
        if (parent != null) {
            parent.delete(i);
        }
    }
}
