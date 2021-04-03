package com.company.JavaSourceLearn.algorithm;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 双向循环链表测试
 * @date : 2021-02-23 20:11:37
 */
public class DoubleLoopNodeTest {
    public static void main(String[] args) {
        DoubleLoopNode doubleLoopNode1 = new DoubleLoopNode(1);
        DoubleLoopNode doubleLoopNode2 = new DoubleLoopNode(2);
        DoubleLoopNode doubleLoopNode3 = new DoubleLoopNode(3);
//        doubleLoopNode1.insertAfter(doubleLoopNode2).insertAfter(doubleLoopNode3).insertAfter(doubleLoopNode4);
        doubleLoopNode1.insertBefore(doubleLoopNode2).insertBefore(doubleLoopNode3);
        System.out.println(doubleLoopNode1.getData());
        System.out.println(doubleLoopNode1.getNext().getData());
        System.out.println(doubleLoopNode1.getNext().getNext().getData());
        System.out.println(doubleLoopNode1.getNext().getNext().getNext().getData());
        System.out.println("------------------");
        System.out.println(doubleLoopNode1.getData());
        System.out.println(doubleLoopNode1.getPrev().getData());
        System.out.println(doubleLoopNode1.getPrev().getPrev().getData());
        System.out.println(doubleLoopNode1.getPrev().getPrev().getPrev().getData());
    }
}
