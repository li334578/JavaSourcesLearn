package com.company.JavaSourceLearn.algorithm2.lesson01;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-05-06 21:09:03
 */
public class DynamicArray<T> {
    private Object[] elements;
    private int size;

    private static final int defaultCapacity = 16;

    /**
     * 无参构造 默认数组大小是16
     */
    public DynamicArray() {
        this.size = 0;
        elements = new Object[defaultCapacity];
    }

    /**
     * 指定容量的构造 容量大于 defaultCapacity 使用指定容量 否则使用 defaultCapacity
     *
     * @param capacity 指定初始容量
     */
    public DynamicArray(int capacity) {
        this.elements = new Object[Math.max(capacity, defaultCapacity)];
    }

    /**
     * 向动态数组中添加元素
     *
     * @param element 需要添加的元素
     */
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

    /**
     * 替换指定索引位置的元素
     *
     * @param element 新元素
     * @param index   索引位置
     * @return 旧元素
     */
    public T replace(T element, int index) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("数组下标不合法");
        Object oldElement = elements[index];
        // 替换指定位置的元素
        if (index <= size) {
            elements[index] = element;
        }
        return (T) oldElement;
    }

    /**
     * 向指定位置插入元素
     *
     * @param element 新元素
     * @param index   索引位置
     */
    public void insert(T element, int index) {
        int newIndex = 0;
        Object[] newElements = new Object[size + 1];
        for (int i = 0; i < elements.length; i++) {
            if (i == index) {
                newElements[i] = element;
            } else {
                newElements[newIndex] = elements[i];
            }
            newIndex++;
        }
        elements = newElements;
        size++;
    }

    /**
     * 获取指定索引位置的元素
     *
     * @param index 索引值
     * @return 索引位置的元素
     */
    public T get(int index) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("数组下标不合法");
        return (T) elements[index];
    }

    /**
     * 获取元素首次出现的索引位置
     *
     * @param element 元素
     * @return 索引位置 不存在返回-1
     */
    public int indexOf(T element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * 获取元素最后一次出现的索引位置
     *
     * @param element 元素
     * @return 索引位置 不存在返回-1
     */
    public int indexOfLast(T element) {
        int index = -1;
        for (int i = size - 1; i > 0; i--) {
            if (elements[i] == element) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * 移除指定索引位置的元素
     *
     * @param index 指定索引位置
     * @return 返回移除的元素
     */
    public T remove(int index) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("数组下标不合法");
        Object result = elements[index];
        Object[] newElements = new Object[size];
        int newIndex = 0;
        for (int i = 0; i < elements.length; i++) {
            if (i != index) {
                newElements[newIndex] = elements[i];
                newIndex++;
            }
        }
        size--;
        elements = newElements;
        return (T) result;
    }

    /**
     * 判断数组是否为空
     *
     * @return true 数组为空
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 获取数组中的元素个数
     *
     * @return 数组中元素个数
     */
    public int getSize() {
        return size;
    }

    /**
     * 清空数组
     */
    public void clear() {
        size = 0;
    }

    /**
     * 判断数组是否包含目标元素
     *
     * @param element 数组目标元素
     * @return 是否包含数组元素
     */
    public boolean contains(T element) {
        boolean result = false;
        for (Object object : elements) {
            if (object == element) {
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        String elementStr = Arrays.stream(elements).filter(Objects::nonNull).map(Objects::toString).collect(Collectors.joining(","));
        return stringBuilder.append(elementStr).append("]").toString();
    }
}
