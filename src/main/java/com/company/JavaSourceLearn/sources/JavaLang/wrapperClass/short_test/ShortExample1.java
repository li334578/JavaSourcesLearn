package main.java.com.company.JavaSourceLearn.sources.JavaLang.wrapperClass.short_test;


/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : Short类
 * @date : 2020-12-16 20:28:17
 */
public class ShortExample1 {
    public static void main(String[] args) {
        // Short 是short的包装类 short 数据类型是 16 位、有符号的以二进制补码表示的整数
        // Short extends Number implements Comparable<Short>
        System.out.println(Short.MAX_VALUE); // -32768 -(2^15) 有一位是符号位
        System.out.println(Short.MIN_VALUE); // 32767 2^15 - 1
        // public static final Class<Short>    TYPE = (Class<Short>) Class.getPrimitiveClass("short");
        System.out.println(Short.class); // 获取全类名
        System.out.println(Short.TYPE); // 获取simple类名
        // static String toString(short s) short转字符串 Integer以十进制解析
        /*
         * public static String toString(short s) {
         *         return Integer.toString((int)s, 10);
         *     }
         */
        // static short parseShort(String s, int radix) 以radix进制解析String为short值 范围需在 -32768 ~ 32767之间
        /*
         * public static short parseShort(String s, int radix)
         *         throws NumberFormatException {
         *         int i = Integer.parseInt(s, radix);
         *         if (i < MIN_VALUE || i > MAX_VALUE)
         *             throw new NumberFormatException(
         *                 "Value out of range. Value:\"" + s + "\" Radix:" + radix);
         *         return (short)i;
         *     }
         */
        // static short parseShort(String s)  以默认十进制解析String为short值
        /*
         * public static short parseShort(String s) throws NumberFormatException {
         *         return parseShort(s, 10);
         *     }
         */
        // static Short valueOf(String s, int radix) 以radix进制解析String为short值
        /*
         * public static Short valueOf(String s, int radix)
         *         throws NumberFormatException {
         *         return valueOf(parseShort(s, radix));
         *     }
         */
        // static Short valueOf(String s) 以默认十进制解析String为short值
        /*
         * public static Short valueOf(String s) throws NumberFormatException {
         *         return valueOf(s, 10);
         *     }
         */
        // short缓存池 -128 , 127
        /*
         * private static class ShortCache {
         *         private ShortCache(){}
         *
         *         static final Short cache[] = new Short[-(-128) + 127 + 1];
         *
         *         static {
         *             for(int i = 0; i < cache.length; i++)
         *                 cache[i] = new Short((short)(i - 128));
         *         }
         *     }
         */
        // 在缓存池范围内直接从缓存中取值 不在缓存池中 new Short 进行创建
        /*
         * public static Short valueOf(short s) {
         *         final int offset = 128;
         *         int sAsInt = s;
         *         if (sAsInt >= -128 && sAsInt <= 127) { // must cache
         *             return ShortCache.cache[sAsInt + offset];
         *         }
         *         return new Short(s);
         *     }
         */
        // static Short decode(String nm)
        /*
         * public static Short decode(String nm) throws NumberFormatException {
         *         int i = Integer.decode(nm);
         *         if (i < MIN_VALUE || i > MAX_VALUE)
         *             throw new NumberFormatException(
         *                     "Value " + i + " out of range from input " + nm);
         *         return valueOf((short)i);
         *     }
         * * 采用哪种进制解析nm取决于nm的格式：
         * > 0x、0X、#开头，代表按16进制解析
         * > 0开头，代表按8进制解析
         * > 其他情形默认按10进制解析
         */
        System.out.println(Short.SIZE); // 16 十六位无符号数
        System.out.println(Short.BYTES); // 2 2字节空间
        // static short reverseBytes(short i) 返回通过反转指定的short值的二进制补码表示形式的字节顺序而获得的值。
        /*
         * public static short reverseBytes(short i) {
         *         return (short) (((i & 0xFF00) >> 8) | (i << 8));
         *     }
         * 位运算
         */
    }
}
