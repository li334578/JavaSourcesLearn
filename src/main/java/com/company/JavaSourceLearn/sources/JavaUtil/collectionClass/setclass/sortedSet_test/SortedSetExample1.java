package main.java.com.company.JavaSourceLearn.sources.JavaUtil.collectionClass.setclass.sortedSet_test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : SortedSet
 * @date : 2021-01-14 20:24:11
 */
public class SortedSetExample1 {
    public static void main(String[] args) {
        // extends Set<E>
        // 返回用于对该集合中的元素进行排序的比较器；如果此集合使用其元素的自然排序，则返回null 。
        // Comparator<? super E> comparator();
        // 切割set
        // SortedSet<E> subSet(E fromElement, E toElement);
        // 从头到toElement
        // SortedSet<E> headSet(E toElement);
        // 从fromElement到尾
        // SortedSet<E> tailSet(E fromElement);
        // 获取第一个元素
        // E first();
        // 获取最后一个元素
        // E last();
        // 分离器
        /*
         * @Override
         *     default Spliterator<E> spliterator() {
         *         return new Spliterators.IteratorSpliterator<E>(
         *                 this, Spliterator.DISTINCT | Spliterator.SORTED | Spliterator.ORDERED) {
         *             @Override
         *             public Comparator<? super E> getComparator() {
         *                 return SortedSet.this.comparator();
         *             }
         *         };
         *     }
         */

    }
}
