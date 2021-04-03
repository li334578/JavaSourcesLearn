package com.company.JavaSourceLearn.algorithm;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 栈实现
 * @date : 2021-02-22 20:18:46
 */
public class MyStack {
    private int[] elements;

    public MyStack() {
        elements = new int[0];
    }

    /**
     * 判断栈是否为空
     *
     * @return boolean
     */
    public boolean isEmpty() {
        return elements.length == 0;
    }


    /**
     * 元素入栈
     *
     * @param element 入栈的元素
     */
    public void push(int element) {
        int[] newArray = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }
        newArray[elements.length] = element;
        elements = newArray;
    }


    /**
     * 查看栈顶元素
     *
     * @return 栈顶元素
     */
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("stack is empty");
        } else {
            return elements[elements.length - 1];
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("stack is empty");
        } else {
            int element = elements[elements.length - 1];
            int[] newArray = new int[elements.length - 1];
            for (int i = 0; i < elements.length - 1; i++) {
                newArray[i] = elements[i];
            }
            elements = newArray;
            return element;
        }
    }
}
