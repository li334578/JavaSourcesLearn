package com.company.JavaSourceLearn.sources.JavaLang.otherClass.ThreadLocal_test;


/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : ThreadLocal
 * @date : 2021-01-03 20:24:46
 */
public class ThreadLocalExample1 {
    public static void main(String[] args) {
        // 内部类
        // SuppliedThreadLocal ThreadLocal的扩展，从指定的Supplier中获取其初始值
        /*
         * SuppliedThreadLocal(Supplier<? extends T> supplier) {
         *             this.supplier = Objects.requireNonNull(supplier);
         *         }
         */
        // private final Supplier<? extends T> supplier; 属性
        // 初始值
        /*
         * protected T initialValue() {
         *             return supplier.get();
         *         }
         */
        // ThreadLocalMap是一个自定义的哈希映射，仅适用于维护线程局部值
        // 内部内部类
        /*
         * static class Entry extends WeakReference<ThreadLocal<?>> {
         * 继承WeakReference
         *             Object value; 属性
         * 给属性赋值的方法
         *             Entry(ThreadLocal<?> k, Object v) {
         *                 super(k);
         *                 value = v;
         *             }
         *         }
         */
        // 构造一个最初包含（firstKey，firstValue）的新map。
        // ThreadLocalMaps是延迟构造的，因此只有在至少要放置一个条目时才创建一个 懒汉
        /*
         * ThreadLocalMap(ThreadLocal<?> firstKey, Object firstValue) {
         *             table = new Entry[INITIAL_CAPACITY]; 初始值为16
         *             int i = firstKey.threadLocalHashCode & (INITIAL_CAPACITY - 1);
         *             table[i] = new Entry(firstKey, firstValue);
         *             size = 1;
         *             setThreshold(INITIAL_CAPACITY);
         *         }
         */
        // 构造一个新map，其中包括给定父map中的所有可继承ThreadLocals。
        // 仅由createInheritedMap调用
        /*
         * private ThreadLocalMap(ThreadLocalMap parentMap) {
         *             Entry[] parentTable = parentMap.table;
         *             int len = parentTable.length;
         *             setThreshold(len);
         *             table = new Entry[len];
         *
         *             for (int j = 0; j < len; j++) {
         *                 Entry e = parentTable[j];
         *                 if (e != null) {
         *                     @SuppressWarnings("unchecked")
         *                     ThreadLocal<Object> key = (ThreadLocal<Object>) e.get();
         *                     if (key != null) {
         *                         Object value = key.childValue(e.value);
         *                         Entry c = new Entry(key, value);
         *                         int h = key.threadLocalHashCode & (len - 1);
         *                         while (table[h] != null)
         *                             h = nextIndex(h, len);
         *                         table[h] = c;
         *                         size++;
         *                     }
         *                 }
         *             }
         *         }
         */
        // 扩充阈值 当前长度的2/3
        /*
         * private void setThreshold(int len) {
         *             threshold = len * 2 / 3;
         *         }
         */
        // 增量模块 获取下一个存储位置
        /*
         * private static int nextIndex(int i, int len) {
         *             return ((i + 1 < len) ? i + 1 : 0);
         *         }
         */
        // 减量模块 获取上一个变量位置
        /*
         * private static int prevIndex(int i, int len) {
         *             return ((i - 1 >= 0) ? i - 1 : len - 1);
         *         }
         */
        // 获取与键关联的条目 获取key对应的实体
        /*
         * private Entry getEntry(ThreadLocal<?> key) {
         *              计算HashCode获取存储位置
         *             int i = key.threadLocalHashCode & (table.length - 1);
         *             Entry e = table[i];
         *             if (e != null && e.get() == key)
         *                  存在HashCode直接返回
         *                 return e;
         *             else
         *                  不存在HashCode调用此方法
         *                 return getEntryAfterMiss(key, i, e);
         *         }
         */
        // 当在其直接哈希槽中找不到密钥时使用的getEntry方法的版本
        // getEntryAfterMiss线性探测，
        // 过程中每碰到无效slot，调用expungeStaleEntry进行段清理；如果找到了key，则返回结果entry
        /*
         * private Entry getEntryAfterMiss(ThreadLocal<?> key, int i, Entry e) {
         *             Entry[] tab = table;
         *             int len = tab.length;
         *
         *             while (e != null) {
         *                 ThreadLocal<?> k = e.get();
         *                 if (k == key)
         *                     return e;
         *                 if (k == null)
         *                      无效的slot进行段清理
         *                     expungeStaleEntry(i);
         *                 else
         *                     i = nextIndex(i, len);
         *                  从hashtable下的链表的索引取值
         *                 e = tab[i];
         *             }
         *              没有key 返回null
         *             return null;
         *         }
         */
        // 设置与键关联的值。
        /*
         * private void set(ThreadLocal<?> key, Object value) {
         *
         *             Entry[] tab = table;
         *             int len = tab.length;
         *             int i = key.threadLocalHashCode & (len-1);
         *
         *             for (Entry e = tab[i];
         *                  e != null;
         *                  e = tab[i = nextIndex(i, len)]) {
         *                 ThreadLocal<?> k = e.get();
         *
         *                 if (k == key) {
         *                     e.value = value;
         *                     return;
         *                 }
         *
         *                 if (k == null) {
         *                     replaceStaleEntry(key, value, i);
         *                     return;
         *                 }
         *             }
         *
         *             tab[i] = new Entry(key, value);
         *             int sz = ++size;
         *             if (!cleanSomeSlots(i, sz) && sz >= threshold)
         *                 rehash();
         *         }
         */
        // 移除key entity值
        /*
         * private void remove(ThreadLocal<?> key) {
         *             Entry[] tab = table;
         *             int len = tab.length;
         *             int i = key.threadLocalHashCode & (len-1);
         *             for (Entry e = tab[i];
         *                  e != null;
         *                  e = tab[i = nextIndex(i, len)]) {
         *                 if (e.get() == key) {
         *                     e.clear();
         *                     expungeStaleEntry(i);
         *                     return;
         *                 }
         *             }
         *         }
         */
        // 将设置操作期间遇到的陈旧条目替换为指定键的条目。
        // 无论指定键的条目是否已存在，在value参数中传递的值都存储在该条目中。
        // 副作用是，此方法删除了包含过时条目的“运行”中的所有过时条目。 (运行是两个空槽之间的一系列输入。)
        /**
         * private void replaceStaleEntry(ThreadLocal<?> key, Object value,
         *                                        int staleSlot) {
         *             Entry[] tab = table;
         *             int len = tab.length;
         *             Entry e;
         *              //备份以检查当前运行中是否有过时的条目。
         *              //我们一次清除整个运行，以避免由于垃圾收集器释放大量的引用
         *              //（即，每当收集器运行时）而导致的连续重新哈希处理
         *             // Back up to check for prior stale entry in current run.
         *             // We clean out whole runs at a time to avoid continual
         *             // incremental rehashing due to garbage collector freeing
         *             // up refs in bunches (i.e., whenever the collector runs).
         *             int slotToExpunge = staleSlot;
         *             for (int i = prevIndex(staleSlot, len);
         *                  (e = tab[i]) != null;
         *                  i = prevIndex(i, len))
         *                 if (e.get() == null)
         *                     slotToExpunge = i;
         *
         *             // Find either the key or trailing null slot of run, whichever
         *             // occurs first
         *             for (int i = nextIndex(staleSlot, len);
         *                  (e = tab[i]) != null;
         *                  i = nextIndex(i, len)) {
         *                 ThreadLocal<?> k = e.get();
         *
         *                 // If we find key, then we need to swap it
         *                 // with the stale entry to maintain hash table order.
         *                 // The newly stale slot, or any other stale slot
         *                 // encountered above it, can then be sent to expungeStaleEntry
         *                 // to remove or rehash all of the other entries in run.
         *                 if (k == key) {
         *                     e.value = value;
         *
         *                     tab[i] = tab[staleSlot];
         *                     tab[staleSlot] = e;
         *
         *                     // Start expunge at preceding stale entry if it exists
         *                     if (slotToExpunge == staleSlot)
         *                         slotToExpunge = i;
         *                     cleanSomeSlots(expungeStaleEntry(slotToExpunge), len);
         *                     return;
         *                 }
         *
         *                 // If we didn't find stale entry on backward scan, the
         *                 // first stale entry seen while scanning for key is the
         *                 // first still present in the run.
         *                 if (k == null && slotToExpunge == staleSlot)
         *                     slotToExpunge = i;
         *             }
         *
         *             // If key not found, put new entry in stale slot
         *             tab[staleSlot].value = null;
         *             tab[staleSlot] = new Entry(key, value);
         *
         *             // If there are any other stale entries in run, expunge them
         *             if (slotToExpunge != staleSlot)
         *                 cleanSomeSlots(expungeStaleEntry(slotToExpunge), len);
         *         }
         */
        // 通过重新散列位于staleSlot和下一个null插槽之间的任何可能冲突的条目来清除陈旧的条目。
        // 这还会清除尾随null之前遇到的所有其他过时的条目。
        /*
         * private int expungeStaleEntry(int staleSlot) {
         *             Entry[] tab = table;
         *             int len = tab.length;
         *
         *             // expunge entry at staleSlot
         *             tab[staleSlot].value = null;
         *             tab[staleSlot] = null;
         *             size--;
         *
         *             // Rehash until we encounter null
         *             Entry e;
         *             int i;
         *             for (i = nextIndex(staleSlot, len);
         *                  (e = tab[i]) != null;
         *                  i = nextIndex(i, len)) {
         *                 ThreadLocal<?> k = e.get();
         *                 if (k == null) {
         *                     e.value = null;
         *                     tab[i] = null;
         *                     size--;
         *                 } else {
         *                     int h = k.threadLocalHashCode & (len - 1);
         *                     if (h != i) {
         *                         tab[i] = null;
         *
         *                         // Unlike Knuth 6.4 Algorithm R, we must scan until
         *                         // null because multiple entries could have been stale.
         *                         while (tab[h] != null)
         *                             h = nextIndex(h, len);
         *                         tab[h] = e;
         *                     }
         *                 }
         *             }
         *             return i;
         *         }
         */
        // 清除无效条目
        /*
         * private boolean cleanSomeSlots(int i, int n) {
         *             boolean removed = false;
         *             Entry[] tab = table;
         *             int len = tab.length;
         *             do {
         *                 i = nextIndex(i, len);
         *                 Entry e = tab[i];
         *                 if (e != null && e.get() == null) {
         *                     n = len;
         *                     removed = true;
         *                     i = expungeStaleEntry(i);
         *                 }
         *             } while ( (n >>>= 1) != 0);
         *             return removed;
         *         }
         */
        // 重新包装和/或调整大小。 首先扫描整个表，删除陈旧的条目。
        // 如果这样不能充分缩小大小，则将表格加倍。
        /*
         * private void rehash() {
         *             expungeStaleEntries();
         *             if (size >= threshold - threshold / 4)
         *                 resize();
         *         }
         */
        // 将表的容量加倍。 原来的值的位置需要重新计算
        /*
         * private void resize() {
         *             Entry[] oldTab = table;
         *             int oldLen = oldTab.length;
         *             int newLen = oldLen * 2;
         *             Entry[] newTab = new Entry[newLen];
         *             int count = 0;
         *
         *             for (int j = 0; j < oldLen; ++j) {
         *                 Entry e = oldTab[j];
         *                 if (e != null) {
         *                     ThreadLocal<?> k = e.get();
         *                     if (k == null) {
         *                         e.value = null; // Help the GC
         *                     } else {
         *                         int h = k.threadLocalHashCode & (newLen - 1);
         *                         while (newTab[h] != null)
         *                             h = nextIndex(h, newLen);
         *                         newTab[h] = e;
         *                         count++;
         *                     }
         *                 }
         *             }
         *
         *             setThreshold(newLen);
         *             size = count;
         *             table = newTab;
         *         }
         */
        // 清除表中所有过时的条目。
        /*
         * private void expungeStaleEntries() {
         *             Entry[] tab = table;
         *             int len = tab.length;
         *             for (int j = 0; j < len; j++) {
         *                 Entry e = tab[j];
         *                 if (e != null && e.get() == null)
         *                     expungeStaleEntry(j);
         *             }
         *         }
         */
        // 初始容量大小 16 必须为2的n次幂
        // private static final int INITIAL_CAPACITY = 16;
        // 该表，根据需要调整大小。 table.length必须始终为2的幂
        // private Entry[] table;
        // 表中的条目数
        // private int size = 0;
        // 下一个要调整大小的大小值
        // private int threshold; 默认为0
        // Threadlocal构造
        // 无参
        /*
         * public ThreadLocal() {
         *     }
         */
        // 获取下一个HashCode值
        /*
         * private static int nextHashCode() {
         *         return nextHashCode.getAndAdd(HASH_INCREMENT);
         *     }
         */
        // 获取初始值 调用set方法后才能调用该方法应使用匿名内部类重写该方法
        /*
         * protected T initialValue() {
         *         return null;
         *     }
         */
        // 创建线程局部变量。 变量的初始值是通过在Supplier上调用get方法确定的。
        /*
         * public static <S> ThreadLocal<S> withInitial(Supplier<? extends S> supplier) {
         *         return new SuppliedThreadLocal<>(supplier);
         *     }
         */
        // 返回此线程局部变量的当前线程副本中的值。
        // 如果该变量没有当前线程的值，则首先将其初始化为通过调用initialValue方法返回的值
        /*
         * public T get() {
         *         Thread t = Thread.currentThread();
         *         ThreadLocalMap map = getMap(t);
         *         if (map != null) {
         *             ThreadLocalMap.Entry e = map.getEntry(this);
         *             if (e != null) {
         *                 @SuppressWarnings("unchecked")
         *                 T result = (T)e.value;
         *                 return result;
         *             }
         *         }
         *         return setInitialValue();
         *     }
         */
        // set（）的变体以建立initialValue。 如果用户已覆盖set（）方法，请使用它代替set（）。
        // 设置初始值
        /*
         * private T setInitialValue() {
         *         T value = initialValue();
         *         Thread t = Thread.currentThread();
         *         ThreadLocalMap map = getMap(t);
         *         if (map != null)
         *             map.set(this, value);
         *         else
         *             createMap(t, value);
         *         return value;
         *     }
         */
        // 将此线程局部变量的当前线程副本设置为指定值。
        // 大多数子类将不需要重写此方法，而仅依靠initialValue方法来设置线程initialValue的值。
        /*
         * public void set(T value) {
         *         Thread t = Thread.currentThread();
         *         ThreadLocalMap map = getMap(t);
         *         if (map != null)
         *             map.set(this, value);
         *         else
         *             createMap(t, value);
         *     }
         */
        // 移除key entity
        /*
         * public void remove() {
         *          ThreadLocalMap m = getMap(Thread.currentThread());
         *          if (m != null)
         *              m.remove(this);
         *      }
         */
        // 获取线程关联的map值
        /*
         * ThreadLocalMap getMap(Thread t) {
         *         return t.threadLocals;
         *     }
         */
        // 创建与线程关联的map值
        /*
         * void createMap(Thread t, T firstValue) {
         *         t.threadLocals = new ThreadLocalMap(this, firstValue);
         *     }
         */
        // 创建继承的线程局部变量的映射的工厂方法。 设计为仅从Thread构造函数调用。
        /*
         * static ThreadLocalMap createInheritedMap(ThreadLocalMap parentMap) {
         *         return new ThreadLocalMap(parentMap);
         *     }
         */
        // 方法childValue在InheritableThreadLocal子类中可见地定义，
        // 但是在此内部定义是为了提供createInheritedMap工厂方法而无需在InheritableThreadLocal中子类化map类。
        // 此技术优于在方法中嵌入测试实例的替代方法。
        /*
         * T childValue(T parentValue) {
         *         throw new UnsupportedOperationException();
         *     }
         */
        // 下一个hashcode的值
        // ThreadLocals依赖于附加到每个线程（Thread.threadLocals和InheritableThreadLocals）的每线程线性探针哈希映射。
        // ThreadLocal对象充当键，通过threadLocalHashCode搜索。 这是一个自定义哈希码（仅在ThreadLocalMaps中有用），
        // 在相同的线程使用连续构造的ThreadLocals的常见情况下，它消除了冲突，而在不太常见的情况下，它们表现良好
        // private final int threadLocalHashCode = nextHashCode();
        // 下一个要给出的哈希码。 原子更新。 从零开始
        // private static AtomicInteger nextHashCode = new AtomicInteger();
        // 返回下一个HashCode值
        /*
         * private static int nextHashCode() {
         *         return nextHashCode.getAndAdd(HASH_INCREMENT);
         *     }
         */
    }
}
