package com.company.JavaSourceLearn.sources.JavaLang.stringClass.AbstractStringBuilder_test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : AbstractStringBuilder
 * @date : 2021-01-01 14:22:30
 */
public class AbstractStringBuilderExample1 {
    public static void main(String[] args) {
        // 抽象类 StringBuffer StringBuilder的父类
        // 构造方法
        // 无参构造
        /*
         * AbstractStringBuilder() {
         *     }
         */
        // 指定长度的AbstractStringBuilder构造
        /*
         * AbstractStringBuilder(int capacity) {
         *         value = new char[capacity];
         *     }
         */
        // 获取AbstractStringBuilder长度的方法
        /*
         * public int length() {
         *         return count;
         *     }
         */
        // 返回当前AbstractStringBuilder容量
        /*
         * public int capacity() {
         *         return value.length;
         *     }
         */
        // 确保容量至少等于指定的最小值。 如果当前容量小于该参数，那么将分配一个具有更大容量的新内部数组。
        // 新容量中的较大者 原来容量的两倍，再加上2
        // 当前value可以存储的字符容量，即在下一次重新申请内存之前能存储字符序列的长度。
        /*
         * public void ensureCapacity(int minimumCapacity) {
         *         if (minimumCapacity > 0)
         *             ensureCapacityInternal(minimumCapacity);
         *     }
         */
        // 用来确保容量至少等于指定的最小值,是该类的核心也是其两个实现类StringBuffer和StringBuilder的核心。
        // 1.判断入参minimumCapacity是否有效，即是否大于0，大于0执行ensureCapacityInternal方法，小于等于0则忽略。
        /*
         * private void ensureCapacityInternal(int minimumCapacity) {
         *         // overflow-conscious code
         *         if (minimumCapacity - value.length > 0) {
         *             value = Arrays.copyOf(value,
         *                     newCapacity(minimumCapacity));
         *         }
         *     }
         */
        // 返回至少等于给定最小容量的容量。 如果足够，则返回增加相同数量+ 2的当前容量。
        /*
         * private int newCapacity(int minCapacity) {
         *         // overflow-conscious code
         *         int newCapacity = (value.length << 1) + 2;
         *         if (newCapacity - minCapacity < 0) {
         *             newCapacity = minCapacity;
         *         }
         *         return (newCapacity <= 0 || MAX_ARRAY_SIZE - newCapacity < 0)
         *             ? hugeCapacity(minCapacity)
         *             : newCapacity;
         *     }
         */
        // 返回最大容量
        /*
         * private int hugeCapacity(int minCapacity) {
         *         if (Integer.MAX_VALUE - minCapacity < 0) { // overflow
         *             throw new OutOfMemoryError();
         *         }
         *         return (minCapacity > MAX_ARRAY_SIZE)
         *             ? minCapacity : MAX_ARRAY_SIZE;
         *     }
         */
        // 减少字符序列的使用空间，比如申请了100字符长度的空间，但是现在只用了60个，
        // 那剩下的40个无用的空间放在那里占内存，可以调用此方法释放掉未用到的内存。
        /*
         * public void trimToSize() {
         *         if (count < value.length) {
         *             value = Arrays.copyOf(value, count);
         *         }
         *     }
         */
        // 设置AbstractStringBuilder长度
        /*
         * public void setLength(int newLength) {
         *         if (newLength < 0)
         *             throw new StringIndexOutOfBoundsException(newLength);
         *         ensureCapacityInternal(newLength);
         *
         *         if (count < newLength) {
         *             Arrays.fill(value, count, newLength, '\0');
         *         }
         *
         *         count = newLength;
         *     }
         */
        // 取指定索引位置的字符
        /*
         * public char charAt(int index) {
         *         if ((index < 0) || (index >= count))
         *             throw new StringIndexOutOfBoundsException(index);
         *         return value[index];
         *     }
         */
        // 取指定索引位置的字符的Unicode码
        /*
         * public int codePointAt(int index) {
         *         if ((index < 0) || (index >= count)) {
         *             throw new StringIndexOutOfBoundsException(index);
         *         }
         *         return Character.codePointAtImpl(value, index, count);
         *     }
         */
        // 取指定索引位置的前一个位置的字符的Unicode码
        /*
         * public int codePointBefore(int index) {
         *         int i = index - 1;
         *         if ((i < 0) || (i >= count)) {
         *             throw new StringIndexOutOfBoundsException(index);
         *         }
         *         return Character.codePointBeforeImpl(value, index, 0);
         *     }
         */
        // beginIndex到endIndex位置的长度
        /*
         * public int codePointCount(int beginIndex, int endIndex) {
         *         if (beginIndex < 0 || endIndex > count || beginIndex > endIndex) {
         *             throw new IndexOutOfBoundsException();
         *         }
         *         return Character.codePointCountImpl(value, beginIndex, endIndex-beginIndex);
         *     }
         */
        // index到index+codePointOffset位置的长度
        /*
         * public int offsetByCodePoints(int index, int codePointOffset) {
         *         if (index < 0 || index > count) {
         *             throw new IndexOutOfBoundsException();
         *         }
         *         return Character.offsetByCodePointsImpl(value, 0, count,
         *                                                 index, codePointOffset);
         *     }
         */
        // srcBegin到srcEnd获取char类型的数组到dst从dstBegin索引位置开始
        /*
         * public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
         *     {
         *         if (srcBegin < 0)
         *             throw new StringIndexOutOfBoundsException(srcBegin);
         *         if ((srcEnd < 0) || (srcEnd > count))
         *             throw new StringIndexOutOfBoundsException(srcEnd);
         *         if (srcBegin > srcEnd)
         *             throw new StringIndexOutOfBoundsException("srcBegin > srcEnd");
         *         System.arraycopy(value, srcBegin, dst, dstBegin, srcEnd - srcBegin);
         *     }
         */
        // 设置index位置的字符为ch
        /*
         * public void setCharAt(int index, char ch) {
         *         if ((index < 0) || (index >= count))
         *             throw new StringIndexOutOfBoundsException(index);
         *         value[index] = ch;
         *     }
         */
        // 在AbstractStringBuilder末尾拼接object
        /*
         * public AbstractStringBuilder append(Object obj) {
         *         return append(String.valueOf(obj));
         *     }
         */
        // 在AbstractStringBuilder末尾拼接str
        /*
         * public AbstractStringBuilder append(String str) {
         *         if (str == null)
         *             return appendNull();
         *         int len = str.length();
         *         ensureCapacityInternal(count + len);
         *         str.getChars(0, len, value, count);
         *         count += len;
         *         return this;
         *     }
         */
        // 在AbstractStringBuilder末尾拼接StringBuffer对象
        /*
         * public AbstractStringBuilder append(StringBuffer sb) {
         *         if (sb == null)
         *             return appendNull();
         *         int len = sb.length();
         *         ensureCapacityInternal(count + len);
         *         sb.getChars(0, len, value, count);
         *         count += len;
         *         return this;
         *     }
         */
        // 在AbstractStringBuilder末尾拼接AbstractStringBuilder对象
        /*
         * AbstractStringBuilder append(AbstractStringBuilder asb) {
         *         if (asb == null)
         *             return appendNull();
         *         int len = asb.length();
         *         ensureCapacityInternal(count + len);
         *         asb.getChars(0, len, value, count);
         *         count += len;
         *         return this;
         *     }
         */
        // 在AbstractStringBuilder末尾拼接CharSequence字符序列
        /*
         * public AbstractStringBuilder append(CharSequence s) {
         *         if (s == null)
         *             return appendNull();
         *         if (s instanceof String)
         *             return this.append((String)s);
         *         if (s instanceof AbstractStringBuilder)
         *             return this.append((AbstractStringBuilder)s);
         *
         *         return this.append(s, 0, s.length());
         *     }
         */
        // 拼接参数为空时 返回"null"
        /*
         * private AbstractStringBuilder appendNull() {
         *         int c = count;
         *         ensureCapacityInternal(c + 4);
         *         final char[] value = this.value;
         *         value[c++] = 'n';
         *         value[c++] = 'u';
         *         value[c++] = 'l';
         *         value[c++] = 'l';
         *         count = c;
         *         return this;
         *     }
         */
        // 在AbstractStringBuilder末尾拼接字符序列s的start~end位置的字符
        /*
         * public AbstractStringBuilder append(CharSequence s, int start, int end) {
         *         if (s == null)
         *             s = "null";
         *         if ((start < 0) || (start > end) || (end > s.length()))
         *             throw new IndexOutOfBoundsException(
         *                 "start " + start + ", end " + end + ", s.length() "
         *                 + s.length());
         *         int len = end - start;
         *         ensureCapacityInternal(count + len);
         *         for (int i = start, j = count; i < end; i++, j++)
         *             value[j] = s.charAt(i);
         *         count += len;
         *         return this;
         *     }
         */
        // 在AbstractStringBuilder末尾拼接char数组str
        /*
         * public AbstractStringBuilder append(char[] str) {
         *         int len = str.length;
         *         ensureCapacityInternal(count + len);
         *         System.arraycopy(str, 0, value, count, len);
         *         count += len;
         *         return this;
         *     }
         */
        // 在AbstractStringBuilder末尾拼接char数组str的offset位置到offset+len
        /*
         * public AbstractStringBuilder append(char str[], int offset, int len) {
         *         if (len > 0)                // let arraycopy report AIOOBE for len < 0
         *             ensureCapacityInternal(count + len);
         *         System.arraycopy(str, offset, value, count, len);
         *         count += len;
         *         return this;
         *     }
         */
        // 在AbstractStringBuilder末尾拼接boolean值b "true" "false"
        /*
         * public AbstractStringBuilder append(boolean b) {
         *         if (b) {
         *             ensureCapacityInternal(count + 4);
         *             value[count++] = 't';
         *             value[count++] = 'r';
         *             value[count++] = 'u';
         *             value[count++] = 'e';
         *         } else {
         *             ensureCapacityInternal(count + 5);
         *             value[count++] = 'f';
         *             value[count++] = 'a';
         *             value[count++] = 'l';
         *             value[count++] = 's';
         *             value[count++] = 'e';
         *         }
         *         return this;
         *     }
         */
        // 在AbstractStringBuilder末尾拼接char
        /*
         * public AbstractStringBuilder append(char c) {
         *         ensureCapacityInternal(count + 1);
         *         value[count++] = c;
         *         return this;
         *     }
         */
        // 在AbstractStringBuilder末尾拼接int
        /*
         * public AbstractStringBuilder append(int i) {
         *         if (i == Integer.MIN_VALUE) {
         *             append("-2147483648");
         *             return this;
         *         }
         *         int appendedLength = (i < 0) ? Integer.stringSize(-i) + 1
         *                                      : Integer.stringSize(i);
         *         int spaceNeeded = count + appendedLength;
         *         ensureCapacityInternal(spaceNeeded);
         *         Integer.getChars(i, spaceNeeded, value);
         *         count = spaceNeeded;
         *         return this;
         *     }
         */
        // 在AbstractStringBuilder末尾拼接long
        /*
         * public AbstractStringBuilder append(long l) {
         *         if (l == Long.MIN_VALUE) {
         *             append("-9223372036854775808");
         *             return this;
         *         }
         *         int appendedLength = (l < 0) ? Long.stringSize(-l) + 1
         *                                      : Long.stringSize(l);
         *         int spaceNeeded = count + appendedLength;
         *         ensureCapacityInternal(spaceNeeded);
         *         Long.getChars(l, spaceNeeded, value);
         *         count = spaceNeeded;
         *         return this;
         *     }
         */
        // 在AbstractStringBuilder末尾拼接float
        /*
         * public AbstractStringBuilder append(float f) {
         *         FloatingDecimal.appendTo(f,this);
         *         return this;
         *     }
         */
        // 在AbstractStringBuilder末尾拼接double
        /*
         * public AbstractStringBuilder append(double d) {
         *         FloatingDecimal.appendTo(d,this);
         *         return this;
         *     }
         */
        // 删除此序列的子字符串中的字符。 子字符串从指定的start开始，并且如果不存在这样的字符，则扩展到索引end - 1处的字符或序列的末尾。
        // 删除字符序列指定区间的内容。这个操作不改变原序列的容量。
        /*
         * public AbstractStringBuilder delete(int start, int end) {
         *         if (start < 0)
         *             throw new StringIndexOutOfBoundsException(start);
         *         if (end > count)
         *             end = count;
         *         if (start > end)
         *             throw new StringIndexOutOfBoundsException();
         *         int len = end - start;
         *         if (len > 0) {
         *             System.arraycopy(value, start+len, value, start, count-end);
         *             count -= len;
         *         }
         *         return this;
         *     }
         */
        // 在AbstractStringBuilder末尾拼接codePoint对应的字符
        /*
         * public AbstractStringBuilder appendCodePoint(int codePoint) {
         *         final int count = this.count;
         *
         *         if (Character.isBmpCodePoint(codePoint)) {
         *             ensureCapacityInternal(count + 1);
         *             value[count] = (char) codePoint;
         *             this.count = count + 1;
         *         } else if (Character.isValidCodePoint(codePoint)) {
         *             ensureCapacityInternal(count + 2);
         *             Character.toSurrogates(codePoint, value, count);
         *             this.count = count + 2;
         *         } else {
         *             throw new IllegalArgumentException();
         *         }
         *         return this;
         *     }
         */
        // 删除指定index索引位置的字符
        /*
         * public AbstractStringBuilder deleteCharAt(int index) {
         *         if ((index < 0) || (index >= count))
         *             throw new StringIndexOutOfBoundsException(index);
         *         System.arraycopy(value, index+1, value, index, count-index-1);
         *         count--;
         *         return this;
         *     }
         */
        // 替换start位置到end位置的字符为str AbstractStringBuilder长度会改变
        /*
         * public AbstractStringBuilder replace(int start, int end, String str) {
         *         if (start < 0)
         *             throw new StringIndexOutOfBoundsException(start);
         *         if (start > count)
         *             throw new StringIndexOutOfBoundsException("start > length()");
         *         if (start > end)
         *             throw new StringIndexOutOfBoundsException("start > end");
         *
         *         if (end > count)
         *             end = count;
         *         int len = str.length();
         *         int newCount = count + len - (end - start);
         *         ensureCapacityInternal(newCount);
         *
         *         System.arraycopy(value, end, value, start + len, count - end);
         *         str.getChars(value, start);
         *         count = newCount;
         *         return this;
         *     }
         */
        // 截取start到末尾
        /*
         * public String substring(int start) {
         *         return substring(start, count);
         *     }
         */
        // 截取AbstractStringBuilder的start~end返回字符序列
        /*
         * public CharSequence subSequence(int start, int end) {
         *         return substring(start, end);
         *     }
         */
        // 截取AbstractStringBuilder的start~end返回String
        /*
         * public String substring(int start, int end) {
         *         if (start < 0)
         *             throw new StringIndexOutOfBoundsException(start);
         *         if (end > count)
         *             throw new StringIndexOutOfBoundsException(end);
         *         if (start > end)
         *             throw new StringIndexOutOfBoundsException(end - start);
         *         return new String(value, start, end - start);
         *     }
         */
        // 从str的offset位置插入len长度到AbstractStringBuilder的index位置
        /*
         * public AbstractStringBuilder insert(int index, char[] str, int offset,
         *                                         int len)
         *     {
         *         if ((index < 0) || (index > length()))
         *             throw new StringIndexOutOfBoundsException(index);
         *         if ((offset < 0) || (len < 0) || (offset > str.length - len))
         *             throw new StringIndexOutOfBoundsException(
         *                 "offset " + offset + ", len " + len + ", str.length "
         *                 + str.length);
         *         ensureCapacityInternal(count + len);
         *         System.arraycopy(value, index, value, index + len, count - index);
         *         System.arraycopy(str, offset, value, index, len);
         *         count += len;
         *         return this;
         *     }
         */
        // 在AbstractStringBuilder的offset位置插入obj
        /*
         * public AbstractStringBuilder insert(int offset, Object obj) {
         *         return insert(offset, String.valueOf(obj));
         *     }
         */
        // 在AbstractStringBuilder的offset位置插入str
        /*
         * public AbstractStringBuilder insert(int offset, String str) {
         *         if ((offset < 0) || (offset > length()))
         *             throw new StringIndexOutOfBoundsException(offset);
         *         if (str == null)
         *             str = "null";
         *         int len = str.length();
         *         ensureCapacityInternal(count + len);
         *         System.arraycopy(value, offset, value, offset + len, count - offset);
         *         str.getChars(value, offset);
         *         count += len;
         *         return this;
         *     }
         */
        // 在AbstractStringBuilder的offset位置插入char数组
        /*
         * public AbstractStringBuilder insert(int offset, char[] str) {
         *         if ((offset < 0) || (offset > length()))
         *             throw new StringIndexOutOfBoundsException(offset);
         *         int len = str.length;
         *         ensureCapacityInternal(count + len);
         *         System.arraycopy(value, offset, value, offset + len, count - offset);
         *         System.arraycopy(str, 0, value, offset, len);
         *         count += len;
         *         return this;
         *     }
         */
        // 在AbstractStringBuilder的offset位置插入CharSequence
        /*
         * public AbstractStringBuilder insert(int dstOffset, CharSequence s) {
         *         if (s == null)
         *             s = "null";
         *         if (s instanceof String)
         *             return this.insert(dstOffset, (String)s);
         *         return this.insert(dstOffset, s, 0, s.length());
         *     }
         */
        // AbstractStringBuilder的offset位置插入 CharSequence的start~end位置的字符
        /*
         * public AbstractStringBuilder insert(int dstOffset, CharSequence s,
         *                                          int start, int end) {
         *         if (s == null)
         *             s = "null";
         *         if ((dstOffset < 0) || (dstOffset > this.length()))
         *             throw new IndexOutOfBoundsException("dstOffset "+dstOffset);
         *         if ((start < 0) || (end < 0) || (start > end) || (end > s.length()))
         *             throw new IndexOutOfBoundsException(
         *                 "start " + start + ", end " + end + ", s.length() "
         *                 + s.length());
         *         int len = end - start;
         *         ensureCapacityInternal(count + len);
         *         System.arraycopy(value, dstOffset, value, dstOffset + len,
         *                          count - dstOffset);
         *         for (int i=start; i<end; i++)
         *             value[dstOffset++] = s.charAt(i);
         *         count += len;
         *         return this;
         *     }
         */
        // AbstractStringBuilder的offset位置插入boolean
        /*
         * public AbstractStringBuilder insert(int offset, boolean b) {
         *         return insert(offset, String.valueOf(b));
         *     }
         */
        // AbstractStringBuilder的offset位置插入char
        /*
         * public AbstractStringBuilder insert(int offset, char c) {
         *         ensureCapacityInternal(count + 1);
         *         System.arraycopy(value, offset, value, offset + 1, count - offset);
         *         value[offset] = c;
         *         count += 1;
         *         return this;
         *     }
         */
        // AbstractStringBuilder的offset位置插入int
        /*
         * public AbstractStringBuilder insert(int offset, int i) {
         *         return insert(offset, String.valueOf(i));
         *     }
         */
        // AbstractStringBuilder的offset位置插入long
        /*
         * public AbstractStringBuilder insert(int offset, long l) {
         *         return insert(offset, String.valueOf(l));
         *     }
         */
        // AbstractStringBuilder的offset位置插入float
        /*
         * public AbstractStringBuilder insert(int offset, float f) {
         *         return insert(offset, String.valueOf(f));
         *     }
         */
        // AbstractStringBuilder的offset位置插入double
        /*
         * public AbstractStringBuilder insert(int offset, double d) {
         *         return insert(offset, String.valueOf(d));
         *     }
         */
        // 获取str在AbstractStringBuilder中的索引位置
        /*
         * public int indexOf(String str) {
         *         return indexOf(str, 0);
         *     }
         */
        // 获取str在AbstractStringBuilder中的索引位置从fromIndex开始寻找
        /*
         * public int indexOf(String str, int fromIndex) {
         *         return String.indexOf(value, 0, count, str, fromIndex);
         *     }
         */
        // 反向查找 获取str在AbstractStringBuilder中的索引位置
        /*
         * public int lastIndexOf(String str) {
         *         return lastIndexOf(str, count);
         *     }
         */
        // 反向查找 获取str在AbstractStringBuilder中的索引位置从fromIndex开始寻找
        /*
         * public int lastIndexOf(String str, int fromIndex) {
         *         return String.lastIndexOf(value, 0, count, str, fromIndex);
         *     }
         */
        // 字符串的翻转方法
        /*
         * public AbstractStringBuilder reverse() {
         *         boolean hasSurrogates = false;
         *         int n = count - 1;
         *         for (int j = (n-1) >> 1; j >= 0; j--) {
         *             int k = n - j;
         *             char cj = value[j];
         *             char ck = value[k];
         *             value[j] = ck;
         *             value[k] = cj;
         *             if (Character.isSurrogate(cj) ||
         *                 Character.isSurrogate(ck)) {
         *                 hasSurrogates = true;
         *             }
         *         }
         *         if (hasSurrogates) {
         *             reverseAllValidSurrogatePairs();
         *         }
         *         return this;
         *     }
         */
        // 翻转方法的帮助器
        /*
         * private void reverseAllValidSurrogatePairs() {
         *         for (int i = 0; i < count - 1; i++) {
         *             char c2 = value[i];
         *             if (Character.isLowSurrogate(c2)) {
         *                 char c1 = value[i + 1];
         *                 if (Character.isHighSurrogate(c1)) {
         *                     value[i++] = c1;
         *                     value[i] = c2;
         *                 }
         *             }
         *         }
         *     }
         */
        // 声明toString()方法
        // public abstract String toString();
        // 获取value(char[])
        /*
         * final char[] getValue() {
         *         return value;
         *     }
         */
        // char[] value; 字符存储
        // int count; 使用的字符容量
        // 最大长度 private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    }
}
