package com.company.sources.JavaUtil.collectionClass.arrayList_test;

import java.util.*;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : ArrayList
 * @date : 2021-01-05 20:00:59
 */
public class ArrayListExample1 {
    public static void main(String[] args) {
        // 底层是数组
        // extends AbstractList<E>
        //        implements List<E>, RandomAccess, Cloneable, java.io.Serializable
        // 内部类
        // ltr 优化版本的AbstractList.ltr
        // int cursor;       // index of next element to return 下一个要返回元素的索引
        //        返回最后一个元素的索引 如果没有返回-1
        //        int lastRet = -1; // index of last element returned; -1 if no such
        //        控制并发修改异常的值
        //        int expectedModCount = modCount;
        // 判断是否包含下一个元素
        /*
         * public boolean hasNext() {
         *             return cursor != size;
         *         }
         */
        // 获取当前指针对应的元素
        /*
         * @SuppressWarnings("unchecked")
         *         public E next() {
         *             checkForComodification();
         *             int i = cursor;
         *             if (i >= size)
         *                 throw new NoSuchElementException();
         *             Object[] elementData = ArrayList.this.elementData;
         *             if (i >= elementData.length)
         *                 throw new ConcurrentModificationException();
         *             cursor = i + 1;
         *             return (E) elementData[lastRet = i];
         *         }
         */
        // 清空列表中的元素
        /*
         * public void remove() {
         *             if (lastRet < 0)
         *                 throw new IllegalStateException();
         *             checkForComodification();
         *
         *             try {
         *                 ArrayList.this.remove(lastRet);
         *                 cursor = lastRet;
         *                 lastRet = -1;
         *                 expectedModCount = modCount;
         *             } catch (IndexOutOfBoundsException ex) {
         *                 throw new ConcurrentModificationException();
         *             }
         *         }
         */
        // 遍历list中剩余元素给consumer消费
        /*
         * @SuppressWarnings("unchecked")
         *         public void forEachRemaining(Consumer<? super E> consumer) {
         *             Objects.requireNonNull(consumer);
         *             final int size = ArrayList.this.size;
         *             int i = cursor;
         *             if (i >= size) {
         *                 return;
         *             }
         *             final Object[] elementData = ArrayList.this.elementData;
         *             if (i >= elementData.length) {
         *                 throw new ConcurrentModificationException();
         *             }
         *             while (i != size && modCount == expectedModCount) {
         *                 consumer.accept((E) elementData[i++]);
         *             }
         *             // update once at end of iteration to reduce heap write traffic
         *             cursor = i;
         *             lastRet = i - 1;
         *             checkForComodification();
         *         }
         */
        // 检查并发修改异常
        /*
         * final void checkForComodification() {
         *             if (modCount != expectedModCount)
         *                 throw new ConcurrentModificationException();
         *         }
         */
        // ListItr对AbstractList.ListItr的优化版本
        // 构造器 构造一个从index位置开始的迭代器
        /*
         * ListItr(int index) {
         *             super();
         *             cursor = index;
         *         }
         */
        // 是否拥有前一个元素
        /*
         * public boolean hasPrevious() {
         *             return cursor != 0;
         *         }
         */
        // 获取下一个将要取出的元素的索引
        /*
         * public int nextIndex() {
         *             return cursor;
         *         }
         */
        // 获取前一个元素的索引
        /*
         * public int previousIndex() {
         *             return cursor - 1;
         *         }
         */
        // 获取前一个元素
        /*
         * @SuppressWarnings("unchecked")
         *         public E previous() {
         *             checkForComodification();
         *             int i = cursor - 1;
         *             if (i < 0)
         *                 throw new NoSuchElementException();
         *             Object[] elementData = ArrayList.this.elementData;
         *             if (i >= elementData.length)
         *                 throw new ConcurrentModificationException();
         *             cursor = i;
         *             return (E) elementData[lastRet = i];
         *         }
         */
        // 设置末尾元素
        /*
         * public void set(E e) {
         *             if (lastRet < 0)
         *                 throw new IllegalStateException();
         *             checkForComodification();
         *
         *             try {
         *                 ArrayList.this.set(lastRet, e);
         *             } catch (IndexOutOfBoundsException ex) {
         *                 throw new ConcurrentModificationException();
         *             }
         *         }
         */
        // 添加元素
        /*
         * public void add(E e) {
         *             checkForComodification();
         *
         *             try {
         *                 int i = cursor;
         *                 ArrayList.this.add(i, e);
         *                 cursor = i + 1;
         *                 lastRet = -1;
         *                 expectedModCount = modCount;
         *             } catch (IndexOutOfBoundsException ex) {
         *                 throw new ConcurrentModificationException();
         *             }
         *         }
         */
        // 内部类SubList
        // 截取父list parent父list offset偏移量 [fromIndex,toIndex)
        /*
         * SubList(AbstractList<E> parent,
         *                 int offset, int fromIndex, int toIndex) {
         *             this.parent = parent;
         *             this.parentOffset = fromIndex;
         *             this.offset = offset + fromIndex;
         *             this.size = toIndex - fromIndex;
         *             this.modCount = ArrayList.this.modCount;
         *         }
         */
        // 设置指定索引位置的元素
        /*
         * public E set(int index, E e) {
         *             rangeCheck(index);
         *             checkForComodification();
         *             E oldValue = ArrayList.this.elementData(offset + index);
         *             ArrayList.this.elementData[offset + index] = e;
         *             return oldValue;
         *         }
         */
        // 获取指定位置的元素
        /*
         * public E get(int index) {
         *             rangeCheck(index);
         *             checkForComodification();
         *             return ArrayList.this.elementData(offset + index);
         *         }
         */
        // 获取SubList的列表size
        /*
         * public int size() {
         *             checkForComodification();
         *             return this.size;
         *         }
         */
        // 在指定位置insert元素 列表size++ index后的元素后移
        /*
         * public void add(int index, E e) {
         *             rangeCheckForAdd(index);
         *             checkForComodification();
         *             parent.add(parentOffset + index, e);
         *             this.modCount = parent.modCount;
         *             this.size++;
         *         }
         */
        // 移除指定索引位置的元素
        /*
         * public E remove(int index) {
         *             rangeCheck(index);
         *             checkForComodification();
         *             E result = parent.remove(parentOffset + index);
         *             this.modCount = parent.modCount;
         *             this.size--;
         *             return result;
         *         }
         */
        // 移除指定索引范围的元素 [fromIndex,toIndex)
        /*
         * protected void removeRange(int fromIndex, int toIndex) {
         *             checkForComodification();
         *             parent.removeRange(parentOffset + fromIndex,
         *                                parentOffset + toIndex);
         *             this.modCount = parent.modCount;
         *             this.size -= toIndex - fromIndex;
         *         }
         */
        // 添加集合c中的所有元素
        /*
         * public boolean addAll(Collection<? extends E> c) {
         *             return addAll(this.size, c);
         *         }
         */
        // 从指定索引处添加集合c中的所有元素
        /*
         * public boolean addAll(int index, Collection<? extends E> c) {
         *             rangeCheckForAdd(index);
         *             int cSize = c.size();
         *             if (cSize==0)
         *                 return false;
         *
         *             checkForComodification();
         *             parent.addAll(parentOffset + index, c);
         *             this.modCount = parent.modCount;
         *             this.size += cSize;
         *             return true;
         *         }
         */
        // 获取迭代器
        /*
         * public Iterator<E> iterator() {
         *             return listIterator();
         *         }
         */
        // 获取从指定索引开始的迭代器
        /*
         * public ListIterator<E> listIterator(final int index) {
         *             checkForComodification();
         *             rangeCheckForAdd(index);
         *             final int offset = this.offset;
         *
         *             return new ListIterator<E>() {
         *                 int cursor = index;
         *                 int lastRet = -1;
         *                 int expectedModCount = ArrayList.this.modCount;
         *
         *                 public boolean hasNext() {
         *                     return cursor != SubList.this.size;
         *                 }
         *
         *                 @SuppressWarnings("unchecked")
         *                 public E next() {
         *                     checkForComodification();
         *                     int i = cursor;
         *                     if (i >= SubList.this.size)
         *                         throw new NoSuchElementException();
         *                     Object[] elementData = ArrayList.this.elementData;
         *                     if (offset + i >= elementData.length)
         *                         throw new ConcurrentModificationException();
         *                     cursor = i + 1;
         *                     return (E) elementData[offset + (lastRet = i)];
         *                 }
         *
         *                 public boolean hasPrevious() {
         *                     return cursor != 0;
         *                 }
         *
         *                 @SuppressWarnings("unchecked")
         *                 public E previous() {
         *                     checkForComodification();
         *                     int i = cursor - 1;
         *                     if (i < 0)
         *                         throw new NoSuchElementException();
         *                     Object[] elementData = ArrayList.this.elementData;
         *                     if (offset + i >= elementData.length)
         *                         throw new ConcurrentModificationException();
         *                     cursor = i;
         *                     return (E) elementData[offset + (lastRet = i)];
         *                 }
         *
         *                 @SuppressWarnings("unchecked")
         *                 public void forEachRemaining(Consumer<? super E> consumer) {
         *                     Objects.requireNonNull(consumer);
         *                     final int size = SubList.this.size;
         *                     int i = cursor;
         *                     if (i >= size) {
         *                         return;
         *                     }
         *                     final Object[] elementData = ArrayList.this.elementData;
         *                     if (offset + i >= elementData.length) {
         *                         throw new ConcurrentModificationException();
         *                     }
         *                     while (i != size && modCount == expectedModCount) {
         *                         consumer.accept((E) elementData[offset + (i++)]);
         *                     }
         *                     // update once at end of iteration to reduce heap write traffic
         *                     lastRet = cursor = i;
         *                     checkForComodification();
         *                 }
         *
         *                 public int nextIndex() {
         *                     return cursor;
         *                 }
         *
         *                 public int previousIndex() {
         *                     return cursor - 1;
         *                 }
         *
         *                 public void remove() {
         *                     if (lastRet < 0)
         *                         throw new IllegalStateException();
         *                     checkForComodification();
         *
         *                     try {
         *                         SubList.this.remove(lastRet);
         *                         cursor = lastRet;
         *                         lastRet = -1;
         *                         expectedModCount = ArrayList.this.modCount;
         *                     } catch (IndexOutOfBoundsException ex) {
         *                         throw new ConcurrentModificationException();
         *                     }
         *                 }
         *
         *                 public void set(E e) {
         *                     if (lastRet < 0)
         *                         throw new IllegalStateException();
         *                     checkForComodification();
         *
         *                     try {
         *                         ArrayList.this.set(offset + lastRet, e);
         *                     } catch (IndexOutOfBoundsException ex) {
         *                         throw new ConcurrentModificationException();
         *                     }
         *                 }
         *
         *                 public void add(E e) {
         *                     checkForComodification();
         *
         *                     try {
         *                         int i = cursor;
         *                         SubList.this.add(i, e);
         *                         cursor = i + 1;
         *                         lastRet = -1;
         *                         expectedModCount = ArrayList.this.modCount;
         *                     } catch (IndexOutOfBoundsException ex) {
         *                         throw new ConcurrentModificationException();
         *                     }
         *                 }
         *
         *                 final void checkForComodification() {
         *                     if (expectedModCount != ArrayList.this.modCount)
         *                         throw new ConcurrentModificationException();
         *                 }
         *             };
         *         }
         */
        // list的截取方法 [fromIndex,toIndex)
        /*
         * public List<E> subList(int fromIndex, int toIndex) {
         *             subListRangeCheck(fromIndex, toIndex, size);
         *             return new SubList(this, offset, fromIndex, toIndex);
         *         }
         */
        // 核验index位置是否合法
        /*
         * private void rangeCheck(int index) {
         *             if (index < 0 || index >= this.size)
         *                 throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
         *         }
         */
        // 核验该索引处是否允许添加元素
        /*
         * private void rangeCheckForAdd(int index) {
         *             if (index < 0 || index > this.size)
         *                 throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
         *         }
         */
        // 下标越界Msg
        /*
         * private String outOfBoundsMsg(int index) {
         *             return "Index: "+index+", Size: "+this.size;
         *         }
         */
        // 检查并发修改异常
        /*
         * private void checkForComodification() {
         *             if (ArrayList.this.modCount != this.modCount)
         *                 throw new ConcurrentModificationException();
         *         }
         */
        // 可分割迭代器
        /*
         * public Spliterator<E> spliterator() {
         *             checkForComodification();
         *             return new ArrayListSpliterator<E>(ArrayList.this, offset,
         *                                                offset + this.size, this.modCount);
         *         }
         */
        // private final AbstractList<E> parent; 父list
        // private final int parentOffset; 父list偏移量
        // private final int offset; 当前list偏移量
        // int size; list的size
        // ArrayListSpliterator 基于索引的、二分的、懒加载器
        // private final ArrayList<E> list;
        // private int index; // current index, modified on advance/split 当前索引，在提前/拆分时修改
        // private int fence; // -1 until used; then one past last index 被使用之前是-1 使用之后是最后一个索引
        // private int expectedModCount; // initialized when fence set 设置栅栏的时候被初始化
        // 初始化一个给定范围的懒加载器
        /*
         * ArrayListSpliterator(ArrayList<E> list, int origin, int fence,
         *                              int expectedModCount) {
         *             this.list = list; // OK if null unless traversed
         *             this.index = origin;
         *             this.fence = fence;
         *             this.expectedModCount = expectedModCount;
         *         }
         */
        // 第一次使用时实例化结束位置
        /*
         * private int getFence() { // initialize fence to size on first use
         *             int hi; // (a specialized variant appears in method forEach)
         *             ArrayList<E> lst;
         *             if ((hi = fence) < 0) {
         *                 if ((lst = list) == null)
         *                     hi = fence = 0;
         *                 else {
         *                     expectedModCount = lst.modCount;
         *                     hi = fence = lst.size;
         *                 }
         *             }
         *             return hi;
         *         }
         */
        // 分割list,返回一个返回一个新分割出的spilterator实例
        // 相当于二分法，这个方法会递归
        // ArrayListSpliterator本质还是对原list进行操作，只是通过index和fence来控制每次处理的范围
        /*
         * public ArrayListSpliterator<E> trySplit() {
         *             int hi = getFence(), lo = index, mid = (lo + hi) >>> 1;
         *             return (lo >= mid) ? null : // divide range in half unless too small
         *                 new ArrayListSpliterator<E>(list, lo, index = mid,
         *                                             expectedModCount);
         *         }
         */
        // 如果有元素剩余，那么执行action，并返回true，如果没有元素剩余，返回false
        /*
         * public boolean tryAdvance(Consumer<? super E> action) {
         *             if (action == null)
         *                 throw new NullPointerException();
         *             int hi = getFence(), i = index;
         *             if (i < hi) {
         *                 index = i + 1;
         *                 @SuppressWarnings("unchecked") E e = (E)list.elementData[i];
         *                 action.accept(e);
         *                 if (list.modCount != expectedModCount)
         *                     throw new ConcurrentModificationException();
         *                 return true;
         *             }
         *             return false;
         *         }
         */
        // 对当前的线程中的元素执行给定的操作，直到所有的元素被处理或者抛出异常
        /*
         * public void forEachRemaining(Consumer<? super E> action) {
         *             int i, hi, mc; // hoist accesses and checks from loop
         *             ArrayList<E> lst; Object[] a;
         *             if (action == null)
         *                 throw new NullPointerException();
         *             if ((lst = list) != null && (a = lst.elementData) != null) {
         *                 if ((hi = fence) < 0) {
         *                     mc = lst.modCount;
         *                     hi = lst.size;
         *                 }
         *                 else
         *                     mc = expectedModCount;
         *                 if ((i = index) >= 0 && (index = hi) <= a.length) {
         *                     for (; i < hi; ++i) {
         *                         @SuppressWarnings("unchecked") E e = (E) a[i];
         *                         action.accept(e);
         *                     }
         *                     if (lst.modCount == mc)
         *                         return;
         *                 }
         *             }
         *             throw new ConcurrentModificationException();
         *         }
         */
        // 返回forEachRemain()需要遍历元素总数的估计值，如果这个结果是无穷大，未计数的，那么返回
        /*
         * public long estimateSize() {
         *             return (long) (getFence() - index);
         *         }
         */
        // 返回此Spliterator及其元素的一组特征值，这些结果表示为（ORDERED ， DISTINCT ， SORTED ， SIZED ，  NONNULL ， IMMUTABLE ， CONCURRENT ， SUBSIZED ）的或运算
        // 如果符合该Spliterator有什么特性，那么代表那个属性的那一位就是1，否则就是0
        /*
         * public int characteristics() {
         *             return Spliterator.ORDERED | Spliterator.SIZED | Spliterator.SUBSIZED;
         *         }
         */
        // 构建一个具有初始容量的空列表
        /*
         * public ArrayList(int initialCapacity) {
         *         if (initialCapacity > 0) {
         *             this.elementData = new Object[initialCapacity];
         *         } else if (initialCapacity == 0) {
         *             this.elementData = EMPTY_ELEMENTDATA;
         *         } else {
         *             throw new IllegalArgumentException("Illegal Capacity: "+
         *                                                initialCapacity);
         *         }
         *     }
         */
        // 无参构造 构建一个初始容量为10的空列表
        /*
         * public ArrayList() {
         *         this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
         *     }
         */
        // 根据集合c构建一个列表
        /*
         * public ArrayList(Collection<? extends E> c) {
         *         elementData = c.toArray();
         *         if ((size = elementData.length) != 0) {
         *             // c.toArray might (incorrectly) not return Object[] (see 6260652)
         *             if (elementData.getClass() != Object[].class)
         *                 elementData = Arrays.copyOf(elementData, size, Object[].class);
         *         } else {
         *             // replace with empty array.
         *             this.elementData = EMPTY_ELEMENTDATA;
         *         }
         *     }
         */
        // 将列表的大小减小为实际元素数量的大小
        /*
         * public void trimToSize() {
         *         modCount++;
         *         if (size < elementData.length) {
         *             elementData = (size == 0)
         *               ? EMPTY_ELEMENTDATA
         *               : Arrays.copyOf(elementData, size);
         *         }
         *     }
         */
        // 如有必要，增加此ArrayList实例的容量，以确保它至少可以容纳最小容量参数指定的元素数量。
        // list中元素数量过大时可以用此方法进行指定 会大大缩减初始化时间
        /*
         * public void ensureCapacity(int minCapacity) {
         *         int minExpand = (elementData != DEFAULTCAPACITY_EMPTY_ELEMENTDATA)
         *             // any size if not default element table
         *             ? 0
         *             // larger than default for default empty table. It's already
         *             // supposed to be at default size.
         *             : DEFAULT_CAPACITY;
         *
         *         if (minCapacity > minExpand) {
         *             ensureExplicitCapacity(minCapacity);
         *         }
         *     }
         */
        // 判断是否需要扩容
        /*
         * private void ensureCapacityInternal(int minCapacity) {
         *         if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
         *             minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
         *         }
         *
         *         ensureExplicitCapacity(minCapacity);
         *     }
         */
        // 数组容量检查，不够时则进行扩容
        /*
         * private void ensureExplicitCapacity(int minCapacity) {
         *         modCount++;
         *         // overflow-conscious code
         *         if (minCapacity - elementData.length > 0)
         *             grow(minCapacity);
         *     }
         */
        // 增加容量以确保其至少可以容纳最小容量参数指定的元素数
        /*
         * private void grow(int minCapacity) {
         *         // overflow-conscious code
         *         int oldCapacity = elementData.length;
         *         int newCapacity = oldCapacity + (oldCapacity >> 1);
         *         if (newCapacity - minCapacity < 0)
         *             newCapacity = minCapacity;
         *         if (newCapacity - MAX_ARRAY_SIZE > 0)
         *             newCapacity = hugeCapacity(minCapacity);
         *         // minCapacity is usually close to size, so this is a win:
         *         elementData = Arrays.copyOf(elementData, newCapacity);
         *     }
         */
        // 进行大容量分配
        /*
         * private static int hugeCapacity(int minCapacity) {
         *         if (minCapacity < 0) // overflow
         *             throw new OutOfMemoryError();
         *         return (minCapacity > MAX_ARRAY_SIZE) ?
         *             Integer.MAX_VALUE :
         *             MAX_ARRAY_SIZE;
         *     }
         */
        // 返回列表中的元素个数
        /*
         * public int size() {
         *         return size;
         *     }
         */
        // 判断列表是否为空
        /*
         * public boolean isEmpty() {
         *         return size == 0;
         *     }
         */
        // 判断列表中是否包含某个元素
        /*
         * public boolean contains(Object o) {
         *         return indexOf(o) >= 0;
         *     }
         */
        // 获取元素第一次出现的索引位置
        /*
         * public int indexOf(Object o) {
         *         if (o == null) {
         *             for (int i = 0; i < size; i++)
         *                 if (elementData[i]==null)
         *                     return i;
         *         } else {
         *             for (int i = 0; i < size; i++)
         *                 if (o.equals(elementData[i]))
         *                     return i;
         *         }
         *         return -1;
         *     }
         */
        // 返回元素最后一次出现的索引位置
        /*
         * public int lastIndexOf(Object o) {
         *         if (o == null) {
         *             for (int i = size-1; i >= 0; i--)
         *                 if (elementData[i]==null)
         *                     return i;
         *         } else {
         *             for (int i = size-1; i >= 0; i--)
         *                 if (o.equals(elementData[i]))
         *                     return i;
         *         }
         *         return -1;
         *     }
         */
        // 返回列表的浅拷贝复制
        /*
         * public Object clone() {
         *         try {
         *             ArrayList<?> v = (ArrayList<?>) super.clone();
         *             v.elementData = Arrays.copyOf(elementData, size);
         *             v.modCount = 0;
         *             return v;
         *         } catch (CloneNotSupportedException e) {
         *             // this shouldn't happen, since we are Cloneable
         *             throw new InternalError(e);
         *         }
         *     }
         */
        // 将列表复制成全新的数组 原列表中数据修改不影响数组中的值
        /*
         * public Object[] toArray() {
         *         return Arrays.copyOf(elementData, size);
         *     }
         */
        List<Integer> list = new ArrayList(Arrays.asList(1, 3, 5, 7));
        Object[] objects = list.toArray();
        list.add(9);
        System.out.println("-------------" + objects.length);
        list.forEach(System.out::println);
        System.out.println("-------------" + objects.length);
        // 获取list的指定泛型的数组
        /*
         * public <T> T[] toArray(T[] a) {
         *         if (a.length < size)
         *             // Make a new array of a's runtime type, but my contents:
         *             return (T[]) Arrays.copyOf(elementData, size, a.getClass());
         *         System.arraycopy(elementData, 0, a, 0, size);
         *         if (a.length > size)
         *             a[size] = null;
         *         return a;
         *     }
         */
        Integer[] array = new Integer[list.size()];
        Integer[] integers = list.toArray(array);
        System.out.println("***-***");
        Arrays.stream(array).forEach(System.out::println);
        System.out.println("***-***");
        Arrays.stream(integers).forEach(System.out::println);
        // 获取指定位置的索引元素 修饰符为default
        /*
         * E elementData(int index) {
         *         return (E) elementData[index];
         *     }
         */
        // 获取指定位置的索引元素
        /*
         * public E get(int index) {
         *         rangeCheck(index);
         *
         *         return elementData(index);
         *     }
         */
        System.out.println("*********************");
        System.out.println(list.get(0));
        // 设置指定索引位置的元素 返回原value值
        // 此index不能大于size 否则会出现下标越界异常 IndexOutOfBoundsException
        /*
         * public E set(int index, E element) {
         *         rangeCheck(index);
         *
         *         E oldValue = elementData(index);
         *         elementData[index] = element;
         *         return oldValue;
         *     }
         */
        // 在列表末尾添加元素
        /*
         * public boolean add(E e) {
         *         ensureCapacityInternal(size + 1);  // Increments modCount!!
         *         elementData[size++] = e;
         *         return true;
         *     }
         */
        // 向指定索引位置添加元素
        /*
         * public void add(int index, E element) {
         *         rangeCheckForAdd(index);
         *
         *         ensureCapacityInternal(size + 1);  // Increments modCount!!
         *         System.arraycopy(elementData, index, elementData, index + 1,
         *                          size - index);
         *         elementData[index] = element;
         *         size++;
         *     }
         */
        // 移除指定索引位置的元素
        // 将元素copy出来 原列表调用GC回收
        /*
         * public E remove(int index) {
         *         rangeCheck(index);
         *
         *         modCount++;
         *         E oldValue = elementData(index);
         *
         *         int numMoved = size - index - 1;
         *         if (numMoved > 0)
         *             System.arraycopy(elementData, index+1, elementData, index,
         *                              numMoved);
         *         elementData[--size] = null; // clear to let GC do its work
         *
         *         return oldValue;
         *     }
         */
        // 移除指定元素
        /*
         * public boolean remove(Object o) {
         *         if (o == null) {
         *             for (int index = 0; index < size; index++)
         *                 if (elementData[index] == null) {
         *                     fastRemove(index);
         *                     return true;
         *                 }
         *         } else {
         *             for (int index = 0; index < size; index++)
         *                 if (o.equals(elementData[index])) {
         *                     fastRemove(index);
         *                     return true;
         *                 }
         *         }
         *         return false;
         *     }
         */
        // 专用的remove方法，跳过边界检查，并且不返回删除的值。
        /*
         * private void fastRemove(int index) {
         *         modCount++;
         *         int numMoved = size - index - 1;
         *         if (numMoved > 0)
         *             System.arraycopy(elementData, index+1, elementData, index,
         *                              numMoved);
         *         elementData[--size] = null; // clear to let GC do its work
         *     }
         */
        // 移除列表中所有的元素
        /*
         * public void clear() {
         *         modCount++;
         *
         *         // clear to let GC do its work
         *         for (int i = 0; i < size; i++)
         *             elementData[i] = null;
         *
         *         size = 0;
         *     }
         */
        // 添加集合c中的所有元素到列表中
        /*
         * public boolean addAll(Collection<? extends E> c) {
         *         Object[] a = c.toArray();
         *         int numNew = a.length;
         *         ensureCapacityInternal(size + numNew);  // Increments modCount
         *         System.arraycopy(a, 0, elementData, size, numNew);
         *         size += numNew;
         *         return numNew != 0;
         *     }
         */
        // 从指定索引位置添加集合c中的所有元素
        /*
         * public boolean addAll(int index, Collection<? extends E> c) {
         *         rangeCheckForAdd(index);
         *
         *         Object[] a = c.toArray();
         *         int numNew = a.length;
         *         ensureCapacityInternal(size + numNew);  // Increments modCount
         *
         *         int numMoved = size - index;
         *         if (numMoved > 0)
         *             System.arraycopy(elementData, index, elementData, index + numNew,
         *                              numMoved);
         *
         *         System.arraycopy(a, 0, elementData, index, numNew);
         *         size += numNew;
         *         return numNew != 0;
         *     }
         */
        // 移除指定下标范围的元素
        /*
         * protected void removeRange(int fromIndex, int toIndex) {
         *         modCount++;
         *         int numMoved = size - toIndex;
         *         System.arraycopy(elementData, toIndex, elementData, fromIndex,
         *                          numMoved);
         *
         *         // clear to let GC do its work
         *         int newSize = size - (toIndex-fromIndex);
         *         for (int i = newSize; i < size; i++) {
         *             elementData[i] = null;
         *         }
         *         size = newSize;
         *     }
         */
        // 检查给定的索引是否在范围内
        /*
         * private void rangeCheck(int index) {
         *         if (index >= size)
         *             throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
         *     }
         */
        // add和addAll使用的rangeCheck版
        /*
         * private void rangeCheckForAdd(int index) {
         *         if (index > size || index < 0)
         *             throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
         *     }
         */
        // 下标越界的Msg
        /*
         * private String outOfBoundsMsg(int index) {
         *         return "Index: "+index+", Size: "+size;
         *     }
         */
        // 从list中移除集合c中的元素 c不能为null
        /*
         * public boolean removeAll(Collection<?> c) {
         *         Objects.requireNonNull(c);
         *         return batchRemove(c, false);
         *     }
         */
        // 从list中移除不包含在集合c中的所有元素
        /*
         * public boolean retainAll(Collection<?> c) {
         *         Objects.requireNonNull(c);
         *         return batchRemove(c, true);
         *     }
         */
        // 批量移除方法 c目标集合 complement是否保留集合元素
        /*
         * private boolean batchRemove(Collection<?> c, boolean complement) {
         *         final Object[] elementData = this.elementData;
         *         int r = 0, w = 0;
         *         boolean modified = false;
         *         try {
         *             for (; r < size; r++)
         *                 if (c.contains(elementData[r]) == complement)
         *                     elementData[w++] = elementData[r];
         *         } finally {
         *             // Preserve behavioral compatibility with AbstractCollection,
         *             // even if c.contains() throws.
         *             if (r != size) {
         *                 System.arraycopy(elementData, r,
         *                                  elementData, w,
         *                                  size - r);
         *                 w += size - r;
         *             }
         *             if (w != size) {
         *                 // clear to let GC do its work
         *                 for (int i = w; i < size; i++)
         *                     elementData[i] = null;
         *                 modCount += size - w;
         *                 size = w;
         *                 modified = true;
         *             }
         *         }
         *         return modified;
         *     }
         */
        // 将ArrayList实例的状态保存到流 即，对其进行序列化
        /*
         * private void writeObject(java.io.ObjectOutputStream s)
         *         throws java.io.IOException{
         *         // Write out element count, and any hidden stuff
         *         int expectedModCount = modCount;
         *         s.defaultWriteObject();
         *
         *         // Write out size as capacity for behavioural compatibility with clone()
         *         s.writeInt(size);
         *
         *         // Write out all elements in the proper order.
         *         for (int i=0; i<size; i++) {
         *             s.writeObject(elementData[i]);
         *         }
         *
         *         if (modCount != expectedModCount) {
         *             throw new ConcurrentModificationException();
         *         }
         *     }
         */
        // 从流中读取集合元素
        /*
         * private void readObject(java.io.ObjectInputStream s)
         *         throws java.io.IOException, ClassNotFoundException {
         *         elementData = EMPTY_ELEMENTDATA;
         *
         *         // Read in size, and any hidden stuff
         *         s.defaultReadObject();
         *
         *         // Read in capacity
         *         s.readInt(); // ignored
         *
         *         if (size > 0) {
         *             // be like clone(), allocate array based upon size not capacity
         *             ensureCapacityInternal(size);
         *
         *             Object[] a = elementData;
         *             // Read in all elements in the proper order.
         *             for (int i=0; i<size; i++) {
         *                 a[i] = s.readObject();
         *             }
         *         }
         *     }
         */
        // 从列表中的指定位置开始，以适当的顺序返回列表中元素的列表迭代器
        /*
         * public ListIterator<E> listIterator(int index) {
         *         if (index < 0 || index > size)
         *             throw new IndexOutOfBoundsException("Index: "+index);
         *         return new ListItr(index);
         *     }
         */
        // 获取列表中元素的列表迭代器
        /*
         * public ListIterator<E> listIterator() {
         *         return new ListItr(0);
         *     }
         */
        // 以正确的顺序返回此列表中元素的迭代器
        /*
         * public Iterator<E> iterator() {
         *         return new Itr();
         *     }
         */
        ListIterator<Integer> integerListIterator = list.listIterator();
        Iterator<Integer> iterator = list.iterator();
        // 根据指定索引截取列表
        /*
         * public List<E> subList(int fromIndex, int toIndex) {
         *         subListRangeCheck(fromIndex, toIndex, size);
         *         return new SubList(this, 0, fromIndex, toIndex);
         *     }
         */
        // 检查截取范围是否合法
        /*
         * static void subListRangeCheck(int fromIndex, int toIndex, int size) {
         *         if (fromIndex < 0)
         *             throw new IndexOutOfBoundsException("fromIndex = " + fromIndex);
         *         if (toIndex > size)
         *             throw new IndexOutOfBoundsException("toIndex = " + toIndex);
         *         if (fromIndex > toIndex)
         *             throw new IllegalArgumentException("fromIndex(" + fromIndex +
         *                                                ") > toIndex(" + toIndex + ")");
         *     }
         */
        // 遍历列表元素执行action
        /*
         * public void forEach(Consumer<? super E> action) {
         *         Objects.requireNonNull(action);
         *         final int expectedModCount = modCount;
         *         @SuppressWarnings("unchecked")
         *         final E[] elementData = (E[]) this.elementData;
         *         final int size = this.size;
         *         for (int i=0; modCount == expectedModCount && i < size; i++) {
         *             action.accept(elementData[i]);
         *         }
         *         if (modCount != expectedModCount) {
         *             throw new ConcurrentModificationException();
         *         }
         *     }
         */
        // 在此列表中的元素上创建后绑定和快速失败的Spliterator 。
        /*
         * public Spliterator<E> spliterator() {
         *         return new ArrayListSpliterator<>(this, 0, -1, 0);
         *     }
         */
        // 满足filter就移除元素
        /*
         * public boolean removeIf(Predicate<? super E> filter) {
         *         Objects.requireNonNull(filter);
         *         // figure out which elements are to be removed
         *         // any exception thrown from the filter predicate at this stage
         *         // will leave the collection unmodified
         *         int removeCount = 0;
         *         final BitSet removeSet = new BitSet(size);
         *         final int expectedModCount = modCount;
         *         final int size = this.size;
         *         for (int i=0; modCount == expectedModCount && i < size; i++) {
         *             @SuppressWarnings("unchecked")
         *             final E element = (E) elementData[i];
         *             if (filter.test(element)) {
         *                 removeSet.set(i);
         *                 removeCount++;
         *             }
         *         }
         *         if (modCount != expectedModCount) {
         *             throw new ConcurrentModificationException();
         *         }
         *
         *         // shift surviving elements left over the spaces left by removed elements
         *         final boolean anyToRemove = removeCount > 0;
         *         if (anyToRemove) {
         *             final int newSize = size - removeCount;
         *             for (int i=0, j=0; (i < size) && (j < newSize); i++, j++) {
         *                 i = removeSet.nextClearBit(i);
         *                 elementData[j] = elementData[i];
         *             }
         *             for (int k=newSize; k < size; k++) {
         *                 elementData[k] = null;  // Let gc do its work
         *             }
         *             this.size = newSize;
         *             if (modCount != expectedModCount) {
         *                 throw new ConcurrentModificationException();
         *             }
         *             modCount++;
         *         }
         *
         *         return anyToRemove;
         *     }
         */
        // 对列表中的元素执行operator操作并替换原有元素
        /*
         * public void replaceAll(UnaryOperator<E> operator) {
         *         Objects.requireNonNull(operator);
         *         final int expectedModCount = modCount;
         *         final int size = this.size;
         *         for (int i=0; modCount == expectedModCount && i < size; i++) {
         *             elementData[i] = operator.apply((E) elementData[i]);
         *         }
         *         if (modCount != expectedModCount) {
         *             throw new ConcurrentModificationException();
         *         }
         *         modCount++;
         *     }
         */
        list.replaceAll(x -> x + 1);
        list.forEach(System.out::println);
        System.out.println("-------------");
        // 按照comparator对列表中的元素进行排序
        /*
         * public void sort(Comparator<? super E> c) {
         *         final int expectedModCount = modCount;
         *         Arrays.sort((E[]) elementData, 0, size, c);
         *         if (modCount != expectedModCount) {
         *             throw new ConcurrentModificationException();
         *         }
         *         modCount++;
         *     }
         */
        list.sort((t1, t2) -> t2 - t1);
        list.forEach(System.out::println);

//        private static final long serialVersionUID = 8683452581122892189L; 序列化参数
//        private static final int DEFAULT_CAPACITY = 10; 默认初始容量
//        private static final Object[] EMPTY_ELEMENTDATA = {}; 空元素数据
//        private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {}; 默认容量空元素数据
//        transient Object[] elementData; 非私有以简化嵌套类访问
//        private int size; 列表中的元素个数
    }
}
