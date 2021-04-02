package main.java.com.company.JavaSourceLearn.sources.JavaUtil.otherClass;

import java.util.BitSet;

/**
 * @Author: liwenbo
 * @Date: 29/3/2021
 * @Description:
 */
public class BitSetTest {
    public static void main(String[] args) {
        /*
         * BitSet 是不安全的，除非外部同步多线程使用。
         * 集合中的所有位的初始值false。
         * 传递一个null参数到BitSet中的任何方法会导致一个NullPointerException。
         */
        BitSet bitSet = new BitSet(16);
        BitSet bitSet2 = new BitSet(16);
        // 将bitSet中所有值设置为true
        int cardinality = bitSet.cardinality();
        // 将bitSet中所有值设置为false
        bitSet2.clear();
        // 设置指定索引位置的值为false
        bitSet.clear(2);
        // 指定索引范围的值设置为false [fromIndex,toIndex)
        bitSet.clear(3, 5);
        bitSet.set(1);
        // 遍历所有元素执行逻辑与
        bitSet.and(bitSet2);
        // 在指定索引位置 设置当前值的补码
        bitSet.flip(2);
        // 此方法设置每个位将指定的fromIndex（包括）到指定的toIndex（不包括）为其当前值的补码。
        bitSet.flip(4, 5);
        // 获取指定索引位置的boolean值
        boolean booleanValue = bitSet.get(2);
        // 获取指定索引范围的bitSet
        BitSet bitSet1 = bitSet.get(2, 5);
        // 指定的bitSet中有true 此bitSet中的任何位此方法都返回true
        boolean intersects = bitSet.intersects(bitSet1);
        // 如果此BitSet中没有包含位被设置为true，此方法返回true。
        boolean empty = bitSet.isEmpty();
        // 此方法返回此BitSet的“逻辑大小”：在BitSet中最高设置位加一的索引。
        int length = bitSet.length();
        // 从fromIndex索引后设置为true
        int i = bitSet.nextSetBit(2);
        // 从fromIndex索引后设置为false
        int i1 = bitSet.nextClearBit(2);
        // 遍历执行或运算
        bitSet.or(bitSet1);
        // 返回bitSet的字符串形式
        String s = bitSet.toString();
        // 循环执行逻辑异或
        bitSet.xor(bitSet1);
    }
}
