package com.company.sources.JavaUtil.collectionClass.mapclass.abstractMap_test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : AbstractMap
 * @date : 2021-01-06 21:42:28
 */
public class AbstractMapExample1 {
    public static void main(String[] args) {
        // AbstractMap<K,V> implements Map<K,V>
        // 内部类 SimpleEntry<K,V>
        //        implements Entry<K,V>, java.io.Serializable
        // 构造
        /*
         * public SimpleEntry(K key, V value) {
         *             this.key   = key;
         *             this.value = value;
         *         }
         */
        // 复制一个entity
        /*
         * public SimpleEntry(Entry<? extends K, ? extends V> entry) {
         *             this.key   = entry.getKey();
         *             this.value = entry.getValue();
         *         }
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
        // 设置value 返回旧值
        /*
         * public V setValue(V value) {
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
         *             return eq(key, e.getKey()) && eq(value, e.getValue());
         *         }
         */
        // 获取HashCode值
        /*
         * public int hashCode() {
         *             return (key   == null ? 0 :   key.hashCode()) ^
         *                    (value == null ? 0 : value.hashCode());
         *         }
         */
        // toString方法
        /*
         * public String toString() {
         *             return key + "=" + value;
         *         }
         */
        // private static final long serialVersionUID = -8499721149061103585L; 序列化参数
        // private final K key; key
        // private V value; value
        // 内部类
        // SimpleImmutableEntry
        // 保持不变的键和值。 此类不支持setValue方法。 在返回键-值映射的线程安全快照的方法中，此类可能很方便
        // implements Entry<K,V>, java.io.Serializable
        // 创建一个entity
        /*
         * public SimpleImmutableEntry(K key, V value) {
         *             this.key   = key;
         *             this.value = value;
         *         }
         */
        // 根据entity创建一个entity
        /*
         * public SimpleImmutableEntry(Entry<? extends K, ? extends V> entry) {
         *             this.key   = entry.getKey();
         *             this.value = entry.getValue();
         *         }
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
        // 不支持set方法
        /*
         * public V setValue(V value) {
         *             throw new UnsupportedOperationException();
         *         }
         */
        // equals
        /*
         * public boolean equals(Object o) {
         *             if (!(o instanceof Map.Entry))
         *                 return false;
         *             Map.Entry<?,?> e = (Map.Entry<?,?>)o;
         *             return eq(key, e.getKey()) && eq(value, e.getValue());
         *         }
         */
        // 获取HashCode方法
        /*
         * public int hashCode() {
         *             return (key   == null ? 0 :   key.hashCode()) ^
         *                    (value == null ? 0 : value.hashCode());
         *         }
         */
        // toString方法
        /*
         * public String toString() {
         *             return key + "=" + value;
         *         }
         */
        // private static final long serialVersionUID = 7138329143949025153L; 序列化id
        // private final K key; key值
        // private final V value; value值
        // 空参构造
        /*
         * protected AbstractMap() {
         *     }
         */
        // 获取map的容量
        /*
         * public int size() {
         *         return entrySet().size();
         *     }
         */
        // 判断map是否为空
        /*
         * public boolean isEmpty() {
         *         return size() == 0;
         *     }
         */
        // 判断map是否包含value值
        /*
         * public boolean containsValue(Object value) {
         *         Iterator<Entry<K,V>> i = entrySet().iterator();
         *         if (value==null) {
         *             while (i.hasNext()) {
         *                 Entry<K,V> e = i.next();
         *                 if (e.getValue()==null)
         *                     return true;
         *             }
         *         } else {
         *             while (i.hasNext()) {
         *                 Entry<K,V> e = i.next();
         *                 if (value.equals(e.getValue()))
         *                     return true;
         *             }
         *         }
         *         return false;
         *     }
         */
        // 判断map是否包含key值
        /*
         * public boolean containsKey(Object key) {
         *         Iterator<Map.Entry<K,V>> i = entrySet().iterator();
         *         if (key==null) {
         *             while (i.hasNext()) {
         *                 Entry<K,V> e = i.next();
         *                 if (e.getKey()==null)
         *                     return true;
         *             }
         *         } else {
         *             while (i.hasNext()) {
         *                 Entry<K,V> e = i.next();
         *                 if (key.equals(e.getKey()))
         *                     return true;
         *             }
         *         }
         *         return false;
         *     }
         */
        // 获取key对应的value值
        /*
         * public V get(Object key) {
         *         Iterator<Entry<K,V>> i = entrySet().iterator();
         *         if (key==null) {
         *             while (i.hasNext()) {
         *                 Entry<K,V> e = i.next();
         *                 if (e.getKey()==null)
         *                     return e.getValue();
         *             }
         *         } else {
         *             while (i.hasNext()) {
         *                 Entry<K,V> e = i.next();
         *                 if (key.equals(e.getKey()))
         *                     return e.getValue();
         *             }
         *         }
         *         return null;
         *     }
         */
        // 向map中put值
        /*
         * public V put(K key, V value) {
         *         throw new UnsupportedOperationException();
         *     }
         */
        // 移除key对应的value
        /*
         * public V remove(Object key) {
         *         Iterator<Entry<K,V>> i = entrySet().iterator();
         *         Entry<K,V> correctEntry = null;
         *         if (key==null) {
         *             while (correctEntry==null && i.hasNext()) {
         *                 Entry<K,V> e = i.next();
         *                 if (e.getKey()==null)
         *                     correctEntry = e;
         *             }
         *         } else {
         *             while (correctEntry==null && i.hasNext()) {
         *                 Entry<K,V> e = i.next();
         *                 if (key.equals(e.getKey()))
         *                     correctEntry = e;
         *             }
         *         }
         *
         *         V oldValue = null;
         *         if (correctEntry !=null) {
         *             oldValue = correctEntry.getValue();
         *             i.remove();
         *         }
         *         return oldValue;
         *     }
         */
        // 将map的值添加到此map中
        /*
         * public void putAll(Map<? extends K, ? extends V> m) {
         *         for (Map.Entry<? extends K, ? extends V> e : m.entrySet())
         *             put(e.getKey(), e.getValue());
         *     }
         */
        // 清空map
        /*
         * public void clear() {
         *         entrySet().clear();
         *     }
         */
        // 获取key的Set集合
        /*
         * public Set<K> keySet() {
         *         Set<K> ks = keySet;
         *         if (ks == null) {
         *             ks = new AbstractSet<K>() {
         *                 public Iterator<K> iterator() {
         *                     return new Iterator<K>() {
         *                         private Iterator<Entry<K,V>> i = entrySet().iterator();
         *
         *                         public boolean hasNext() {
         *                             return i.hasNext();
         *                         }
         *
         *                         public K next() {
         *                             return i.next().getKey();
         *                         }
         *
         *                         public void remove() {
         *                             i.remove();
         *                         }
         *                     };
         *                 }
         *
         *                 public int size() {
         *                     return AbstractMap.this.size();
         *                 }
         *
         *                 public boolean isEmpty() {
         *                     return AbstractMap.this.isEmpty();
         *                 }
         *
         *                 public void clear() {
         *                     AbstractMap.this.clear();
         *                 }
         *
         *                 public boolean contains(Object k) {
         *                     return AbstractMap.this.containsKey(k);
         *                 }
         *             };
         *             keySet = ks;
         *         }
         *         return ks;
         *     }
         */
        // 获取value集合
        /*
         * public Collection<V> values() {
         *         Collection<V> vals = values;
         *         if (vals == null) {
         *             vals = new AbstractCollection<V>() {
         *                 public Iterator<V> iterator() {
         *                     return new Iterator<V>() {
         *                         private Iterator<Entry<K,V>> i = entrySet().iterator();
         *
         *                         public boolean hasNext() {
         *                             return i.hasNext();
         *                         }
         *
         *                         public V next() {
         *                             return i.next().getValue();
         *                         }
         *
         *                         public void remove() {
         *                             i.remove();
         *                         }
         *                     };
         *                 }
         *
         *                 public int size() {
         *                     return AbstractMap.this.size();
         *                 }
         *
         *                 public boolean isEmpty() {
         *                     return AbstractMap.this.isEmpty();
         *                 }
         *
         *                 public void clear() {
         *                     AbstractMap.this.clear();
         *                 }
         *
         *                 public boolean contains(Object v) {
         *                     return AbstractMap.this.containsValue(v);
         *                 }
         *             };
         *             values = vals;
         *         }
         *         return vals;
         *     }
         */
        // entity集合 public abstract Set<Entry<K,V>> entrySet();
        // equals方法
        /*
         * public boolean equals(Object o) {
         *         if (o == this)
         *             return true;
         *
         *         if (!(o instanceof Map))
         *             return false;
         *         Map<?,?> m = (Map<?,?>) o;
         *         if (m.size() != size())
         *             return false;
         *
         *         try {
         *             Iterator<Entry<K,V>> i = entrySet().iterator();
         *             while (i.hasNext()) {
         *                 Entry<K,V> e = i.next();
         *                 K key = e.getKey();
         *                 V value = e.getValue();
         *                 if (value == null) {
         *                     if (!(m.get(key)==null && m.containsKey(key)))
         *                         return false;
         *                 } else {
         *                     if (!value.equals(m.get(key)))
         *                         return false;
         *                 }
         *             }
         *         } catch (ClassCastException unused) {
         *             return false;
         *         } catch (NullPointerException unused) {
         *             return false;
         *         }
         *
         *         return true;
         *     }
         */
        // hashCode方法
        /*
         * public int hashCode() {
         *         int h = 0;
         *         Iterator<Entry<K,V>> i = entrySet().iterator();
         *         while (i.hasNext())
         *             h += i.next().hashCode();
         *         return h;
         *     }
         */
        // toString方法
        /*
         * public String toString() {
         *         Iterator<Entry<K,V>> i = entrySet().iterator();
         *         if (! i.hasNext())
         *             return "{}";
         *
         *         StringBuilder sb = new StringBuilder();
         *         sb.append('{');
         *         for (;;) {
         *             Entry<K,V> e = i.next();
         *             K key = e.getKey();
         *             V value = e.getValue();
         *             sb.append(key   == this ? "(this Map)" : key);
         *             sb.append('=');
         *             sb.append(value == this ? "(this Map)" : value);
         *             if (! i.hasNext())
         *                 return sb.append('}').toString();
         *             sb.append(',').append(' ');
         *         }
         *     }
         */
        // 返回map的浅copy
        /*
         * protected Object clone() throws CloneNotSupportedException {
         *         AbstractMap<?,?> result = (AbstractMap<?,?>)super.clone();
         *         result.keySet = null;
         *         result.values = null;
         *         return result;
         *     }
         */
        // 比较o1、o2是否相等 会先判null
        /*
         * private static boolean eq(Object o1, Object o2) {
         *         return o1 == null ? o2 == null : o1.equals(o2);
         *     }
         */
        // transient Set<K>        keySet; key的集合
        // transient Collection<V> values; value的集合
    }
}
