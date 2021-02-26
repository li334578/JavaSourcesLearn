package com.company.algorithm;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 双向循环链表
 * @date : 2021-02-23 20:04:57
 */
public class DoubleLoopNode {
    private DoubleLoopNode prev = this;
    private DoubleLoopNode next = this;
    private Object data;

    public DoubleLoopNode(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public DoubleLoopNode insertAfter(DoubleLoopNode newDoubleLoopNode) {
        // 前插
        DoubleLoopNode prevDoubleLoopNode = this.prev; // 原前节点
        // 3 1 2 1 2 3 2 3 1 4 4 4
        newDoubleLoopNode.next = this;
        // 3 1 2 1 2 3 2 3 1 4 4 1
        this.prev = newDoubleLoopNode;
        // 4 1 2 1 2 3 2 3 1 4 4 1
        newDoubleLoopNode.prev = prevDoubleLoopNode;
        // 4 1 2 1 2 3 2 3 1 3 4 1
        prevDoubleLoopNode.next = newDoubleLoopNode;
        // 4 1 2 1 2 3 2 3 4 3 4 1

        // 4 1 2 1 2 3 2 3 4 3 4 1
        return this;
    }

    public DoubleLoopNode insertBefore(DoubleLoopNode newDoubleLoopNode) {
        // 后插
        DoubleLoopNode nextDoubleLoopNode = this.next; // 原后节点
        // 3 1 2 - 4 4 4 - 1 2 3 2 3 1
        this.next = newDoubleLoopNode;
        // 3 1 4 - 4 4 4 - 1 2 3 2 3 1
        newDoubleLoopNode.prev = this;
        // 3 1 4 - 1 4 4 - 1 2 3 2 3 1
        newDoubleLoopNode.next = nextDoubleLoopNode;
        // 3 1 4 - 1 4 2 - 1 2 3 2 3 1
        nextDoubleLoopNode.prev = newDoubleLoopNode;
        // 3 1 4 - 1 4 2 - 4 2 3 2 3 1
        return this;
    }


    public DoubleLoopNode getPrev() {
        return this.prev;
    }

    public DoubleLoopNode getNext() {
        return this.next;
    }
}
