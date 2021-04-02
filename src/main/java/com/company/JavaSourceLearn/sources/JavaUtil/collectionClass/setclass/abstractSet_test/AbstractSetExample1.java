package main.java.com.company.JavaSourceLearn.sources.JavaUtil.collectionClass.setclass.abstractSet_test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : AbstractSet
 * @date : 2021-01-06 21:43:32
 */
public class AbstractSetExample1 {
    public static void main(String[] args) {
        // 无参构造
        /*
         * protected AbstractSet() {
         *     }
         */
        // equals方法
        /*
         * public boolean equals(Object o) {
         *         if (o == this)
         *             return true;
         *
         *         if (!(o instanceof Set))
         *             return false;
         *         Collection<?> c = (Collection<?>) o;
         *         if (c.size() != size())
         *             return false;
         *         try {
         *             return containsAll(c);
         *         } catch (ClassCastException unused)   {
         *             return false;
         *         } catch (NullPointerException unused) {
         *             return false;
         *         }
         *     }
         */
        // hashCode方法
        /*
         * public int hashCode() {
         *         int h = 0;
         *         Iterator<E> i = iterator();
         *         while (i.hasNext()) {
         *             E obj = i.next();
         *             if (obj != null)
         *                 h += obj.hashCode();
         *         }
         *         return h;
         *     }
         */
        // 移除集合c中所有的元素
        /*
         * public boolean removeAll(Collection<?> c) {
         *         Objects.requireNonNull(c);
         *         boolean modified = false;
         *
         *         if (size() > c.size()) {
         *             for (Iterator<?> i = c.iterator(); i.hasNext(); )
         *                 modified |= remove(i.next());
         *         } else {
         *             for (Iterator<?> i = iterator(); i.hasNext(); ) {
         *                 if (c.contains(i.next())) {
         *                     i.remove();
         *                     modified = true;
         *                 }
         *             }
         *         }
         *         return modified;
         *     }
         */
    }
}
