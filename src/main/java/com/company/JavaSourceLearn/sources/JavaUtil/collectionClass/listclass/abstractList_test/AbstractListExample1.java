package com.company.JavaSourceLearn.sources.JavaUtil.collectionClass.listclass.abstractList_test;


/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : AbstractList
 * @date : 2021-01-04 20:18:22
 */
public class AbstractListExample1 {
    public static void main(String[] args) {
        // extends AbstractCollection<E> implements List<E>
        // 内部类
        // Itr implements Iterator
        // 属性
        // int cursor = 0; 下标位置
        // 最近一次调用下一个或上一个返回的元素的索引。 如果通过调用remove删除了此元素，则重置为-1。
        // int lastRet = -1; 他保存cursor操作前的索引
        // 迭代器认为后备列表应该具有的modCount值。 如果违反了此期望，则迭代器已检测到并发修改
        // int expectedModCount = modCount;

        // 判断是否有下一个元素
        // 迭代器每次迭代出一个元素时元素索引指针cursor都会下移
        // 通过检查元素指针cursor是否等于集合长度判断时候还有元素
        /*
         * public boolean hasNext() {
         *             return cursor != size();
         *         }
         */
        // 获取当前元素索引指针(cursor)处的元素
        // 检测是否发生并发修改，并发修改则抛出异常
        // 获取当前元素索引指针所指向的元素，保存当前索引到lastRet、cursor++
        // 返回回去到的元素
        /*
         * public E next() {
         *             checkForComodification();
         *             try {
         *                 int i = cursor;
         *                 E next = get(i);
         *                 lastRet = i;
         *                 cursor = i + 1;
         *                 return next;
         *             } catch (IndexOutOfBoundsException e) {
         *                 checkForComodification();
         *                 throw new NoSuchElementException();
         *             }
         *         }
         */
        // 删除lastRet索引处的元素
        // 对lastRet进行和是否并发修改进行检查
        // 调用AbstractList超类的remove方法删除lastRet索引处的元素
        // 如果元素索引指针cursor大于lastRet，则将cursor迁移一位，lastRet置为-1
        /*
         * public void remove() {
         *             if (lastRet < 0)
         *                 throw new IllegalStateException();
         *             checkForComodification();
         *
         *             try {
         *                 AbstractList.this.remove(lastRet);
         *                 if (lastRet < cursor)
         *                     cursor--;
         *                 lastRet = -1;
         *                 expectedModCount = modCount;
         *             } catch (IndexOutOfBoundsException e) {
         *                 throw new ConcurrentModificationException();
         *             }
         *         }
         */
        // 检查是否发生并发修改
        // 通过modCount和expectedModCount是否相等检查
        /*
         * final void checkForComodification() {
         *             if (modCount != expectedModCount)
         *                 throw new ConcurrentModificationException();
         *         }
         */
        // 内部类 ListItr extends Itr implements ListIterator<E>
        // ListItr类有参构造器，初始化开始元素索引指针位置
        /*
         * ListItr(int index) {
         *             cursor = index;
         *         }
         */
        // 是否有前一个元素
        /*
         * public boolean hasPrevious() {
         *             return cursor != 0;
         *         }
         */
        // 获取前一个元素
        /*
         * public E previous() {
         *             checkForComodification();
         *             try {
         *                 int i = cursor - 1;
         *                 E previous = get(i);
         *                 lastRet = cursor = i;
         *                 return previous;
         *             } catch (IndexOutOfBoundsException e) {
         *                 checkForComodification();
         *                 throw new NoSuchElementException();
         *             }
         *         }
         */
        // 获取当前元素索引
        /*
         * public int nextIndex() {
         *             return cursor;
         *         }
         */
        // 获取上一个元素索引
        /*
         * public int previousIndex() {
         *             return cursor-1;
         *         }
         */
        // 替换元素
        // 检查lastRet是否越界，检查时候并发操作
        // 调用AbstractList的set方法进行替换
        /*
         * public void set(E e) {
         *             if (lastRet < 0)
         *                 throw new IllegalStateException();
         *             checkForComodification();
         *
         *             try {
         *                 AbstractList.this.set(lastRet, e);
         *                 expectedModCount = modCount;
         *             } catch (IndexOutOfBoundsException ex) {
         *                 throw new ConcurrentModificationException();
         *             }
         *         }
         */
        // 添加元素
        // 检查是否并发操作，是则抛异常
        // 调用AbstractList的add方法进行添加操作，并将元素指针索引 + 1
        /*
         * public void add(E e) {
         *             checkForComodification();
         *
         *             try {
         *                 int i = cursor;
         *                 AbstractList.this.add(i, e);
         *                 lastRet = -1;
         *                 cursor = i + 1;
         *                 expectedModCount = modCount;
         *             } catch (IndexOutOfBoundsException ex) {
         *                 throw new ConcurrentModificationException();
         *             }
         *         }
         */
        // 主类
        // 构造函数。 用于子类构造函数的调用，通常是隐式的。
        /*
         * protected AbstractList() {
         *     }
         */
        // 将指定的元素追加到此列表的末尾（可选操作）
        /*
         * public boolean add(E e) {
         *         add(size(), e);
         *         return true;
         *     }
         */
        // 获取index位置的元素
        // abstract public E get(int index);
        // 给指定索引位置设置元素并返回元素 需要子类实现
        /*
         * public E set(int index, E element) {
         *         throw new UnsupportedOperationException();
         *     }
         */
        // 移除指定索引位置的元素并返回元素 需要子类实现
        /*
         * public E remove(int index) {
         *         throw new UnsupportedOperationException();
         *     }
         */
        // 获取元素在列表中第一次出现的索引位置
        /*
         * public int indexOf(Object o) {
         *         ListIterator<E> it = listIterator();
         *         if (o==null) {
         *             while (it.hasNext())
         *                 if (it.next()==null)
         *                     return it.previousIndex();
         *         } else {
         *             while (it.hasNext())
         *                 if (o.equals(it.next()))
         *                     return it.previousIndex();
         *         }
         *         return -1;
         *     }
         */
        // 获取元素在列表中最后一次出现的索引位置
        /*
         * public int lastIndexOf(Object o) {
         *         ListIterator<E> it = listIterator(size());
         *         if (o==null) {
         *             while (it.hasPrevious())
         *                 if (it.previous()==null)
         *                     return it.nextIndex();
         *         } else {
         *             while (it.hasPrevious())
         *                 if (o.equals(it.previous()))
         *                     return it.nextIndex();
         *         }
         *         return -1;
         *     }
         */
        // 从此列表中删除所有元素（可选操作）。 该调用返回后，该列表将为空。
        /*
         * public void clear() {
         *         removeRange(0, size());
         *     }
         */
        // 从index往后添加c中的元素到列表中
        /*
         * public boolean addAll(int index, Collection<? extends E> c) {
         *         rangeCheckForAdd(index);
         *         boolean modified = false;
         *         for (E e : c) {
         *             add(index++, e);
         *             modified = true;
         *         }
         *         return modified;
         *     }
         */
        // 以适当的顺序返回此列表中元素的迭代器 依托后台列表的size() ， get(int)和remove(int)方法。
        /*
         * public Iterator<E> iterator() {
         *         return new Itr();
         *     }
         */
        // 返回此列表中元素的列表迭代器（按适当顺序）。
        /*
         * public ListIterator<E> listIterator() {
         *         return listIterator(0);
         *     }
         */
        // 从列表中的指定位置开始，返回列表中元素的列表迭代器（按正确顺序）。
        // 指定的索引指示初始调用next将返回的第一个元素。 对previous的初始调用将返回指定索引减去1的元素。
        /*
         * public ListIterator<E> listIterator(final int index) {
         *         rangeCheckForAdd(index);
         *
         *         return new ListItr(index);
         *     }
         */
        // 截取元素列表
        /*
         * public List<E> subList(int fromIndex, int toIndex) {
         *         return (this instanceof RandomAccess ?
         *                 new RandomAccessSubList<>(this, fromIndex, toIndex) :
         *                 new SubList<>(this, fromIndex, toIndex));
         *     }
         */
        // 比较两个列表内元素是否为同一对象
        /*
         * public boolean equals(Object o) {
         *         if (o == this)
         *             return true;
         *         if (!(o instanceof List))
         *             return false;
         *
         *         ListIterator<E> e1 = listIterator();
         *         ListIterator<?> e2 = ((List<?>) o).listIterator();
         *         while (e1.hasNext() && e2.hasNext()) {
         *             E o1 = e1.next();
         *             Object o2 = e2.next();
         *             if (!(o1==null ? o2==null : o1.equals(o2)))
         *                 return false;
         *         }
         *         return !(e1.hasNext() || e2.hasNext());
         *     }
         */
        // 获取HashCode
        /*
         * public int hashCode() {
         *         int hashCode = 1;
         *         for (E e : this)
         *             hashCode = 31*hashCode + (e==null ? 0 : e.hashCode());
         *         return hashCode;
         *     }
         */
        // 从此列表中删除索引在fromIndex （包括）和toIndex （不包括）之间的所有元素
        /*
         * protected void removeRange(int fromIndex, int toIndex) {
         *         ListIterator<E> it = listIterator(fromIndex);
         *         for (int i=0, n=toIndex-fromIndex; i<n; i++) {
         *             it.next();
         *             it.remove();
         *         }
         *     }
         */
        // 为元素添加检查索引
        /*
         * private void rangeCheckForAdd(int index) {
         *         if (index < 0 || index > size())
         *             throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
         *     }
         */
        // 返回下标越界的msg信息
        /*
         * private String outOfBoundsMsg(int index) {
         *         return "Index: "+index+", Size: "+size();
         *     }
         */
        // 已对该列表进行结构修改的次数
        // protected transient int modCount = 0;
        // 内部类 SubList<E> extends AbstractList<E> 对list的截取修改会影响原list
        // 构造方法 取list的 [fromIndex,toIndex)
        /*
         * SubList(AbstractList<E> list, int fromIndex, int toIndex) {
         *         if (fromIndex < 0)
         *             throw new IndexOutOfBoundsException("fromIndex = " + fromIndex);
         *         if (toIndex > list.size())
         *             throw new IndexOutOfBoundsException("toIndex = " + toIndex);
         *         if (fromIndex > toIndex)
         *             throw new IllegalArgumentException("fromIndex(" + fromIndex +
         *                                                ") > toIndex(" + toIndex + ")");
         *         l = list;
         *         offset = fromIndex;
         *         size = toIndex - fromIndex;
         *         this.modCount = l.modCount;
         *     }
         */
        // 设置指定索引位置的元素
        /*
         * public E set(int index, E element) {
         *         rangeCheck(index);
         *         checkForComodification();
         *         return l.set(index+offset, element);
         *     }
         */
        // 获取指定索引位置的元素
        /*
         * public E get(int index) {
         *         rangeCheck(index);
         *         checkForComodification();
         *         return l.get(index+offset);
         *     }
         */
        // 获取subList的长度 toIndex - fromIndex
        /*
         * public int size() {
         *         checkForComodification();
         *         return size;
         *     }
         */
        // 向subList中添加元素 会影响原list的内容
        /*
         * public void add(int index, E element) {
         *         rangeCheckForAdd(index);
         *         checkForComodification();
         *         l.add(index+offset, element);
         *         this.modCount = l.modCount;
         *         size++;
         *     }
         */
        // 移除指定索引位置的元素
        /*
         * public E remove(int index) {
         *         rangeCheck(index);
         *         checkForComodification();
         *         E result = l.remove(index+offset);
         *         this.modCount = l.modCount;
         *         size--;
         *         return result;
         *     }
         */
        // 移除索引范围的元素 [fromIndex,toIndex)
        /*
         * protected void removeRange(int fromIndex, int toIndex) {
         *         checkForComodification();
         *         l.removeRange(fromIndex+offset, toIndex+offset);
         *         this.modCount = l.modCount;
         *         size -= (toIndex-fromIndex);
         *     }
         */
        // 向subLit元素末尾添加c中的所有元素
        /*
         * public boolean addAll(Collection<? extends E> c) {
         *         return addAll(size, c);
         *     }
         */
        // 向subList元素的index位置后添加c中的所有元素
        /*
         * public boolean addAll(int index, Collection<? extends E> c) {
         *         rangeCheckForAdd(index);
         *         int cSize = c.size();
         *         if (cSize==0)
         *             return false;
         *
         *         checkForComodification();
         *         l.addAll(offset+index, c);
         *         this.modCount = l.modCount;
         *         size += cSize;
         *         return true;
         *     }
         */
        // 获取迭代器
        /*
         * public Iterator<E> iterator() {
         *         return listIterator();
         *     }
         */
        // 从列表中的指定位置开始，返回列表中元素的列表迭代器（按正确顺序）。
        /*
         * public ListIterator<E> listIterator(final int index) {
         *         checkForComodification();
         *         rangeCheckForAdd(index);
         *
         *         return new ListIterator<E>() {
         *             private final ListIterator<E> i = l.listIterator(index+offset);
         *
         *             public boolean hasNext() {
         *                 return nextIndex() < size;
         *             }
         *
         *             public E next() {
         *                 if (hasNext())
         *                     return i.next();
         *                 else
         *                     throw new NoSuchElementException();
         *             }
         *
         *             public boolean hasPrevious() {
         *                 return previousIndex() >= 0;
         *             }
         *
         *             public E previous() {
         *                 if (hasPrevious())
         *                     return i.previous();
         *                 else
         *                     throw new NoSuchElementException();
         *             }
         *
         *             public int nextIndex() {
         *                 return i.nextIndex() - offset;
         *             }
         *
         *             public int previousIndex() {
         *                 return i.previousIndex() - offset;
         *             }
         *
         *             public void remove() {
         *                 i.remove();
         *                 SubList.this.modCount = l.modCount;
         *                 size--;
         *             }
         *
         *             public void set(E e) {
         *                 i.set(e);
         *             }
         *
         *             public void add(E e) {
         *                 i.add(e);
         *                 SubList.this.modCount = l.modCount;
         *                 size++;
         *             }
         *         };
         *     }
         */
        // 截取当前的subList [fromIndex,toIndex)
        /*
         * public List<E> subList(int fromIndex, int toIndex) {
         *         return new SubList<>(this, fromIndex, toIndex);
         *     }
         */
        // 核验index位置是否合法
        /*
         * private void rangeCheck(int index) {
         *         if (index < 0 || index >= size)
         *             throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
         *     }
         */
        // 核验添加的index是否合法
        /*
         * private void rangeCheckForAdd(int index) {
         *         if (index < 0 || index > size)
         *             throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
         *     }
         */
        // 返回下标越界的msg信息
        /*
         * private String outOfBoundsMsg(int index) {
         *         return "Index: "+index+", Size: "+size;
         *     }
         */
        // private final AbstractList<E> l; 当前元素信息
        // private final int offset; 索引偏移量
        // private int size; 元素数量
        // 内部类 RandomAccessSubList<E> extends SubList<E> implements RandomAccess
        // 随机访问子列表
        /*
         * RandomAccessSubList(AbstractList<E> list, int fromIndex, int toIndex) {
         *         super(list, fromIndex, toIndex);
         *     }
         */
        /*
         * public List<E> subList(int fromIndex, int toIndex) {
         *         return new RandomAccessSubList<>(this, fromIndex, toIndex);
         *     }
         */
    }
}
