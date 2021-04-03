package com.company.JavaSourceLearn.sources.JavaUtil.collectionClass.otherClass.stack_test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : Stack
 * @date : 2021-01-14 20:14:37
 */
public class StackExample1 {
    public static void main(String[] args) {
        // extends Vector<E>
        // 创建一个空堆栈
        /*
         * public Stack() {
         *     }
         */
        // 将项目推入此堆栈的顶部。 与以下内容完全相同：
        /*
         * public E push(E item) {
         *         addElement(item);
         *
         *         return item;
         *     }
         */
        // 删除此堆栈顶部的对象，并将该对象作为此函数的值返回。
        /*
         * public synchronized E pop() {
         *         E       obj;
         *         int     len = size();
         *
         *         obj = peek();
         *         removeElementAt(len - 1);
         *
         *         return obj;
         *     }
         */
        // 在不将其从堆栈中移除的情况下，查看该堆栈顶部的对象。
        /*
         * public synchronized E peek() {
         *         int     len = size();
         *
         *         if (len == 0)
         *             throw new EmptyStackException();
         *         return elementAt(len - 1);
         *     }
         */
        // 判断此堆栈是不是空
        /*
         * public boolean empty() {
         *         return size() == 0;
         *     }
         */
        // 从堆栈中搜索元素返回索引
        /*
         * public synchronized int search(Object o) {
         *         int i = lastIndexOf(o);
         *
         *         if (i >= 0) {
         *             return size() - i;
         *         }
         *         return -1;
         *     }
         */
        // 序列化id
        // private static final long serialVersionUID = 1224463164541339165L;
    }
}
