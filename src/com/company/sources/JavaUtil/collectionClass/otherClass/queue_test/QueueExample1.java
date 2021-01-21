package com.company.sources.JavaUtil.collectionClass.otherClass.queue_test;

import java.util.Queue;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : Queue
 * @date : 2021-01-14 20:10:41
 */
public class QueueExample1 {
    public static void main(String[] args) {
        // extends Collection<E>
        // 向队列中添加元素
        // boolean add(E e);
        // 如果可以在不违反容量限制的情况下立即将指定的元素插入此队列。
        // 使用容量受限的队列时，通常最好使用add ，因为add可能仅通过引发异常而无法插入元素。
        // boolean offer(E e);
        // 检索并删除此队列的头。 此方法与poll不同之处仅在于，如果此队列为空，它将引发异常。
        // E remove();
        // 检索出队元素头 不存在返回null
        // E poll();
        // 检索但不删除此队列的头。 此方法与peek不同之处仅在于，如果此队列为空，它将引发异常
        // E element();
        // 检索不删除队列的头 不存在返回null
        // E peek();
    }
}
