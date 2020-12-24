package com.company.sources.wrapperClass.long_test;

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

    }
}
