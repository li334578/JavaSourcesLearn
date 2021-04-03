package com.company.JavaSourceLearn.algorithm.huffmanTree;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 节点
 * @date : 2021-03-09 21:09:35
 */
public class Node implements Comparable<Node> {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }


    @Override
    public int compareTo(Node o) {
        return o.value - this.value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
