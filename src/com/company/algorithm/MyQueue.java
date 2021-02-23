package com.company.algorithm;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 队列实现
 * @date : 2021-02-22 20:37:45
 */
public class MyQueue {
    private int[] elements;

    public MyQueue() {
        elements = new int[0];
    }

    /**
     * 判断队列是否为空
     *
     * @return 队列是否为空
     */
    public boolean isEmpty() {
        return elements.length == 0;
    }


    /**
     * 入队
     *
     * @param element 元素
     */
    public void addElement(int element) {
        int[] newArray = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }
        newArray[elements.length] = element;
        elements = newArray;
    }

    /**
     * 出队
     *
     * @return 队列元素出队
     */
    public int poll() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        } else {
            int element = elements[0];
            int[] newArray = new int[elements.length - 1];
            for (int i = 1; i < elements.length; i++) {
                newArray[i - 1] = elements[i];
            }
            elements = newArray;
            return element;
        }
    }


}
