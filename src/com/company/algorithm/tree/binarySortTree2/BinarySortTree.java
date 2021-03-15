package com.company.algorithm.tree.binarySortTree2;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 二叉排序树
 * @date : 2021-03-11 19:57:42
 */
public class BinarySortTree {
    Node root;

    public void add(Node node) {
        if (root == null) {
            root = node;
        } else {
            root.add(node);
        }
    }

    /**
     * 中序遍历方法
     */
    public void midShow() {
        if (root != null) {
            root.midShow(root);
        }
    }

    public Node search(int value) {
        if (root == null) {
            return null;
        } else {
            return root.search(value);
        }
    }

    public Node searchParent(int value) {
        if (root == null) {
            return null;
        }
        return root.searchParent(value);
    }

    public void delete(int value) {
        if (root == null) {
            return;
        } else {
            // 删除根节点的情况
            if (root.getValue() == value
                    && root.getLeft() == null
                    && root.getRight() == null) {
                root = null;
                return;
            }
            // 找到目标节点
            Node target = search(value);
            if (target == null) {
                // 不存在目标节点
                return;
            }
            // 找到目标节点的父节点
            Node parent = searchParent(value);
            // 左右节点都为空
            if (target.getLeft() == null && target.getRight() == null) {
                // 目标节点是叶子节点
                if (parent.getLeft().getValue() == value) {
                    parent.setLeft(null);
                }
                if (parent.getRight().getValue() == value) {
                    parent.setRight(null);
                }
            } else if (target.getLeft() != null && target.getRight() != null) {
                // 左右节点都不为空
                // 删除右子树中值最小的节点，获取到该节点的值
                int min = deleteMin(target.getRight());
                // 替换目标节点的值
                target.setValue(min);
            } else {
                // 左右节点有一个为空
                if (target.getLeft() != null) {
                    // 左节点不为空
                    if (parent.getRight().getValue() == value) {
                        parent.setRight(target.getLeft());
                    }
                    if (parent.getLeft().getValue() == value) {
                        parent.setLeft(target.getLeft());
                    }
                } else {
                    // 右子节点不为空
                    if (parent.getRight().getValue() == value) {
                        parent.setRight(target.getRight());
                    }
                    if (parent.getLeft().getValue() == value) {
                        parent.setLeft(target.getRight());
                    }
                }
            }
        }
    }


    /**
     * 删除节点的最小子节点的方法
     *
     * @param node 节点
     * @return 最小子节点的值
     */
    private int deleteMin(Node node) {
        // 找到子树中最小的子节点
        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        // 删除这个最小的节点
        delete(node.getValue());
        return node.getValue();
    }
}
