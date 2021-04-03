package com.company.JavaSourceLearn.algorithm.huffmanTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 赫夫曼树
 * @date : 2021-03-09 21:11:13
 */
public class HuffmanTreeTest {
    public static void main(String[] args) {
        int[] nums = {3, 7, 8, 29, 5, 11, 23, 14};
        Node huffmanTree = createHuffmanTree(nums);
        System.out.println(huffmanTree);
    }

    private static Node createHuffmanTree(int[] nums) {
        List<Node> list = new ArrayList<>();
        for (int num : nums) {
            list.add(new Node(num));
        }
        // 排序
        while (list.size() > 1) {
            Collections.sort(list);
            // 取出最小的两个
            Node left = list.get(list.size() - 1);
            Node right = list.get(list.size() - 2);
            // 创建新节点
            Node parent = new Node(left.value + right.value);
            parent.left=left;
            parent.right=right;
            list.remove(left);
            list.remove(right);
            list.add(parent);
        }
        return list.get(0);
    }
}
