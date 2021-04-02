package main.java.com.company.JavaSourceLearn.algorithm;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 单链表节点
 * @date : 2021-02-22 20:50:49
 */
public class SingleNode {

    private int value;
    private SingleNode nextSingleNode;

    public SingleNode(int value) {
        this.value = value;
    }

    /**
     * 向链表末尾追加节点
     *
     * @param singleNode 节点
     * @return this
     */
    public SingleNode appendSingleNode(SingleNode singleNode) {
        SingleNode currentSingleNode = this;
        while (currentSingleNode.next() != null) {
            currentSingleNode = currentSingleNode.next();
        }
        currentSingleNode.nextSingleNode = singleNode;
        return this;
    }

    /**
     * 获取下一个节点
     *
     * @return 下一个节点
     */
    public SingleNode next() {
        return this.nextSingleNode;
    }

    /**
     * 判断当前节点是否是最后一个节点
     *
     * @return boolean
     */
    public boolean isLast() {
        return nextSingleNode == null;
    }

    /**
     * 当前节点后插入节点
     *
     * @param singleNode 插入的节点
     */
    public void afterInsert(SingleNode singleNode) {
        singleNode.nextSingleNode = this.next();
        this.nextSingleNode = singleNode;
    }

    /**
     * 获取当前节点的值
     *
     * @return 获取当前节点的值
     */
    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "SingleNode{" +
                "value=" + value +
                ", nextSingleNode=" + nextSingleNode +
                '}';
    }
}
