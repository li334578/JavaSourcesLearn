package com.company.JavaSourceLearn.algorithm;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 单链表测试
 * @date : 2021-02-22 20:51:45
 */
public class SingleNodeTest {
    public static void main(String[] args) {
        SingleNode singleNode0 = new SingleNode(0);
        SingleNode singleNode1 = new SingleNode(2);
        SingleNode singleNode2 = new SingleNode(4);
        SingleNode singleNode3 = new SingleNode(6);
        SingleNode singleNode4 = new SingleNode(8);
        SingleNode singleNode5 = new SingleNode(10);
        singleNode0.appendSingleNode(singleNode1).appendSingleNode(singleNode2)
                .appendSingleNode(singleNode3).appendSingleNode(singleNode4).appendSingleNode(singleNode5);
        System.out.println(singleNode0);
        System.out.println(singleNode0.next().next());
        System.out.println(singleNode0.next().next().getValue());

        SingleNode singleNodeInsert = new SingleNode(-1);
        singleNode0.next().next().afterInsert(singleNodeInsert);
        System.out.println(singleNode0);
    }
}
