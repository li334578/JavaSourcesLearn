package com.company.sources.JavaUtil.collectionClass.mapclass.hashMap_test;

import java.util.HashMap;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : HashMap
 * @date : 2021-01-07 20:44:51
 */
public class HashMapExample1 {
    public static void main(String[] args) {
        /**
         * HashMap结构：哈希数组+链表/红黑树，key和value均可以为null
         * 存储元素时，需要调用key的hashCode()方法，计算出一个哈希值
         * 哈希值相同的元素，必定位于同一个哈希槽（链）上，但不能确定这两个元素是不是同位元素
         * 在进一步判断key如果相等（必要时需要调用equals()方法）时，才能确定这两个元素属于同位元素
         * 如果是存储同位元素，需要考虑是否允许覆盖旧值的问题
         * 哈希值不同的元素，它们也可能位于同一个哈希槽（链）上，但它们肯定不是同位元素
         * 注：HashMap非线程安全。如果需要考虑并发，则需要使用ConcurrentHashMap
         */
        // 内部类
        // 基础节点
        // Node<K,V> implements Map.Entry<K,V>
        // final int hash; hash值
        // final K key; key值
        // V value; value值
        // Node<K,V> next; 下一个节点
        // 构造方法
        /*
         * Node(int hash, K key, V value, Node<K,V> next) {
         *             this.hash = hash;
         *             this.key = key;
         *             this.value = value;
         *             this.next = next;
         *         }
         */
        // 获取key
        /*
         * public final K getKey()        { return key; }
         */
        // 获取value
        /*
         * public final V getValue()      { return value; }
         */
        // toString
        /*
         * public final String toString() { return key + "=" + value; }
         */
        // hashcode
        /*
         * public final int hashCode() {
         *             return Objects.hashCode(key) ^ Objects.hashCode(value);
         *         }
         */
        // 设置Node的value
        /*
         * public final V setValue(V newValue) {
         *             V oldValue = value;
         *             value = newValue;
         *             return oldValue;
         *         }
         */
        // equals
        /*
         * public final boolean equals(Object o) {
         *             if (o == this)
         *                 return true;
         *             if (o instanceof Map.Entry) {
         *                 Map.Entry<?,?> e = (Map.Entry<?,?>)o;
         *                 if (Objects.equals(key, e.getKey()) &&
         *                     Objects.equals(value, e.getValue()))
         *                     return true;
         *             }
         *             return false;
         *         }
         */
        // 内部类KeySet
        // KeySet extends AbstractSet<K>
        // 获取元素数量
        /*
         * public final int size()                 { return size; }
         */
        // 清空HashMap
        /*
         * public final void clear()               { HashMap.this.clear(); }
         */
        // 获取keySet迭代器
        /*
         * public final Iterator<K> iterator()     { return new KeyIterator(); }
         */
        // 判断keySet是否包含key值
        /*
         * public final boolean contains(Object o) { return containsKey(o); }
         */
        // 移除key
        /*
         * public final boolean remove(Object key) {
         *             return removeNode(hash(key), key, null, false, true) != null;
         *         }
         */
        // 分割器 Spliterator
        /*
         * public final Spliterator<K> spliterator() {
         *             return new KeySpliterator<>(HashMap.this, 0, -1, 0, 0);
         *         }
         */
        // 迭代元素执行action
        /*
         * public final void forEach(Consumer<? super K> action) {
         *             Node<K,V>[] tab;
         *             if (action == null)
         *                 throw new NullPointerException();
         *             if (size > 0 && (tab = table) != null) {
         *                 int mc = modCount;
         *                 for (int i = 0; i < tab.length; ++i) {
         *                     for (Node<K,V> e = tab[i]; e != null; e = e.next)
         *                         action.accept(e.key);
         *                 }
         *                 if (modCount != mc)
         *                     throw new ConcurrentModificationException();
         *             }
         *         }
         */
        // 内部类values
        // Values extends AbstractCollection<V>
        // 获取元素数量
        /*
         * public final int size()                 { return size; }
         */
        // 清空HashMap
        /*
         * public final void clear()               { HashMap.this.clear(); }
         */
        // 获取value迭代器
        /*
         * public final Iterator<V> iterator()     { return new ValueIterator(); }
         */
        // 判断是否包含value值
        /*
         * public final boolean contains(Object o) { return containsValue(o); }
         */
        // 分离器 spliterator
        /*
         * public final Spliterator<V> spliterator() {
         *             return new ValueSpliterator<>(HashMap.this, 0, -1, 0, 0);
         *         }
         */
        // 遍历执行action
        /*
         * public final void forEach(Consumer<? super V> action) {
         *             Node<K,V>[] tab;
         *             if (action == null)
         *                 throw new NullPointerException();
         *             if (size > 0 && (tab = table) != null) {
         *                 int mc = modCount;
         *                 for (int i = 0; i < tab.length; ++i) {
         *                     for (Node<K,V> e = tab[i]; e != null; e = e.next)
         *                         action.accept(e.value);
         *                 }
         *                 if (modCount != mc)
         *                     throw new ConcurrentModificationException();
         *             }
         *         }
         */
        // 内部类 EntrySet
        // EntrySet extends AbstractSet<Map.Entry<K,V>>
        // 获取元素数量
        /*
         * public final int size()                 { return size; }
         */
        // 清空HashMap
        /*
         * public final void clear()               { HashMap.this.clear(); }
         */
        // 获取entry迭代器
        /*
         * public final Iterator<Map.Entry<K,V>> iterator() {
         *             return new EntryIterator();
         *         }
         */
        // 判断是否包含 entry值 o
        /*
         * public final boolean contains(Object o) {
         *             if (!(o instanceof Map.Entry))
         *                 return false;
         *             Map.Entry<?,?> e = (Map.Entry<?,?>) o;
         *             Object key = e.getKey();
         *             Node<K,V> candidate = getNode(hash(key), key);
         *             return candidate != null && candidate.equals(e);
         *         }
         */
        // 移除entry值o
        /*
         * public final boolean remove(Object o) {
         *             if (o instanceof Map.Entry) {
         *                 Map.Entry<?,?> e = (Map.Entry<?,?>) o;
         *                 Object key = e.getKey();
         *                 Object value = e.getValue();
         *                 return removeNode(hash(key), key, value, true, true) != null;
         *             }
         *             return false;
         *         }
         */
        // entry分离器
        /*
         * public final Spliterator<Map.Entry<K,V>> spliterator() {
         *             return new EntrySpliterator<>(HashMap.this, 0, -1, 0, 0);
         *         }
         */
        // 遍历执行action
        /*
         * public final void forEach(Consumer<? super Map.Entry<K,V>> action) {
         *             Node<K,V>[] tab;
         *             if (action == null)
         *                 throw new NullPointerException();
         *             if (size > 0 && (tab = table) != null) {
         *                 int mc = modCount;
         *                 for (int i = 0; i < tab.length; ++i) {
         *                     for (Node<K,V> e = tab[i]; e != null; e = e.next)
         *                         action.accept(e);
         *                 }
         *                 if (modCount != mc)
         *                     throw new ConcurrentModificationException();
         *             }
         *         }
         */
        // 内部类 HashIterator迭代器
        // Node<K,V> next;        // next entry to return 下一个将要返回的条目
        // Node<K,V> current;     // current entry 当前条目
        // int expectedModCount;  // for fast-fail 并发修改异常
        // int index;             // current slot 当前插槽索引
        // 无参构造器
        /*
         * HashIterator() {
         *             expectedModCount = modCount;
         *             Node<K,V>[] t = table;
         *             current = next = null;
         *             index = 0;
         *             if (t != null && size > 0) { // advance to first entry
         *                 do {} while (index < t.length && (next = t[index++]) == null);
         *             }
         *         }
         */
        // 是否拥有下一个元素
        /*
         * public final boolean hasNext() {
         *             return next != null;
         *         }
         */
        // 获取下一个节点的值
        /*
         * final Node<K,V> nextNode() {
         *             Node<K,V>[] t;
         *             Node<K,V> e = next;
         *             if (modCount != expectedModCount)
         *                 throw new ConcurrentModificationException();
         *             if (e == null)
         *                 throw new NoSuchElementException();
         *             if ((next = (current = e).next) == null && (t = table) != null) {
         *                 do {} while (index < t.length && (next = t[index++]) == null);
         *             }
         *             return e;
         *         }
         */
        // 清空元素
        /*
         * public final void remove() {
         *             Node<K,V> p = current;
         *             if (p == null)
         *                 throw new IllegalStateException();
         *             if (modCount != expectedModCount)
         *                 throw new ConcurrentModificationException();
         *             current = null;
         *             K key = p.key;
         *             removeNode(hash(key), key, null, false, false);
         *             expectedModCount = modCount;
         *         }
         */
        // key迭代器 KeyIterator
        // extends HashIterator
        //        implements Iterator<K>
        // 获取下一个节点的key值
        /*
         * public final K next() { return nextNode().key; }
         */
        // value迭代器 ValueIterator
        // extends HashIterator
        //        implements Iterator<V>
        // 获取下一个节点的value
        // public final V next() { return nextNode().value; }
        // entry迭代器 EntryIterator
        // extends HashIterator
        //        implements Iterator<Map.Entry<K,V>>
        // 获取下一个节点 entry
        // public final Map.Entry<K,V> next() { return nextNode(); }
        // HashMapSpliterator hashMap分离器
        // final HashMap<K,V> map; 节点值
        // Node<K,V> current;          // current node 当前节点值
        // int index;                  // current index, modified on advance/split 当前索引
        // int fence;                  // one past last index 最后一个索引
        // int est;                    // size estimate 估算容量
        // int expectedModCount;       // for comodification checks 检查并发修改异常
        // 构造器
        /*
         * HashMapSpliterator(HashMap<K,V> m, int origin,
         *                            int fence, int est,
         *                            int expectedModCount) {
         *             this.map = m;
         *             this.index = origin;
         *             this.fence = fence;
         *             this.est = est;
         *             this.expectedModCount = expectedModCount;
         *         }
         */
        // 初始化 首次使用时初始化篱笆和大小
        /*
         * final int getFence() { // initialize fence and size on first use
         *             int hi;
         *             if ((hi = fence) < 0) {
         *                 HashMap<K,V> m = map;
         *                 est = m.size;
         *                 expectedModCount = m.modCount;
         *                 Node<K,V>[] tab = m.table;
         *                 hi = fence = (tab == null) ? 0 : tab.length;
         *             }
         *             return hi;
         *         }
         */
        // 获取预估大小
        /*
         * public final long estimateSize() {
         *             getFence(); // force init
         *             return (long) est;
         *         }
         */
        // key的分离器 KeySpliterator
        // extends HashMapSpliterator<K,V>
        //        implements Spliterator<K>
        // 构造器
        /*
         * KeySpliterator(HashMap<K,V> m, int origin, int fence, int est,
         *                        int expectedModCount) {
         *             super(m, origin, fence, est, expectedModCount);
         *         }
         */
        // 尝试分割key的分离器
        /*
         * public KeySpliterator<K,V> trySplit() {
         *             int hi = getFence(), lo = index, mid = (lo + hi) >>> 1;
         *             return (lo >= mid || current != null) ? null :
         *                 new KeySpliterator<>(map, lo, index = mid, est >>>= 1,
         *                                         expectedModCount);
         *         }
         */
        // 遍历剩余元素执行action
        /*
         * public void forEachRemaining(Consumer<? super K> action) {
         *             int i, hi, mc;
         *             if (action == null)
         *                 throw new NullPointerException();
         *             HashMap<K,V> m = map;
         *             Node<K,V>[] tab = m.table;
         *             if ((hi = fence) < 0) {
         *                 mc = expectedModCount = m.modCount;
         *                 hi = fence = (tab == null) ? 0 : tab.length;
         *             }
         *             else
         *                 mc = expectedModCount;
         *             if (tab != null && tab.length >= hi &&
         *                 (i = index) >= 0 && (i < (index = hi) || current != null)) {
         *                 Node<K,V> p = current;
         *                 current = null;
         *                 do {
         *                     if (p == null)
         *                         p = tab[i++];
         *                     else {
         *                         action.accept(p.key);
         *                         p = p.next;
         *                     }
         *                 } while (p != null || i < hi);
         *                 if (m.modCount != mc)
         *                     throw new ConcurrentModificationException();
         *             }
         *         }
         */
        // 对所有元素执行action
        /*
         * public boolean tryAdvance(Consumer<? super K> action) {
         *     int hi;
         *     if (action == null)
         *         throw new NullPointerException();
         *     Node<K,V>[] tab = map.table;
         *     if (tab != null && tab.length >= (hi = getFence()) && index >= 0) {
         *         while (current != null || index < hi) {
         *             if (current == null)
         *                 current = tab[index++];
         *             else {
         *                 K k = current.key;
         *                 current = current.next;
         *                 action.accept(k);
         *                 if (map.modCount != expectedModCount)
         *                     throw new ConcurrentModificationException();
         *                 return true;
         *             }
         *         }
         *     }
         *     return false;
         * }
         */
        // 特点
        /*
         * public int characteristics() {
         *             return (fence < 0 || est == map.size ? Spliterator.SIZED : 0) |
         *                 Spliterator.DISTINCT;
         *         }
         */
        // value分离器 ValueSpliterator
        // extends HashMapSpliterator<K,V>
        //        implements Spliterator<V>
        // value分离器构造方法
        /*
         * ValueSpliterator(HashMap<K,V> m, int origin, int fence, int est,
         *                          int expectedModCount) {
         *             super(m, origin, fence, est, expectedModCount);
         *         }
         */
        // 尝试分割value分离器
        /*
         * public ValueSpliterator<K,V> trySplit() {
         *             int hi = getFence(), lo = index, mid = (lo + hi) >>> 1;
         *             return (lo >= mid || current != null) ? null :
         *                 new ValueSpliterator<>(map, lo, index = mid, est >>>= 1,
         *                                           expectedModCount);
         *         }
         */
        // 对于剩余元素执行action
        /*
         * public void forEachRemaining(Consumer<? super V> action) {
         *             int i, hi, mc;
         *             if (action == null)
         *                 throw new NullPointerException();
         *             HashMap<K,V> m = map;
         *             Node<K,V>[] tab = m.table;
         *             if ((hi = fence) < 0) {
         *                 mc = expectedModCount = m.modCount;
         *                 hi = fence = (tab == null) ? 0 : tab.length;
         *             }
         *             else
         *                 mc = expectedModCount;
         *             if (tab != null && tab.length >= hi &&
         *                 (i = index) >= 0 && (i < (index = hi) || current != null)) {
         *                 Node<K,V> p = current;
         *                 current = null;
         *                 do {
         *                     if (p == null)
         *                         p = tab[i++];
         *                     else {
         *                         action.accept(p.value);
         *                         p = p.next;
         *                     }
         *                 } while (p != null || i < hi);
         *                 if (m.modCount != mc)
         *                     throw new ConcurrentModificationException();
         *             }
         *         }
         */
        // 遍历所有元素执行action
        /*
         * public boolean tryAdvance(Consumer<? super V> action) {
         *             int hi;
         *             if (action == null)
         *                 throw new NullPointerException();
         *             Node<K,V>[] tab = map.table;
         *             if (tab != null && tab.length >= (hi = getFence()) && index >= 0) {
         *                 while (current != null || index < hi) {
         *                     if (current == null)
         *                         current = tab[index++];
         *                     else {
         *                         V v = current.value;
         *                         current = current.next;
         *                         action.accept(v);
         *                         if (map.modCount != expectedModCount)
         *                             throw new ConcurrentModificationException();
         *                         return true;
         *                     }
         *                 }
         *             }
         *             return false;
         *         }
         */
        // 特点
        /*
         * public int characteristics() {
         *             return (fence < 0 || est == map.size ? Spliterator.SIZED : 0);
         *         }
         */
        // entry分离器 EntrySpliterator<K,V>
        // extends HashMapSpliterator<K,V>
        //        implements Spliterator<Map.Entry<K,V>>
        // entry分离器 构造器
        /*
         * EntrySpliterator(HashMap<K,V> m, int origin, int fence, int est,
         *                          int expectedModCount) {
         *             super(m, origin, fence, est, expectedModCount);
         *         }
         */
        // 尝试分离
        /*
         * public EntrySpliterator<K,V> trySplit() {
         *             int hi = getFence(), lo = index, mid = (lo + hi) >>> 1;
         *             return (lo >= mid || current != null) ? null :
         *                 new EntrySpliterator<>(map, lo, index = mid, est >>>= 1,
         *                                           expectedModCount);
         *         }
         */
        // 对剩余元素执行action
        /*
         * public void forEachRemaining(Consumer<? super Map.Entry<K,V>> action) {
         *             int i, hi, mc;
         *             if (action == null)
         *                 throw new NullPointerException();
         *             HashMap<K,V> m = map;
         *             Node<K,V>[] tab = m.table;
         *             if ((hi = fence) < 0) {
         *                 mc = expectedModCount = m.modCount;
         *                 hi = fence = (tab == null) ? 0 : tab.length;
         *             }
         *             else
         *                 mc = expectedModCount;
         *             if (tab != null && tab.length >= hi &&
         *                 (i = index) >= 0 && (i < (index = hi) || current != null)) {
         *                 Node<K,V> p = current;
         *                 current = null;
         *                 do {
         *                     if (p == null)
         *                         p = tab[i++];
         *                     else {
         *                         action.accept(p);
         *                         p = p.next;
         *                     }
         *                 } while (p != null || i < hi);
         *                 if (m.modCount != mc)
         *                     throw new ConcurrentModificationException();
         *             }
         *         }
         */
        // 对所有元素执行action
        /*
         * public boolean tryAdvance(Consumer<? super Map.Entry<K,V>> action) {
         *             int hi;
         *             if (action == null)
         *                 throw new NullPointerException();
         *             Node<K,V>[] tab = map.table;
         *             if (tab != null && tab.length >= (hi = getFence()) && index >= 0) {
         *                 while (current != null || index < hi) {
         *                     if (current == null)
         *                         current = tab[index++];
         *                     else {
         *                         Node<K,V> e = current;
         *                         current = current.next;
         *                         action.accept(e);
         *                         if (map.modCount != expectedModCount)
         *                             throw new ConcurrentModificationException();
         *                         return true;
         *                     }
         *                 }
         *             }
         *             return false;
         *         }
         */
        // 特点
        /*
         * public int characteristics() {
         *             return (fence < 0 || est == map.size ? Spliterator.SIZED : 0) |
         *                 Spliterator.DISTINCT;
         *         }
         */
        // 内部类 树形节点 TreeNode
        // TreeNode<K,V> parent;  // red-black tree links 父节点
        // TreeNode<K,V> left; 左节点
        // TreeNode<K,V> right; 右节点
        // TreeNode<K,V> prev;    前方结点 // needed to unlink next upon deletion
        // boolean red; // 是否红节点
        // 构造器
        /*
         * TreeNode(int hash, K key, V val, Node<K,V> next) {
         *             super(hash, key, val, next);
         *         }
         */
        // 返回包含此节点的树的根。 前驱节点为null
        /*
         * final TreeNode<K,V> root() {
         *             for (TreeNode<K,V> r = this, p;;) {
         *                 if ((p = r.parent) == null)
         *                     return r;
         *                 r = p;
         *             }
         *         }
         */
        // 确保给定的根是其bin的第一个节点。
        // 把红黑树的根节点设为 其所在的数组槽 的第一个元素
        // 首先明确：TreeNode既是一个红黑树结构，也是一个双链表结构
        // 这个方法里做的事情，就是保证树的根节点一定也要成为链表的首节点
        /*
         * static <K,V> void moveRootToFront(Node<K,V>[] tab, TreeNode<K,V> root) {
         *             int n;
         *             if (root != null && tab != null && (n = tab.length) > 0) { // 根节点不为空 并且 HashMap的元素数组不为空
         *                 int index = (n - 1) & root.hash; // 根据根节点的Hash值 和 HashMap的元素数组长度  取得根节点在数组中的位置
         *                 TreeNode<K,V> first = (TreeNode<K,V>)tab[index]; // 首先取得该位置上的第一个节点对象
         *                 if (root != first) { // 如果该节点对象 与 根节点对象 不同
         *                     Node<K,V> rn; // 定义根节点的后一个节点
         *                     tab[index] = root; // 把元素数组index位置的元素替换为根节点对象
         *                     TreeNode<K,V> rp = root.prev; // 获取根节点对象的前一个节点
         *                     if ((rn = root.next) != null) // 如果后节点不为空
         *                         ((TreeNode<K,V>)rn).prev = rp; // root后节点的前节点  指向到 root的前节点，相当于把root从链表中摘除
         *                     if (rp != null) // 如果root的前节点不为空
         *                         rp.next = rn; // root前节点的后节点 指向到 root的后节点
         *                     if (first != null) // 如果数组该位置上原来的元素不为空
         *                         first.prev = root; // 这个原有的元素的 前节点 指向到 root，相当于root目前位于链表的首位
         *                     root.next = first; // 原来的第一个节点现在作为root的下一个节点，变成了第二个节点
         *                     root.prev = null; // 首节点没有前节点
         *                 }
         *                  这一步是防御性的编程
         *                  校验TreeNode对象是否满足红黑树和双链表的特性
         *                  如果这个方法校验不通过：可能是因为用户编程失误，破坏了结构（例如：并发场景下）；也可能是TreeNode的实现有问题（这个是理论上的以防万一）；
         *                 assert checkInvariants(root);
         *             }
         *         }
         */
        // 查找具有给定哈希值和键的从根p开始的节点
        /*
         * final TreeNode<K,V> find(int h, Object k, Class<?> kc) {
         *             TreeNode<K,V> p = this;
         *             do {
         *                 int ph, dir; K pk;
         *                 TreeNode<K,V> pl = p.left, pr = p.right, q;
         *                 if ((ph = p.hash) > h)
         *                     p = pl;
         *                 else if (ph < h)
         *                     p = pr;
         *                 else if ((pk = p.key) == k || (k != null && k.equals(pk)))
         *                     return p;
         *                 else if (pl == null)
         *                     p = pr;
         *                 else if (pr == null)
         *                     p = pl;
         *                 else if ((kc != null ||
         *                           (kc = comparableClassFor(k)) != null) &&
         *                          (dir = compareComparables(kc, k, pk)) != 0)
         *                     p = (dir < 0) ? pl : pr;
         *                 else if ((q = pr.find(h, k, kc)) != null)
         *                     return q;
         *                 else
         *                     p = pl;
         *             } while (p != null);
         *             return null;
         *         }
         */
        // 查找根节点
        /*
         * final TreeNode<K,V> getTreeNode(int h, Object k) {
         *             return ((parent != null) ? root() : this).find(h, k, null);
         *         }
         */
        // 破译实用程序，用于在hashCodes相等且不可比较时对插入进行排序
        /*
         * static int tieBreakOrder(Object a, Object b) {
         *             int d;
         *             if (a == null || b == null ||
         *                 (d = a.getClass().getName().
         *                  compareTo(b.getClass().getName())) == 0)
         *                 d = (System.identityHashCode(a) <= System.identityHashCode(b) ?
         *                      -1 : 1);
         *             return d;
         *         }
         */
        // 从该节点链接的节点的表单树。
        /*
         * final void treeify(Node<K,V>[] tab) {
         *             TreeNode<K,V> root = null;
         *             for (TreeNode<K,V> x = this, next; x != null; x = next) {
         *                 next = (TreeNode<K,V>)x.next;
         *                 x.left = x.right = null;
         *                 if (root == null) {
         *                     x.parent = null;
         *                     x.red = false;
         *                     root = x;
         *                 }
         *                 else {
         *                     K k = x.key;
         *                     int h = x.hash;
         *                     Class<?> kc = null;
         *                     for (TreeNode<K,V> p = root;;) {
         *                         int dir, ph;
         *                         K pk = p.key;
         *                         if ((ph = p.hash) > h)
         *                             dir = -1;
         *                         else if (ph < h)
         *                             dir = 1;
         *                         else if ((kc == null &&
         *                                   (kc = comparableClassFor(k)) == null) ||
         *                                  (dir = compareComparables(kc, k, pk)) == 0)
         *                             dir = tieBreakOrder(k, pk);
         *
         *                         TreeNode<K,V> xp = p;
         *                         if ((p = (dir <= 0) ? p.left : p.right) == null) {
         *                             x.parent = xp;
         *                             if (dir <= 0)
         *                                 xp.left = x;
         *                             else
         *                                 xp.right = x;
         *                             root = balanceInsertion(root, x);
         *                             break;
         *                         }
         *                     }
         *                 }
         *             }
         *             moveRootToFront(tab, root);
         *         }
         */
        // 返回非TreeNode列表，该列表替换从该节点链接的非TreeNode
        /*
         * final Node<K,V> untreeify(HashMap<K,V> map) {
         *             Node<K,V> hd = null, tl = null;
         *             for (Node<K,V> q = this; q != null; q = q.next) {
         *                 Node<K,V> p = map.replacementNode(q, null);
         *                 if (tl == null)
         *                     hd = p;
         *                 else
         *                     tl.next = p;
         *                 tl = p;
         *             }
         *             return hd;
         *         }
         */
        // putVal的树版本
        /*
         * final TreeNode<K,V> putTreeVal(HashMap<K,V> map, Node<K,V>[] tab,
         *                                        int h, K k, V v) {
         *             Class<?> kc = null;
         *             boolean searched = false;
         *             TreeNode<K,V> root = (parent != null) ? root() : this;
         *             for (TreeNode<K,V> p = root;;) {
         *                 int dir, ph; K pk;
         *                 if ((ph = p.hash) > h)
         *                     dir = -1;
         *                 else if (ph < h)
         *                     dir = 1;
         *                 else if ((pk = p.key) == k || (k != null && k.equals(pk)))
         *                     return p;
         *                 else if ((kc == null &&
         *                           (kc = comparableClassFor(k)) == null) ||
         *                          (dir = compareComparables(kc, k, pk)) == 0) {
         *                     if (!searched) {
         *                         TreeNode<K,V> q, ch;
         *                         searched = true;
         *                         if (((ch = p.left) != null &&
         *                              (q = ch.find(h, k, kc)) != null) ||
         *                             ((ch = p.right) != null &&
         *                              (q = ch.find(h, k, kc)) != null))
         *                             return q;
         *                     }
         *                     dir = tieBreakOrder(k, pk);
         *                 }
         *
         *                 TreeNode<K,V> xp = p;
         *                 if ((p = (dir <= 0) ? p.left : p.right) == null) {
         *                     Node<K,V> xpn = xp.next;
         *                     TreeNode<K,V> x = map.newTreeNode(h, k, v, xpn);
         *                     if (dir <= 0)
         *                         xp.left = x;
         *                     else
         *                         xp.right = x;
         *                     xp.next = x;
         *                     x.parent = x.prev = xp;
         *                     if (xpn != null)
         *                         ((TreeNode<K,V>)xpn).prev = x;
         *                     moveRootToFront(tab, balanceInsertion(root, x));
         *                     return null;
         *                 }
         *             }
         *         }
         */
        // 删除此调用之前必须存在的给定节点。
        // 这比典型的红黑删除代码更为混乱，
        // 因为我们无法将内部节点的内容与由在遍历期间可独立访问的“下一个”指针固定的叶子后继对象交换。
        // 因此，我们交换树链接。 如果当前树的节点似乎太少，则将垃圾箱转换回普通垃圾箱。
        // （该测试触发2到6个节点之间的某个位置，具体取决于树的结构）。
        /*
         * final void removeTreeNode(HashMap<K,V> map, Node<K,V>[] tab,
         *                                   boolean movable) {
         *             int n;
         *             if (tab == null || (n = tab.length) == 0)
         *                 return;
         *             int index = (n - 1) & hash;
         *             TreeNode<K,V> first = (TreeNode<K,V>)tab[index], root = first, rl;
         *             TreeNode<K,V> succ = (TreeNode<K,V>)next, pred = prev;
         *             if (pred == null)
         *                 tab[index] = first = succ;
         *             else
         *                 pred.next = succ;
         *             if (succ != null)
         *                 succ.prev = pred;
         *             if (first == null)
         *                 return;
         *             if (root.parent != null)
         *                 root = root.root();
         *             if (root == null || root.right == null ||
         *                 (rl = root.left) == null || rl.left == null) {
         *                 tab[index] = first.untreeify(map);  // too small
         *                 return;
         *             }
         *             TreeNode<K,V> p = this, pl = left, pr = right, replacement;
         *             if (pl != null && pr != null) {
         *                 TreeNode<K,V> s = pr, sl;
         *                 while ((sl = s.left) != null) // find successor
         *                     s = sl;
         *                 boolean c = s.red; s.red = p.red; p.red = c; // swap colors
         *                 TreeNode<K,V> sr = s.right;
         *                 TreeNode<K,V> pp = p.parent;
         *                 if (s == pr) { // p was s's direct parent
         *                     p.parent = s;
         *                     s.right = p;
         *                 }
         *                 else {
         *                     TreeNode<K,V> sp = s.parent;
         *                     if ((p.parent = sp) != null) {
         *                         if (s == sp.left)
         *                             sp.left = p;
         *                         else
         *                             sp.right = p;
         *                     }
         *                     if ((s.right = pr) != null)
         *                         pr.parent = s;
         *                 }
         *                 p.left = null;
         *                 if ((p.right = sr) != null)
         *                     sr.parent = p;
         *                 if ((s.left = pl) != null)
         *                     pl.parent = s;
         *                 if ((s.parent = pp) == null)
         *                     root = s;
         *                 else if (p == pp.left)
         *                     pp.left = s;
         *                 else
         *                     pp.right = s;
         *                 if (sr != null)
         *                     replacement = sr;
         *                 else
         *                     replacement = p;
         *             }
         *             else if (pl != null)
         *                 replacement = pl;
         *             else if (pr != null)
         *                 replacement = pr;
         *             else
         *                 replacement = p;
         *             if (replacement != p) {
         *                 TreeNode<K,V> pp = replacement.parent = p.parent;
         *                 if (pp == null)
         *                     root = replacement;
         *                 else if (p == pp.left)
         *                     pp.left = replacement;
         *                 else
         *                     pp.right = replacement;
         *                 p.left = p.right = p.parent = null;
         *             }
         *
         *             TreeNode<K,V> r = p.red ? root : balanceDeletion(root, replacement);
         *
         *             if (replacement == p) {  // detach
         *                 TreeNode<K,V> pp = p.parent;
         *                 p.parent = null;
         *                 if (pp != null) {
         *                     if (p == pp.left)
         *                         pp.left = null;
         *                     else if (p == pp.right)
         *                         pp.right = null;
         *                 }
         *             }
         *             if (movable)
         *                 moveRootToFront(tab, r);
         *         }
         */
        // 将树箱中的节点拆分为较高和较低的树箱，如果现在太小，则取消树化。 仅从调整大小调用
        /*
         * final void split(HashMap<K,V> map, Node<K,V>[] tab, int index, int bit) {
         *             TreeNode<K,V> b = this;
         *             // Relink into lo and hi lists, preserving order
         *             TreeNode<K,V> loHead = null, loTail = null;
         *             TreeNode<K,V> hiHead = null, hiTail = null;
         *             int lc = 0, hc = 0;
         *             for (TreeNode<K,V> e = b, next; e != null; e = next) {
         *                 next = (TreeNode<K,V>)e.next;
         *                 e.next = null;
         *                 if ((e.hash & bit) == 0) {
         *                     if ((e.prev = loTail) == null)
         *                         loHead = e;
         *                     else
         *                         loTail.next = e;
         *                     loTail = e;
         *                     ++lc;
         *                 }
         *                 else {
         *                     if ((e.prev = hiTail) == null)
         *                         hiHead = e;
         *                     else
         *                         hiTail.next = e;
         *                     hiTail = e;
         *                     ++hc;
         *                 }
         *             }
         *
         *             if (loHead != null) {
         *                 if (lc <= UNTREEIFY_THRESHOLD)
         *                     tab[index] = loHead.untreeify(map);
         *                 else {
         *                     tab[index] = loHead;
         *                     if (hiHead != null) // (else is already treeified)
         *                         loHead.treeify(tab);
         *                 }
         *             }
         *             if (hiHead != null) {
         *                 if (hc <= UNTREEIFY_THRESHOLD)
         *                     tab[index + bit] = hiHead.untreeify(map);
         *                 else {
         *                     tab[index + bit] = hiHead;
         *                     if (loHead != null)
         *                         hiHead.treeify(tab);
         *                 }
         *             }
         *         }
         */
        // 红黑树方法，全部改编自CLR 左旋方法
        /*
         * static <K,V> TreeNode<K,V> rotateLeft(TreeNode<K,V> root,
         *                                               TreeNode<K,V> p) {
         *             TreeNode<K,V> r, pp, rl;
         *             if (p != null && (r = p.right) != null) {
         *                 if ((rl = p.right = r.left) != null)
         *                     rl.parent = p;
         *                 if ((pp = r.parent = p.parent) == null)
         *                     (root = r).red = false;
         *                 else if (pp.left == p)
         *                     pp.left = r;
         *                 else
         *                     pp.right = r;
         *                 r.left = p;
         *                 p.parent = r;
         *             }
         *             return root;
         *         }
         */
        // 右旋方法
        /*
         * static <K,V> TreeNode<K,V> rotateRight(TreeNode<K,V> root,
         *                                                TreeNode<K,V> p) {
         *             TreeNode<K,V> l, pp, lr;
         *             if (p != null && (l = p.left) != null) {
         *                 if ((lr = p.left = l.right) != null)
         *                     lr.parent = p;
         *                 if ((pp = l.parent = p.parent) == null)
         *                     (root = l).red = false;
         *                 else if (pp.right == p)
         *                     pp.right = l;
         *                 else
         *                     pp.left = l;
         *                 l.right = p;
         *                 p.parent = l;
         *             }
         *             return root;
         *         }
         */
        // 平衡插入节点
        /*
         * static <K,V> TreeNode<K,V> balanceInsertion(TreeNode<K,V> root,
         *                                                     TreeNode<K,V> x) {
         *             x.red = true;
         *             for (TreeNode<K,V> xp, xpp, xppl, xppr;;) {
         *                 if ((xp = x.parent) == null) {
         *                     x.red = false;
         *                     return x;
         *                 }
         *                 else if (!xp.red || (xpp = xp.parent) == null)
         *                     return root;
         *                 if (xp == (xppl = xpp.left)) {
         *                     if ((xppr = xpp.right) != null && xppr.red) {
         *                         xppr.red = false;
         *                         xp.red = false;
         *                         xpp.red = true;
         *                         x = xpp;
         *                     }
         *                     else {
         *                         if (x == xp.right) {
         *                             root = rotateLeft(root, x = xp);
         *                             xpp = (xp = x.parent) == null ? null : xp.parent;
         *                         }
         *                         if (xp != null) {
         *                             xp.red = false;
         *                             if (xpp != null) {
         *                                 xpp.red = true;
         *                                 root = rotateRight(root, xpp);
         *                             }
         *                         }
         *                     }
         *                 }
         *                 else {
         *                     if (xppl != null && xppl.red) {
         *                         xppl.red = false;
         *                         xp.red = false;
         *                         xpp.red = true;
         *                         x = xpp;
         *                     }
         *                     else {
         *                         if (x == xp.left) {
         *                             root = rotateRight(root, x = xp);
         *                             xpp = (xp = x.parent) == null ? null : xp.parent;
         *                         }
         *                         if (xp != null) {
         *                             xp.red = false;
         *                             if (xpp != null) {
         *                                 xpp.red = true;
         *                                 root = rotateLeft(root, xpp);
         *                             }
         *                         }
         *                     }
         *                 }
         *             }
         *         }
         */
        // 平衡删除
        /*
         * static <K,V> TreeNode<K,V> balanceDeletion(TreeNode<K,V> root,
         *                                                    TreeNode<K,V> x) {
         *             for (TreeNode<K,V> xp, xpl, xpr;;)  {
         *                 if (x == null || x == root)
         *                     return root;
         *                 else if ((xp = x.parent) == null) {
         *                     x.red = false;
         *                     return x;
         *                 }
         *                 else if (x.red) {
         *                     x.red = false;
         *                     return root;
         *                 }
         *                 else if ((xpl = xp.left) == x) {
         *                     if ((xpr = xp.right) != null && xpr.red) {
         *                         xpr.red = false;
         *                         xp.red = true;
         *                         root = rotateLeft(root, xp);
         *                         xpr = (xp = x.parent) == null ? null : xp.right;
         *                     }
         *                     if (xpr == null)
         *                         x = xp;
         *                     else {
         *                         TreeNode<K,V> sl = xpr.left, sr = xpr.right;
         *                         if ((sr == null || !sr.red) &&
         *                             (sl == null || !sl.red)) {
         *                             xpr.red = true;
         *                             x = xp;
         *                         }
         *                         else {
         *                             if (sr == null || !sr.red) {
         *                                 if (sl != null)
         *                                     sl.red = false;
         *                                 xpr.red = true;
         *                                 root = rotateRight(root, xpr);
         *                                 xpr = (xp = x.parent) == null ?
         *                                     null : xp.right;
         *                             }
         *                             if (xpr != null) {
         *                                 xpr.red = (xp == null) ? false : xp.red;
         *                                 if ((sr = xpr.right) != null)
         *                                     sr.red = false;
         *                             }
         *                             if (xp != null) {
         *                                 xp.red = false;
         *                                 root = rotateLeft(root, xp);
         *                             }
         *                             x = root;
         *                         }
         *                     }
         *                 }
         *                 else { // symmetric
         *                     if (xpl != null && xpl.red) {
         *                         xpl.red = false;
         *                         xp.red = true;
         *                         root = rotateRight(root, xp);
         *                         xpl = (xp = x.parent) == null ? null : xp.left;
         *                     }
         *                     if (xpl == null)
         *                         x = xp;
         *                     else {
         *                         TreeNode<K,V> sl = xpl.left, sr = xpl.right;
         *                         if ((sl == null || !sl.red) &&
         *                             (sr == null || !sr.red)) {
         *                             xpl.red = true;
         *                             x = xp;
         *                         }
         *                         else {
         *                             if (sl == null || !sl.red) {
         *                                 if (sr != null)
         *                                     sr.red = false;
         *                                 xpl.red = true;
         *                                 root = rotateLeft(root, xpl);
         *                                 xpl = (xp = x.parent) == null ?
         *                                     null : xp.left;
         *                             }
         *                             if (xpl != null) {
         *                                 xpl.red = (xp == null) ? false : xp.red;
         *                                 if ((sl = xpl.left) != null)
         *                                     sl.red = false;
         *                             }
         *                             if (xp != null) {
         *                                 xp.red = false;
         *                                 root = rotateRight(root, xp);
         *                             }
         *                             x = root;
         *                         }
         *                     }
         *                 }
         *             }
         *         }
         */
        // 递归不变检查
        /*
         * static <K,V> boolean checkInvariants(TreeNode<K,V> t) {
         *             TreeNode<K,V> tp = t.parent, tl = t.left, tr = t.right,
         *                 tb = t.prev, tn = (TreeNode<K,V>)t.next;
         *             if (tb != null && tb.next != t)
         *                 return false;
         *             if (tn != null && tn.prev != t)
         *                 return false;
         *             if (tp != null && t != tp.left && t != tp.right)
         *                 return false;
         *             if (tl != null && (tl.parent != t || tl.hash > t.hash))
         *                 return false;
         *             if (tr != null && (tr.parent != t || tr.hash < t.hash))
         *                 return false;
         *             if (t.red && tl != null && tl.red && tr != null && tr.red)
         *                 return false;
         *             if (tl != null && !checkInvariants(tl))
         *                 return false;
         *             if (tr != null && !checkInvariants(tr))
         *                 return false;
         *             return true;
         *         }
         */
        // HashMap类方法
        // 构造一个具有指定初始容量和负载因子的空HashMap
        /*
         * public HashMap(int initialCapacity, float loadFactor) {
         *         if (initialCapacity < 0)
         *             throw new IllegalArgumentException("Illegal initial capacity: " +
         *                                                initialCapacity);
         *         if (initialCapacity > MAXIMUM_CAPACITY)
         *             initialCapacity = MAXIMUM_CAPACITY;
         *         if (loadFactor <= 0 || Float.isNaN(loadFactor))
         *             throw new IllegalArgumentException("Illegal load factor: " +
         *                                                loadFactor);
         *         this.loadFactor = loadFactor;
         *         this.threshold = tableSizeFor(initialCapacity);
         *     }
         */
        // 指定初始容量使用默认负载因子的构造方法
        /*
         * public HashMap(int initialCapacity) {
         *         this(initialCapacity, DEFAULT_LOAD_FACTOR);
         *     }
         */
        // 使用默认初始容量(16)和默认负载因子(0.75)的构造方法
        /*
         * public HashMap() {
         *         this.loadFactor = DEFAULT_LOAD_FACTOR; // all other fields defaulted
         *     }
         */
        // 使用m的值和初始容量来构建hashMap 负载因子是0.75
        /*
         * public HashMap(Map<? extends K, ? extends V> m) {
         *         this.loadFactor = DEFAULT_LOAD_FACTOR;
         *         putMapEntries(m, false);
         *     }
         */
        // 计算key的hash值
        /*
         * static final int hash(Object key) {
         *         int h;
         *         return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
         *     }
         */
        // 如果x实现了Comparable就返回x的Class否则返回null
        /*
         * static Class<?> comparableClassFor(Object x) {
         *         if (x instanceof Comparable) {
         *             Class<?> c; Type[] ts, as; Type t; ParameterizedType p;
         *             if ((c = x.getClass()) == String.class) // bypass checks
         *                 return c;
         *             if ((ts = c.getGenericInterfaces()) != null) {
         *                 for (int i = 0; i < ts.length; ++i) {
         *                     if (((t = ts[i]) instanceof ParameterizedType) &&
         *                         ((p = (ParameterizedType)t).getRawType() ==
         *                          Comparable.class) &&
         *                         (as = p.getActualTypeArguments()) != null &&
         *                         as.length == 1 && as[0] == c) // type arg is c
         *                         return c;
         *                 }
         *             }
         *         }
         *         return null;
         *     }
         */
        // 如果x匹配kc（k的筛选的可比类），则返回k.compareTo（x），否则返回0。
        /*
         * @SuppressWarnings({"rawtypes","unchecked"}) // for cast to Comparable
         *     static int compareComparables(Class<?> kc, Object k, Object x) {
         *         return (x == null || x.getClass() != kc ? 0 :
         *                 ((Comparable)k).compareTo(x));
         *     }
         */
        // 对于给定的目标容量，返回两倍大小的幂。
        // 根据预期的容量cap计算出HashMap中的哈希数组实际需要分配的容量
        // 如果输入值是2的冪，则原样返回，如果不是2的冪，则向上取就近的冪
        // 比如输入13，返回16，输入17，返回32
        /*
         * static final int tableSizeFor(int cap) {
         *         int n = cap - 1;
         *         n |= n >>> 1;
         *         n |= n >>> 2;
         *         n |= n >>> 4;
         *         n |= n >>> 8;
         *         n |= n >>> 16;
         *         return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
         *     }
         */
        // 实现Map.putAll和Map构造函数
        // 将指定HashMap中的元素存入到当前HashMap（允许覆盖） evict是否允许覆盖
        /*
         * final void putMapEntries(Map<? extends K, ? extends V> m, boolean evict) {
         *         int s = m.size();
         *         if (s > 0) {
         *             if (table == null) { // pre-size
         *                 float ft = ((float)s / loadFactor) + 1.0F;
         *                 int t = ((ft < (float)MAXIMUM_CAPACITY) ?
         *                          (int)ft : MAXIMUM_CAPACITY);
         *                 if (t > threshold)
         *                     threshold = tableSizeFor(t);
         *             }
         *             else if (s > threshold)
         *                 resize();
         *             for (Map.Entry<? extends K, ? extends V> e : m.entrySet()) {
         *                 K key = e.getKey();
         *                 V value = e.getValue();
         *                 putVal(hash(key), key, value, false, evict);
         *             }
         *         }
         *     }
         */
        // 返回此映射中的键值映射数。
        /*
         * public int size() {
         *         return size;
         *     }
         */
        // 如果此映射不包含键值映射，则返回true 。
        /*
         * public boolean isEmpty() {
         *         return size == 0;
         *     }
         */
        // 获取key对应的node值
        /*
         * public V get(Object key) {
         *         Node<K,V> e;
         *         return (e = getNode(hash(key), key)) == null ? null : e.value;
         *     }
         */
        // 获取key对应的node值
        /*
         * final Node<K,V> getNode(int hash, Object key) {
         *         Node<K,V>[] tab; Node<K,V> first, e; int n; K k;
         *         if ((tab = table) != null && (n = tab.length) > 0 &&
         *             (first = tab[(n - 1) & hash]) != null) {
         *             if (first.hash == hash && // always check first node
         *                 ((k = first.key) == key || (key != null && key.equals(k))))
         *                 return first;
         *             if ((e = first.next) != null) {
         *                 if (first instanceof TreeNode)
         *                     return ((TreeNode<K,V>)first).getTreeNode(hash, key);
         *                 do {
         *                     if (e.hash == hash &&
         *                         ((k = e.key) == key || (key != null && key.equals(k))))
         *                         return e;
         *                 } while ((e = e.next) != null);
         *             }
         *         }
         *         return null;
         *     }
         */
        // 判断map中是否包含key值
        /*
         * public boolean containsKey(Object key) {
         *         return getNode(hash(key), key) != null;
         *     }
         */
        // 向map中放入一个节点
        /*
         * public V put(K key, V value) {
         *         return putVal(hash(key), key, value, false, true);
         *     }
         */
        // 向当前Map中存入新的元素，并返回旧元素
        // key的哈希值 key value 是否需要维持原状（不覆盖旧值） if false, the table is in creation mode.
        // 返回同位元素的旧值（在当前Map中占据相同位置的元素）
        // 如果不存在同位元素，即插入了新元素，则返回null
        // 如果存在同位元素，但同位元素的旧值为null，那么也返回null
        /*
         * final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
         *                    boolean evict) {
         *         Node<K,V>[] tab; Node<K,V> p; int n, i;
         *         if ((tab = table) == null || (n = tab.length) == 0)
         *             n = (tab = resize()).length;
         *         if ((p = tab[i = (n - 1) & hash]) == null)
         *             tab[i] = newNode(hash, key, value, null);
         *         else {
         *             Node<K,V> e; K k;
         *             if (p.hash == hash &&
         *                 ((k = p.key) == key || (key != null && key.equals(k))))
         *                 e = p;
         *             else if (p instanceof TreeNode)
         *                 e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
         *             else {
         *                 for (int binCount = 0; ; ++binCount) {
         *                     if ((e = p.next) == null) {
         *                         p.next = newNode(hash, key, value, null);
         *                         if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
         *                             treeifyBin(tab, hash);
         *                         break;
         *                     }
         *                     if (e.hash == hash &&
         *                         ((k = e.key) == key || (key != null && key.equals(k))))
         *                         break;
         *                     p = e;
         *                 }
         *             }
         *             if (e != null) { // existing mapping for key
         *                 V oldValue = e.value;
         *                 if (!onlyIfAbsent || oldValue == null)
         *                     e.value = value;
         *                 afterNodeAccess(e);
         *                 return oldValue;
         *             }
         *         }
         *         ++modCount;
         *         if (++size > threshold)
         *             resize();
         *         afterNodeInsertion(evict);
         *         return null;
         *     }
         */
        // 初始化或增加表大小。 如果为空，则根据字段阈值中保持的初始容量目标进行分配。
        // 否则，因为我们使用的是2的幂，所以每个bin中的元素必须保持相同的索引，或者在新表中以2的幂偏移。
        /*
         * final Node<K,V>[] resize() {
         *         Node<K,V>[] oldTab = table;
         *         int oldCap = (oldTab == null) ? 0 : oldTab.length;
         *         int oldThr = threshold;
         *         int newCap, newThr = 0;
         *         if (oldCap > 0) {
         *             if (oldCap >= MAXIMUM_CAPACITY) {
         *                 threshold = Integer.MAX_VALUE;
         *                 return oldTab;
         *             }
         *             else if ((newCap = oldCap << 1) < MAXIMUM_CAPACITY &&
         *                      oldCap >= DEFAULT_INITIAL_CAPACITY)
         *                 newThr = oldThr << 1; // double threshold
         *         }
         *         else if (oldThr > 0) // initial capacity was placed in threshold
         *             newCap = oldThr;
         *         else {               // zero initial threshold signifies using defaults
         *             newCap = DEFAULT_INITIAL_CAPACITY;
         *             newThr = (int)(DEFAULT_LOAD_FACTOR * DEFAULT_INITIAL_CAPACITY);
         *         }
         *         if (newThr == 0) {
         *             float ft = (float)newCap * loadFactor;
         *             newThr = (newCap < MAXIMUM_CAPACITY && ft < (float)MAXIMUM_CAPACITY ?
         *                       (int)ft : Integer.MAX_VALUE);
         *         }
         *         threshold = newThr;
         *         @SuppressWarnings({"rawtypes","unchecked"})
         *             Node<K, V>[] newTab = (Node<K,V>[])new Node[newCap];
         *         table = newTab;
         *         if (oldTab != null) {
         *             for (int j = 0; j < oldCap; ++j) {
         *                 Node<K,V> e;
         *                 if ((e = oldTab[j]) != null) {
         *                     oldTab[j] = null;
         *                     if (e.next == null)
         *                         newTab[e.hash & (newCap - 1)] = e;
         *                     else if (e instanceof TreeNode)
         *                         ((TreeNode<K,V>)e).split(this, newTab, j, oldCap);
         *                     else { // preserve order
         *                         Node<K,V> loHead = null, loTail = null;
         *                         Node<K,V> hiHead = null, hiTail = null;
         *                         Node<K,V> next;
         *                         do {
         *                             next = e.next;
         *                             if ((e.hash & oldCap) == 0) {
         *                                 if (loTail == null)
         *                                     loHead = e;
         *                                 else
         *                                     loTail.next = e;
         *                                 loTail = e;
         *                             }
         *                             else {
         *                                 if (hiTail == null)
         *                                     hiHead = e;
         *                                 else
         *                                     hiTail.next = e;
         *                                 hiTail = e;
         *                             }
         *                         } while ((e = next) != null);
         *                         if (loTail != null) {
         *                             loTail.next = null;
         *                             newTab[j] = loHead;
         *                         }
         *                         if (hiTail != null) {
         *                             hiTail.next = null;
         *                             newTab[j + oldCap] = hiHead;
         *                         }
         *                     }
         *                 }
         *             }
         *         }
         *         return newTab;
         *     }
         */
        // 除非表太小（在这种情况下，将调整大小），否则将替换给定哈希值的索引处bin中所有链接的节点。
        /*
         * final void treeifyBin(Node<K,V>[] tab, int hash) {
         *         int n, index; Node<K,V> e;
         *         if (tab == null || (n = tab.length) < MIN_TREEIFY_CAPACITY)
         *             resize();
         *         else if ((e = tab[index = (n - 1) & hash]) != null) {
         *             TreeNode<K,V> hd = null, tl = null;
         *             do {
         *                 TreeNode<K,V> p = replacementTreeNode(e, null);
         *                 if (tl == null)
         *                     hd = p;
         *                 else {
         *                     p.prev = tl;
         *                     tl.next = p;
         *                 }
         *                 tl = p;
         *             } while ((e = e.next) != null);
         *             if ((tab[index] = hd) != null)
         *                 hd.treeify(tab);
         *         }
         *     }
         */
        // 将m中的值放入map中 覆盖
        /*
         * public void putAll(Map<? extends K, ? extends V> m) {
         *         putMapEntries(m, true);
         *     }
         */
        // 移除key
        /*
         * public V remove(Object key) {
         *         Node<K,V> e;
         *         return (e = removeNode(hash(key), key, null, false, true)) == null ?
         *             null : e.value;
         *     }
         */
        // 从HashMap中移除指定的元素，并返回刚刚移除的元素（移除失败返回null）
        // matchValue 移除元素时是否需要考虑value的匹配问题
        // movable    移除元素后如果红黑树根结点发生了变化，那么是否需要改变结点在链表上的顺序
        /*
         * final Node<K,V> removeNode(int hash, Object key, Object value,
         *                                boolean matchValue, boolean movable) {
         *         Node<K,V>[] tab; Node<K,V> p; int n, index;
         *         if ((tab = table) != null && (n = tab.length) > 0 &&
         *             (p = tab[index = (n - 1) & hash]) != null) {
         *             Node<K,V> node = null, e; K k; V v;
         *             if (p.hash == hash &&
         *                 ((k = p.key) == key || (key != null && key.equals(k))))
         *                 node = p;
         *             else if ((e = p.next) != null) {
         *                 if (p instanceof TreeNode)
         *                     node = ((TreeNode<K,V>)p).getTreeNode(hash, key);
         *                 else {
         *                     do {
         *                         if (e.hash == hash &&
         *                             ((k = e.key) == key ||
         *                              (key != null && key.equals(k)))) {
         *                             node = e;
         *                             break;
         *                         }
         *                         p = e;
         *                     } while ((e = e.next) != null);
         *                 }
         *             }
         *             if (node != null && (!matchValue || (v = node.value) == value ||
         *                                  (value != null && value.equals(v)))) {
         *                 if (node instanceof TreeNode)
         *                     ((TreeNode<K,V>)node).removeTreeNode(this, tab, movable);
         *                 else if (node == p)
         *                     tab[index] = node.next;
         *                 else
         *                     p.next = node.next;
         *                 ++modCount;
         *                 --size;
         *                 afterNodeRemoval(node);
         *                 return node;
         *             }
         *         }
         *         return null;
         *     }
         */
        // 清空元素值
        /*
         * public void clear() {
         *         Node<K,V>[] tab;
         *         modCount++;
         *         if ((tab = table) != null && size > 0) {
         *             size = 0;
         *             for (int i = 0; i < tab.length; ++i)
         *                 tab[i] = null;
         *         }
         *     }
         */
        // 判断map是否包含value值
        /*
         * public boolean containsValue(Object value) {
         *         Node<K,V>[] tab; V v;
         *         if ((tab = table) != null && size > 0) {
         *             for (int i = 0; i < tab.length; ++i) {
         *                 for (Node<K,V> e = tab[i]; e != null; e = e.next) {
         *                     if ((v = e.value) == value ||
         *                         (value != null && value.equals(v)))
         *                         return true;
         *                 }
         *             }
         *         }
         *         return false;
         *     }
         */
        // 获取keySet
        /*
         * public Set<K> keySet() {
         *         Set<K> ks = keySet;
         *         if (ks == null) {
         *             ks = new KeySet();
         *             keySet = ks;
         *         }
         *         return ks;
         *     }
         */
        // 获取value的集合
        /*
         * public Collection<V> values() {
         *         Collection<V> vs = values;
         *         if (vs == null) {
         *             vs = new Values();
         *             values = vs;
         *         }
         *         return vs;
         *     }
         */
        // 获取entrySet
        /*
         * public Set<Map.Entry<K,V>> entrySet() {
         *         Set<Map.Entry<K,V>> es;
         *         return (es = entrySet) == null ? (entrySet = new EntrySet()) : es;
         *     }
         */
        // 根据key获取value 如果value不存在 返回defaultValue
        /*
         * @Override
         *     public V getOrDefault(Object key, V defaultValue) {
         *         Node<K,V> e;
         *         return (e = getNode(hash(key), key)) == null ? defaultValue : e.value;
         *     }
         */
        // 如果key不存在则put 将指定的元素（key-value）存入HashMap，并返回旧值，不允许覆盖
        /*
         * @Override
         *     public V putIfAbsent(K key, V value) {
         *         return putVal(hash(key), key, value, true, true);
         *     }
         */
        // 移除节点
        /*
         * @Override
         *     public boolean remove(Object key, Object value) {
         *         return removeNode(hash(key), key, value, true, true) != null;
         *     }
         */
        // 替换key对应的value值
        /*
         * @Override
         *     public boolean replace(K key, V oldValue, V newValue) {
         *         Node<K,V> e; V v;
         *         if ((e = getNode(hash(key), key)) != null &&
         *             ((v = e.value) == oldValue || (v != null && v.equals(oldValue)))) {
         *             e.value = newValue;
         *             afterNodeAccess(e);
         *             return true;
         *         }
         *         return false;
         *     }
         */
        // 替换key对应的value值
        /*
         * @Override
         *     public V replace(K key, V value) {
         *         Node<K,V> e;
         *         if ((e = getNode(hash(key), key)) != null) {
         *             V oldValue = e.value;
         *             e.value = value;
         *             afterNodeAccess(e);
         *             return oldValue;
         *         }
         *         return null;
         *     }
         */
        // 插入/替换操作，返回新值（可能为null）
        // 此方法的主要意图：不存在同位元素，或旧value为null时，使用key创造的新value来更新旧value。
        // 如果同位元素旧值不为空，则直接返回旧值。
        /*
         * @Override
         *     public V computeIfAbsent(K key,
         *                              Function<? super K, ? extends V> mappingFunction) {
         *         if (mappingFunction == null)
         *             throw new NullPointerException();
         *         int hash = hash(key);
         *         Node<K,V>[] tab; Node<K,V> first; int n, i;
         *         int binCount = 0;
         *         TreeNode<K,V> t = null;
         *         Node<K,V> old = null;
         *         if (size > threshold || (tab = table) == null ||
         *             (n = tab.length) == 0)
         *             n = (tab = resize()).length;
         *         if ((first = tab[i = (n - 1) & hash]) != null) {
         *             if (first instanceof TreeNode)
         *                 old = (t = (TreeNode<K,V>)first).getTreeNode(hash, key);
         *             else {
         *                 Node<K,V> e = first; K k;
         *                 do {
         *                     if (e.hash == hash &&
         *                         ((k = e.key) == key || (key != null && key.equals(k)))) {
         *                         old = e;
         *                         break;
         *                     }
         *                     ++binCount;
         *                 } while ((e = e.next) != null);
         *             }
         *             V oldValue;
         *             if (old != null && (oldValue = old.value) != null) {
         *                 afterNodeAccess(old);
         *                 return oldValue;
         *             }
         *         }
         *         V v = mappingFunction.apply(key);
         *         if (v == null) {
         *             return null;
         *         } else if (old != null) {
         *             old.value = v;
         *             afterNodeAccess(old);
         *             return v;
         *         }
         *         else if (t != null)
         *             t.putTreeVal(this, tab, hash, key, v);
         *         else {
         *             tab[i] = newNode(hash, key, v, first);
         *             if (binCount >= TREEIFY_THRESHOLD - 1)
         *                 treeifyBin(tab, hash);
         *         }
         *         ++modCount;
         *         ++size;
         *         afterNodeInsertion(true);
         *         return v;
         *     }
         */
        // 删除/替换操作，返回新值（可能为null）
        /*
         * public V computeIfPresent(K key,
         *                               BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
         *         if (remappingFunction == null)
         *             throw new NullPointerException();
         *         Node<K,V> e; V oldValue;
         *         int hash = hash(key);
         *         if ((e = getNode(hash, key)) != null &&
         *             (oldValue = e.value) != null) {
         *             V v = remappingFunction.apply(key, oldValue);
         *             if (v != null) {
         *                 e.value = v;
         *                 afterNodeAccess(e);
         *                 return v;
         *             }
         *             else
         *                 removeNode(hash, key, null, false, true);
         *         }
         *         return null;
         *     }
         */
        // 插入/删除/替换操作，返回新值（可能为null）
        // 此方法的主要意图：使用key和旧value创造的新value来更新旧value
        /*
         * @Override
         *     public V compute(K key,
         *                      BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
         *         if (remappingFunction == null)
         *             throw new NullPointerException();
         *         int hash = hash(key);
         *         Node<K,V>[] tab; Node<K,V> first; int n, i;
         *         int binCount = 0;
         *         TreeNode<K,V> t = null;
         *         Node<K,V> old = null;
         *         if (size > threshold || (tab = table) == null ||
         *             (n = tab.length) == 0)
         *             n = (tab = resize()).length;
         *         if ((first = tab[i = (n - 1) & hash]) != null) {
         *             if (first instanceof TreeNode)
         *                 old = (t = (TreeNode<K,V>)first).getTreeNode(hash, key);
         *             else {
         *                 Node<K,V> e = first; K k;
         *                 do {
         *                     if (e.hash == hash &&
         *                         ((k = e.key) == key || (key != null && key.equals(k)))) {
         *                         old = e;
         *                         break;
         *                     }
         *                     ++binCount;
         *                 } while ((e = e.next) != null);
         *             }
         *         }
         *         V oldValue = (old == null) ? null : old.value;
         *         V v = remappingFunction.apply(key, oldValue);
         *         if (old != null) {
         *             if (v != null) {
         *                 old.value = v;
         *                 afterNodeAccess(old);
         *             }
         *             else
         *                 removeNode(hash, key, null, false, true);
         *         }
         *         else if (v != null) {
         *             if (t != null)
         *                 t.putTreeVal(this, tab, hash, key, v);
         *             else {
         *                 tab[i] = newNode(hash, key, v, first);
         *                 if (binCount >= TREEIFY_THRESHOLD - 1)
         *                     treeifyBin(tab, hash);
         *             }
         *             ++modCount;
         *             ++size;
         *             afterNodeInsertion(true);
         *         }
         *         return v;
         *     }
         */
        // 插入/删除/替换操作，返回新值（可能为null）
        // 此方法的主要意图：使用备用value和旧value创造的新value来更新旧value
        /*
         * @Override
         *     public V merge(K key, V value,
         *                    BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
         *         if (value == null)
         *             throw new NullPointerException();
         *         if (remappingFunction == null)
         *             throw new NullPointerException();
         *         int hash = hash(key);
         *         Node<K,V>[] tab; Node<K,V> first; int n, i;
         *         int binCount = 0;
         *         TreeNode<K,V> t = null;
         *         Node<K,V> old = null;
         *         if (size > threshold || (tab = table) == null ||
         *             (n = tab.length) == 0)
         *             n = (tab = resize()).length;
         *         if ((first = tab[i = (n - 1) & hash]) != null) {
         *             if (first instanceof TreeNode)
         *                 old = (t = (TreeNode<K,V>)first).getTreeNode(hash, key);
         *             else {
         *                 Node<K,V> e = first; K k;
         *                 do {
         *                     if (e.hash == hash &&
         *                         ((k = e.key) == key || (key != null && key.equals(k)))) {
         *                         old = e;
         *                         break;
         *                     }
         *                     ++binCount;
         *                 } while ((e = e.next) != null);
         *             }
         *         }
         *         if (old != null) {
         *             V v;
         *             if (old.value != null)
         *                 v = remappingFunction.apply(old.value, value);
         *             else
         *                 v = value;
         *             if (v != null) {
         *                 old.value = v;
         *                 afterNodeAccess(old);
         *             }
         *             else
         *                 removeNode(hash, key, null, false, true);
         *             return v;
         *         }
         *         if (value != null) {
         *             if (t != null)
         *                 t.putTreeVal(this, tab, hash, key, value);
         *             else {
         *                 tab[i] = newNode(hash, key, value, first);
         *                 if (binCount >= TREEIFY_THRESHOLD - 1)
         *                     treeifyBin(tab, hash);
         *             }
         *             ++modCount;
         *             ++size;
         *             afterNodeInsertion(true);
         *         }
         *         return value;
         *     }
         */
        // 对元素遍历执行action
        /*
         * @Override
         *     public void forEach(BiConsumer<? super K, ? super V> action) {
         *         Node<K,V>[] tab;
         *         if (action == null)
         *             throw new NullPointerException();
         *         if (size > 0 && (tab = table) != null) {
         *             int mc = modCount;
         *             for (int i = 0; i < tab.length; ++i) {
         *                 for (Node<K,V> e = tab[i]; e != null; e = e.next)
         *                     action.accept(e.key, e.value);
         *             }
         *             if (modCount != mc)
         *                 throw new ConcurrentModificationException();
         *         }
         *     }
         */
        // 替换当前HashMap中的所有元素，替换策略由function决定，function的入参是元素的key和value，出参作为新值
        /*
         * @Override
         *     public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
         *         Node<K,V>[] tab;
         *         if (function == null)
         *             throw new NullPointerException();
         *         if (size > 0 && (tab = table) != null) {
         *             int mc = modCount;
         *             for (int i = 0; i < tab.length; ++i) {
         *                 for (Node<K,V> e = tab[i]; e != null; e = e.next) {
         *                     e.value = function.apply(e.key, e.value);
         *                 }
         *             }
         *             if (modCount != mc)
         *                 throw new ConcurrentModificationException();
         *         }
         *     }
         */
        // 浅克隆
        /*
         * @SuppressWarnings("unchecked")
         *     @Override
         *     public Object clone() {
         *         HashMap<K,V> result;
         *         try {
         *             result = (HashMap<K,V>)super.clone();
         *         } catch (CloneNotSupportedException e) {
         *             // this shouldn't happen, since we are Cloneable
         *             throw new InternalError(e);
         *         }
         *         result.reinitialize();
         *         result.putMapEntries(this, false);
         *         return result;
         *     }
         */
        // 序列化HashSet时也使用这些方法
        /*
         * final float loadFactor() { return loadFactor; }
         */
        // 返回map的容量
        /*
         * final int capacity() {
         *         return (table != null) ? table.length :
         *             (threshold > 0) ? threshold :
         *             DEFAULT_INITIAL_CAPACITY;
         *     }
         */
        // 将map序列化到流
        /*
         * private void writeObject(java.io.ObjectOutputStream s)
         *         throws IOException {
         *         int buckets = capacity();
         *         // Write out the threshold, loadfactor, and any hidden stuff
         *         s.defaultWriteObject();
         *         s.writeInt(buckets);
         *         s.writeInt(size);
         *         internalWriteEntries(s);
         *     }
         */
        // 从流中读取map
        /*
         * private void readObject(java.io.ObjectInputStream s)
         *         throws IOException, ClassNotFoundException {
         *         // Read in the threshold (ignored), loadfactor, and any hidden stuff
         *         s.defaultReadObject();
         *         reinitialize();
         *         if (loadFactor <= 0 || Float.isNaN(loadFactor))
         *             throw new InvalidObjectException("Illegal load factor: " +
         *                                              loadFactor);
         *         s.readInt();                // Read and ignore number of buckets
         *         int mappings = s.readInt(); // Read number of mappings (size)
         *         if (mappings < 0)
         *             throw new InvalidObjectException("Illegal mappings count: " +
         *                                              mappings);
         *         else if (mappings > 0) { // (if zero, use defaults)
         *             // Size the table using given load factor only if within
         *             // range of 0.25...4.0
         *             float lf = Math.min(Math.max(0.25f, loadFactor), 4.0f);
         *             float fc = (float)mappings / lf + 1.0f;
         *             int cap = ((fc < DEFAULT_INITIAL_CAPACITY) ?
         *                        DEFAULT_INITIAL_CAPACITY :
         *                        (fc >= MAXIMUM_CAPACITY) ?
         *                        MAXIMUM_CAPACITY :
         *                        tableSizeFor((int)fc));
         *             float ft = (float)cap * lf;
         *             threshold = ((cap < MAXIMUM_CAPACITY && ft < MAXIMUM_CAPACITY) ?
         *                          (int)ft : Integer.MAX_VALUE);
         *             @SuppressWarnings({"rawtypes","unchecked"})
         *                 Node<K, V>[] tab = (Node<K,V>[])new Node[cap];
         *             table = tab;
         *
         *             // Read the keys and values, and put the mappings in the HashMap
         *             for (int i = 0; i < mappings; i++) {
         *                 @SuppressWarnings("unchecked")
         *                     K key = (K) s.readObject();
         *                 @SuppressWarnings("unchecked")
         *                     V value = (V) s.readObject();
         *                 putVal(hash(key), key, value, false, false);
         *             }
         *         }
         *     }
         */
        // 创建一个节点 非树节点
        /*
         * Node<K,V> newNode(int hash, K key, V value, Node<K,V> next) {
         *         return new Node<>(hash, key, value, next);
         *     }
         */
        // 用于从TreeNodes转换为普通节点
        /*
         * Node<K,V> replacementNode(Node<K,V> p, Node<K,V> next) {
         *         return new Node<>(p.hash, p.key, p.value, next);
         *     }
         */
        // 创建一个树节点
        /*
         * TreeNode<K,V> newTreeNode(int hash, K key, V value, Node<K,V> next) {
         *         return new TreeNode<>(hash, key, value, next);
         *     }
         */
        // 将节点转换成树节点
        /*
         * TreeNode<K,V> replacementTreeNode(Node<K,V> p, Node<K,V> next) {
         *         return new TreeNode<>(p.hash, p.key, p.value, next);
         *     }
         */
        // 重置为初始默认状态。 由clone和readObject调用。
        /*
         * void reinitialize() {
         *         table = null;
         *         entrySet = null;
         *         keySet = null;
         *         values = null;
         *         modCount = 0;
         *         threshold = 0;
         *         size = 0;
         *     }
         */
        // 允许LinkedHashMap后处理的回调
        // void afterNodeAccess(Node<K,V> p) { }
        // void afterNodeInsertion(boolean evict) { }
        // void afterNodeRemoval(Node<K,V> p) { }
        // 仅从writeObject调用，以确保兼容的顺序。
        /*
         * void internalWriteEntries(java.io.ObjectOutputStream s) throws IOException {
         *         Node<K,V>[] tab;
         *         if (size > 0 && (tab = table) != null) {
         *             for (int i = 0; i < tab.length; ++i) {
         *                 for (Node<K,V> e = tab[i]; e != null; e = e.next) {
         *                     s.writeObject(e.key);
         *                     s.writeObject(e.value);
         *                 }
         *             }
         *         }
         *     }
         */
        // private static final long serialVersionUID = 362498820763181265L; 序列化参数
        // 默认初始容量-必须是2的幂。
        // static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16
        // 如果隐式指定了更高的值，则使用最大容量
        // static final int MAXIMUM_CAPACITY = 1 << 30;
        System.out.println(1 << 30);
        // 默认负载因子
        // static final float DEFAULT_LOAD_FACTOR = 0.75f;

        // 使用树而不是列表的存储单元计数阈值垃圾箱。
        // 将元素添加到树中时，容器将转换为树至少有这么多节点。值必须大于大于2，且至少应为8，以符合中的假设
        // 关于转换回普通垃圾箱的树木移除收缩。
        // static final int TREEIFY_THRESHOLD = 8;

        // 存储过程中取消检测（拆分）存储箱的存储箱计数阈值调整大小操作。
        // 应小于TREEIFY\u阈值，并且多数6目筛下用收缩检测去除。
        // static final int UNTREEIFY_THRESHOLD = 6;

        // 最小的桌子容量，箱子可以被树化。
        // （否则，如果bin中的节点太多，则会调整表的大小。）
        // 应至少为4*TREEIFY\u阈值以避免冲突
        // 在调整大小和树化阈值之间。
        // static final int MIN_TREEIFY_CAPACITY = 64;
    }
}
