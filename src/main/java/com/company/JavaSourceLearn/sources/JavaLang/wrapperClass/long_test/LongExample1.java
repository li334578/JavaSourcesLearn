package main.java.com.company.JavaSourceLearn.sources.JavaLang.wrapperClass.long_test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : Long类
 * @date : 2020-12-22 22:00:09
 */
public class LongExample1 {
    public static void main(String[] args) {
        // static class LongCache Long缓存池 -128~127
        /*
         * private static class LongCache {
         *         private LongCache(){}
         *
         *         static final Long cache[] = new Long[-(-128) + 127 + 1];
         *
         *         static {
         *             for(int i = 0; i < cache.length; i++)
         *                 cache[i] = new Long(i - 128);
         *         }
         *     }
         */
        // 构造方法 Long(long value)
        /*
         * public Long(long value) {
         *         this.value = value;
         *     }
         */
        // 构造方法 Long(String s)
        /*
         * public Long(String s) throws NumberFormatException {
         *         this.value = parseLong(s, 10);
         *     }
         */
        // static String toString(long i, int radix) 按指定进制 转字符串方法
        System.out.println(Long.toString(32L, 8)); // 40
        System.out.println(Long.toString(-32L, 8)); // -40
        // static String toUnsignedString(long i, int radix) 按指定进制 补码 转无符号字符串方法
        System.out.println(Long.toUnsignedString(-32L, 8)); // 1777777777777777777740
        //  static BigInteger toUnsignedBigInteger(long i) 转无符号BigInteger
        // 转16进制字符串 2^4
        /*
         * public static String toHexString(long i) {
         *         return toUnsignedString0(i, 4);
         *     }
         */
        // 转8进制字符串 2^3
        /*
         * public static String toOctalString(long i) {
         *         return toUnsignedString0(i, 3);
         *     }
         */
        // 转2进制字符串 2^1
        /*
         * public static String toBinaryString(long i) {
         *         return toUnsignedString0(i, 1);
         *     }
         */
        // 按2^shift 转字符串 0<shift<=5
        /*
         * static String toUnsignedString0(long val, int shift) {
         *         // assert shift > 0 && shift <=5 : "Illegal shift value";
         *         int mag = Long.SIZE - Long.numberOfLeadingZeros(val);
         *         int chars = Math.max(((mag + (shift - 1)) / shift), 1);
         *         char[] buf = new char[chars];
         *
         *         formatUnsignedLong(val, shift, buf, 0, chars);
         *         return new String(buf, true);
         *     }
         */
        // 将long格式（视为无符号）格式化为字符缓冲区。
        /*
         * static int formatUnsignedLong(long val, int shift, char[] buf, int offset, int len) {
         *         int charPos = len;
         *         int radix = 1 << shift;
         *         int mask = radix - 1;
         *         do {
         *             buf[offset + --charPos] = Integer.digits[((int) val) & mask];
         *             val >>>= shift;
         *         } while (val != 0 && charPos > 0);
         *
         *         return charPos;
         *     }
         */
        // long类型转toString
        /*
         * public static String toString(long i) {
         *         if (i == Long.MIN_VALUE)
         *             return "-9223372036854775808";
         *         int size = (i < 0) ? stringSize(-i) + 1 : stringSize(i);
         *         char[] buf = new char[size];
         *         getChars(i, size, buf);
         *         return new String(buf, true);
         *     }
         */
        // long类型转无符号String
        /*
         * public static String toUnsignedString(long i) {
         *         return toUnsignedString(i, 10);
         *     }
         */
        //将代表整数i的字符放入字符数组buf。
        // 字符从指定索引处的最低有效数字（不包括最高字符）开始向后放置，并从那里向后工作。
        // 如果i == Long.MIN_VALUE，将失败
        //  void getChars(long i, int index, char[] buf)
        // 获取stringSize x为正数
        /*
         * static int stringSize(long x) {
         *         long p = 10;
         *         for (int i=1; i<19; i++) {
         *             if (x < p)
         *                 return i;
         *             p = 10*p;
         *         }
         *         return 19;
         *     }
         */
        // static long parseLong(String s, int radix)
        /*
         * String按radix进制解析成long类型
         */
        // static long parseLong(String s) String按10进制解析成long类型
        /*
         * public static long parseLong(String s) throws NumberFormatException {
         *         return parseLong(s, 10);
         *     }
         */
        // String按radix进制解析成long类型
        /*
         * static long parseUnsignedLong(String s, int radix)
         */
        // String按10进制解析成long类型
        /*
         * static long parseUnsignedLong(String s)
         */
        System.out.println(Long.parseUnsignedLong("2"));
        // String按radix进制转Long包装类
        /*
         * public static Long valueOf(String s, int radix) throws NumberFormatException {
         *         return Long.valueOf(parseLong(s, radix));
         *     }
         */
        // String按10进制转Long包装类
        /*
         * public static Long valueOf(String s) throws NumberFormatException
         *     {
         *         return Long.valueOf(parseLong(s, 10));
         *     }
         */
        // 装箱方法 static Long valueOf(long l)
        /*
         * public static Long valueOf(long l) {
         *         final int offset = 128;
         *         if (l >= -128 && l <= 127) { // will cache
         *             return LongCache.cache[(int)l + offset];
         *         }
         *         return new Long(l);
         *     }
         */
        // Long decode(String nm) String类型解码成Long 支持 十进制，十六进制和八进制数
        // 从Number继承来的方法
        // 转byte
        /*
         * public byte byteValue() {
         *         return (byte)value;
         *     }
         */
        // 转short
        /*
         * public short shortValue() {
         *         return (short)value;
         *     }
         */
        // 转int
        /*
         * public int intValue() {
         *         return (int)value;
         *     }
         */
        // 拆箱 转long
        /*
         * public long longValue() {
         *         return value;
         *     }
         */
        // 转float
        /*
         * public float floatValue() {
         *         return (float)value;
         *     }
         */
        // 转double
        /*
         * public double doubleValue() {
         *         return (double)value;
         *     }
         */
        // 继承自Object的方法
        // 转String
        /*
         * public String toString() {
         *         return toString(value);
         *     }
         */
        // 获取HashCode
        /*
         * public int hashCode() {
         *         return Long.hashCode(value);
         *     }
         */
        // 获取指定long值的HashCode
        /*
         * public static int hashCode(long value) {
         *         return (int)(value ^ (value >>> 32));
         *     }
         */
        // 比较方法
        /*
         * public boolean equals(Object obj) {
         *         if (obj instanceof Long) {
         *             return value == ((Long)obj).longValue();
         *         }
         *         return false;
         *     }
         */
        // 解析String为Long
        /*
         * public static Long getLong(String nm) {
         *         return getLong(nm, null);
         *     }
         */
        // 解析String为Long 解析为null时返回val
        /*
         * public static Long getLong(String nm, long val) {
         *         Long result = Long.getLong(nm, null);
         *         return (result == null) ? Long.valueOf(val) : result;
         *     }
         */
        // 解析String为Long 解析为null时返回val
        /*
         * public static Long getLong(String nm, Long val) {
         *         String v = null;
         *         try {
         *             v = System.getProperty(nm);
         *         } catch (IllegalArgumentException | NullPointerException e) {
         *         }
         *         if (v != null) {
         *             try {
         *                 return Long.decode(v);
         *             } catch (NumberFormatException e) {
         *             }
         *         }
         *         return val;
         *     }
         */
        // 比较方法
        /*
         * public int compareTo(Long anotherLong) {
         *         return compare(this.value, anotherLong.value);
         *     }
         */
        Long long1 = 10L;
        System.out.println(long1.compareTo(9L)); // 1
        System.out.println(long1.compareTo(10L)); // 0
        System.out.println(long1.compareTo(11L)); // -1
        // 比较两个long的大小
        /*
         * public static int compare(long x, long y) {
         *         return (x < y) ? -1 : ((x == y) ? 0 : 1);
         *     }
         */
        // 忽略符合比较long的大小
        /*
         * public static int compareUnsigned(long x, long y) {
         *         return compare(x + MIN_VALUE, y + MIN_VALUE);
         *     }
         */
        System.out.println(Long.compareUnsigned(-1, -2));
        System.out.println(Long.compareUnsigned(-1, -1));
        // long相除
        /*
         * static long divideUnsigned(long dividend, long divisor)
         */
        // long取余
        /*
         * static long remainderUnsigned(long dividend, long divisor)
         */
        // static long highestOneBit(long i) 获取小于i的最近的2的幂
        System.out.println(Long.highestOneBit(5));
        System.out.println(Long.highestOneBit(9));
        // static long lowestOneBit(long i)
        // 若i非零，返回值为最低位1的权值
        // 若i为零，返回值为0
        System.out.println(Long.lowestOneBit(5));
        System.out.println(Long.lowestOneBit(9));
        // static int numberOfLeadingZeros(long i) 二进制中0的个数
        // static int numberOfTrailingZeros(long i) 二进制中1的个数
        // static int bitCount(long i) 二进制补码表示形式中1的个数。
        // static long rotateLeft(long i, int distance) 将long的二进制补码左移distance位
        // static long rotateRight(long i, int distance) 将long的二进制补码右移distance位
        // static long reverse(long i) 翻转二进制数
        // static int signum(long i) -1 0 1 获取i的符号
        // static long reverseBytes(long i) 返回通过反转给定参数的二进制2的补码表示形式的字节顺序而生成的值。
        // static long sum(long a, long b) 求和
        // static long max(long a, long b) 取最大值
        // static long min(long a, long b) 取最小值
        // @Native public static final long MIN_VALUE = 0x8000000000000000L; 最小值
        // @Native public static final long MAX_VALUE = 0x7fffffffffffffffL; 最大值
        System.out.println(Long.TYPE); // long
        // private final long value; 属性
        System.out.println(Long.SIZE); // 64 位
        System.out.println(Long.BYTES); // 8字节数
        // serialVersionUID 序列化id
    }
}
