package com.company.sources.JavaUtil.collectionClass.listclass.linkedList_test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : LinkedList
 * @date : 2021-01-06 20:21:06
 */
public class LinkedListExample1 {
    public static void main(String[] args) {
        // extends AbstractSequentialList<E>
        //    implements List<E>, Deque<E>, Cloneable, java.io.Serializable
        // 内部类
        // ListItr 列表迭代器 implements ListIterator<E>
        // 属性
        // private Node<E> lastReturned; 上一个获取的元素
        // private Node<E> next; 下一个将会获取的元素
        // private int nextIndex; 下一个元素的索引
        // private int expectedModCount = modCount; 检查并发修改异常
        // 指定索引构造方法 构建从index开始的列表迭代器
        /*
         * ListItr(int index) {
         *             // assert isPositionIndex(index);
         *             next = (index == size) ? null : node(index);
         *             nextIndex = index;
         *         }
         */
        // 是否拥有下一个元素
        /*
         * public boolean hasNext() {
         *             return nextIndex < size;
         *         }
         */
        // 获取当前元素
        /*
         * public E next() {
         *             checkForComodification();
         *             if (!hasNext())
         *                 throw new NoSuchElementException();
         *
         *             lastReturned = next;
         *             next = next.next;
         *             nextIndex++;
         *             return lastReturned.item;
         *         }
         */
        // 是否拥有上一个元素
        /*
         * public boolean hasPrevious() {
         *             return nextIndex > 0;
         *         }
         */
        // 获取上一个元素
        /*
         * public E previous() {
         *             checkForComodification();
         *             if (!hasPrevious())
         *                 throw new NoSuchElementException();
         *
         *             lastReturned = next = (next == null) ? last : next.prev;
         *             nextIndex--;
         *             return lastReturned.item;
         *         }
         */
        // 获取下一个元素的索引
        /*
         * public int nextIndex() {
         *             return nextIndex;
         *         }
         */
        // 获取上一个元素的索引
        /*
         * public int previousIndex() {
         *             return nextIndex - 1;
         *         }
         */
        // 清空列表元素
        /*
         * public void remove() {
         *             checkForComodification();
         *             if (lastReturned == null)
         *                 throw new IllegalStateException();
         *
         *             Node<E> lastNext = lastReturned.next;
         *             unlink(lastReturned);
         *             if (next == lastReturned)
         *                 next = lastNext;
         *             else
         *                 nextIndex--;
         *             lastReturned = null;
         *             expectedModCount++;
         *         }
         */
        // 设置元素到列表末尾
        /*
         * public void set(E e) {
         *             if (lastReturned == null)
         *                 throw new IllegalStateException();
         *             checkForComodification();
         *             lastReturned.item = e;
         *         }
         */
        // 向列表添加元素E
        /*
         * public void add(E e) {
         *             checkForComodification();
         *             lastReturned = null;
         *             if (next == null)
         *                 linkLast(e);
         *             else
         *                 linkBefore(e, next);
         *             nextIndex++;
         *             expectedModCount++;
         *         }
         */
        // 遍历元素执行action
        /*
         * public void forEachRemaining(Consumer<? super E> action) {
         *     Objects.requireNonNull(action);
         *     while (modCount == expectedModCount && nextIndex < size) {
         *         action.accept(next.item);
         *         lastReturned = next;
         *         next = next.next;
         *         nextIndex++;
         *     }
         *     checkForComodification();
         * }
         */
        // 检查并发修改异常
        /*
         * final void checkForComodification() {
         *             if (modCount != expectedModCount)
         *                 throw new ConcurrentModificationException();
         *         }
         */
        // LinkedList的节点元素Node
        /*
         * private static class Node<E> {
         *         E item; 当前节点元素
         *         Node<E> next; 下一个节点的元素
         *         Node<E> prev; 上一个节点的元素
         *         节点的构造方法
         *         Node(Node<E> prev, E element, Node<E> next) {
         *             this.item = element;
         *             this.next = next;
         *             this.prev = prev;
         *         }
         *     }
         */
        // 通过ListItr.previous提供降序迭代器的适配器
        // 降序迭代器
        /*
         * private class DescendingIterator implements Iterator<E> {
         *         private final ListItr itr = new ListItr(size()); // 列表迭代器
         *         public boolean hasNext() { // 是否拥有下一个元素
         *             return itr.hasPrevious();
         *         }
         *         public E next() { // 获取下一个元素
         *             return itr.previous();
         *         }
         *         public void remove() { // 清空列表
         *             itr.remove();
         *         }
         *     }
         */
        // Spliterators.IteratorSpliterator的自定义变体
        // static final int BATCH_UNIT = 1 << 10;  // batch array size increment 批量处理数组大小增量
        // static final int MAX_BATCH = 1 << 25;  // max batch array size; 最大批量处理数组大小
        // final LinkedList<E> list; // null OK unless traversed 除非遍历该值为null
        // Node<E> current;      // current node; null until initialized 当前节点 直到初始化为null
        // int est;              // size estimate; -1 until first needed 预计容量 回到获取第一个元素为-1
        // int expectedModCount; // initialized when est set 当set元素时初始化
        // int batch;            // batch size for splits 分割批次的大小
        // 构造 指定列表、预计容量和检测并发修改异常的值
        /*
         * LLSpliterator(LinkedList<E> list, int est, int expectedModCount) {
         *             this.list = list;
         *             this.est = est;
         *             this.expectedModCount = expectedModCount;
         *         }
         */
        // 获取预计容量
        /*
         * final int getEst() {
         *             int s; // force initialization
         *             final LinkedList<E> lst;
         *             if ((s = est) < 0) {
         *                 if ((lst = list) == null)
         *                     s = est = 0;
         *                 else {
         *                     expectedModCount = lst.modCount;
         *                     current = lst.first;
         *                     s = est = lst.size;
         *                 }
         *             }
         *             return s;
         *         }
         */
        // 获取预估容量
        /*
         * public long estimateSize() { return (long) getEst(); }
         */
        // 尝试分割
        /*
         * public Spliterator<E> trySplit() {
         *     Node<E> p;
         *     int s = getEst();
         *     if (s > 1 && (p = current) != null) {
         *         int n = batch + BATCH_UNIT;
         *         if (n > s)
         *             n = s;
         *         if (n > MAX_BATCH)
         *             n = MAX_BATCH;
         *         Object[] a = new Object[n];
         *         int j = 0;
         *         do { a[j++] = p.item; } while ((p = p.next) != null && j < n);
         *         current = p;
         *         batch = j;
         *         est = s - j;
         *         return Spliterators.spliterator(a, 0, j, Spliterator.ORDERED);
         *     }
         *     return null;
         * }
         */
        // 对剩余元素遍历执行action
        /*
         * public void forEachRemaining(Consumer<? super E> action) {
         *             Node<E> p; int n;
         *             if (action == null) throw new NullPointerException();
         *             if ((n = getEst()) > 0 && (p = current) != null) {
         *                 current = null;
         *                 est = 0;
         *                 do {
         *                     E e = p.item;
         *                     p = p.next;
         *                     action.accept(e);
         *                 } while (p != null && --n > 0);
         *             }
         *             if (list.modCount != expectedModCount)
         *                 throw new ConcurrentModificationException();
         *         }
         */
        // 对当前元素执行action
        /*
         * public boolean tryAdvance(Consumer<? super E> action) {
         *             Node<E> p;
         *             if (action == null) throw new NullPointerException();
         *             if (getEst() > 0 && (p = current) != null) {
         *                 --est;
         *                 E e = p.item;
         *                 current = p.next;
         *                 action.accept(e);
         *                 if (list.modCount != expectedModCount)
         *                     throw new ConcurrentModificationException();
         *                 return true;
         *             }
         *             return false;
         *         }
         */
        // 获取LinkedList特征
        /*
         * public int characteristics() {
         *             return Spliterator.ORDERED | Spliterator.SIZED | Spliterator.SUBSIZED;
         *         }
         */
        // 构建一个空列表
        /*
         * public LinkedList() {
         *     }
         */
        // 通过集合c构建一个列表
        /*
         * public LinkedList(Collection<? extends E> c) {
         *         this();
         *         addAll(c);
         *     }
         */
        // 将e指定为列表的首元素
        /*
         * private void linkFirst(E e) {
         *         final Node<E> f = first;
         *         final Node<E> newNode = new Node<>(null, e, f);
         *         first = newNode;
         *         if (f == null)
         *             last = newNode;
         *         else
         *             f.prev = newNode;
         *         size++;
         *         modCount++;
         *     }
         */
        // 将e指定为列表的末尾元素
        /*
         * void linkLast(E e) {
         *     final Node<E> l = last;
         *     final Node<E> newNode = new Node<>(l, e, null);
         *     last = newNode;
         *     if (l == null)
         *         first = newNode;
         *     else
         *         l.next = newNode;
         *     size++;
         *     modCount++;
         * }
         */
        // 在非空节点succ前插入元素e
        /*
         * void linkBefore(E e, Node<E> succ) {
         *         // assert succ != null;
         *         final Node<E> pred = succ.prev;
         *         final Node<E> newNode = new Node<>(pred, e, succ);
         *         succ.prev = newNode;
         *         if (pred == null)
         *             first = newNode;
         *         else
         *             pred.next = newNode;
         *         size++;
         *         modCount++;
         *     }
         */
        // 取消链接第一个非空元素
        /*
         * private E unlinkFirst(Node<E> f) {
         *         // assert f == first && f != null;
         *         final E element = f.item;
         *         final Node<E> next = f.next;
         *         f.item = null;
         *         f.next = null; // help GC
         *         first = next;
         *         if (next == null)
         *             last = null;
         *         else
         *             next.prev = null;
         *         size--;
         *         modCount++;
         *         return element;
         *     }
         */
        // 取消链接最后一个非元素
        /*
         * private E unlinkLast(Node<E> l) {
         *         // assert l == last && l != null;
         *         final E element = l.item;
         *         final Node<E> prev = l.prev;
         *         l.item = null;
         *         l.prev = null; // help GC
         *         last = prev;
         *         if (prev == null)
         *             first = null;
         *         else
         *             prev.next = null;
         *         size--;
         *         modCount++;
         *         return element;
         *     }
         */
        // 取消链接非空元素
        /*
         * E unlink(Node<E> x) {
         *         // assert x != null;
         *         final E element = x.item;
         *         final Node<E> next = x.next;
         *         final Node<E> prev = x.prev;
         *
         *         if (prev == null) {
         *             first = next;
         *         } else {
         *             prev.next = next;
         *             x.prev = null;
         *         }
         *
         *         if (next == null) {
         *             last = prev;
         *         } else {
         *             next.prev = prev;
         *             x.next = null;
         *         }
         *
         *         x.item = null;
         *         size--;
         *         modCount++;
         *         return element;
         *     }
         */
        // 获取第一个元素 第一个元素为空抛出没有元素异常 NoSuchElementException
        /*
         * public E getFirst() {
         *         final Node<E> f = first;
         *         if (f == null)
         *             throw new NoSuchElementException();
         *         return f.item;
         *     }
         */
        // 获取最后一个元素
        /*
         * public E getLast() {
         *         final Node<E> l = last;
         *         if (l == null)
         *             throw new NoSuchElementException();
         *         return l.item;
         *     }
         */
        // 移除第一个元素
        /*
         * public E removeFirst() {
         *         final Node<E> f = first;
         *         if (f == null)
         *             throw new NoSuchElementException();
         *         return unlinkFirst(f);
         *     }
         */
        // 移除最后一个元素
        /*
         * public E removeLast() {
         *         final Node<E> l = last;
         *         if (l == null)
         *             throw new NoSuchElementException();
         *         return unlinkLast(l);
         *     }
         */
        // 添加元素到列表首
        /*
         * public void addFirst(E e) {
         *         linkFirst(e);
         *     }
         */
        // 添加元素到列表尾
        /*
         * public void addLast(E e) {
         *         linkLast(e);
         *     }
         */
        // 判断列表是否包含元素
        /*
         * public boolean contains(Object o) {
         *         return indexOf(o) != -1;
         *     }
         */
        // 获取列表元素个数
        /*
         * public int size() {
         *         return size;
         *     }
         */
        // 向列表尾添加元素
        /*
         * public boolean add(E e) {
         *         linkLast(e);
         *         return true;
         *     }
         */
        // 移除列表中的元素
        /*
         * public boolean remove(Object o) {
         *         if (o == null) {
         *             for (Node<E> x = first; x != null; x = x.next) {
         *                 if (x.item == null) {
         *                     unlink(x);
         *                     return true;
         *                 }
         *             }
         *         } else {
         *             for (Node<E> x = first; x != null; x = x.next) {
         *                 if (o.equals(x.item)) {
         *                     unlink(x);
         *                     return true;
         *                 }
         *             }
         *         }
         *         return false;
         *     }
         */
        // 添加集合c中所有元素到列表中
        /*
         * public boolean addAll(Collection<? extends E> c) {
         *         return addAll(size, c);
         *     }
         */
        // 从指定索引位置添加列表c中的所有元素
        /*
         * public boolean addAll(int index, Collection<? extends E> c) {
         *         checkPositionIndex(index);
         *
         *         Object[] a = c.toArray();
         *         int numNew = a.length;
         *         if (numNew == 0)
         *             return false;
         *
         *         Node<E> pred, succ;
         *         if (index == size) {
         *             succ = null;
         *             pred = last;
         *         } else {
         *             succ = node(index);
         *             pred = succ.prev;
         *         }
         *
         *         for (Object o : a) {
         *             @SuppressWarnings("unchecked") E e = (E) o;
         *             Node<E> newNode = new Node<>(pred, e, null);
         *             if (pred == null)
         *                 first = newNode;
         *             else
         *                 pred.next = newNode;
         *             pred = newNode;
         *         }
         *
         *         if (succ == null) {
         *             last = pred;
         *         } else {
         *             pred.next = succ;
         *             succ.prev = pred;
         *         }
         *
         *         size += numNew;
         *         modCount++;
         *         return true;
         *     }
         */
        // 清空列表中的元素
        /*
         * public void clear() {
         *         // Clearing all of the links between nodes is "unnecessary", but:
         *         // - helps a generational GC if the discarded nodes inhabit
         *         //   more than one generation
         *         // - is sure to free memory even if there is a reachable Iterator
         *         for (Node<E> x = first; x != null; ) {
         *             Node<E> next = x.next;
         *             x.item = null;
         *             x.next = null;
         *             x.prev = null;
         *             x = next;
         *         }
         *         first = last = null;
         *         size = 0;
         *         modCount++;
         *     }
         */
        // 获取指定索引位置的元素
        /*
         * public E get(int index) {
         *         checkElementIndex(index);
         *         return node(index).item;
         *     }
         */
        // 替换指定索引位置的元素
        /*
         * public E set(int index, E element) {
         *         checkElementIndex(index);
         *         Node<E> x = node(index);
         *         E oldVal = x.item;
         *         x.item = element;
         *         return oldVal;
         *     }
         */
        // 在指定位置插入元素
        /*
         * public void add(int index, E element) {
         *         checkPositionIndex(index);
         *
         *         if (index == size)
         *             linkLast(element);
         *         else
         *             linkBefore(element, node(index));
         *     }
         */
        // 移除指定索引位置的元素
        /*
         * public E remove(int index) {
         *         checkElementIndex(index);
         *         return unlink(node(index));
         *     }
         */
        // 判断索引位置是否有元素
        /*
         * private boolean isElementIndex(int index) {
         *         return index >= 0 && index < size;
         *     }
         */
        // 判断索引位置是否可以添加元素
        /*
         * private boolean isPositionIndex(int index) {
         *         return index >= 0 && index <= size;
         *     }
         */
        // 下标越界Msg
        /*
         * private String outOfBoundsMsg(int index) {
         *         return "Index: "+index+", Size: "+size;
         *     }
         */
        // 检查元素索引是否合法 是否有元素
        /*
         * private void checkElementIndex(int index) {
         *         if (!isElementIndex(index))
         *             throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
         *     }
         */
        // 检查元素索引处是否可以添加元素
        /*
         * private void checkPositionIndex(int index) {
         *         if (!isPositionIndex(index))
         *             throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
         *     }
         */
        // 获取指定索引位置的元素
        /*
         * Node<E> node(int index) {
         *         // assert isElementIndex(index);
         *
         *         if (index < (size >> 1)) {
         *             Node<E> x = first;
         *             for (int i = 0; i < index; i++)
         *                 x = x.next;
         *             return x;
         *         } else {
         *             Node<E> x = last;
         *             for (int i = size - 1; i > index; i--)
         *                 x = x.prev;
         *             return x;
         *         }
         *     }
         */
        // 获取元素o第一次出现的索引位置
        /*
         * public int indexOf(Object o) {
         *         int index = 0;
         *         if (o == null) {
         *             for (Node<E> x = first; x != null; x = x.next) {
         *                 if (x.item == null)
         *                     return index;
         *                 index++;
         *             }
         *         } else {
         *             for (Node<E> x = first; x != null; x = x.next) {
         *                 if (o.equals(x.item))
         *                     return index;
         *                 index++;
         *             }
         *         }
         *         return -1;
         *     }
         */
        // 获取元素最后一次出现的索引位置
        /*
         * public int lastIndexOf(Object o) {
         *         int index = size;
         *         if (o == null) {
         *             for (Node<E> x = last; x != null; x = x.prev) {
         *                 index--;
         *                 if (x.item == null)
         *                     return index;
         *             }
         *         } else {
         *             for (Node<E> x = last; x != null; x = x.prev) {
         *                 index--;
         *                 if (o.equals(x.item))
         *                     return index;
         *             }
         *         }
         *         return -1;
         *     }
         */
        // 检索但不删除此列表的头（第一个元素） 首元素为null返回null
        /*
         * public E peek() {
         *         final Node<E> f = first;
         *         return (f == null) ? null : f.item;
         *     }
         */
        // 检索但不删除此列表的头（第一个元素）
        // 首元素为null抛出没有元素异常 NoSuchElementException
        /*
         * public E element() {
         *         return getFirst();
         *     }
         */
        // 检索并删除列表的头 元素为null返回null
        /*
         * public E poll() {
         *         final Node<E> f = first;
         *         return (f == null) ? null : unlinkFirst(f);
         *     }
         */
        // 检索并删除列表的头元素 元素为null 抛出没有元素异常 NoSuchElementException
        /*
         * public E remove() {
         *         return removeFirst();
         *     }
         */
        // 添加元素到列表尾
        /*
         * public boolean offer(E e) {
         *         return add(e);
         *     }
         */
        // 添加元素到列表头
        /*
         * public boolean offerFirst(E e) {
         *         addFirst(e);
         *         return true;
         *     }
         */
        // 添加元素到列表尾
        /*
         * public boolean offerLast(E e) {
         *         addLast(e);
         *         return true;
         *     }
         */
        // 获取列表头元素 不移除
        /*
         * public E peekFirst() {
         *         final Node<E> f = first;
         *         return (f == null) ? null : f.item;
         *      }
         */
        // 获取列表尾元素 不移除
        /*
         * public E peekLast() {
         *         final Node<E> l = last;
         *         return (l == null) ? null : l.item;
         *     }
         */
        // 获列表头元素 移除
        /*
         * public E pollFirst() {
         *         final Node<E> f = first;
         *         return (f == null) ? null : unlinkFirst(f);
         *     }
         */
        // 获取列表尾元素 移除
        /*
         * public E pollLast() {
         *         final Node<E> l = last;
         *         return (l == null) ? null : unlinkLast(l);
         *     }
         */
        // 向列表头压入元素
        /*
         * public void push(E e) {
         *         addFirst(e);
         *     }
         */
        // 移除并返回列表首元素
        /*
         * public E pop() {
         *         return removeFirst();
         *     }
         */
        // 移除第一次出现的元素o
        /*
         * public boolean removeFirstOccurrence(Object o) {
         *         return remove(o);
         *     }
         */
        // 移除最后一次出现的元素o
        /*
         * public boolean removeLastOccurrence(Object o) {
         *         if (o == null) {
         *             for (Node<E> x = last; x != null; x = x.prev) {
         *                 if (x.item == null) {
         *                     unlink(x);
         *                     return true;
         *                 }
         *             }
         *         } else {
         *             for (Node<E> x = last; x != null; x = x.prev) {
         *                 if (o.equals(x.item)) {
         *                     unlink(x);
         *                     return true;
         *                 }
         *             }
         *         }
         *         return false;
         *     }
         */
        // 获取元素的列表迭代器
        /*
         * public ListIterator<E> listIterator(int index) {
         *         checkPositionIndex(index);
         *         return new ListItr(index);
         *     }
         */
        // 获取元素的降序迭代器
        /*
         * public Iterator<E> descendingIterator() {
         *         return new DescendingIterator();
         *     }
         */
        // 克隆方法 不允许克隆
        /*
         * @SuppressWarnings("unchecked")
         *     private LinkedList<E> superClone() {
         *         try {
         *             return (LinkedList<E>) super.clone();
         *         } catch (CloneNotSupportedException e) {
         *             throw new InternalError(e);
         *         }
         *     }
         */
        // 返回当前列表的浅copy
        /*
         * public Object clone() {
         *         LinkedList<E> clone = superClone();
         *
         *         // Put clone into "virgin" state
         *         clone.first = clone.last = null;
         *         clone.size = 0;
         *         clone.modCount = 0;
         *
         *         // Initialize clone with our elements
         *         for (Node<E> x = first; x != null; x = x.next)
         *             clone.add(x.item);
         *
         *         return clone;
         *     }
         */
        // 将元素copy到数组中 修改数组不影响原列表
        /*
         * public Object[] toArray() {
         *         Object[] result = new Object[size];
         *         int i = 0;
         *         for (Node<E> x = first; x != null; x = x.next)
         *             result[i++] = x.item;
         *         return result;
         *     }
         */
        // 将元素copy到指定泛型的数组
        /*
         * @SuppressWarnings("unchecked")
         *     public <T> T[] toArray(T[] a) {
         *         if (a.length < size)
         *             a = (T[])java.lang.reflect.Array.newInstance(
         *                                 a.getClass().getComponentType(), size);
         *         int i = 0;
         *         Object[] result = a;
         *         for (Node<E> x = first; x != null; x = x.next)
         *             result[i++] = x.item;
         *
         *         if (a.length > size)
         *             a[size] = null;
         *
         *         return a;
         *     }
         */
        // 获取列表的输出流s 序列化
        /*
         * private void writeObject(java.io.ObjectOutputStream s)
         *         throws java.io.IOException {
         *         // Write out any hidden serialization magic
         *         s.defaultWriteObject();
         *
         *         // Write out size
         *         s.writeInt(size);
         *
         *         // Write out all elements in the proper order.
         *         for (Node<E> x = first; x != null; x = x.next)
         *             s.writeObject(x.item);
         *     }
         */
        // 读取列表的输入流 反序列化
        /*
         * @SuppressWarnings("unchecked")
         *     private void readObject(java.io.ObjectInputStream s)
         *         throws java.io.IOException, ClassNotFoundException {
         *         // Read in any hidden serialization magic
         *         s.defaultReadObject();
         *
         *         // Read in size
         *         int size = s.readInt();
         *
         *         // Read in all elements in the proper order.
         *         for (int i = 0; i < size; i++)
         *             linkLast((E)s.readObject());
         *     }
         */
        // 在此列表中的元素上创建后绑定和快速失败的Spliterator
        /*
         * public Spliterator<E> spliterator() {
         *         return new LLSpliterator<E>(this, -1, 0);
         *     }
         */
        // transient int size = 0; 列表元素个数
        // transient LinkedList.Node<E> first; 首元素
        // transient LinkedList.Node<E> last; 尾元素
        // 序列化 private static final long serialVersionUID = 876323262645176354L;
    }
}
