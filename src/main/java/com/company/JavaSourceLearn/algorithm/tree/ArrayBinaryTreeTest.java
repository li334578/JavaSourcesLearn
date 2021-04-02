package main.java.com.company.JavaSourceLearn.algorithm.tree;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 数组顺序存储二叉树测试方法
 * @date : 2021-03-08 20:29:57
 */
public class ArrayBinaryTreeTest {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        ArrayBinaryTree arrayBinaryTree = new ArrayBinaryTree(nums);
        arrayBinaryTree.frontShow();
    }
}
