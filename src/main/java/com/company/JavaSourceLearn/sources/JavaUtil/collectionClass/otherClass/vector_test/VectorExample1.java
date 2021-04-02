package main.java.com.company.JavaSourceLearn.sources.JavaUtil.collectionClass.otherClass.vector_test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : Vector
 * @date : 2021-01-13 20:17:33
 */
public class VectorExample1 {
    public static void main(String[] args) {
        // extends AbstractList<E>
        //    implements List<E>, RandomAccess, Cloneable, java.io.Serializable
        // 内部类
        // Itr
        // 是否包含下一个元素
        /*
         * public boolean hasNext() {
         *             // Racy but within spec, since modifications are checked
         *             // within or after synchronization in next/previous
         *             return cursor != elementCount;
         *         }
         */
        // 获取下一个元素
        /*
         * public E next() {
         *             synchronized (Vector.this) {
         *                 checkForComodification();
         *                 int i = cursor;
         *                 if (i >= elementCount)
         *                     throw new NoSuchElementException();
         *                 cursor = i + 1;
         *                 return elementData(lastRet = i);
         *             }
         *         }
         */
        // 移除当前元素
        /*
         * public void remove() {
         *             if (lastRet == -1)
         *                 throw new IllegalStateException();
         *             synchronized (Vector.this) {
         *                 checkForComodification();
         *                 Vector.this.remove(lastRet);
         *                 expectedModCount = modCount;
         *             }
         *             cursor = lastRet;
         *             lastRet = -1;
         *         }
         */
        // 遍历剩余元素执行consumer
        /*
         * @Override
         *         public void forEachRemaining(Consumer<? super E> action) {
         *             Objects.requireNonNull(action);
         *             synchronized (Vector.this) {
         *                 final int size = elementCount;
         *                 int i = cursor;
         *                 if (i >= size) {
         *                     return;
         *                 }
         *         @SuppressWarnings("unchecked")
         *                 final E[] elementData = (E[]) Vector.this.elementData;
         *                 if (i >= elementData.length) {
         *                     throw new ConcurrentModificationException();
         *                 }
         *                 while (i != size && modCount == expectedModCount) {
         *                     action.accept(elementData[i++]);
         *                 }
         *                 // update once at end of iteration to reduce heap write traffic
         *                 cursor = i;
         *                 lastRet = i - 1;
         *                 checkForComodification();
         *             }
         *         }
         */
        // 检查并发修改异常
        /*
         * final void checkForComodification() {
         *             if (modCount != expectedModCount)
         *                 throw new ConcurrentModificationException();
         *         }
         */
        // int cursor;       // index of next element to return 下一个将要返回的元素的索引
        // int lastRet = -1; // index of last element returned; -1 if no such 最后一个返回元素的索引
        // int expectedModCount = modCount; 并发修改异常
        // ListItr
        // 构造器 指定索引
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
        // 下一个将要返回的元素索引
        /*
         * public int nextIndex() {
         *             return cursor;
         *         }
         */
        // 前一个元素的索引
        /*
         * public int previousIndex() {
         *             return cursor - 1;
         *         }
         */
        // 获取前一个元素
        /*
         * public E previous() {
         *             synchronized (Vector.this) {
         *                 checkForComodification();
         *                 int i = cursor - 1;
         *                 if (i < 0)
         *                     throw new NoSuchElementException();
         *                 cursor = i;
         *                 return elementData(lastRet = i);
         *             }
         *         }
         */
        // 设置元素到下一个将要返回的元素位置
        /*
         * public void set(E e) {
         *             if (lastRet == -1)
         *                 throw new IllegalStateException();
         *             synchronized (Vector.this) {
         *                 checkForComodification();
         *                 Vector.this.set(lastRet, e);
         *             }
         *         }
         */
        // 添加元素到列表末尾
        /*
         * public void add(E e) {
         *             int i = cursor;
         *             synchronized (Vector.this) {
         *                 checkForComodification();
         *                 Vector.this.add(i, e);
         *                 expectedModCount = modCount;
         *             }
         *             cursor = i + 1;
         *             lastRet = -1;
         *         }
         */
        // 分离器 VectorSpliterator
        // 构造 创建一个分离器
        /*
         * VectorSpliterator(Vector<E> list, Object[] array, int origin, int fence,
         *                           int expectedModCount) {
         *             this.list = list;
         *             this.array = array;
         *             this.index = origin;
         *             this.fence = fence;
         *             this.expectedModCount = expectedModCount;
         *         }
         */
        // 获取元素栅栏位置 初始化的时候调用
        /*
         * private int getFence() { // initialize on first use
         *             int hi;
         *             if ((hi = fence) < 0) {
         *                 synchronized(list) {
         *                     array = list.elementData;
         *                     expectedModCount = list.modCount;
         *                     hi = fence = list.elementCount;
         *                 }
         *             }
         *             return hi;
         *         }
         */
        // 分离器
        /*
         * public Spliterator<E> trySplit() {
         *             int hi = getFence(), lo = index, mid = (lo + hi) >>> 1;
         *             return (lo >= mid) ? null :
         *                 new VectorSpliterator<E>(list, array, lo, index = mid,
         *                                          expectedModCount);
         *         }
         */
        // 遍历执行action
        /*
         * @SuppressWarnings("unchecked")
         *         public boolean tryAdvance(Consumer<? super E> action) {
         *             int i;
         *             if (action == null)
         *                 throw new NullPointerException();
         *             if (getFence() > (i = index)) {
         *                 index = i + 1;
         *                 action.accept((E)array[i]);
         *                 if (list.modCount != expectedModCount)
         *                     throw new ConcurrentModificationException();
         *                 return true;
         *             }
         *             return false;
         *         }
         */
        // 对剩余元素执行action
        /*
         * @SuppressWarnings("unchecked")
         *         public void forEachRemaining(Consumer<? super E> action) {
         *             int i, hi; // hoist accesses and checks from loop
         *             Vector<E> lst; Object[] a;
         *             if (action == null)
         *                 throw new NullPointerException();
         *             if ((lst = list) != null) {
         *                 if ((hi = fence) < 0) {
         *                     synchronized(lst) {
         *                         expectedModCount = lst.modCount;
         *                         a = array = lst.elementData;
         *                         hi = fence = lst.elementCount;
         *                     }
         *                 }
         *                 else
         *                     a = array;
         *                 if (a != null && (i = index) >= 0 && (index = hi) <= a.length) {
         *                     while (i < hi)
         *                         action.accept((E) a[i++]);
         *                     if (lst.modCount == expectedModCount)
         *                         return;
         *                 }
         *             }
         *             throw new ConcurrentModificationException();
         *         }
         */
        // 预估容量
        /*
         * public long estimateSize() {
         *             return (long) (getFence() - index);
         *         }
         */
        // 特征
        /*
         * public int characteristics() {
         *             return Spliterator.ORDERED | Spliterator.SIZED | Spliterator.SUBSIZED;
         *         }
         */
        // private final Vector<E> list; 存放元素
        // private Object[] array; 数组
        // private int index; // current index, modified on advance/split 当前索引位
        // private int fence; // -1 until used; then one past last index 最后一个索引位置
        // private int expectedModCount; // initialized when fence set 并发修改异常
        // 构造一个具有指定初始容量和容量增量的空向量。
        /*
         * public Vector(int initialCapacity, int capacityIncrement) {
         *         super();
         *         if (initialCapacity < 0)
         *             throw new IllegalArgumentException("Illegal Capacity: "+
         *                                                initialCapacity);
         *         this.elementData = new Object[initialCapacity];
         *         this.capacityIncrement = capacityIncrement;
         *     }
         */
        // 指定初始容量的构造
        /*
         * public Vector(int initialCapacity) {
         *         this(initialCapacity, 0);
         *     }
         */
        // 无参构造
        /*
         * public Vector() {
         *         this(10);
         *     }
         */
        // 从集合c中构造vector
        /*
         * public Vector(Collection<? extends E> c) {
         *         elementData = c.toArray();
         *         elementCount = elementData.length;
         *         // c.toArray might (incorrectly) not return Object[] (see 6260652)
         *         if (elementData.getClass() != Object[].class)
         *             elementData = Arrays.copyOf(elementData, elementCount, Object[].class);
         *     }
         */
        // 将元素copy到数组中
        /*
         * public synchronized void copyInto(Object[] anArray) {
         *         System.arraycopy(elementData, 0, anArray, 0, elementCount);
         *     }
         */
        // 释放vector空间 把未存储元素的空间释放
        /*
         * public synchronized void trimToSize() {
         *         modCount++;
         *         int oldCapacity = elementData.length;
         *         if (elementCount < oldCapacity) {
         *             elementData = Arrays.copyOf(elementData, elementCount);
         *         }
         *     }
         */
        // 如有必要，增加此向量的容量，以确保它至少可以容纳最小容量参数指定的组件数。
        /*
         * public synchronized void ensureCapacity(int minCapacity) {
         *         if (minCapacity > 0) {
         *             modCount++;
         *             ensureCapacityHelper(minCapacity);
         *         }
         *     }
         */
        // helper 这实现了sureCapacity的非同步语义。
        // 此类中的同步方法可以在内部调用此方法以确保容量，而不会产生额外的同步开销。
        /*
         * private void ensureCapacityHelper(int minCapacity) {
         *         // overflow-conscious code
         *         if (minCapacity - elementData.length > 0)
         *             grow(minCapacity);
         *     }
         */
        // 扩容空间
        /*
         * private void grow(int minCapacity) {
         *         // overflow-conscious code
         *         int oldCapacity = elementData.length;
         *         int newCapacity = oldCapacity + ((capacityIncrement > 0) ?
         *                                          capacityIncrement : oldCapacity);
         *         if (newCapacity - minCapacity < 0)
         *             newCapacity = minCapacity;
         *         if (newCapacity - MAX_ARRAY_SIZE > 0)
         *             newCapacity = hugeCapacity(minCapacity);
         *         elementData = Arrays.copyOf(elementData, newCapacity);
         *     }
         */
        // 较大的容量
        /*
         * private static int hugeCapacity(int minCapacity) {
         *         if (minCapacity < 0) // overflow
         *             throw new OutOfMemoryError();
         *         return (minCapacity > MAX_ARRAY_SIZE) ?
         *             Integer.MAX_VALUE :
         *             MAX_ARRAY_SIZE;
         *     }
         */
        // 设置新size
        /*
         * public synchronized void setSize(int newSize) {
         *         modCount++;
         *         if (newSize > elementCount) {
         *             ensureCapacityHelper(newSize);
         *         } else {
         *             for (int i = newSize ; i < elementCount ; i++) {
         *                 elementData[i] = null;
         *             }
         *         }
         *         elementCount = newSize;
         *     }
         */
        // 获取vector容量
        /*
         * public synchronized int capacity() {
         *         return elementData.length;
         *     }
         */
        // 获取元素数量
        /*
         * public synchronized int size() {
         *         return elementCount;
         *     }
         */
        // 判断vector是否为空
        /*
         * public synchronized boolean isEmpty() {
         *         return elementCount == 0;
         *     }
         */
        // 返回此向量的组成部分的枚举。
        // 返回的Enumeration对象将生成此向量中的所有项目。
        // 生成的第一项是索引0的项，然后是索引1的项，依此类推。
        /*
         * public Enumeration<E> elements() {
         *         return new Enumeration<E>() {
         *             int count = 0;
         *
         *             public boolean hasMoreElements() {
         *                 return count < elementCount;
         *             }
         *
         *             public E nextElement() {
         *                 synchronized (Vector.this) {
         *                     if (count < elementCount) {
         *                         return elementData(count++);
         *                     }
         *                 }
         *                 throw new NoSuchElementException("Vector Enumeration");
         *             }
         *         };
         *     }
         */
        // 判断vector是否包含元素o
        /*
         * public boolean contains(Object o) {
         *         return indexOf(o, 0) >= 0;
         *     }
         */
        // 返回元素第一次出现的索引
        /*
         * public int indexOf(Object o) {
         *         return indexOf(o, 0);
         *     }
         */
        // 返回指定元素在此向量中首次出现的index ，从index向前搜索，如果未找到该元素，则返回-1
        /*
         * public synchronized int indexOf(Object o, int index) {
         *         if (o == null) {
         *             for (int i = index ; i < elementCount ; i++)
         *                 if (elementData[i]==null)
         *                     return i;
         *         } else {
         *             for (int i = index ; i < elementCount ; i++)
         *                 if (o.equals(elementData[i]))
         *                     return i;
         *         }
         *         return -1;
         *     }
         */
        // 返回元素最后一次出现的索引
        /*
         * public synchronized int lastIndexOf(Object o) {
         *         return lastIndexOf(o, elementCount-1);
         *     }
         */
        // 从指定索引开始搜索 返回元素最后一次出现的索引
        /*
         * public synchronized int lastIndexOf(Object o, int index) {
         *         if (index >= elementCount)
         *             throw new IndexOutOfBoundsException(index + " >= "+ elementCount);
         *
         *         if (o == null) {
         *             for (int i = index; i >= 0; i--)
         *                 if (elementData[i]==null)
         *                     return i;
         *         } else {
         *             for (int i = index; i >= 0; i--)
         *                 if (o.equals(elementData[i]))
         *                     return i;
         *         }
         *         return -1;
         *     }
         */
        // 返回指定索引位置的元素
        /*
         * public synchronized E elementAt(int index) {
         *         if (index >= elementCount) {
         *             throw new ArrayIndexOutOfBoundsException(index + " >= " + elementCount);
         *         }
         *
         *         return elementData(index);
         *     }
         */
        // 返回vector的首元素
        /*
         * public synchronized E firstElement() {
         *         if (elementCount == 0) {
         *             throw new NoSuchElementException();
         *         }
         *         return elementData(0);
         *     }
         */
        // 返回vector的尾元素
        /*
         * public synchronized E lastElement() {
         *         if (elementCount == 0) {
         *             throw new NoSuchElementException();
         *         }
         *         return elementData(elementCount - 1);
         *     }
         */
        // 设置指定索引位置的元素为obj
        /*
         * public synchronized void setElementAt(E obj, int index) {
         *         if (index >= elementCount) {
         *             throw new ArrayIndexOutOfBoundsException(index + " >= " +
         *                                                      elementCount);
         *         }
         *         elementData[index] = obj;
         *     }
         */
        // 移除指定索引位置的元素
        /*
         * public synchronized void removeElementAt(int index) {
         *         modCount++;
         *         if (index >= elementCount) {
         *             throw new ArrayIndexOutOfBoundsException(index + " >= " +
         *                                                      elementCount);
         *         }
         *         else if (index < 0) {
         *             throw new ArrayIndexOutOfBoundsException(index);
         *         }
         *         int j = elementCount - index - 1;
         *         if (j > 0) {
         *             System.arraycopy(elementData, index + 1, elementData, index, j);
         *         }
         *         elementCount--;
         *         elementData[elementCount] = null;
         * }
         */
        // 在指定索引位置插入元素
        /*
         * public synchronized void insertElementAt(E obj, int index) {
         *         modCount++;
         *         if (index > elementCount) {
         *             throw new ArrayIndexOutOfBoundsException(index
         *                                                      + " > " + elementCount);
         *         }
         *         ensureCapacityHelper(elementCount + 1);
         *         System.arraycopy(elementData, index, elementData, index + 1, elementCount - index);
         *         elementData[index] = obj;
         *         elementCount++;
         *     }
         */
        // 向vector末尾添加元素
        /*
         * public synchronized void addElement(E obj) {
         *         modCount++;
         *         ensureCapacityHelper(elementCount + 1);
         *         elementData[elementCount++] = obj;
         *     }
         */
        // 移除指定元素
        /*
         * public synchronized boolean removeElement(Object obj) {
         *         modCount++;
         *         int i = indexOf(obj);
         *         if (i >= 0) {
         *             removeElementAt(i);
         *             return true;
         *         }
         *         return false;
         *     }
         */
        // 移除vector的所有元素
        /*
         * public synchronized void removeAllElements() {
         *         modCount++;
         *         // Let gc do its work
         *         for (int i = 0; i < elementCount; i++)
         *             elementData[i] = null;
         *
         *         elementCount = 0;
         *     }
         */
        // 克隆  该副本将包含对内部数据数组的克隆的引用，而不是对此Vector对象的原始内部数据数组的引用。
        /*
         * public synchronized Object clone() {
         *         try {
         *             @SuppressWarnings("unchecked")
         *                 Vector<E> v = (Vector<E>) super.clone();
         *             v.elementData = Arrays.copyOf(elementData, elementCount);
         *             v.modCount = 0;
         *             return v;
         *         } catch (CloneNotSupportedException e) {
         *             // this shouldn't happen, since we are Cloneable
         *             throw new InternalError(e);
         *         }
         *     }
         */
        // 将vector复制到数组中
        /*
         * public synchronized Object[] toArray() {
         *         return Arrays.copyOf(elementData, elementCount);
         *     }
         */
        // 将vector复制到指定泛型的数组中
        /*
         * @SuppressWarnings("unchecked")
         *     public synchronized <T> T[] toArray(T[] a) {
         *         if (a.length < elementCount)
         *             return (T[]) Arrays.copyOf(elementData, elementCount, a.getClass());
         *
         *         System.arraycopy(elementData, 0, a, 0, elementCount);
         *
         *         if (a.length > elementCount)
         *             a[elementCount] = null;
         *
         *         return a;
         *     }
         */
        // 获取指定索引位置的元素
        /*
         * @SuppressWarnings("unchecked")
         *     E elementData(int index) {
         *         return (E) elementData[index];
         *     }
         */
        // 获取指定索引位置的元素
        /*
         * public synchronized E get(int index) {
         *         if (index >= elementCount)
         *             throw new ArrayIndexOutOfBoundsException(index);
         *
         *         return elementData(index);
         *     }
         */
        // 设置指定索引位置的元素为element
        /*
         * public synchronized E set(int index, E element) {
         *         if (index >= elementCount)
         *             throw new ArrayIndexOutOfBoundsException(index);
         *
         *         E oldValue = elementData(index);
         *         elementData[index] = element;
         *         return oldValue;
         *     }
         */
        // 添加元素e到vector末尾
        /*
         * public synchronized boolean add(E e) {
         *         modCount++;
         *         ensureCapacityHelper(elementCount + 1);
         *         elementData[elementCount++] = e;
         *         return true;
         *     }
         */
        // 移除指定元素o
        /*
         * public boolean remove(Object o) {
         *         return removeElement(o);
         *     }
         */
        // 向指定索引位置插入元素
        /*
         * public void add(int index, E element) {
         *         insertElementAt(element, index);
         *     }
         */
        // 移除指定索引位置的元素
        /*
         * public synchronized E remove(int index) {
         *         modCount++;
         *         if (index >= elementCount)
         *             throw new ArrayIndexOutOfBoundsException(index);
         *         E oldValue = elementData(index);
         *
         *         int numMoved = elementCount - index - 1;
         *         if (numMoved > 0)
         *             System.arraycopy(elementData, index+1, elementData, index,
         *                              numMoved);
         *         elementData[--elementCount] = null; // Let gc do its work
         *
         *         return oldValue;
         *     }
         */
        // 清空vector
        /*
         * public void clear() {
         *         removeAllElements();
         *     }
         */
        // 判断vector是否包含集合c中的所有元素
        /*
         * public synchronized boolean containsAll(Collection<?> c) {
         *         return super.containsAll(c);
         *     }
         */
        // 添加集合c中所有元素到vector中
        /*
         * public synchronized boolean addAll(Collection<? extends E> c) {
         *         modCount++;
         *         Object[] a = c.toArray();
         *         int numNew = a.length;
         *         ensureCapacityHelper(elementCount + numNew);
         *         System.arraycopy(a, 0, elementData, elementCount, numNew);
         *         elementCount += numNew;
         *         return numNew != 0;
         *     }
         */
        // 移除集合c中所有元素
        /*
         * public synchronized boolean removeAll(Collection<?> c) {
         *         return super.removeAll(c);
         *     }
         */
        // 移除除集合c中的其他元素
        /*
         * public synchronized boolean retainAll(Collection<?> c) {
         *         return super.retainAll(c);
         *     }
         */
        // 在指定索引位置插入集合c中的所有元素
        /*
         * public synchronized boolean addAll(int index, Collection<? extends E> c) {
         *         modCount++;
         *         if (index < 0 || index > elementCount)
         *             throw new ArrayIndexOutOfBoundsException(index);
         *
         *         Object[] a = c.toArray();
         *         int numNew = a.length;
         *         ensureCapacityHelper(elementCount + numNew);
         *
         *         int numMoved = elementCount - index;
         *         if (numMoved > 0)
         *             System.arraycopy(elementData, index, elementData, index + numNew,
         *                              numMoved);
         *
         *         System.arraycopy(a, 0, elementData, index, numNew);
         *         elementCount += numNew;
         *         return numNew != 0;
         *     }
         */
        // 比较指定对象与此向量是否相等。 返回true当且仅当指定的对象也是一个列表，
        // 两个列表具有相同的大小，并在两个列表所有对应的元素对都相等。
        /*
         * public synchronized boolean equals(Object o) {
         *         return super.equals(o);
         *     }
         */
        // 获取HashCode方法
        /*
         * public synchronized int hashCode() {
         *         return super.hashCode();
         *     }
         */
        // toString
        /*
         * public synchronized String toString() {
         *         return super.toString();
         *     }
         */
        // 对vector进行切割
        /*
         * public synchronized List<E> subList(int fromIndex, int toIndex) {
         *         return Collections.synchronizedList(super.subList(fromIndex, toIndex),
         *                                             this);
         *     }
         */
        // 移除指定范围的元素
        /*
         * protected synchronized void removeRange(int fromIndex, int toIndex) {
         *         modCount++;
         *         int numMoved = elementCount - toIndex;
         *         System.arraycopy(elementData, toIndex, elementData, fromIndex,
         *                          numMoved);
         *
         *         // Let gc do its work
         *         int newElementCount = elementCount - (toIndex-fromIndex);
         *         while (elementCount != newElementCount)
         *             elementData[--elementCount] = null;
         *     }
         */
        // 将vector序列化到流
        /*
         * private void writeObject(java.io.ObjectOutputStream s)
         *             throws java.io.IOException {
         *         final java.io.ObjectOutputStream.PutField fields = s.putFields();
         *         final Object[] data;
         *         synchronized (this) {
         *             fields.put("capacityIncrement", capacityIncrement);
         *             fields.put("elementCount", elementCount);
         *             data = elementData.clone();
         *         }
         *         fields.put("elementData", data);
         *         s.writeFields();
         *     }
         */
        // 构建一个从指定索引位置开始的列表迭代器
        /*
         * public synchronized ListIterator<E> listIterator(int index) {
         *         if (index < 0 || index > elementCount)
         *             throw new IndexOutOfBoundsException("Index: "+index);
         *         return new ListItr(index);
         *     }
         */
        // 获取列表迭代器
        /*
         * public synchronized ListIterator<E> listIterator() {
         *         return new ListItr(0);
         *     }
         */
        // 获取迭代器
        /*
         * public synchronized Iterator<E> iterator() {
         *         return new Itr();
         *     }
         */
        // 遍历元素执行consumer消费者
        /*
         * @Override
         *     public synchronized void forEach(Consumer<? super E> action) {
         *         Objects.requireNonNull(action);
         *         final int expectedModCount = modCount;
         *         @SuppressWarnings("unchecked")
         *         final E[] elementData = (E[]) this.elementData;
         *         final int elementCount = this.elementCount;
         *         for (int i=0; modCount == expectedModCount && i < elementCount; i++) {
         *             action.accept(elementData[i]);
         *         }
         *         if (modCount != expectedModCount) {
         *             throw new ConcurrentModificationException();
         *         }
         *     }
         */
        // 如果元素满足条件移除元素
        /*
         * @Override
         *     @SuppressWarnings("unchecked")
         *     public synchronized boolean removeIf(Predicate<? super E> filter) {
         *         Objects.requireNonNull(filter);
         *         // figure out which elements are to be removed
         *         // any exception thrown from the filter predicate at this stage
         *         // will leave the collection unmodified
         *         int removeCount = 0;
         *         final int size = elementCount;
         *         final BitSet removeSet = new BitSet(size);
         *         final int expectedModCount = modCount;
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
         *             elementCount = newSize;
         *             if (modCount != expectedModCount) {
         *                 throw new ConcurrentModificationException();
         *             }
         *             modCount++;
         *         }
         *
         *         return anyToRemove;
         *     }
         */
        // 执行operator替换原元素
        /*
         * @Override
         *     @SuppressWarnings("unchecked")
         *     public synchronized void replaceAll(UnaryOperator<E> operator) {
         *         Objects.requireNonNull(operator);
         *         final int expectedModCount = modCount;
         *         final int size = elementCount;
         *         for (int i=0; modCount == expectedModCount && i < size; i++) {
         *             elementData[i] = operator.apply((E) elementData[i]);
         *         }
         *         if (modCount != expectedModCount) {
         *             throw new ConcurrentModificationException();
         *         }
         *         modCount++;
         *     }
         */
        // 按照comparator c 排序元素
        /*
         * @SuppressWarnings("unchecked")
         *     @Override
         *     public synchronized void sort(Comparator<? super E> c) {
         *         final int expectedModCount = modCount;
         *         Arrays.sort((E[]) elementData, 0, elementCount, c);
         *         if (modCount != expectedModCount) {
         *             throw new ConcurrentModificationException();
         *         }
         *         modCount++;
         *     }
         */
        // 分离器
        /*
         * @Override
         *     public Spliterator<E> spliterator() {
         *         return new VectorSpliterator<>(this, null, 0, -1, 0);
         *     }
         */
        // protected Object[] elementData; 元素数组
        // protected int elementCount; 元素数量
        // protected int capacityIncrement; 数组增量
        // private static final long serialVersionUID = -2767605614048989439L; 序列化参数
        // private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8; 最大容量
    }
}
