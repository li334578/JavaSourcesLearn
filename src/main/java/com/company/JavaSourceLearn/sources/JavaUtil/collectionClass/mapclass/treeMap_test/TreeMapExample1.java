package main.java.com.company.JavaSourceLearn.sources.JavaUtil.collectionClass.mapclass.treeMap_test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : TreeMap
 * @date : 2021-01-10 19:35:06
 */
public class TreeMapExample1 {
    public static void main(String[] args) {
        // extends AbstractMap<K,V>
        //    implements NavigableMap<K,V>, Cloneable, java.io.Serializable
        // 内部类 Values
        // value迭代器
        /*
         * public Iterator<V> iterator() {
         *             return new ValueIterator(getFirstEntry());
         *         }
         */
        // 元素数量
        /*
         * public int size() {
         *             return TreeMap.this.size();
         *         }
         */
        // 判断是否包含value
        /*
         * public boolean contains(Object o) {
         *             return TreeMap.this.containsValue(o);
         *         }
         */
        // 移除value
        /*
         * public boolean remove(Object o) {
         *             for (Entry<K,V> e = getFirstEntry(); e != null; e = successor(e)) {
         *                 if (valEquals(e.getValue(), o)) {
         *                     deleteEntry(e);
         *                     return true;
         *                 }
         *             }
         *             return false;
         *         }
         */
        // 清空treeMap
        /*
         * public void clear() {
         *             TreeMap.this.clear();
         *         }
         */
        // 分离器
        /*
         * public Spliterator<V> spliterator() {
         *             return new ValueSpliterator<K,V>(TreeMap.this, null, null, 0, -1, 0);
         *         }
         */
        // EntrySet
        // entry迭代器
        /*
         * public Iterator<Map.Entry<K,V>> iterator() {
         *             return new EntryIterator(getFirstEntry());
         *         }
         */
        // 判断是否包entry
        /*
         * public boolean contains(Object o) {
         *             if (!(o instanceof Map.Entry))
         *                 return false;
         *             Map.Entry<?,?> entry = (Map.Entry<?,?>) o;
         *             Object value = entry.getValue();
         *             Entry<K,V> p = getEntry(entry.getKey());
         *             return p != null && valEquals(p.getValue(), value);
         *         }
         */
        // 移除entry
        /*
         * public boolean remove(Object o) {
         *             if (!(o instanceof Map.Entry))
         *                 return false;
         *             Map.Entry<?,?> entry = (Map.Entry<?,?>) o;
         *             Object value = entry.getValue();
         *             Entry<K,V> p = getEntry(entry.getKey());
         *             if (p != null && valEquals(p.getValue(), value)) {
         *                 deleteEntry(p);
         *                 return true;
         *             }
         *             return false;
         *         }
         */
        // 清空treeMap
        /*
         * public void clear() {
         *             TreeMap.this.clear();
         *         }
         */
        // 元素数量
        /*
         * public int size() {
         *             return TreeMap.this.size();
         *         }
         */
        // 分离器
        /*
         * public Spliterator<Map.Entry<K,V>> spliterator() {
         *             return new EntrySpliterator<K,V>(TreeMap.this, null, null, 0, -1, 0);
         *         }
         */
        // KeySet
        // 构造方法
        /*
         * KeySet(NavigableMap<E,?> map) { m = map; }
         */
        // 迭代器
        /*
         * public Iterator<E> iterator() {
         *             if (m instanceof TreeMap)
         *                 return ((TreeMap<E,?>)m).keyIterator();
         *             else
         *                 return ((TreeMap.NavigableSubMap<E,?>)m).keyIterator();
         *         }
         */
        // 降序迭代器
        /*
         * public Iterator<E> descendingIterator() {
         *             if (m instanceof TreeMap)
         *                 return ((TreeMap<E,?>)m).descendingKeyIterator();
         *             else
         *                 return ((TreeMap.NavigableSubMap<E,?>)m).descendingKeyIterator();
         *         }
         */
        // 元素数量
        /*
         * public int size() { return m.size(); }
         */
        // treeMap判断是否为空
        /*
         * public boolean isEmpty() { return m.isEmpty(); }
         */
        // 判断是否包含key o
        /*
         * public boolean contains(Object o) { return m.containsKey(o); }
         */
        // 清空treeMap
        /*
         * public void clear() { m.clear(); }
         */
        // 返回严格小于给定键的最大键；如果没有这样的键，则返回null
        // 获取一个key，该key是遍历当前Map时形参e的前驱
        /*
         * public E lower(E e) { return m.lowerKey(e); }
         */
        // 获取一个key，该key是遍历当前Map时形参e的前驱（包括e本身）
        /*
         * public E floor(E e) { return m.floorKey(e); }
         */
        // 获取一个key，该key是遍历当前Map时形参e的后继（包括e本身）
        /*
         * public E ceiling(E e) { return m.ceilingKey(e); }
         */
        // 获取一个key，该key是遍历当前Map时形参e的后继
        /*
         * public E higher(E e) { return m.higherKey(e); }
         */
        // 返回遍历当前Map时的首个结点的key
        /*
         * public E first() { return m.firstKey(); }
         */
        // 返回最后一个节点的key
        /*
         * public E last() { return m.lastKey(); }
         */
        // 比较器
        /*
         * public Comparator<? super E> comparator() { return m.comparator(); }
         */
        // 出栈第一个元素
        /*
         * public E pollFirst() {
         *             Map.Entry<E,?> e = m.pollFirstEntry();
         *             return (e == null) ? null : e.getKey();
         *         }
         */
        // 出栈最后一个元素
        /*
         * public E pollLast() {
         *             Map.Entry<E,?> e = m.pollLastEntry();
         *             return (e == null) ? null : e.getKey();
         *         }
         */
        // 移除元素o
        /*
         * public boolean remove(Object o) {
         *             int oldSize = size();
         *             m.remove(o);
         *             return size() != oldSize;
         *         }
         */
        // 分割Set
        /*
         * public NavigableSet<E> subSet(E fromElement, boolean fromInclusive,
         *                                       E toElement,   boolean toInclusive) {
         *             return new KeySet<>(m.subMap(fromElement, fromInclusive,
         *                                           toElement,   toInclusive));
         *         }
         */
        // 头Set
        /*
         * public NavigableSet<E> headSet(E toElement, boolean inclusive) {
         *             return new KeySet<>(m.headMap(toElement, inclusive));
         *         }
         */
        // 尾Set
        /*
         * public NavigableSet<E> tailSet(E fromElement, boolean inclusive) {
         *             return new KeySet<>(m.tailMap(fromElement, inclusive));
         *         }
         */
        // 获取[fromElement, toElement)范围内的Set
        /*
         * public SortedSet<E> subSet(E fromElement, E toElement) {
         *             return subSet(fromElement, true, toElement, false);
         *         }
         */
        // 获取【理论区间】上限为toElement(不包含)的Set
        /*
         * public SortedSet<E> headSet(E toElement) {
         *             return headSet(toElement, false);
         *         }
         */
        // 获取【理论区间】下限为fromElement(包含)的Set
        /*
         * public SortedSet<E> tailSet(E fromElement) {
         *             return tailSet(fromElement, true);
         *         }
         */
        // 降序
        /*
         * public NavigableSet<E> descendingSet() {
         *             return new KeySet<>(m.descendingMap());
         *         }
         */
        // 分离器
        /*
         * public Spliterator<E> spliterator() {
         *             return keySpliteratorFor(m);
         *         }
         */
        // PrivateEntryIterator 私有entry迭代器
        // Entry<K,V> next; 下一个元素
        // Entry<K,V> lastReturned; 最后一次返回的元素
        // int expectedModCount; 并发修改异常
        // 构造器
        /*
         * PrivateEntryIterator(Entry<K,V> first) {
         *             expectedModCount = modCount;
         *             lastReturned = null;
         *             next = first;
         *         }
         */
        // 判断是否包含下一个元素
        /*
         * public final boolean hasNext() {
         *             return next != null;
         *         }
         */
        // 获取下一个entry
        /*
         * final Entry<K,V> nextEntry() {
         *             Entry<K,V> e = next;
         *             if (e == null)
         *                 throw new NoSuchElementException();
         *             if (modCount != expectedModCount)
         *                 throw new ConcurrentModificationException();
         *             next = successor(e);
         *             lastReturned = e;
         *             return e;
         *         }
         */
        // 获取前一个元素
        /*
         * final Entry<K,V> prevEntry() {
         *             Entry<K,V> e = next;
         *             if (e == null)
         *                 throw new NoSuchElementException();
         *             if (modCount != expectedModCount)
         *                 throw new ConcurrentModificationException();
         *             next = predecessor(e);
         *             lastReturned = e;
         *             return e;
         *         }
         */
        // EntryIterator
        // entry迭代器
        // 构造
        /*
         * EntryIterator(Entry<K,V> first) {
         *             super(first);
         *         }
         */
        // 获取下一个元素
        /*
         * public Map.Entry<K,V> next() {
         *             return nextEntry();
         *         }
         */
        // ValueIterator
        // value迭代器
        /*
         * ValueIterator(Entry<K,V> first) {
         *             super(first);
         *         }
         */
        // 获取下一个元素
        /*
         * public V next() {
         *             return nextEntry().value;
         *         }
         */
        // KeyIterator
        // key迭代器
        // 构造
        /*
         * KeyIterator(Entry<K,V> first) {
         *             super(first);
         *         }
         */
        // 获取下一个元素
        /*
         * public K next() {
         *             return nextEntry().key;
         *         }
         */
        // DescendingKeyIterator 降序迭代器
        // 构造器
        /*
         * DescendingKeyIterator(Entry<K,V> first) {
         *             super(first);
         *         }
         */
        // 获取下一个元素
        /*
         * public K next() {
         *             return prevEntry().key;
         *         }
         */
        // 移除元素
        /*
         * public void remove() {
         *             if (lastReturned == null)
         *                 throw new IllegalStateException();
         *             if (modCount != expectedModCount)
         *                 throw new ConcurrentModificationException();
         *             deleteEntry(lastReturned);
         *             lastReturned = null;
         *             expectedModCount = modCount;
         *         }
         */
        // NavigableSubMap
        // 内部类
        // EntrySetView
        // 获取元素数量
        /*
         * public int size() {
         *                 if (fromStart && toEnd)
         *                     return m.size();
         *                 if (size == -1 || sizeModCount != m.modCount) {
         *                     sizeModCount = m.modCount;
         *                     size = 0;
         *                     Iterator<?> i = iterator();
         *                     while (i.hasNext()) {
         *                         size++;
         *                         i.next();
         *                     }
         *                 }
         *                 return size;
         *             }
         */
        // 判断是否为空
        /*
         * public boolean isEmpty() {
         *                 TreeMap.Entry<K,V> n = absLowest();
         *                 return n == null || tooHigh(n.key);
         *             }
         */
        // 判断是否包含entry o
        /*
         * public boolean contains(Object o) {
         *                 if (!(o instanceof Map.Entry))
         *                     return false;
         *                 Map.Entry<?,?> entry = (Map.Entry<?,?>) o;
         *                 Object key = entry.getKey();
         *                 if (!inRange(key))
         *                     return false;
         *                 TreeMap.Entry<?,?> node = m.getEntry(key);
         *                 return node != null &&
         *                     valEquals(node.getValue(), entry.getValue());
         *             }
         */
        // 移除元素 o
        /*
         * public boolean remove(Object o) {
         *                 if (!(o instanceof Map.Entry))
         *                     return false;
         *                 Map.Entry<?,?> entry = (Map.Entry<?,?>) o;
         *                 Object key = entry.getKey();
         *                 if (!inRange(key))
         *                     return false;
         *                 TreeMap.Entry<K,V> node = m.getEntry(key);
         *                 if (node!=null && valEquals(node.getValue(),
         *                                             entry.getValue())) {
         *                     m.deleteEntry(node);
         *                     return true;
         *                 }
         *                 return false;
         *             }
         */
        // private transient int size = -1, sizeModCount; 元素数量、modCount
        // SubMapIterator
        // 迭代器构造
        /*
         * SubMapIterator(TreeMap.Entry<K,V> first,
         *                            TreeMap.Entry<K,V> fence) {
         *                 expectedModCount = m.modCount;
         *                 lastReturned = null;
         *                 next = first;
         *                 fenceKey = fence == null ? UNBOUNDED : fence.key;
         *             }
         */
        // 是否拥有下一个元素
        /*
         * public final boolean hasNext() {
         *                 return next != null && next.key != fenceKey;
         *             }
         */
        // 获取下一个元素
        /*
         * final TreeMap.Entry<K,V> nextEntry() {
         *                 TreeMap.Entry<K,V> e = next;
         *                 if (e == null || e.key == fenceKey)
         *                     throw new NoSuchElementException();
         *                 if (m.modCount != expectedModCount)
         *                     throw new ConcurrentModificationException();
         *                 next = successor(e);
         *                 lastReturned = e;
         *                 return e;
         *             }
         */
        // 获取上一个元素
        /*
         * final TreeMap.Entry<K,V> prevEntry() {
         *                 TreeMap.Entry<K,V> e = next;
         *                 if (e == null || e.key == fenceKey)
         *                     throw new NoSuchElementException();
         *                 if (m.modCount != expectedModCount)
         *                     throw new ConcurrentModificationException();
         *                 next = predecessor(e);
         *                 lastReturned = e;
         *                 return e;
         *             }
         */
        // 移除升序
        /*
         * final void removeAscending() {
         *                 if (lastReturned == null)
         *                     throw new IllegalStateException();
         *                 if (m.modCount != expectedModCount)
         *                     throw new ConcurrentModificationException();
         *                 // deleted entries are replaced by their successors
         *                 if (lastReturned.left != null && lastReturned.right != null)
         *                     next = lastReturned;
         *                 m.deleteEntry(lastReturned);
         *                 lastReturned = null;
         *                 expectedModCount = m.modCount;
         *             }
         */
        // 移除降序
        /*
         * final void removeDescending() {
         *                 if (lastReturned == null)
         *                     throw new IllegalStateException();
         *                 if (m.modCount != expectedModCount)
         *                     throw new ConcurrentModificationException();
         *                 m.deleteEntry(lastReturned);
         *                 lastReturned = null;
         *                 expectedModCount = m.modCount;
         *             }
         */
        // TreeMap.Entry<K,V> lastReturned; 最后一个获取的元素
        // TreeMap.Entry<K,V> next; 下一个将要返回的元素
        // final Object fenceKey; 栅栏键
        // int expectedModCount; 并发修改异常
        // SubMapEntryIterator
        // 构造
        /*
         * SubMapEntryIterator(TreeMap.Entry<K,V> first,
         *                                 TreeMap.Entry<K,V> fence) {
         *                 super(first, fence);
         *             }
         */
        // 获取下一个entry
        /*
         * public Map.Entry<K,V> next() {
         *                 return nextEntry();
         *             }
         */
        // 移除升序
        /*
         * public void remove() {
         *                 removeAscending();
         *             }
         */
        // DescendingSubMapEntryIterator 降序迭代器
        // 构造器
        /*
         * DescendingSubMapEntryIterator(TreeMap.Entry<K,V> last,
         *                                           TreeMap.Entry<K,V> fence) {
         *                 super(last, fence);
         *             }
         */
        // 获取下一个entry
        /*
         * public Map.Entry<K,V> next() {
         *                 return prevEntry();
         *             }
         */
        // 移除降序
        /*
         * public void remove() {
         *                 removeDescending();
         *             }
         */
        // key迭代器 SubMapKeyIterator
        // 构造
        /*
         * SubMapKeyIterator(TreeMap.Entry<K,V> first,
         *                               TreeMap.Entry<K,V> fence) {
         *                 super(first, fence);
         *             }
         */
        // 获取下一个key
        /*
         * public K next() {
         *                 return nextEntry().key;
         *             }
         */
        // 移除升序
        /*
         * public void remove() {
         *                 removeAscending();
         *             }
         */
        // 分离器
        /*
         * public Spliterator<K> trySplit() {
         *                 return null;
         *             }
         */
        // 遍历剩余元素执行action
        /*
         * public void forEachRemaining(Consumer<? super K> action) {
         *                 while (hasNext())
         *                     action.accept(next());
         *             }
         */
        // 遍历所有元素执行action
        /*
         * public boolean tryAdvance(Consumer<? super K> action) {
         *                 if (hasNext()) {
         *                     action.accept(next());
         *                     return true;
         *                 }
         *                 return false;
         *             }
         */
        // 估计大小
        /*
         * public long estimateSize() {
         *                 return Long.MAX_VALUE;
         *             }
         */
        // 特征
        /*
         * public int characteristics() {
         *                 return Spliterator.DISTINCT | Spliterator.ORDERED |
         *                     Spliterator.SORTED;
         *             }
         */
        // 比较器
        /*
         * public final Comparator<? super K>  getComparator() {
         *                 return NavigableSubMap.this.comparator();
         *             }
         */
        // 降序key迭代器 DescendingSubMapKeyIterator
        // 构造
        /*
         * DescendingSubMapKeyIterator(TreeMap.Entry<K,V> last,
         *                                         TreeMap.Entry<K,V> fence) {
         *                 super(last, fence);
         *             }
         */
        // 下一个key
        /*
         * public K next() {
         *                 return prevEntry().key;
         *             }
         */
        // 移除降序
        /*
         * public void remove() {
         *                 removeDescending();
         *             }
         */
        // 分离器
        /*
         * public Spliterator<K> trySplit() {
         *                 return null;
         *             }
         */
        // 遍历剩余元素执行action
        /*
         * public void forEachRemaining(Consumer<? super K> action) {
         *                 while (hasNext())
         *                     action.accept(next());
         *             }
         */
        // 对所有元素执行action
        /*
         * public boolean tryAdvance(Consumer<? super K> action) {
         *                 if (hasNext()) {
         *                     action.accept(next());
         *                     return true;
         *                 }
         *                 return false;
         *             }
         */
        // 预计容量
        /*
         * public long estimateSize() {
         *                 return Long.MAX_VALUE;
         *             }
         */
        // 特点
        /*
         * public int characteristics() {
         *                 return Spliterator.DISTINCT | Spliterator.ORDERED;
         *             }
         */
        // 构造
        /*
         * NavigableSubMap(TreeMap<K,V> m,
         *                         boolean fromStart, K lo, boolean loInclusive,
         *                         boolean toEnd,     K hi, boolean hiInclusive) {
         *             if (!fromStart && !toEnd) {
         *                 if (m.compare(lo, hi) > 0)
         *                     throw new IllegalArgumentException("fromKey > toKey");
         *             } else {
         *                 if (!fromStart) // type check
         *                     m.compare(lo, lo);
         *                 if (!toEnd)
         *                     m.compare(hi, hi);
         *             }
         *
         *             this.m = m;
         *             this.fromStart = fromStart;
         *             this.lo = lo;
         *             this.loInclusive = loInclusive;
         *             this.toEnd = toEnd;
         *             this.hi = hi;
         *             this.hiInclusive = hiInclusive;
         *         }
         */
        // 判断指定的key是否在【实际区间】左侧溢出
        /*
         * final boolean tooLow(Object key) {
         *             if (!fromStart) {
         *                 int c = m.compare(key, lo);
         *                 if (c < 0 || (c == 0 && !loInclusive))
         *                     return true;
         *             }
         *             return false;
         *         }
         */
        // 判断指定的key是否在【实际区间】右侧溢出
        /*
         * final boolean tooHigh(Object key) {
         *             if (!toEnd) {
         *                 int c = m.compare(key, hi);
         *                 if (c > 0 || (c == 0 && !hiInclusive))
         *                     return true;
         *             }
         *             return false;
         *         }
         */
        // 子视图申请闭区间时，判断指定的key是否位于父视图的【实际区间】内[既没有上溢，也没有下溢]
        /*
         * final boolean inRange(Object key) {
         *             return !tooLow(key) && !tooHigh(key);
         *         }
         */
        // 子视图申请开区间时，判断指定的key是否位于父视图的【实际区间】内[既没有上溢，也没有下溢]
        /*
         * final boolean inClosedRange(Object key) {
         *             return (fromStart || m.compare(key, lo) >= 0)
         *                 && (toEnd || m.compare(hi, key) >= 0);
         *         }
         */
        // 获取【backing区间】中尽量靠左侧的【可视】元素
        /*
         * final TreeMap.Entry<K,V> absLowest() {
         *             TreeMap.Entry<K,V> e =
         *                 (fromStart ?  m.getFirstEntry() :
         *                  (loInclusive ? m.getCeilingEntry(lo) :
         *                                 m.getHigherEntry(lo)));
         *             return (e == null || tooHigh(e.key)) ? null : e;
         *         }
         */
        // 获取【backing区间】中尽量靠右侧的【可视】元素
        /*
         * final TreeMap.Entry<K,V> absHighest() {
         *             TreeMap.Entry<K,V> e =
         *                 (toEnd ?  m.getLastEntry() :
         *                  (hiInclusive ?  m.getFloorEntry(hi) :
         *                                  m.getLowerEntry(hi)));
         *             return (e == null || tooLow(e.key)) ? null : e;
         *         }
         */
        // 获取【backing区间】中尽量靠左侧的，且其targetKey>=key的【可视】元素
        // （这里的关系运算符标记的是元素遍历的先后关系）
        /*
         * final TreeMap.Entry<K,V> absCeiling(K key) {
         *             if (tooLow(key))
         *                 return absLowest();
         *             TreeMap.Entry<K,V> e = m.getCeilingEntry(key);
         *             return (e == null || tooHigh(e.key)) ? null : e;
         *         }
         */
        // 获取【backing区间】中尽量靠左侧的，且其targetKey>key的【可视】元素
        // （这里的关系运算符标记的是元素遍历的先后关系）
        /*
         * final TreeMap.Entry<K,V> absHigher(K key) {
         *             if (tooLow(key))
         *                 return absLowest();
         *             TreeMap.Entry<K,V> e = m.getHigherEntry(key);
         *             return (e == null || tooHigh(e.key)) ? null : e;
         *         }
         */
        // 获取【backing区间】中尽量靠右侧的，且其targetKey<=key的【可视】元素
        // （这里的关系运算符标记的是元素遍历的先后关系）
        /*
         * final TreeMap.Entry<K,V> absFloor(K key) {
         *             if (tooHigh(key))
         *                 return absHighest();
         *             TreeMap.Entry<K,V> e = m.getFloorEntry(key);
         *             return (e == null || tooLow(e.key)) ? null : e;
         *         }
         */
        // 获取【backing区间】中尽量靠右侧的，且其targetKey<key的【可视】元素
        // （这里的关系运算符标记的是元素遍历的先后关系）
        /*
         * final TreeMap.Entry<K,V> absLower(K key) {
         *             if (tooHigh(key))
         *                 return absHighest();
         *             TreeMap.Entry<K,V> e = m.getLowerEntry(key);
         *             return (e == null || tooLow(e.key)) ? null : e;
         *         }
         */
        // 在【backing区间】上获取【理论区间】的上限屏障（向左越过该屏障就会进入【理论区间】）
        /*
         * final TreeMap.Entry<K,V> absHighFence() {
         *             return (toEnd ? null : (hiInclusive ?
         *                                     m.getHigherEntry(hi) :
         *                                     m.getCeilingEntry(hi)));
         *         }
         */
        // TODO 20210111
    }
}
