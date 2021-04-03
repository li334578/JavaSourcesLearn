package com.company.JavaSourceLearn.sources.JavaLang.stringClass.StringBuffer_test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : StringBuffer
 * @date : 2021-01-01 16:31:31
 */
public class StringBufferExample1 {
    public static void main(String[] args) {
        //extends AbstractStringBuilder
        //implements java.io.Serializable, CharSequence
        // 主要记录和StringBuilder有区别的方法
        // 获取length 使用了synchronized
        /*
         * public synchronized int length() {
         *         return count;
         *     }
         */
        // 获取容量 synchronized
        /*
         * public synchronized int capacity() {
         *         return value.length;
         *     }
         */
        StringBuffer stringBuffer = new StringBuffer("123456");
        System.out.println(stringBuffer.length()); // 6
        System.out.println(stringBuffer.capacity()); // 16 + 6
        // 当前value可以存储的字符容量，即在下一次重新申请内存之前能存储字符序列的长度。
        /*
         * public synchronized void ensureCapacity(int minimumCapacity) {
         *         super.ensureCapacity(minimumCapacity);
         *     }
         */
        // 释放无用空间
        /*
         * public synchronized void trimToSize() {
         *         super.trimToSize();
         *     }
         */
        stringBuffer.trimToSize();
        System.out.println(stringBuffer.length()); // 6
        System.out.println(stringBuffer.capacity()); // 6
        // 设置length
        /*
         * public synchronized void setLength(int newLength) {
         *         toStringCache = null;
         *         super.setLength(newLength);
         *     }
         */
        stringBuffer.setLength(10);
        System.out.println(stringBuffer.length()); // 10
        System.out.println(stringBuffer.capacity()); // 14
        // 获取指定索引的字符
        /*
         * public synchronized char charAt(int index) {
         *         if ((index < 0) || (index >= count))
         *             throw new StringIndexOutOfBoundsException(index);
         *         return value[index];
         *     }
         */
        // 获取指定索引位置的字符的codePoint
        /*
         * public synchronized int codePointAt(int index) {
         *         return super.codePointAt(index);
         *     }
         */
        // 获取指定索引位置的前一个位置的字符的codePoint
        /*
         * public synchronized int codePointBefore(int index) {
         *         return super.codePointBefore(index);
         *     }
         */
        // 计算beginIndex~endIndex的length
        /*
         * public synchronized int codePointCount(int beginIndex, int endIndex) {
         *         return super.codePointCount(beginIndex, endIndex);
         *     }
         */
        // 计算index到codePointOffset+index的length
        /*
         * public synchronized int offsetByCodePoints(int index, int codePointOffset) {
         *         return super.offsetByCodePoints(index, codePointOffset);
         *     }
         */
        // 获取StringBuffer的SrcBegin~srcEnd位置的char[]到dst的dstBegin开始
        /*
         * public synchronized void getChars(int srcBegin, int srcEnd, char[] dst,
         *                                       int dstBegin)
         *     {
         *         super.getChars(srcBegin, srcEnd, dst, dstBegin);
         *     }
         */
        // 设置指定index索引位置的字符为ch
        /*
         * public synchronized void setCharAt(int index, char ch) {
         *         if ((index < 0) || (index >= count))
         *             throw new StringIndexOutOfBoundsException(index);
         *         toStringCache = null;
         *         value[index] = ch;
         *     }
         */
        // 别的方法同StringBuilder只不过加上了synchronized关键字
        // toString返回的最后一个值的缓存。 每当修改StringBuffer时清除。
        // private transient char[] toStringCache;
    }
}
