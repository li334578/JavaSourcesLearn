package com.company.algorithm.tree.binarySortTree2;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 二叉排序树的节点
 * @date : 2021-03-11 19:58:06
 */
public class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }


    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getLeft() {
        return left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }


    /**
     * 获取当前结点的高度
     *
     * @return 高度值
     */
    public int height() {
        return Math.max(left == null ? 0 : left.height(), right == null ? 0 : right.height());
    }

    /**
     * 添加节点
     *
     * @param node
     */
    public void add(Node node) {
        if (node == null) {
            return;
        }
        if (node.value < this.value) {
            if (this.left == null) {
                this.left = node;
            } else {
                this.left.add(node);
            }
        } else {
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.add(node);
            }
        }
    }

    /**
     * 中序遍历
     *
     * @param node
     */
    public void midShow(Node node) {
        if (node == null) {
            return;
        }
        midShow(node.left);
        System.out.println(node.value);
        midShow(node.right);
    }

    /**
     * 查找节点值
     *
     * @param value 目标值
     * @return 目标节点
     */
    public Node search(int value) {
        if (this.value == value) {
            return this;
        } else if (this.value > value) {
            if (left == null) {
                return null;
            }
            return left.search(value);
        } else {
            if (right == null) {
                return null;
            }
            return right.search(value);
        }
    }

    /**
     * 搜索节点的父节点
     *
     * @param value 目标值
     * @return 父节点
     */
    public Node searchParent(int value) {
        if ((this.left != null && this.left.value == value)
                || (this.right != null && this.right.value == value)) {
            return this;
        } else if (this.left != null && this.value > value) {
            return this.left.searchParent(value);
        } else if (this.right != null) {
            return this.right.searchParent(value);
        }
        return null;
    }
}
