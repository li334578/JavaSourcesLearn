package com.company.algorithm.tree;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 二叉树测试
 * @date : 2021-03-04 20:34:06
 */
public class TestBinaryTree {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = new TreeNode(1);
        binaryTree.setRoot(root);
        // 创建左子树
        TreeNode leftChild = new TreeNode(2);
        root.setLeftNode(leftChild);
        // 创建右子树
        TreeNode rightChild = new TreeNode(3);
        root.setRightNode(rightChild);
        leftChild.setLeftNode(new TreeNode(4));
        leftChild.setRightNode(new TreeNode(5));
        rightChild.setLeftNode(new TreeNode(6));
        rightChild.setRightNode(new TreeNode(7));
        // 先序遍历 根左右
        binaryTree.frontShow();
        System.out.println("---------------------------");
        // 中序便利 左根右
        binaryTree.midShow();
        System.out.println("---------------------------");
        // 后序遍历 左右根
        binaryTree.afterShow();
        System.out.println("---------------------------");
        // 先序查找 根左右
        TreeNode result1 = binaryTree.frontSearch(8);
        // 中序查找 左根右
        TreeNode result2 = binaryTree.midSearch(2);
        // 后序遍历 左右根
        TreeNode result3 = binaryTree.afterSearch(9);

        binaryTree.delete(2);
        binaryTree.afterShow();
    }
}
