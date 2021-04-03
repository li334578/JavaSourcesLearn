package com.company.JavaSourceLearn.sources.JavaUtil.otherClass;

import java.util.ArrayDeque;
import java.util.Iterator;

/**
 * @Author: liwenbo
 * @Date: 29/3/2021
 * @Description:
 */
public class ArrayDequeTest {
    public static void main(String[] args) {
        /*
         * 数组双端队列没有容量限制，使他们增长为必要支持使用。
         * 它们不是线程安全的;如果没有外部同步。
         * 不支持多线程并发访问。
         * null元素被禁止使用在数组deques。
         * 它们要比堆栈Stack和LinkedList快。
         */
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        // 此方法将添加指定的元素，在此deque队列的末尾。
        arrayDeque.add("a");
        // 此方法将添加指定的元素，在此deque队列的前面。
        arrayDeque.addFirst("q");
        // 此方法将插入指定的元素，在此deque队列的末尾。
        arrayDeque.addLast("w");
        arrayDeque.push("b");
        arrayDeque.forEach(System.out::println);
        System.out.println("-------");
        // 此方法返回一个迭代器在此deque队列以逆向顺序的元素。
        Iterator<String> stringIterator = arrayDeque.descendingIterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }
        // 此方法检索，但是不移除此deque队列表示的队列的头部。
        String element = arrayDeque.element();
        // 此方法检索，但是不移除此deque队列的第一个元素。
        String first = arrayDeque.getFirst();
        // 此方法检索，但是不移除此deque队列的最后一个元素。
        String last = arrayDeque.getLast();
        // 此方法移除此deque队列的指定元素的第一个匹配。
        arrayDeque.removeFirstOccurrence("a");
        // 此方法移除此deque队列的指定元素的最后一次出现。
        arrayDeque.removeLastOccurrence("a");
        // 此方法移除此deque队列的元素。
        arrayDeque.clear();

    }
}
