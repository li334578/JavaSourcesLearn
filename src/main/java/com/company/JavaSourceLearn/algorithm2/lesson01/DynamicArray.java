package com.company.JavaSourceLearn.algorithm2.lesson01;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-05-06 21:09:03
 */
public class DynamicArray<T> {
    private Object[] elements;
    private int size;

    public DynamicArray() {
        this.size = 0;
        elements = new Object[2];
    }

    public DynamicArray(int capacity) {
        this.size = capacity;
        this.elements = new Object[capacity];
    }

    public void add(T element) {
        if (size >= elements.length) {
            // 数组扩容
            int oldLength = elements.length;
            // newLength
            Object[] newElements = new Object[oldLength * 2];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
        elements[size] = element;
        size++;
    }

    public T get(int index) {
        return (T) elements[index];
    }

    public int indexOf(T element) {
        int index = -1;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == element) {
                index = i;
            }
        }
        return index;
    }

    public T remove(int index) {
        // // TODO: 2021/5/6
        return null;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
