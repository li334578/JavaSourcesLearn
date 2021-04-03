package com.company.JavaSourceLearn.sources.JavaUtil.collectionClass.otherClass.hashtable_test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : Hashtable
 * @date : 2021-01-09 21:12:52
 */
public class HashtableExample1 {
    public static void main(String[] args) {
        // extends Dictionary<K,V>
        //    implements Map<K,V>, Cloneable, java.io.Serializable
        // 内部类
        // KeySet
        // key迭代器
        /*
         * public Iterator<K> iterator() {
         *             return getIterator(KEYS);
         *         }
         */
        // 获取元素数量
        /*
         * public int size() {
         *             return count;
         *         }
         */
        // 判断是够包含key o
        /*
         * public boolean contains(Object o) {
         *             return containsKey(o);
         *         }
         */
        // 移除o
        /*
         * public boolean remove(Object o) {
         *             return Hashtable.this.remove(o) != null;
         *         }
         */
        // 清空
        /*
         * public void clear() {
         *             Hashtable.this.clear();
         *         }
         */
        // EntrySet
        // 获取entry迭代器
        /*
         * public Iterator<Map.Entry<K,V>> iterator() {
         *             return getIterator(ENTRIES);
         *         }
         */
        // 添加entry
        /*
         * public boolean add(Map.Entry<K,V> o) {
         *             return super.add(o);
         *         }
         */
        // 包含entry
        /*
         * public boolean contains(Object o) {
         *             if (!(o instanceof Map.Entry))
         *                 return false;
         *             Map.Entry<?,?> entry = (Map.Entry<?,?>)o;
         *             Object key = entry.getKey();
         *             Entry<?,?>[] tab = table;
         *             int hash = key.hashCode();
         *             int index = (hash & 0x7FFFFFFF) % tab.length;
         *
         *             for (Entry<?,?> e = tab[index]; e != null; e = e.next)
         *                 if (e.hash==hash && e.equals(entry))
         *                     return true;
         *             return false;
         *         }
         */
        // 移除entry
        /*
         * public boolean remove(Object o) {
         *             if (!(o instanceof Map.Entry))
         *                 return false;
         *             Map.Entry<?,?> entry = (Map.Entry<?,?>) o;
         *             Object key = entry.getKey();
         *             Entry<?,?>[] tab = table;
         *             int hash = key.hashCode();
         *             int index = (hash & 0x7FFFFFFF) % tab.length;
         *
         *             @SuppressWarnings("unchecked")
         *             Entry<K, V> e = (Entry<K,V>)tab[index];
         *             for(Entry<K,V> prev = null; e != null; prev = e, e = e.next) {
         *                 if (e.hash==hash && e.equals(entry)) {
         *                     modCount++;
         *                     if (prev != null)
         *                         prev.next = e.next;
         *                     else
         *                         tab[index] = e.next;
         *
         *                     count--;
         *                     e.value = null;
         *                     return true;
         *                 }
         *             }
         *             return false;
         *         }
         */
        // 返回元素数量
        /*
         * public int size() {
         *             return count;
         *         }
         */
        // 清空Hashtable
        /*
         * public void clear() {
         *             Hashtable.this.clear();
         *         }
         */
        // ValueCollection
        // value迭代器
        /*
         * public Iterator<V> iterator() {
         *             return getIterator(VALUES);
         *         }
         */
        // 获取元素数量
        /*
         * public int size() {
         *             return count;
         *         }
         */
        // 判断是否包含value
        /*
         * public boolean contains(Object o) {
         *             return containsValue(o);
         *         }
         */
        // 清空value数组
        /*
         * public void clear() {
         *             Hashtable.this.clear();
         *         }
         */
        // Entry
        // final int hash; hash值
        // final K key; key值
        // V value; value值
        // Entry<K,V> next; 下一个节点
        // 构造
        /*
         * protected Entry(int hash, K key, V value, Entry<K,V> next) {
         *             this.hash = hash;
         *             this.key =  key;
         *             this.value = value;
         *             this.next = next;
         *         }
         */
        // 克隆entry
        /*
         * @SuppressWarnings("unchecked")
         * protected Object clone() {
         *     return new Entry<>(hash, key, value,
         *                           (next==null ? null : (Entry<K,V>) next.clone()));
         * }
         */
        // 获取key
        /*
         * public K getKey() {
         *             return key;
         *         }
         */
        // 获取value
        /*
         * public V getValue() {
         *             return value;
         *         }
         */
        // 设置value值
        /*
         * public V setValue(V value) {
         *             if (value == null)
         *                 throw new NullPointerException();
         *
         *             V oldValue = this.value;
         *             this.value = value;
         *             return oldValue;
         *         }
         */
        // equals方法
        /*
         * public boolean equals(Object o) {
         *             if (!(o instanceof Map.Entry))
         *                 return false;
         *             Map.Entry<?,?> e = (Map.Entry<?,?>)o;
         *
         *             return (key==null ? e.getKey()==null : key.equals(e.getKey())) &&
         *                (value==null ? e.getValue()==null : value.equals(e.getValue()));
         *         }
         */
        // HashCode方法
        /*
         * public int hashCode() {
         *             return hash ^ Objects.hashCode(value);
         *         }
         */
        // toString方法
        /*
         * public String toString() {
         *             return key.toString()+"="+value.toString();
         *         }
         */
        // Enumerator 枚举器
        // Entry<?,?>[] table = Hashtable.this.table; hashtable
        // int index = table.length; 索引
        // Entry<?,?> entry; node
        // Entry<?,?> lastReturned; 最后一个返回的node
        // int type; 类型
        // 枚举器构造
        /*
         * Enumerator(int type, boolean iterator) {
         *             this.type = type;
         *             this.iterator = iterator;
         *         }
         */
        // 判断是否拥有更多元素
        /*
         * public boolean hasMoreElements() {
         *             Entry<?,?> e = entry;
         *             int i = index;
         *             Entry<?,?>[] t = table;
         *             while (e == null && i > 0) {
         *             e = t[--i];
         *             }
         *             entry = e;
         *             index = i;
         *             return e != null;
         *        }
         */
        // 获取下一个元素
        /*
         * @SuppressWarnings("unchecked")
         *         public T nextElement() {
         *             Entry<?,?> et = entry;
         *             int i = index;
         *             Entry<?,?>[] t = table;
         *             while (et == null && i > 0) {
         *             et = t[--i];
         *             }
         *             entry = et;
         *             index = i;
         *             if (et != null) {
         *             Entry<?, ?> e = lastReturned = entry;
         *             entry = e.next;
         *             return type == KEYS ? (T) e.key : (type == VALUES ? (T) e.value : (T) e);
         *             }
         *             throw new NoSuchElementException("Hashtable Enumerator");
         *        }
         */
        // 是否还有下一个元素
        /*
         * public boolean hasNext() {
         *             return hasMoreElements();
         *         }
         */
        // 获取下一个元素
        /*
         * public T next() {
         *             if (modCount != expectedModCount)
         *                 throw new ConcurrentModificationException();
         *             return nextElement();
         *         }
         */
        // 清空元素
        /*
         * public void remove() {
         *             if (!iterator)
         *                 throw new UnsupportedOperationException();
         *             if (lastReturned == null)
         *                 throw new IllegalStateException("Hashtable Enumerator");
         *             if (modCount != expectedModCount)
         *                 throw new ConcurrentModificationException();
         *
         *             synchronized(Hashtable.this) {
         *                 Entry<?,?>[] tab = Hashtable.this.table;
         *                 int index = (lastReturned.hash & 0x7FFFFFFF) % tab.length;
         *
         *                 @SuppressWarnings("unchecked")
         *                 Entry<K, V> e = (Entry<K,V>)tab[index];
         *                 for(Entry<K,V> prev = null; e != null; prev = e, e = e.next) {
         *                     if (e == lastReturned) {
         *                         modCount++;
         *                         expectedModCount++;
         *                         if (prev == null)
         *                             tab[index] = e.next;
         *                         else
         *                             prev.next = e.next;
         *                         count--;
         *                         lastReturned = null;
         *                         return;
         *                     }
         *                 }
         *                 throw new ConcurrentModificationException();
         *             }
         *         }
         */
        // 构造方法 指定初始容量和负载因子
        /*
         * public Hashtable(int initialCapacity, float loadFactor) {
         *         if (initialCapacity < 0)
         *             throw new IllegalArgumentException("Illegal Capacity: "+
         *                                                initialCapacity);
         *         if (loadFactor <= 0 || Float.isNaN(loadFactor))
         *             throw new IllegalArgumentException("Illegal Load: "+loadFactor);
         *
         *         if (initialCapacity==0)
         *             initialCapacity = 1;
         *         this.loadFactor = loadFactor;
         *         table = new Entry<?,?>[initialCapacity];
         *         threshold = (int)Math.min(initialCapacity * loadFactor, MAX_ARRAY_SIZE + 1);
         *     }
         */
        // 构造方法 指定初始容量使用默认负载因子
        /*
         * public Hashtable(int initialCapacity) {
         *         this(initialCapacity, 0.75f);
         *     }
         */
        // 无参构造 初始容量:11负载因子0.75f
        /*
         * public Hashtable() {
         *         this(11, 0.75f);
         *     }
         */
        // 根据t构造hashtable
        /*
         * public Hashtable(Map<? extends K, ? extends V> t) {
         *         this(Math.max(2*t.size(), 11), 0.75f);
         *         putAll(t);
         *     }
         */
        // 返回hashtable的key的数量
        /*
         * public synchronized int size() {
         *         return count;
         *     }
         */
        // 判断hashtable是否为空
        /*
         * public synchronized boolean isEmpty() {
         *         return count == 0;
         *     }
         */
        // 返回此哈希表中的值的枚举。 在返回的对象上使用Enumeration方法按顺序获取元素。
        /*
         * public synchronized Enumeration<V> elements() {
         *         return this.<V>getEnumeration(VALUES);
         *     }
         */
        // 判断hashtable中是否包含value 功能上与containsValue相同
        /*
         * public synchronized boolean contains(Object value) {
         *         if (value == null) {
         *             throw new NullPointerException();
         *         }
         *
         *         Entry<?,?> tab[] = table;
         *         for (int i = tab.length ; i-- > 0 ;) {
         *             for (Entry<?,?> e = tab[i] ; e != null ; e = e.next) {
         *                 if (e.value.equals(value)) {
         *                     return true;
         *                 }
         *             }
         *         }
         *         return false;
         *     }
         */
        // 判断hashtable中是否包含value
        /*
         * public boolean containsValue(Object value) {
         *         return contains(value);
         *     }
         */
        // 判断hashtable中是否包含key
        /*
         * public synchronized boolean containsKey(Object key) {
         *         Entry<?,?> tab[] = table;
         *         int hash = key.hashCode();
         *         int index = (hash & 0x7FFFFFFF) % tab.length;
         *         for (Entry<?,?> e = tab[index] ; e != null ; e = e.next) {
         *             if ((e.hash == hash) && e.key.equals(key)) {
         *                 return true;
         *             }
         *         }
         *         return false;
         *     }
         */
        // 获取key对应的value
        /*
         * @SuppressWarnings("unchecked")
         *     public synchronized V get(Object key) {
         *         Entry<?,?> tab[] = table;
         *         int hash = key.hashCode();
         *         int index = (hash & 0x7FFFFFFF) % tab.length;
         *         for (Entry<?,?> e = tab[index] ; e != null ; e = e.next) {
         *             if ((e.hash == hash) && e.key.equals(key)) {
         *                 return (V)e.value;
         *             }
         *         }
         *         return null;
         *     }
         */
        // 增加此哈希表的容量并在内部重新组织该哈希表，以便更有效地容纳和访问其哈希表。
        // 当哈希表中的键数超过该哈希表的容量和负载因子时，将自动调用此方法。
        // 扩容时会调用
        /*
         * @SuppressWarnings("unchecked")
         *     protected void rehash() {
         *         int oldCapacity = table.length;
         *         Entry<?,?>[] oldMap = table;
         *
         *         // overflow-conscious code
         *         int newCapacity = (oldCapacity << 1) + 1;
         *         if (newCapacity - MAX_ARRAY_SIZE > 0) {
         *             if (oldCapacity == MAX_ARRAY_SIZE)
         *                 // Keep running with MAX_ARRAY_SIZE buckets
         *                 return;
         *             newCapacity = MAX_ARRAY_SIZE;
         *         }
         *         Entry<?,?>[] newMap = new Entry<?,?>[newCapacity];
         *
         *         modCount++;
         *         threshold = (int)Math.min(newCapacity * loadFactor, MAX_ARRAY_SIZE + 1);
         *         table = newMap;
         *
         *         for (int i = oldCapacity ; i-- > 0 ;) {
         *             for (Entry<K,V> old = (Entry<K,V>)oldMap[i] ; old != null ; ) {
         *                 Entry<K,V> e = old;
         *                 old = old.next;
         *
         *                 int index = (e.hash & 0x7FFFFFFF) % newCapacity;
         *                 e.next = (Entry<K,V>)newMap[index];
         *                 newMap[index] = e;
         *             }
         *         }
         *     }
         */
        // 向hashtable中添加entry
        /*
         * private void addEntry(int hash, K key, V value, int index) {
         *         modCount++;
         *
         *         Entry<?,?> tab[] = table;
         *         if (count >= threshold) {
         *             // Rehash the table if the threshold is exceeded
         *             rehash();
         *
         *             tab = table;
         *             hash = key.hashCode();
         *             index = (hash & 0x7FFFFFFF) % tab.length;
         *         }
         *
         *         // Creates the new entry.
         *         @SuppressWarnings("unchecked")
         *         Entry<K, V> e = (Entry<K,V>) tab[index];
         *         tab[index] = new Entry<>(hash, key, value, e);
         *         count++;
         *     }
         */
        // 添加键值对到hashtable中
        /*
         * public synchronized V put(K key, V value) {
         *         // Make sure the value is not null
         *         if (value == null) {
         *             throw new NullPointerException();
         *         }
         *
         *         // Makes sure the key is not already in the hashtable.
         *         Entry<?,?> tab[] = table;
         *         int hash = key.hashCode();
         *         int index = (hash & 0x7FFFFFFF) % tab.length;
         *         @SuppressWarnings("unchecked")
         *         Entry<K, V> entry = (Entry<K,V>)tab[index];
         *         for(; entry != null ; entry = entry.next) {
         *             if ((entry.hash == hash) && entry.key.equals(key)) {
         *                 V old = entry.value;
         *                 entry.value = value;
         *                 return old;
         *             }
         *         }
         *
         *         addEntry(hash, key, value, index);
         *         return null;
         *     }
         */
        // 移除key对应的键值对
        /*
         * public synchronized V remove(Object key) {
         *         Entry<?,?> tab[] = table;
         *         int hash = key.hashCode();
         *         int index = (hash & 0x7FFFFFFF) % tab.length;
         *         @SuppressWarnings("unchecked")
         *         Entry<K, V> e = (Entry<K,V>)tab[index];
         *         for(Entry<K,V> prev = null ; e != null ; prev = e, e = e.next) {
         *             if ((e.hash == hash) && e.key.equals(key)) {
         *                 modCount++;
         *                 if (prev != null) {
         *                     prev.next = e.next;
         *                 } else {
         *                     tab[index] = e.next;
         *                 }
         *                 count--;
         *                 V oldValue = e.value;
         *                 e.value = null;
         *                 return oldValue;
         *             }
         *         }
         *         return null;
         *     }
         */
        // 将t中的元素添加到hashtable中
        /*
         * public synchronized void putAll(Map<? extends K, ? extends V> t) {
         *         for (Map.Entry<? extends K, ? extends V> e : t.entrySet())
         *             put(e.getKey(), e.getValue());
         *     }
         */
        // 清空hashtable
        /*
         * public synchronized void clear() {
         *         Entry<?,?> tab[] = table;
         *         modCount++;
         *         for (int index = tab.length; --index >= 0; )
         *             tab[index] = null;
         *         count = 0;
         *     }
         */
        // 返回hashtable的浅copy
        /*
         * public synchronized Object clone() {
         *         try {
         *             Hashtable<?,?> t = (Hashtable<?,?>)super.clone();
         *             t.table = new Entry<?,?>[table.length];
         *             for (int i = table.length ; i-- > 0 ; ) {
         *                 t.table[i] = (table[i] != null)
         *                     ? (Entry<?,?>) table[i].clone() : null;
         *             }
         *             t.keySet = null;
         *             t.entrySet = null;
         *             t.values = null;
         *             t.modCount = 0;
         *             return t;
         *         } catch (CloneNotSupportedException e) {
         *             // this shouldn't happen, since we are Cloneable
         *             throw new InternalError(e);
         *         }
         *     }
         */
        // toString方法
        /*
         * public synchronized String toString() {
         *         int max = size() - 1;
         *         if (max == -1)
         *             return "{}";
         *
         *         StringBuilder sb = new StringBuilder();
         *         Iterator<Map.Entry<K,V>> it = entrySet().iterator();
         *
         *         sb.append('{');
         *         for (int i = 0; ; i++) {
         *             Map.Entry<K,V> e = it.next();
         *             K key = e.getKey();
         *             V value = e.getValue();
         *             sb.append(key   == this ? "(this Map)" : key.toString());
         *             sb.append('=');
         *             sb.append(value == this ? "(this Map)" : value.toString());
         *
         *             if (i == max)
         *                 return sb.append('}').toString();
         *             sb.append(", ");
         *         }
         *     }
         */
        // 获取枚举
        /*
         * private <T> Enumeration<T> getEnumeration(int type) {
         *         if (count == 0) {
         *             return Collections.emptyEnumeration();
         *         } else {
         *             return new Enumerator<>(type, false);
         *         }
         *     }
         */
        // 获取迭代器
        /*
         * private <T> Iterator<T> getIterator(int type) {
         *         if (count == 0) {
         *             return Collections.emptyIterator();
         *         } else {
         *             return new Enumerator<>(type, true);
         *         }
         *     }
         */
        // 获取keySet
        /*
         * public Set<K> keySet() {
         *         if (keySet == null)
         *             keySet = Collections.synchronizedSet(new KeySet(), this);
         *         return keySet;
         *     }
         */
        // 获取entrySet
        /*
         * public Set<Map.Entry<K,V>> entrySet() {
         *         if (entrySet==null)
         *             entrySet = Collections.synchronizedSet(new EntrySet(), this);
         *         return entrySet;
         *     }
         */
        // 获取value的集合
        /*
         * public Collection<V> values() {
         *         if (values==null)
         *             values = Collections.synchronizedCollection(new ValueCollection(),
         *                                                         this);
         *         return values;
         *     }
         */
        // equals
        /*
         * public synchronized boolean equals(Object o) {
         *         if (o == this)
         *             return true;
         *
         *         if (!(o instanceof Map))
         *             return false;
         *         Map<?,?> t = (Map<?,?>) o;
         *         if (t.size() != size())
         *             return false;
         *
         *         try {
         *             Iterator<Map.Entry<K,V>> i = entrySet().iterator();
         *             while (i.hasNext()) {
         *                 Map.Entry<K,V> e = i.next();
         *                 K key = e.getKey();
         *                 V value = e.getValue();
         *                 if (value == null) {
         *                     if (!(t.get(key)==null && t.containsKey(key)))
         *                         return false;
         *                 } else {
         *                     if (!value.equals(t.get(key)))
         *                         return false;
         *                 }
         *             }
         *         } catch (ClassCastException unused)   {
         *             return false;
         *         } catch (NullPointerException unused) {
         *             return false;
         *         }
         *
         *         return true;
         *     }
         */
        // 获取HashCode
        /*
         * public synchronized int hashCode() {
         *          int h = 0;
         *          if (count == 0 || loadFactor < 0)
         *          return h;  // Returns zero
         *
         *          loadFactor = -loadFactor;  // Mark hashCode computation in progress
         *          Entry<?, ?>[] tab = table;
         *          for (Entry<?, ?> entry : tab) {
         *          while (entry != null) {
         *          h += entry.hashCode();
         *          entry = entry.next;
         *          }
         *          }
         *
         *          loadFactor = -loadFactor;  // Mark hashCode computation complete
         *
         *          return h;
         *          }
         */
        // 获取key对应的value 不存在返回defaultValue
        /*
         * @Override
         *     public synchronized V getOrDefault(Object key, V defaultValue) {
         *         V result = get(key);
         *         return (null == result) ? defaultValue : result;
         *     }
         */
        // 遍历元素执行action
        /*
         * @SuppressWarnings("unchecked")
         *     @Override
         *     public synchronized void forEach(BiConsumer<? super K, ? super V> action) {
         *         Objects.requireNonNull(action);     // explicit check required in case
         *                                             // table is empty.
         *         final int expectedModCount = modCount;
         *
         *         Entry<?, ?>[] tab = table;
         *         for (Entry<?, ?> entry : tab) {
         *             while (entry != null) {
         *                 action.accept((K)entry.key, (V)entry.value);
         *                 entry = entry.next;
         *
         *                 if (expectedModCount != modCount) {
         *                     throw new ConcurrentModificationException();
         *                 }
         *             }
         *         }
         *     }
         */
        // 对元素执行function并替换原有元素
        /*
         * @SuppressWarnings("unchecked")
         *     @Override
         *     public synchronized void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
         *         Objects.requireNonNull(function);     // explicit check required in case
         *                                               // table is empty.
         *         final int expectedModCount = modCount;
         *
         *         Entry<K, V>[] tab = (Entry<K, V>[])table;
         *         for (Entry<K, V> entry : tab) {
         *             while (entry != null) {
         *                 entry.value = Objects.requireNonNull(
         *                     function.apply(entry.key, entry.value));
         *                 entry = entry.next;
         *
         *                 if (expectedModCount != modCount) {
         *                     throw new ConcurrentModificationException();
         *                 }
         *             }
         *         }
         *     }
         */
        // 如果不存在key 就add进hashtable
        /*
         * @Override
         *     public synchronized V putIfAbsent(K key, V value) {
         *         Objects.requireNonNull(value);
         *
         *         // Makes sure the key is not already in the hashtable.
         *         Entry<?,?> tab[] = table;
         *         int hash = key.hashCode();
         *         int index = (hash & 0x7FFFFFFF) % tab.length;
         *         @SuppressWarnings("unchecked")
         *         Entry<K, V> entry = (Entry<K,V>)tab[index];
         *         for (; entry != null; entry = entry.next) {
         *             if ((entry.hash == hash) && entry.key.equals(key)) {
         *                 V old = entry.value;
         *                 if (old == null) {
         *                     entry.value = value;
         *                 }
         *                 return old;
         *             }
         *         }
         *
         *         addEntry(hash, key, value, index);
         *         return null;
         *     }
         */
        // 移除元素
        /*
         * @Override
         *     public synchronized boolean remove(Object key, Object value) {
         *         Objects.requireNonNull(value);
         *
         *         Entry<?,?> tab[] = table;
         *         int hash = key.hashCode();
         *         int index = (hash & 0x7FFFFFFF) % tab.length;
         *         @SuppressWarnings("unchecked")
         *         Entry<K, V> e = (Entry<K,V>)tab[index];
         *         for (Entry<K,V> prev = null; e != null; prev = e, e = e.next) {
         *             if ((e.hash == hash) && e.key.equals(key) && e.value.equals(value)) {
         *                 modCount++;
         *                 if (prev != null) {
         *                     prev.next = e.next;
         *                 } else {
         *                     tab[index] = e.next;
         *                 }
         *                 count--;
         *                 e.value = null;
         *                 return true;
         *             }
         *         }
         *         return false;
         *     }
         */
        // 替换
        /*
         * @Override
         *     public synchronized boolean replace(K key, V oldValue, V newValue) {
         *         Objects.requireNonNull(oldValue);
         *         Objects.requireNonNull(newValue);
         *         Entry<?,?> tab[] = table;
         *         int hash = key.hashCode();
         *         int index = (hash & 0x7FFFFFFF) % tab.length;
         *         @SuppressWarnings("unchecked")
         *         Entry<K, V> e = (Entry<K,V>)tab[index];
         *         for (; e != null; e = e.next) {
         *             if ((e.hash == hash) && e.key.equals(key)) {
         *                 if (e.value.equals(oldValue)) {
         *                     e.value = newValue;
         *                     return true;
         *                 } else {
         *                     return false;
         *                 }
         *             }
         *         }
         *         return false;
         *     }
         */
        // 替换
        /*
         * @Override
         *     public synchronized V replace(K key, V value) {
         *         Objects.requireNonNull(value);
         *         Entry<?,?> tab[] = table;
         *         int hash = key.hashCode();
         *         int index = (hash & 0x7FFFFFFF) % tab.length;
         *         @SuppressWarnings("unchecked")
         *         Entry<K, V> e = (Entry<K,V>)tab[index];
         *         for (; e != null; e = e.next) {
         *             if ((e.hash == hash) && e.key.equals(key)) {
         *                 V oldValue = e.value;
         *                 e.value = value;
         *                 return oldValue;
         *             }
         *         }
         *         return null;
         *     }
         */
        // 如果key对应的元素存在 执行mappingFunction
        // 删除/替换操作，返回新值（可能为null）
        // 此方法的主要意图：存在同位元素时，使用key和旧value创造的新value来更新旧value
        /*
         * @Override
         *     public synchronized V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) {
         *         Objects.requireNonNull(mappingFunction);
         *
         *         Entry<?,?> tab[] = table;
         *         int hash = key.hashCode();
         *         int index = (hash & 0x7FFFFFFF) % tab.length;
         *         @SuppressWarnings("unchecked")
         *         Entry<K, V> e = (Entry<K,V>)tab[index];
         *         for (; e != null; e = e.next) {
         *             if (e.hash == hash && e.key.equals(key)) {
         *                 // Hashtable not accept null value
         *                 return e.value;
         *             }
         *         }
         *
         *         V newValue = mappingFunction.apply(key);
         *         if (newValue != null) {
         *             addEntry(hash, key, newValue, index);
         *         }
         *
         *         return newValue;
         *     }
         */
        // 如果key对应的值存在则执行remappingFunction并替换原value
        /*
         * @Override
         *     public synchronized V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
         *         Objects.requireNonNull(remappingFunction);
         *
         *         Entry<?,?> tab[] = table;
         *         int hash = key.hashCode();
         *         int index = (hash & 0x7FFFFFFF) % tab.length;
         *         @SuppressWarnings("unchecked")
         *         Entry<K, V> e = (Entry<K,V>)tab[index];
         *         for (Entry<K,V> prev = null; e != null; prev = e, e = e.next) {
         *             if (e.hash == hash && e.key.equals(key)) {
         *                 V newValue = remappingFunction.apply(key, e.value);
         *                 if (newValue == null) {
         *                     modCount++;
         *                     if (prev != null) {
         *                         prev.next = e.next;
         *                     } else {
         *                         tab[index] = e.next;
         *                     }
         *                     count--;
         *                 } else {
         *                     e.value = newValue;
         *                 }
         *                 return newValue;
         *             }
         *         }
         *         return null;
         *     }
         */
        // 对key对应的V执行remappingFunction
        // 插入/删除/替换操作，返回新值（可能为null）
        // 此方法的主要意图：使用key和旧value创造的新value来更新旧value
        /*
         * @Override
         *     public synchronized V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
         *         Objects.requireNonNull(remappingFunction);
         *
         *         Entry<?,?> tab[] = table;
         *         int hash = key.hashCode();
         *         int index = (hash & 0x7FFFFFFF) % tab.length;
         *         @SuppressWarnings("unchecked")
         *         Entry<K, V> e = (Entry<K,V>)tab[index];
         *         for (Entry<K,V> prev = null; e != null; prev = e, e = e.next) {
         *             if (e.hash == hash && Objects.equals(e.key, key)) {
         *                 V newValue = remappingFunction.apply(key, e.value);
         *                 if (newValue == null) {
         *                     modCount++;
         *                     if (prev != null) {
         *                         prev.next = e.next;
         *                     } else {
         *                         tab[index] = e.next;
         *                     }
         *                     count--;
         *                 } else {
         *                     e.value = newValue;
         *                 }
         *                 return newValue;
         *             }
         *         }
         *
         *         V newValue = remappingFunction.apply(key, null);
         *         if (newValue != null) {
         *             addEntry(hash, key, newValue, index);
         *         }
         *
         *         return newValue;
         *     }
         */
        // 插入/删除/替换操作，返回新值（可能为null）
        /*
         * @Override
         *     public synchronized V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
         *         Objects.requireNonNull(remappingFunction);
         *
         *         Entry<?,?> tab[] = table;
         *         int hash = key.hashCode();
         *         int index = (hash & 0x7FFFFFFF) % tab.length;
         *         @SuppressWarnings("unchecked")
         *         Entry<K, V> e = (Entry<K,V>)tab[index];
         *         for (Entry<K,V> prev = null; e != null; prev = e, e = e.next) {
         *             if (e.hash == hash && e.key.equals(key)) {
         *                 V newValue = remappingFunction.apply(e.value, value);
         *                 if (newValue == null) {
         *                     modCount++;
         *                     if (prev != null) {
         *                         prev.next = e.next;
         *                     } else {
         *                         tab[index] = e.next;
         *                     }
         *                     count--;
         *                 } else {
         *                     e.value = newValue;
         *                 }
         *                 return newValue;
         *             }
         *         }
         *
         *         if (value != null) {
         *             addEntry(hash, key, value, index);
         *         }
         *
         *         return value;
         *     }
         */
        // 将hashtable序列化到流
        /*
         * private void writeObject(java.io.ObjectOutputStream s)
         *             throws IOException {
         *         Entry<Object, Object> entryStack = null;
         *
         *         synchronized (this) {
         *             // Write out the threshold and loadFactor
         *             s.defaultWriteObject();
         *
         *             // Write out the length and count of elements
         *             s.writeInt(table.length);
         *             s.writeInt(count);
         *
         *             // Stack copies of the entries in the table
         *             for (int index = 0; index < table.length; index++) {
         *                 Entry<?,?> entry = table[index];
         *
         *                 while (entry != null) {
         *                     entryStack =
         *                         new Entry<>(0, entry.key, entry.value, entryStack);
         *                     entry = entry.next;
         *                 }
         *             }
         *         }
         *
         *         // Write out the key/value objects from the stacked entries
         *         while (entryStack != null) {
         *             s.writeObject(entryStack.key);
         *             s.writeObject(entryStack.value);
         *             entryStack = entryStack.next;
         *         }
         *     }
         */
        // 从流中反序列化hashtable
        /*
         * private void readObject(java.io.ObjectInputStream s)
         *          throws IOException, ClassNotFoundException
         *     {
         *         // Read in the threshold and loadFactor
         *         s.defaultReadObject();
         *
         *         // Validate loadFactor (ignore threshold - it will be re-computed)
         *         if (loadFactor <= 0 || Float.isNaN(loadFactor))
         *             throw new StreamCorruptedException("Illegal Load: " + loadFactor);
         *
         *         // Read the original length of the array and number of elements
         *         int origlength = s.readInt();
         *         int elements = s.readInt();
         *
         *         // Validate # of elements
         *         if (elements < 0)
         *             throw new StreamCorruptedException("Illegal # of Elements: " + elements);
         *
         *         // Clamp original length to be more than elements / loadFactor
         *         // (this is the invariant enforced with auto-growth)
         *         origlength = Math.max(origlength, (int)(elements / loadFactor) + 1);
         *
         *         // Compute new length with a bit of room 5% + 3 to grow but
         *         // no larger than the clamped original length.  Make the length
         *         // odd if it's large enough, this helps distribute the entries.
         *         // Guard against the length ending up zero, that's not valid.
         *         int length = (int)((elements + elements / 20) / loadFactor) + 3;
         *         if (length > elements && (length & 1) == 0)
         *             length--;
         *         length = Math.min(length, origlength);
         *         table = new Entry<?,?>[length];
         *         threshold = (int)Math.min(length * loadFactor, MAX_ARRAY_SIZE + 1);
         *         count = 0;
         *
         *         // Read the number of elements and then all the key/value objects
         *         for (; elements > 0; elements--) {
         *             @SuppressWarnings("unchecked")
         *                 K key = (K)s.readObject();
         *             @SuppressWarnings("unchecked")
         *                 V value = (V)s.readObject();
         *             // sync is eliminated for performance
         *             reconstitutionPut(table, key, value);
         *         }
         *     }
         */
        // 这与常规put方法在几个方面有所不同。
        // 由于表中最初的元素数量是已知的，因此无需检查是否需要重新哈希。
        // modCount不会增加，并且没有同步，因为我们正在创建一个新实例。
        // 同样，不需要返回值。
        /*
         * private void reconstitutionPut(Entry<?,?>[] tab, K key, V value)
         *         throws StreamCorruptedException
         *     {
         *         if (value == null) {
         *             throw new java.io.StreamCorruptedException();
         *         }
         *         // Makes sure the key is not already in the hashtable.
         *         // This should not happen in deserialized version.
         *         int hash = key.hashCode();
         *         int index = (hash & 0x7FFFFFFF) % tab.length;
         *         for (Entry<?,?> e = tab[index] ; e != null ; e = e.next) {
         *             if ((e.hash == hash) && e.key.equals(key)) {
         *                 throw new java.io.StreamCorruptedException();
         *             }
         *         }
         *         // Creates the new entry.
         *         @SuppressWarnings("unchecked")
         *             Entry<K, V> e = (Entry<K,V>)tab[index];
         *         tab[index] = new Entry<>(hash, key, value, e);
         *         count++;
         *     }
         */
        // private transient Entry<?,?>[] table; hashtable的value
        // private transient int count; entry的数量
        // private int threshold; 阈值容量 初始容量*负载因子
        // private float loadFactor; 负载因子
        // private transient int modCount = 0; 结构修改次数
        // private static final long serialVersionUID = 1421746759512286392L; 序列化参数
        // private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8; 要分配的最大数组大小
        // private transient volatile Set<K> keySet; ksySet
        // private transient volatile Set<Map.Entry<K,V>> entrySet; entrySet
        // private transient volatile Collection<V> values; value集合
        // private static final int KEYS = 0; 类型的枚举值
        // private static final int VALUES = 1; 类型的枚举值
        // private static final int ENTRIES = 2; 类型的枚举值
    }
}
