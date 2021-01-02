package com.company.sources.JavaLang.wrapperClass.int_test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : Integer类
 * @date : 2020-12-16 21:06:35
 */
public class IntegerExample1 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE); // 0x80000000; 2^31 - 1
        System.out.println(Integer.MIN_VALUE); // 0x7fffffff; -2^31
        /*
        用于将数字表示为字符串的所有可能字符
        final static char[] digits = {
        '0' , '1' , '2' , '3' , '4' , '5' ,
        '6' , '7' , '8' , '9' , 'a' , 'b' ,
        'c' , 'd' , 'e' , 'f' , 'g' , 'h' ,
        'i' , 'j' , 'k' , 'l' , 'm' , 'n' ,
        'o' , 'p' , 'q' , 'r' , 's' , 't' ,
        'u' , 'v' , 'w' , 'x' , 'y' , 'z'
        };
         */
        //
        /**
         * public static String toString(int i, int radix) {
         *         if (radix < Character.MIN_RADIX || radix > Character.MAX_RADIX)
         *             radix = 10;
         *
         *         if (radix == 10) {
         *             return toString(i);
         *         }
         *
         *         char buf[] = new char[33];
         *         boolean negative = (i < 0);
         *         int charPos = 32;
         *
         *         if (!negative) {
         *             i = -i;
         *         }
         *
         *         while (i <= -radix) {
         *             buf[charPos--] = digits[-(i % radix)];
         *             i = i / radix;
         *         }
         *         buf[charPos] = digits[-i];
         *
         *         if (negative) {
         *             buf[--charPos] = '-';
         *         }
         *
         *         return new String(buf, charPos, (33 - charPos));
         *     }
         */
        System.out.println(Integer.toString(188, 16)); // bc

        // String toUnsignedString(int i, int radix) 以指定进制获取无符号的String
        /*
         * public static String toUnsignedString(int i, int radix) {
         *         return Long.toUnsignedString(toUnsignedLong(i), radix);
         *     }
         */
        System.out.println(Integer.toUnsignedString(188, 16)); // bc

        // static String toUnsignedString0(int val, int shift) 按照 2^shift次方进制 返回无符号值
        /*
         * private static String toUnsignedString0(int val, int shift) {
         *         // assert shift > 0 && shift <=5 : "Illegal shift value";
         *         int mag = Integer.SIZE - Integer.numberOfLeadingZeros(val);
         *         int chars = Math.max(((mag + (shift - 1)) / shift), 1);
         *         char[] buf = new char[chars];
         *
         *         formatUnsignedInt(val, shift, buf, 0, chars);
         *
         *         // Use special constructor which takes over "buf".
         *         return new String(buf, true);
         *     }
         */
        // static String toHexString(int i)  int转16进制字符串
        /*
         * public static String toHexString(int i) {
         *         return toUnsignedString0(i, 4);
         *     }
         */
        System.out.println(Integer.toHexString(188)); // bc
        // static String toOctalString(int i)  int转8进制字符串
        /*
         * public static String toOctalString(int i) {
         *         return toUnsignedString0(i, 3);
         *     }
         */
        System.out.println(Integer.toOctalString(188)); // 274
        // static String toBinaryString(int i) int转2进制字符串
        /*
         * public static String toBinaryString(int i) {
         *         return toUnsignedString0(i, 1);
         *     }
         */
        System.out.println(Integer.toBinaryString(188)); // 10111100

        // int formatUnsignedInt(int val, int shift, char[] buf, int offset, int len)
        /*
         * static int formatUnsignedInt(int val, int shift, char[] buf, int offset, int len) {
         *         int charPos = len;
         *         int radix = 1 << shift;
         *         int mask = radix - 1;
         *         do {
         *             buf[offset + --charPos] = Integer.digits[val & mask];
         *             val >>>= shift;
         *         } while (val != 0 && charPos > 0);
         *
         *         return charPos;
         *     }
         * 从buf的offset索引处开始，存入变量val在2^shift进制下的后len位
         * shift取1、3、4时分别代表二进制、八进制、16进制
         * 如果len的长度超过该进制下的有效数位长度，则前面空白部分补0
         *
         * 十进制数12345的八进制形式为30071
         *
         * char[] buf = new char[10];
         *
         * formatUnsignedInt(12345, 3, buf, 0, 5) // buf={'3','0','0','7','1','0','0','0','0','0'}
         * formatUnsignedInt(12345, 3, buf, 0, 7) // buf={'0','0','3','0','0','7','1','0','0','0'}
         * formatUnsignedInt(12345, 3, buf, 2, 7) // buf={'0','0','0','0','3','0','0','7','1','0'}
         */
        // final static char [] DigitTens 十位数
        // final static char [] DigitOnes 个位数
        // static String toString(int i) toSting方法 获取size 转char数组
        /*
         * public static String toString(int i) {
         *         if (i == Integer.MIN_VALUE)
         *             return "-2147483648";
         *         int size = (i < 0) ? stringSize(-i) + 1 : stringSize(i);
         *         char[] buf = new char[size];
         *         getChars(i, size, buf);
         *         return new String(buf, true);
         *     }
         */
        // static String toUnsignedString(int i) 转无符号String
        /*
         * public static String toUnsignedString(int i) {
         *         return Long.toString(toUnsignedLong(i));
         *     }
         */
        System.out.println(Integer.toUnsignedString(-1998));//
        // int转换为char[] 直接修改形参buf的内容
        /*
         * static void getChars(int i, int index, char[] buf) {
         *         int q, r;
         *         int charPos = index;
         *         char sign = 0;
         *
         *         if (i < 0) {
         *             sign = '-';
         *             i = -i;
         *         }
         *
         *         // Generate two digits per iteration
         *         while (i >= 65536) {
         *             q = i / 100;
         *         // really: r = i - (q * 100);
         *             r = i - ((q << 6) + (q << 5) + (q << 2));
         *             i = q;
         *             buf [--charPos] = DigitOnes[r];
         *             buf [--charPos] = DigitTens[r];
         *         }
         *
         *         // Fall thru to fast mode for smaller numbers
         *         // assert(i <= 65536, i);
         *         for (;;) {
         *             q = (i * 52429) >>> (16+3);
         *             r = i - ((q << 3) + (q << 1));  // r = i-(q*10) ...
         *             buf [--charPos] = digits [r];
         *             i = q;
         *             if (i == 0) break;
         *         }
         *         if (sign != 0) {
         *             buf [--charPos] = sign;
         *         }
         *     }
         */
        // sizeTable 用于存储Integer的位数
        /*
         * final static int [] sizeTable = { 9, 99, 999, 9999, 99999, 999999, 9999999,
         *                                       99999999, 999999999, Integer.MAX_VALUE };
         */
        // 获取Integer的位数
        /*
         * static int stringSize(int x) {
         *         for (int i=0; ; i++)
         *             if (x <= sizeTable[i])
         *                 return i+1;
         *     }
         */
        // static int parseInt(String s, int radix)
        /*
         * 按照radix进制将String转为int值
         */
        // int parseInt(String s) 按照十进制将String转换为Integer
        /*
         * public static int parseInt(String s) throws NumberFormatException {
         *         return parseInt(s,10);
         *     }
         */
        // static int parseUnsignedInt(String s, int radix)
        /*
         * 按照radix进制将String转为无符号int值
         */
        // static int parseUnsignedInt(String s)
        /*
         * 按照十进制将String转为无符号int值
         */
        // static Integer valueOf(String s, int radix)
        /*
         * 按照radix进制将String转为Integer
         */
        // static Integer valueOf(String s)
        /*
         * 按照10进制将String转为Integer
         */
        // IntegerCache Integer的缓存池 -128~127
        // int装箱方法 在缓存池中直接取 不在缓存池中新建Integer对象
        /*
         * public static Integer valueOf(int i) {
         *         if (i >= IntegerCache.low && i <= IntegerCache.high)
         *             return IntegerCache.cache[i + (-IntegerCache.low)];
         *         return new Integer(i);
         *     }
         */
        // private final int value; Integer的value属性
        // Integer的构造方法
        /*
         * public Integer(int value) {
         *         this.value = value;
         *     }
         */
        // Integer的构造方法
        /*
         * public Integer(String s) throws NumberFormatException {
         *         this.value = parseInt(s, 10);
         *     }
         */
        // 强转为byte类型
        /*
         * public byte byteValue() {
         *         return (byte)value;
         *     }
         */
        // 强转为short类型
        /*
         * public short shortValue() {
         *         return (short)value;
         *     }
         */
        // 拆箱方法
        /*
         * public int intValue() {
         *         return value;
         *     }
         */
        // 强转为long类型
        /*
         * public long longValue() {
         *         return (long)value;
         *     }
         */
        // 强转为float类型
        /*
         * public float floatValue() {
         *         return (float)value;
         *     }
         */
        // 强转为double类型
        /*
         * public double doubleValue() {
         *         return (double)value;
         *     }
         */
        // 转为String类型
        /*
         * public String toString() {
         *         return toString(value);
         *     }
         */
        // 获取Integer的HashCode
        /*
         * public int hashCode() {
         *         return Integer.hashCode(value);
         *     }
         */
        // 计算int的HashCode
        /*
         * public static int hashCode(int value) {
         *         return value;
         *     }
         */
        // Integer的equals方法
        /*
         * public boolean equals(Object obj) {
         *         if (obj instanceof Integer) {
         *             return value == ((Integer)obj).intValue();
         *         }
         *         return false;
         *     }
         */
        Integer integer = 399;
        String s = "399.1";
        System.out.println(integer.equals(s)); // false
        // 根据指定的名称得到系统属性的整数值。
        /*
         * public static Integer getInteger(String nm) {
         *         return getInteger(nm, null);
         *     }
         */
        // 获取System的property
        /*
         * public static Integer getInteger(String nm, int val) {
         *         Integer result = getInteger(nm, null);
         *         return (result == null) ? Integer.valueOf(val) : result;
         *     }
         */
        System.setProperty("a", "1");
        System.out.println(Integer.getInteger("a")); // 1
        // 获取System的property
        /*
         * public static Integer getInteger(String nm, Integer val) {
         *         String v = null;
         *         try {
         *             v = System.getProperty(nm);
         *         } catch (IllegalArgumentException | NullPointerException e) {
         *         }
         *         if (v != null) {
         *             try {
         *                 return Integer.decode(v);
         *             } catch (NumberFormatException e) {
         *             }
         *         }
         *         return val;
         *     }
         */
        // static Integer decode(String nm) 按照十进制对String进行解码
        System.out.println(Integer.decode("123")); // 123
        // int compareTo(Integer anotherInteger) 比较大小方法
        /*
         * public int compareTo(Integer anotherInteger) {
         *         return compare(this.value, anotherInteger.value);
         *     }
         */
        Integer integer1 = 666;
        System.out.println(integer1.compareTo(555)); // 1
        System.out.println(integer1.compareTo(666)); // 0
        System.out.println(integer1.compareTo(777)); // -1
        // static int compare(int x, int y) 比较两个int值的大小
        /*
         * public static int compare(int x, int y) {
         *         return (x < y) ? -1 : ((x == y) ? 0 : 1);
         *     }
         */
        System.out.println(Integer.compare(666, 555)); // 1
        System.out.println(Integer.compare(666, 666)); // 0
        System.out.println(Integer.compare(666, 777)); // -1
        // static int compareUnsigned(int x, int y) 比较无符号数的大小
        /*
         * public static int compareUnsigned(int x, int y) {
         *         return compare(x + MIN_VALUE, y + MIN_VALUE);
         *     }
         */
        // 通过无符号转换将参数转换为long 。
        // 在一个无符号转换为long ，的高阶32位long是零和低32位等于整数参数的比特。
        // 因此，零和正int值被映射到一个数值上等于long值和阴性int值被映射到一个long值等于输入加2 32
        /*
         * public static long toUnsignedLong(int x) {
         *         return ((long) x) & 0xffffffffL;
         *     }
         */
        //返回将第一个参数除以第二个参数的无符号商，其中每个参数和结果均被解释为无符号值。
        //请注意，在二进制补码算术中，如果两个操作数被视为有符号或无符号，则加，减和乘的其他三个基本算术运算在位上相同。
        // 因此，没有提供单独的addUnsigned等方法。
        // 被除数 除数
        /*
         * public static int divideUnsigned(int dividend, int divisor) {
         *         // In lieu of tricky code, for now just use long arithmetic.
         *         return (int)(toUnsignedLong(dividend) / toUnsignedLong(divisor));
         *     }
         */
        System.out.println(Integer.divideUnsigned(10, 5)); // 2
        // 取余
        /*
         * public static int remainderUnsigned(int dividend, int divisor) {
         *         // In lieu of tricky code, for now just use long arithmetic.
         *         return (int)(toUnsignedLong(dividend) % toUnsignedLong(divisor));
         *     }
         */
        System.out.println(Integer.remainderUnsigned(11, 5)); // 1
        // @Native public static final int SIZE = 32; Integer的位数
        // public static final int BYTES = SIZE / Byte.SIZE; Integer的字节数
        // 返回一个int值，该值最多为一个int ，位于指定int值中最高位（“最左边”）一位的位置。
        // 如果指定值的二进制补码二进制表示中没有一位（即等于零），则返回零
        // 获取小于i的最小2的n次幂
        /*
         * public static int highestOneBit(int i) {
         *         // HD, Figure 3-1
         *         i |= (i >>  1);
         *         i |= (i >>  2);
         *         i |= (i >>  4);
         *         i |= (i >>  8);
         *         i |= (i >> 16);
         *         return i - (i >>> 1);
         *     }
         */
        System.out.println(Integer.highestOneBit(5)); // 4
        System.out.println(Integer.highestOneBit(9)); // 8
        System.out.println(Integer.highestOneBit(32)); // 32
        // 若i非零，返回值为最低位1的权值
        // 若i为零，返回值为0
        /*
         * public static int lowestOneBit(int i) {
         *         // HD, Section 2-1
         *         return i & -i;
         *     }
         * n & -n可以只保留n最低位的1
         */
        System.out.println(Integer.lowestOneBit(2));
        System.out.println(Integer.lowestOneBit(4));
        System.out.println(Integer.lowestOneBit(9));
        // 在指定 int 值的二进制补码表示形式中最高位（最左边）的 1 位之前，返回零位的数量。
        // 如果指定值在其二进制补码表示形式中不存在 1 位，换句话说，如果它等于零，则返回 32。
        /*
         * public static int numberOfLeadingZeros(int i) {
         *         // HD, Figure 5-6
         *         if (i == 0)
         *             return 32;
         *         int n = 1;
         *         if (i >>> 16 == 0) { n += 16; i <<= 16; }
         *         if (i >>> 24 == 0) { n +=  8; i <<=  8; }
         *         if (i >>> 28 == 0) { n +=  4; i <<=  4; }
         *         if (i >>> 30 == 0) { n +=  2; i <<=  2; }
         *         n -= i >>> 31;
         *         return n;
         *     }
         */
        System.out.println(Integer.numberOfLeadingZeros(0)); // 32位全为0
        System.out.println(Integer.numberOfLeadingZeros(1)); // 31位0
        System.out.println(Integer.numberOfLeadingZeros(-1)); // 0
        // static int numberOfTrailingZeros(int i)
        /*
         * public static int numberOfTrailingZeros(int i) {
         *         // HD, Figure 5-14
         *         int y;
         *         if (i == 0) return 32;
         *         int n = 31;
         *         y = i <<16; if (y != 0) { n = n -16; i = y; }
         *         y = i << 8; if (y != 0) { n = n - 8; i = y; }
         *         y = i << 4; if (y != 0) { n = n - 4; i = y; }
         *         y = i << 2; if (y != 0) { n = n - 2; i = y; }
         *         return n - ((i << 1) >>> 31);
         *     }
         */
        System.out.println(Integer.numberOfTrailingZeros(1)); // 0 0000 0000 0000 0000 0000 0000 0000 0001
        System.out.println(Integer.numberOfTrailingZeros(0)); // 32 0000 0000 0000 0000 0000 0000 0000 0000
        System.out.println(Integer.numberOfTrailingZeros(2)); // 1 0000 0000 0000 0000 0000 0000 0000 0010
        System.out.println(Integer.numberOfTrailingZeros(16)); // 1 0000 0000 0000 0000 0000 0000 0001 0000
        System.out.println(Integer.numberOfTrailingZeros(Integer.MAX_VALUE)); // 0 1111 1111 1111 1111 1111 1111 1111 1111
        System.out.println("-----------------------");
        // static int bitCount(int i)
        /*
         * public static int bitCount(int i) {
         *         // HD, Figure 5-2
         *         i = i - ((i >>> 1) & 0x55555555);
         *         i = (i & 0x33333333) + ((i >>> 2) & 0x33333333);
         *         i = (i + (i >>> 4)) & 0x0f0f0f0f;
         *         i = i + (i >>> 8);
         *         i = i + (i >>> 16);
         *         return i & 0x3f;
         *     }
         */
        // 返回指定值的二进制补码表示形式中1的个数。
        System.out.println(Integer.bitCount(1)); // 1 0000 0000 0000 0000 0000 0000 0000 0001
        System.out.println(Integer.bitCount(0)); // 0 0000 0000 0000 0000 0000 0000 0000 0000
        System.out.println(Integer.bitCount(3)); // 2 0000 0000 0000 0000 0000 0000 0000 0011
        System.out.println(Integer.bitCount(-1)); // 2 1111 1111 1111 1111 1111 1111 1111 1111
        // 将int的二进制补码左移distance位
        /*
         * public static int rotateLeft(int i, int distance) {
         *         return (i << distance) | (i >>> -distance);
         *     }
         */
        // 0000 0000 0000 0000 0000 0000 0000 0001 -> 0000 0000 0000 0000 0000 0000 0000 1000
        System.out.println(Integer.rotateLeft(1, 3)); // 8
        // 0000 0000 0000 0000 0000 0000 0000 0011 -> 0000 0000 0000 0000 0000 0000 0001 1000
        System.out.println(Integer.rotateLeft(3, 3)); // 24
        // 1111 1111 1111 1111 -> 1111 1111 1111 1111
        System.out.println(Integer.rotateLeft(-1, 3)); // -1
        // 1111 1111 1111 1101 -> 1111 1111 1110 1111
        System.out.println(Integer.rotateLeft(-3, 3)); // -17
        // static int rotateRight(int i, int distance) 将int的二进制补码右移distance位
        /*
         * public static int rotateRight(int i, int distance) {
         *         return (i >>> distance) | (i << -distance);
         *     }
         */
        // 翻转二进制数
        /*
         * public static int reverse(int i) {
         *         // HD, Figure 7-1
         *         i = (i & 0x55555555) << 1 | (i >>> 1) & 0x55555555;
         *         i = (i & 0x33333333) << 2 | (i >>> 2) & 0x33333333;
         *         i = (i & 0x0f0f0f0f) << 4 | (i >>> 4) & 0x0f0f0f0f;
         *         i = (i << 24) | ((i & 0xff00) << 8) |
         *             ((i >>> 8) & 0xff00) | (i >>> 24);
         *         return i;
         *     }
         */
        System.out.println(Integer.reverse(1)); // -2147483648
        // 如果传递“负值”，则返回-1。
        // 如果我们传递“正值”，则返回1。
        // 如果传递“零值”，则返回0。
        /*
         * public static int signum(int i) {
         *         // HD, Section 2-7
         *         return (i >> 31) | (-i >>> 31);
         *     }
         */
        System.out.println(Integer.signum(-2)); // -1
        System.out.println(Integer.signum(2)); // 1
        // 返回通过反转给定参数的二进制2的补码表示形式的字节顺序而生成的值。
        /*
         * public static int reverseBytes(int i) {
         *         return ((i >>> 24)           ) |
         *                ((i >>   8) &   0xFF00) |
         *                ((i <<   8) & 0xFF0000) |
         *                ((i << 24));
         *     }
         */
        // 求和方法
        /*
         * public static int sum(int a, int b) {
         *         return a + b;
         *     }
         */
        System.out.println(Integer.sum(1, 2)); // 3
        // 求最大值
        /*
         * public static int max(int a, int b) {
         *         return Math.max(a, b);
         *     }
         */
        // 求最小值
        /*
         * public static int min(int a, int b) {
         *         return Math.min(a, b);
         *     }
         */
    }
}
