package com.company.algorithm;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 循环链表测试
 * @date : 2021-02-23 19:51:53
 */
public class LoopNodeTest {
    public static void main(String[] args) {
        LoopNode loopNode1 = new LoopNode(1);
        LoopNode loopNode2 = new LoopNode(2);
        LoopNode loopNode3 = new LoopNode(3);
        LoopNode loopNode4 = new LoopNode(4);
//        loopNode1.afterInsert(loopNode2);
//        System.out.println(loopNode1.nextNode().getData());
//        System.out.println(loopNode2.nextNode().getData());
        loopNode1.afterInsert(loopNode2).afterInsert(loopNode3).afterInsert(loopNode4);
        System.out.println(loopNode1.nextNode().getData());
        System.out.println(loopNode1.nextNode().nextNode().getData());
        System.out.println(loopNode1.nextNode().nextNode().nextNode().getData());
        System.out.println(loopNode1.nextNode().nextNode().nextNode().nextNode().getData());
        System.out.println(loopNode1.nextNode().nextNode().nextNode().nextNode().nextNode().getData());
    }
}
