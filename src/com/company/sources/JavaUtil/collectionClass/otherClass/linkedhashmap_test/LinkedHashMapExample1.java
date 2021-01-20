package com.company.sources.JavaUtil.collectionClass.otherClass.linkedhashmap_test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : LinkedHashMap
 * @date : 2021-01-10 16:45:38
 */
public class LinkedHashMapExample1 {
    public static void main(String[] args) {
        // extends HashMap<K,V>
        //    implements Map<K,V>
        // 内部类
        // Entry
        /*
         * static class Entry<K,V> extends HashMap.Node<K,V> {
         *         Entry<K,V> before, after;
         *          构造
         *         Entry(int hash, K key, V value, Node<K,V> next) {
         *             super(hash, key, value, next);
         *         }
         *     }
         */
        // LinkedKeySet
        // 数量
        /*
         * public final int size()                 { return size; }
         */
        // 清空元素
        /*
         * public final void clear()               { LinkedHashMap.this.clear(); }
         */
        // key迭代器
        /*
         * public final Iterator<K> iterator() {
         *             return new LinkedKeyIterator();
         *         }
         */
        // 判断是否包含key
        /*
         * public final boolean contains(Object o) { return containsKey(o); }
         */
        // 移除key对应的节点
        /*
         * public final boolean remove(Object key) {
         *             return removeNode(hash(key), key, null, false, true) != null;
         *         }
         */
        // 分离器
        /*
         * public final Spliterator<K> spliterator()  {
         *             return Spliterators.spliterator(this, Spliterator.SIZED |
         *                                             Spliterator.ORDERED |
         *                                             Spliterator.DISTINCT);
         *         }
         */
        // 遍历元素执行action
        /*
         * public final void forEach(Consumer<? super K> action) {
         *             if (action == null)
         *                 throw new NullPointerException();
         *             int mc = modCount;
         *             for (LinkedHashMap.Entry<K,V> e = head; e != null; e = e.after)
         *                 action.accept(e.key);
         *             if (modCount != mc)
         *                 throw new ConcurrentModificationException();
         *         }
         */
        // LinkedValues
        // 元素数量
        /*
         * public final int size()                 { return size; }
         */
        // 清空元素
        /*
         * public final void clear()               { LinkedHashMap.this.clear(); }
         */
        // 迭代器
        /*
         * public final Iterator<V> iterator() {
         *             return new LinkedValueIterator();
         *         }
         */
        // 包含value
        /*
         * public final boolean contains(Object o) { return containsValue(o); }
         */
        // 分离器
        /*
         * public final Spliterator<V> spliterator() {
         *             return Spliterators.spliterator(this, Spliterator.SIZED |
         *                                             Spliterator.ORDERED);
         *         }
         */
        // 遍历元素执行action
        /*
         * public final void forEach(Consumer<? super V> action) {
         *             if (action == null)
         *                 throw new NullPointerException();
         *             int mc = modCount;
         *             for (LinkedHashMap.Entry<K,V> e = head; e != null; e = e.after)
         *                 action.accept(e.value);
         *             if (modCount != mc)
         *                 throw new ConcurrentModificationException();
         *         }
         */
        // LinkedEntrySet
        // 元素数量
        /*
         * public final int size()                 { return size; }
         */
        // 清空列表
        /*
         * public final void clear()               { LinkedHashMap.this.clear(); }
         */
        // 迭代器
        /*
         * public final Iterator<Map.Entry<K,V>> iterator() {
         *             return new LinkedEntryIterator();
         *         }
         */
        // 判断是否包含entry
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
        // 移除entry
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
        // 分离器
        /*
         * public final Spliterator<Map.Entry<K,V>> spliterator() {
         *             return Spliterators.spliterator(this, Spliterator.SIZED |
         *                                             Spliterator.ORDERED |
         *                                             Spliterator.DISTINCT);
         *         }
         */
        // 遍历元素执行action
        /*
         * public final void forEach(Consumer<? super Map.Entry<K,V>> action) {
         *             if (action == null)
         *                 throw new NullPointerException();
         *             int mc = modCount;
         *             for (LinkedHashMap.Entry<K,V> e = head; e != null; e = e.after)
         *                 action.accept(e);
         *             if (modCount != mc)
         *                 throw new ConcurrentModificationException();
         *         }
         */
        // LinkedHashIterator
        // 下一个元素
        // LinkedHashMap.Entry<K,V> next
        // 当前元素
        // LinkedHashMap.Entry<K,V> current
        // 并发修改异常
        // int expectedModCount;
        // 构造
        /*
         * LinkedHashIterator() {
         *             next = head;
         *             expectedModCount = modCount;
         *             current = null;
         *         }
         */
        // 是否包含下一个元素
        /*
         * public final boolean hasNext() {
         *             return next != null;
         *         }
         */
        // 获取下一个元素
        /*
         * final LinkedHashMap.Entry<K,V> nextNode() {
         *             LinkedHashMap.Entry<K,V> e = next;
         *             if (modCount != expectedModCount)
         *                 throw new ConcurrentModificationException();
         *             if (e == null)
         *                 throw new NoSuchElementException();
         *             current = e;
         *             next = e.after;
         *             return e;
         *         }
         */
        // 移除当前元素
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
        // LinkedKeyIterator key迭代器
        /*
         * final class LinkedKeyIterator extends LinkedHashIterator
         *         implements Iterator<K> {
         *         public final K next() { return nextNode().getKey(); }
         *     }
         */
        // LinkedValueIterator value迭代器
        /*
         * final class LinkedValueIterator extends LinkedHashIterator
         *         implements Iterator<V> {
         *         public final V next() { return nextNode().value; }
         *     }
         */
        // entry迭代器
        /*
         * final class LinkedEntryIterator extends LinkedHashIterator
         *         implements Iterator<Map.Entry<K,V>> {
         *         public final Map.Entry<K,V> next() { return nextNode(); }
         *     }
         */
        // 指定初始容量和负载因子的构造
        /*
         * public LinkedHashMap(int initialCapacity, float loadFactor) {
         *         super(initialCapacity, loadFactor);
         *         accessOrder = false;
         *     }
         */
        // 指定初始容量的构造
        /*
         * public LinkedHashMap(int initialCapacity) {
         *         super(initialCapacity);
         *         accessOrder = false;
         *     }
         */
        // 无参构造
        /*
         * public LinkedHashMap() {
         *         super();
         *         accessOrder = false;
         *     }
         */
        // 根据m构建linkedHashMap
        /*
         * public LinkedHashMap(Map<? extends K, ? extends V> m) {
         *         super();
         *         accessOrder = false;
         *         putMapEntries(m, false);
         *     }
         */
        // 指定初始容量、负载因子和accessOrder排序方式
        /*
         * public LinkedHashMap(int initialCapacity,
         *                          float loadFactor,
         *                          boolean accessOrder) {
         *         super(initialCapacity, loadFactor);
         *         this.accessOrder = accessOrder;
         *     }
         */
        // 将p链接到当前linkedHashMap的末尾
        /*
         * private void linkNodeLast(LinkedHashMap.Entry<K,V> p) {
         *         LinkedHashMap.Entry<K,V> last = tail;
         *         tail = p;
         *         if (last == null)
         *             head = p;
         *         else {
         *             p.before = last;
         *             last.after = p;
         *         }
         *     }
         */
        // 交换元素链接
        /*
         * private void transferLinks(LinkedHashMap.Entry<K,V> src,
         *                                LinkedHashMap.Entry<K,V> dst) {
         *         LinkedHashMap.Entry<K,V> b = dst.before = src.before;
         *         LinkedHashMap.Entry<K,V> a = dst.after = src.after;
         *         if (b == null)
         *             head = dst;
         *         else
         *             b.after = dst;
         *         if (a == null)
         *             tail = dst;
         *         else
         *             a.before = dst;
         *     }
         */
        // 从新计算linkedHashMap的容量
        /*
         * void reinitialize() {
         *         super.reinitialize();
         *         head = tail = null;
         *     }
         */
        // 创建一个新节点
        /*
         * Node<K,V> newNode(int hash, K key, V value, Node<K,V> e) {
         *         LinkedHashMap.Entry<K,V> p =
         *             new LinkedHashMap.Entry<K,V>(hash, key, value, e);
         *         linkNodeLast(p);
         *         return p;
         *     }
         */
        // 替换节点
        /*
         * Node<K,V> replacementNode(Node<K,V> p, Node<K,V> next) {
         *         LinkedHashMap.Entry<K,V> q = (LinkedHashMap.Entry<K,V>)p;
         *         LinkedHashMap.Entry<K,V> t =
         *             new LinkedHashMap.Entry<K,V>(q.hash, q.key, q.value, next);
         *         transferLinks(q, t);
         *         return t;
         *     }
         */
        // 创建一个树节点
        /*
         * TreeNode<K,V> newTreeNode(int hash, K key, V value, Node<K,V> next) {
         *         TreeNode<K,V> p = new TreeNode<K,V>(hash, key, value, next);
         *         linkNodeLast(p);
         *         return p;
         *     }
         */
        // 替换一个树节点
        /*
         * TreeNode<K,V> replacementTreeNode(Node<K,V> p, Node<K,V> next) {
         *         LinkedHashMap.Entry<K,V> q = (LinkedHashMap.Entry<K,V>)p;
         *         TreeNode<K,V> t = new TreeNode<K,V>(q.hash, q.key, q.value, next);
         *         transferLinks(q, t);
         *         return t;
         *     }
         */
        // 移除元素之后做的操作
        /*
         * void afterNodeRemoval(Node<K,V> e) { // unlink
         *         LinkedHashMap.Entry<K,V> p =
         *             (LinkedHashMap.Entry<K,V>)e, b = p.before, a = p.after;
         *         p.before = p.after = null;
         *         if (b == null)
         *             head = a;
         *         else
         *             b.after = a;
         *         if (a == null)
         *             tail = b;
         *         else
         *             a.before = b;
         *     }
         */
        // 插入元素后的操作 evict是否移除原元素
        /*
         * void afterNodeInsertion(boolean evict) { // possibly remove eldest
         *         LinkedHashMap.Entry<K,V> first;
         *         if (evict && (first = head) != null && removeEldestEntry(first)) {
         *             K key = first.key;
         *             removeNode(hash(key), key, null, false, true);
         *         }
         *     }
         */
        // 访问节点后的操作 将节点移到最后
        /*
         * void afterNodeAccess(Node<K,V> e) { // move node to last
         *         LinkedHashMap.Entry<K,V> last;
         *         if (accessOrder && (last = tail) != e) {
         *             LinkedHashMap.Entry<K,V> p =
         *                 (LinkedHashMap.Entry<K,V>)e, b = p.before, a = p.after;
         *             p.after = null;
         *             if (b == null)
         *                 head = a;
         *             else
         *                 b.after = a;
         *             if (a != null)
         *                 a.before = b;
         *             else
         *                 last = b;
         *             if (last == null)
         *                 head = p;
         *             else {
         *                 p.before = last;
         *                 last.after = p;
         *             }
         *             tail = p;
         *             ++modCount;
         *         }
         *     }
         */
        // 序列化
        /*
         * void internalWriteEntries(java.io.ObjectOutputStream s) throws IOException {
         *         for (LinkedHashMap.Entry<K,V> e = head; e != null; e = e.after) {
         *             s.writeObject(e.key);
         *             s.writeObject(e.value);
         *         }
         *     }
         */
        // 判断包含value
        /*
         * public boolean containsValue(Object value) {
         *         for (LinkedHashMap.Entry<K,V> e = head; e != null; e = e.after) {
         *             V v = e.value;
         *             if (v == value || (value != null && value.equals(v)))
         *                 return true;
         *         }
         *         return false;
         *     }
         */
        // 获取key对应的value值
        /*
         * public V get(Object key) {
         *         Node<K,V> e;
         *         if ((e = getNode(hash(key), key)) == null)
         *             return null;
         *         if (accessOrder)
         *             afterNodeAccess(e);
         *         return e.value;
         *     }
         */
        // 获取key对应的value值 不存在返回defaultValue
        /*
         * public V getOrDefault(Object key, V defaultValue) {
         *        Node<K,V> e;
         *        if ((e = getNode(hash(key), key)) == null)
         *            return defaultValue;
         *        if (accessOrder)
         *            afterNodeAccess(e);
         *        return e.value;
         *    }
         */
        // 清空
        /*
         * public void clear() {
         *         super.clear();
         *         head = tail = null;
         *     }
         */
        // 移除LinkedHashMap中最老的结点eldest，返回值代表是否成功移除
        /*
         * protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
         *         return false;
         *     }
         */
        // 获取keySet
        /*
         * public Set<K> keySet() {
         *         Set<K> ks = keySet;
         *         if (ks == null) {
         *             ks = new LinkedKeySet();
         *             keySet = ks;
         *         }
         *         return ks;
         *     }
         */
        // 获取value集合
        /*
         * public Collection<V> values() {
         *         Collection<V> vs = values;
         *         if (vs == null) {
         *             vs = new LinkedValues();
         *             values = vs;
         *         }
         *         return vs;
         *     }
         */
        // 获取entrySet
        /*
         * public Set<Map.Entry<K,V>> entrySet() {
         *         Set<Map.Entry<K,V>> es;
         *         return (es = entrySet) == null ? (entrySet = new LinkedEntrySet()) : es;
         *     }
         */
        // 对元素遍历执行action
        /*
         * public void forEach(BiConsumer<? super K, ? super V> action) {
         *         if (action == null)
         *             throw new NullPointerException();
         *         int mc = modCount;
         *         for (LinkedHashMap.Entry<K,V> e = head; e != null; e = e.after)
         *             action.accept(e.key, e.value);
         *         if (modCount != mc)
         *             throw new ConcurrentModificationException();
         *     }
         */
        // 遍历元素执行function后替换原元素
        /*
         * public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
         *         if (function == null)
         *             throw new NullPointerException();
         *         int mc = modCount;
         *         for (LinkedHashMap.Entry<K,V> e = head; e != null; e = e.after)
         *             e.value = function.apply(e.key, e.value);
         *         if (modCount != mc)
         *             throw new ConcurrentModificationException();
         *     }
         */
        // private static final long serialVersionUID = 3801124242820219131L; 序列化参数
        // transient LinkedHashMap.Entry<K,V> head; 头元素
        // transient LinkedHashMap.Entry<K,V> tail; 尾元素
        // final boolean accessOrder; 此链接的哈希映射的迭代排序方法：对于访问顺序为true ，对于插入顺序为false 。
    }
}
