package com.company.JavaSourceLearn.algorithm.tree.binarySortTree;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 测试二叉排序树
 * @date : 2021-03-11 20:04:07
 */
public class BinarySortTreeTest {
    public static void main(String[] args) {
        BinarySortTree binarySortTree = new BinarySortTree();
        int[] nums = new int[]{7, 3, 10, 12, 5, 1, 9};
        for (int num : nums) {
            binarySortTree.add(new Node(num));
        }
        // 中序遍历
        binarySortTree.midShow();
        // 查找
//        Node search1 = binarySortTree.search(10);
//        System.out.println(search1);
//        Node search2 = binarySortTree.search(20);
//        System.out.println(search2);
        // 查找父节点
//        Node n1 = binarySortTree.searchParent(1);
//        Node n2 = binarySortTree.searchParent(5);
//        Node n3 = binarySortTree.searchParent(0);
//        System.out.println(n1);
//        System.out.println(n2);
//        System.out.println(n3);
        // 删除节点
//        System.out.println("-----------------");
//        binarySortTree.delete(12);
//        binarySortTree.delete(9);
//        binarySortTree.midShow();
        System.out.println("=============");
//        binarySortTree.delete(10);
//        binarySortTree.midShow();
        binarySortTree.delete(10);
        binarySortTree.midShow();
    }
}
