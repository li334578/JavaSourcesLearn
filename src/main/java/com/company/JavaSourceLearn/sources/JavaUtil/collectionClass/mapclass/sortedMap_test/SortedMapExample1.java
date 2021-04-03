package com.company.JavaSourceLearn.sources.JavaUtil.collectionClass.mapclass.sortedMap_test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : SortedMap
 * @date : 2021-01-14 20:20:06
 */
public class SortedMapExample1 {
    public static void main(String[] args) {
        // extends Map<K,V>
        // 返回用于在此映射中对键进行排序的比较器；如果此映射使用其键的自然顺序，则返回null 。
        // Comparator<? super K> comparator();
        // 切割map
        // SortedMap<K,V> subMap(K fromKey, K toKey);
        // 返回此映射部分的视图，该视图的键严格小于toKey
        // SortedMap<K,V> headMap(K toKey);
        // 从fromKey到末尾
        // SortedMap<K,V> tailMap(K fromKey);
        // 返回第一个key值
        // K firstKey();
        // 返回最后一个key值
        // K lastKey();
        // 获取keySet
        // Set<K> keySet();
        // 获取value集合
        // Collection<V> values();
        // 获取entrySet
        // Set<Map.Entry<K, V>> entrySet();
    }
}
