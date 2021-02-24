package com.company.algorithm;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 循环链表节点
 * @date : 2021-02-23 19:48:26
 */
public class LoopNode {

    private Object data;
    private LoopNode next = this;

    public LoopNode(Object data) {
        this.data = data;
    }

    public LoopNode afterInsert(LoopNode nextNode) {
        LoopNode tempLoopNode = this.next;
        this.next = nextNode;
        nextNode.next = tempLoopNode;
        return this;
    }

    public LoopNode nextNode(){
        return this.next;
    }

    public Object getData() {
        return this.data;
    }
}
