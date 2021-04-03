package com.company.JavaSourceLearn.sources.JavaLang.stringClass.StringBuilder_test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : StringBuilder
 * @date : 2021-01-01 14:21:23
 */
public class StringBuilderExample1 {
    public static void main(String[] args) {
        // extends AbstractStringBuilder
        // implements java.io.Serializable, CharSequence
        // 构造
        // 默认容量16
        /*
         * public StringBuilder() {
         *         super(16);
         *     }
         */
        // 指定容量的构造
        /*
         * public StringBuilder(int capacity) {
         *         super(capacity);
         *     }
         */
        // 指定初始值String构造 容量为str.length()+16
        /*
         * public StringBuilder(String str) {
         *         super(str.length() + 16);
         *         append(str);
         *     }
         */
        // 指定初始值CharSequence构造 容量为seq.length()+16
        /*
         * public StringBuilder(CharSequence seq) {
         *         this(seq.length() + 16);
         *         append(seq);
         *     }
         */
        // 拼接方法Object
        /*
         * public StringBuilder append(Object obj) {
         *         return append(String.valueOf(obj));
         *     }
         */
        // 拼接方法String
        /*
         * public StringBuilder append(String str) {
         *         super.append(str);
         *         return this;
         *     }
         */
        // 拼接方法StringBuffer
        /*
         * public StringBuilder append(StringBuffer sb) {
         *         super.append(sb);
         *         return this;
         *     }
         */
        // 拼接方法CharSequence
        /*
         * public StringBuilder append(CharSequence s) {
         *         super.append(s);
         *         return this;
         *     }
         */
        // 拼接方法CharSequence 指定 CharSequence的范围
        /*
         * public StringBuilder append(CharSequence s, int start, int end) {
         *         super.append(s, start, end);
         *         return this;
         *     }
         */
        // 拼接方法char[]
        /*
         * public StringBuilder append(char[] str) {
         *         super.append(str);
         *         return this;
         *     }
         */
        // 拼接方法char[] 指定 char[]的范围
        /*
         * public StringBuilder append(char[] str, int offset, int len) {
         *         super.append(str, offset, len);
         *         return this;
         *     }
         */
        // 拼接方法boolean
        /*
         * public StringBuilder append(boolean b) {
         *         super.append(b);
         *         return this;
         *     }
         */
        // 拼接方法char
        /*
         * public StringBuilder append(char c) {
         *         super.append(c);
         *         return this;
         *     }
         */
        // 拼接方法int
        /*
         * public StringBuilder append(int i) {
         *         super.append(i);
         *         return this;
         *     }
         */
        // 拼接方法long
        /*
         * public StringBuilder append(long lng) {
         *         super.append(lng);
         *         return this;
         *     }
         */
        // 拼接方法float
        /*
         * public StringBuilder append(float f) {
         *         super.append(f);
         *         return this;
         *     }
         */
        // 拼接方法double
        /*
         * public StringBuilder append(double d) {
         *         super.append(d);
         *         return this;
         *     }
         */
        // 拼接方法codePoint对应的字符
        /*
         * public StringBuilder appendCodePoint(int codePoint) {
         *         super.appendCodePoint(codePoint);
         *         return this;
         *     }
         */
        // 移除指定范围的字符
        /*
         * public StringBuilder delete(int start, int end) {
         *         super.delete(start, end);
         *         return this;
         *     }
         */
        // 移除指定索引位置的字符
        /*
         * public StringBuilder deleteCharAt(int index) {
         *         super.deleteCharAt(index);
         *         return this;
         *     }
         */
        // 替换 将Start~end 替换为str 长度会发生改变
        /*
         * public StringBuilder replace(int start, int end, String str) {
         *         super.replace(start, end, str);
         *         return this;
         *     }
         */
        // 从StringBuilder的index位置插入char[]的offset~offset+len
        /*
         * public StringBuilder insert(int index, char[] str, int offset,
         *                                 int len)
         *     {
         *         super.insert(index, str, offset, len);
         *         return this;
         *     }
         */
        // 从StringBuilder的offset位置插入obj
        /*
         * public StringBuilder insert(int offset, Object obj) {
         *             super.insert(offset, obj);
         *             return this;
         *     }
         */
        // 从StringBuilder的offset位置插入str
        /*
         * public StringBuilder insert(int offset, String str) {
         *         super.insert(offset, str);
         *         return this;
         *     }
         */
        // 从StringBuilder的offset位置插入char[]
        /*
         * public StringBuilder insert(int offset, char[] str) {
         *         super.insert(offset, str);
         *         return this;
         *     }
         */
        // 从StringBuilder的dstOffset位置插入CharSequence
        /*
         * public StringBuilder insert(int dstOffset, CharSequence s) {
         *             super.insert(dstOffset, s);
         *             return this;
         *     }
         */
        // 从StringBuilder的dstOffset位置插入CharSequence的start~end
        /*
         * public StringBuilder insert(int dstOffset, CharSequence s,
         *                                 int start, int end)
         *     {
         *         super.insert(dstOffset, s, start, end);
         *         return this;
         *     }
         */
        // 从StringBuilder的offset位置插入boolean
        /*
         * public StringBuilder insert(int offset, boolean b) {
         *         super.insert(offset, b);
         *         return this;
         *     }
         */
        // 从StringBuilder的offset位置插入char
        /*
         * public StringBuilder insert(int offset, char c) {
         *         super.insert(offset, c);
         *         return this;
         *     }
         */
        // 从StringBuilder的offset位置插入int
        /*
         * public StringBuilder insert(int offset, int i) {
         *         super.insert(offset, i);
         *         return this;
         *     }
         */
        // 从StringBuilder的offset位置插入long
        /*
         * public StringBuilder insert(int offset, long l) {
         *         super.insert(offset, l);
         *         return this;
         *     }
         */
        // 从StringBuilder的offset位置插入float
        /*
         * public StringBuilder insert(int offset, float f) {
         *         super.insert(offset, f);
         *         return this;
         *     }
         */
        // 从StringBuilder的offset位置插入double
        /*
         * public StringBuilder insert(int offset, double d) {
         *         super.insert(offset, d);
         *         return this;
         *     }
         */
        // 返回str第一次出现的索引位置
        /*
         * public int indexOf(String str) {
         *         return super.indexOf(str);
         *     }
         */
        StringBuilder stringBuilder = new StringBuilder("hello world");
        System.out.println(stringBuilder.indexOf("x"));
        System.out.println(stringBuilder.indexOf("l"));
        System.out.println(stringBuilder.indexOf("lo"));
        System.out.println(stringBuilder.indexOf("lol"));
        // 返回str第一次出现的索引位置从fromIndex开始
        /*
         * public int indexOf(String str, int fromIndex) {
         *         return super.indexOf(str, fromIndex);
         *     }
         */
        // 反向查找 返回str第一次出现的索引位置
        /*
         * public int lastIndexOf(String str) {
         *         return super.lastIndexOf(str);
         *     }
         */
        // 反向查找 返回str第一次出现的索引位置 从fromIndex开始
        /*
         * public int lastIndexOf(String str, int fromIndex) {
         *         return super.lastIndexOf(str, fromIndex);
         *     }
         */
        // 字符串翻转方法
        /*
         * public StringBuilder reverse() {
         *         super.reverse();
         *         return this;
         *     }
         */
        // StringBuilder转String
        /*
         * public String toString() {
         *         // Create a copy, don't share the array
         *         return new String(value, 0, count);
         *     }
         */
        // 将StringBuilder实例的状态保存到流（即，对其进行序列化）。
        /*
         * private void writeObject(java.io.ObjectOutputStream s)
         *         throws java.io.IOException {
         *         s.defaultWriteObject();
         *         s.writeInt(count);
         *         s.writeObject(value);
         *     }
         */
        // 调用readObject可以从流中恢复StringBuffer的状态
        /*
         * private void readObject(java.io.ObjectInputStream s)
         *         throws java.io.IOException, ClassNotFoundException {
         *         s.defaultReadObject();
         *         count = s.readInt();
         *         value = (char[]) s.readObject();
         *     }
         */
        // 序列化ID static final long serialVersionUID = 4383685877147921099L;

    }
}
