package com.company.sources.JavaUtil.collectionClass.setclass.hashSet_test;

import java.util.HashSet;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : HashSet
 * @date : 2021-01-06 21:47:43
 */
public class HashSetExample1 {
    public static void main(String[] args) {
        // extends AbstractSet<E>
        //    implements Set<E>, Cloneable, java.io.Serializable
        // 构造方法
        // 无参构造
        /*
         * public HashSet() {
         *         map = new HashMap<>();
         *     }
         */
        // 根据集合c构建一个HashSet
        /*
         * public HashSet(Collection<? extends E> c) {
         *         map = new HashMap<>(Math.max((int) (c.size()/.75f) + 1, 16));
         *         addAll(c);
         *     }
         */
        // 指定初始容量和负载因子的构造 底层是HashMap
        /*
         * public HashSet(int initialCapacity, float loadFactor) {
         *         map = new HashMap<>(initialCapacity, loadFactor);
         *     }
         */
        // 指定初始容量的构造
        /*
         * public HashSet(int initialCapacity) {
         *         map = new HashMap<>(initialCapacity);
         *     }
         */
        // 指定初始容量和负载因子的构造 dummy用于区分其他构造 底层是LinkedHashMap
        /*
         * HashSet(int initialCapacity, float loadFactor, boolean dummy) {
         *         map = new LinkedHashMap<>(initialCapacity, loadFactor);
         *     }
         */
        // 迭代器
        /*
         * public Iterator<E> iterator() {
         *         return map.keySet().iterator();
         *     }
         */
        // 返回元素个数
        /*
         * public int size() {
         *         return map.size();
         *     }
         */
        // 判断HashSet是否为空
        /*
         * public boolean isEmpty() {
         *         return map.isEmpty();
         *     }
         */
        // 判断是够包含key o
        /*
         * public boolean contains(Object o) {
         *         return map.containsKey(o);
         *     }
         */
        // 添加元素e
        /*
         * public boolean add(E e) {
         *         return map.put(e, PRESENT)==null;
         *     }
         */
        // 移除元素o
        /*
         * public boolean remove(Object o) {
         *         return map.remove(o)==PRESENT;
         *     }
         */
        // 从set中移除所有元素
        /*
         * public void clear() {
         *         map.clear();
         *     }
         */
        // 获取浅copy
        /*
         * @SuppressWarnings("unchecked")
         *     public Object clone() {
         *         try {
         *             HashSet<E> newSet = (HashSet<E>) super.clone();
         *             newSet.map = (HashMap<E, Object>) map.clone();
         *             return newSet;
         *         } catch (CloneNotSupportedException e) {
         *             throw new InternalError(e);
         *         }
         *     }
         */
        // 将HashSet序列化到流
        /*
         * private void writeObject(java.io.ObjectOutputStream s)
         *         throws java.io.IOException {
         *         // Write out any hidden serialization magic
         *         s.defaultWriteObject();
         *
         *         // Write out HashMap capacity and load factor
         *         s.writeInt(map.capacity());
         *         s.writeFloat(map.loadFactor());
         *
         *         // Write out size
         *         s.writeInt(map.size());
         *
         *         // Write out all elements in the proper order.
         *         for (E e : map.keySet())
         *             s.writeObject(e);
         *     }
         */
        // 从流中反序列化
        /*
         * private void readObject(java.io.ObjectInputStream s)
         *         throws java.io.IOException, ClassNotFoundException {
         *         // Read in any hidden serialization magic
         *         s.defaultReadObject();
         *
         *         // Read capacity and verify non-negative.
         *         int capacity = s.readInt();
         *         if (capacity < 0) {
         *             throw new InvalidObjectException("Illegal capacity: " +
         *                                              capacity);
         *         }
         *
         *         // Read load factor and verify positive and non NaN.
         *         float loadFactor = s.readFloat();
         *         if (loadFactor <= 0 || Float.isNaN(loadFactor)) {
         *             throw new InvalidObjectException("Illegal load factor: " +
         *                                              loadFactor);
         *         }
         *
         *         // Read size and verify non-negative.
         *         int size = s.readInt();
         *         if (size < 0) {
         *             throw new InvalidObjectException("Illegal size: " +
         *                                              size);
         *         }
         *
         *         // Set the capacity according to the size and load factor ensuring that
         *         // the HashMap is at least 25% full but clamping to maximum capacity.
         *         capacity = (int) Math.min(size * Math.min(1 / loadFactor, 4.0f),
         *                 HashMap.MAXIMUM_CAPACITY);
         *
         *         // Create backing HashMap
         *         map = (((HashSet<?>)this) instanceof LinkedHashSet ?
         *                new LinkedHashMap<E,Object>(capacity, loadFactor) :
         *                new HashMap<E,Object>(capacity, loadFactor));
         *
         *         // Read in all elements in the proper order.
         *         for (int i=0; i<size; i++) {
         *             @SuppressWarnings("unchecked")
         *                 E e = (E) s.readObject();
         *             map.put(e, PRESENT);
         *         }
         *     }
         */
        // 分离器
        /*
         * public Spliterator<E> spliterator() {
         *         return new HashMap.KeySpliterator<E,Object>(map, 0, -1, 0, 0);
         *     }
         */
        // static final long serialVersionUID = -5024744406713321676L; 序列化参数
        // private transient HashMap<E,Object> map; 底层是map
        // map的虚拟化object
        // private static final Object PRESENT = new Object()
    }
}
