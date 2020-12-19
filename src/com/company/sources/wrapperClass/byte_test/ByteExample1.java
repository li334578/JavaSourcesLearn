package com.company.sources.wrapperClass.byte_test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : Byte类
 * @date : 2020-12-15 21:41:10
 */
public class ByteExample1 {
    public static void main(String[] args) {
        // Byte 是 byte类的包装类  数据类型是8位、有符号的，以二进制补码表示的整数；
        // 继承了Number类 实现了Comparable<Byte>接口
        /*
         * 取值范围 -128 ~ 127
         */
        System.out.println(Byte.MIN_VALUE); // -128 -(2^7) 有一位是符号位
        System.out.println(Byte.MAX_VALUE); // 127 (2^7)-1
        // @SuppressWarnings("unchecked") 告诉编译器忽略指定的警告，不用在编译完成后出现警告信息。
        /*
         * public static final Class<Byte>     TYPE = (Class<Byte>) Class.getPrimitiveClass("byte");
         * 获取虚拟机的基本class对象
         */
        System.out.println(Byte.TYPE); // byte
        /*
         * public static String toString(byte b) {
         *         return Integer.toString((int)b, 10);
         *     }
         * 返回基数为10的该对象的值的字符串表示
         */
        Byte byte1 = -1;
        System.out.println(Byte.toString(byte1));
        /*
         * ByteCache
         * Byte的缓存数组  cache[-(-128) + 127 + 1] -> cache[256]
         */
        // byte->Byte
        /*
         * public static Byte valueOf(byte b) {
         *         final int offset = 128;
         *         return ByteCache.cache[(int)b + offset];
         *     }
         * offset byte对应Byte缓存数组的偏移量
         * 从缓存数组中获取Byte值 例如 Byte.ValueOf(-1) -> cache[-1+128]
         * Byte byte1 = -1;走的就是Byte.ValueOf(-1)方法
         */
        // byte parseByte(String s, int radix)
        /*
         * public static byte parseByte(String s, int radix)
         *         throws NumberFormatException {
         *         int i = Integer.parseInt(s, radix);
         *         if (i < MIN_VALUE || i > MAX_VALUE)
         *             throw new NumberFormatException(
         *                 "Value out of range. Value:\"" + s + "\" Radix:" + radix);
         *         return (byte)i;
         *     }
         * 将字符串参数解析为第二个参数指定的基数中的带符号byte 。 字符串中的字符必须是数字指定基数的
         * radix 是进制数 支持 2~36进制
         * 转换后的结果不能超出 -128~127 否则会抛出 NumberFormatException
         */
        // byte parseByte(String s)
        /*
         * public static byte parseByte(String s) throws NumberFormatException {
         *         return parseByte(s, 10);
         *     }
         * 使用默认基数10对字符串参数进行解析 使用默认的十进制进行解析
         */
        System.out.println(Byte.parseByte("11", 8)); // 八进制的11 -> 9
        System.out.println(Byte.parseByte("11", 10));// 十进制的11 -> 11
        // Byte valueOf(String s, int radix)
        /*
         * public static Byte valueOf(String s, int radix)
         *         throws NumberFormatException {
         *         return valueOf(parseByte(s, radix));
         *     }
         * 底层还是调用的 valueOf(parseByte(s, radix));
         */
        // Byte valueOf(String s)
        /*
         * public static Byte valueOf(String s) throws NumberFormatException {
         *         return valueOf(s, 10);
         *     }
         * 底层调用的是 Byte valueOf(String s, int radix)方法
         * * 采用哪种进制解析nm取决于nm的格式：
         * > 0x、0X、#开头，代表按16进制解析
         * > 0开头，代表按8进制解析
         * > 其他情形默认按10进制解析
         */
        // Byte decode(String nm)
        /*
         * public static Byte decode(String nm) throws NumberFormatException {
         *         int i = Integer.decode(nm);
         *         if (i < MIN_VALUE || i > MAX_VALUE)
         *             throw new NumberFormatException(
         *                     "Value " + i + " out of range from input " + nm);
         *         return valueOf((byte)i);
         *     }
         * 按照十进制 将 String解码为 Byte 。底层使用Integer.decode(nm)
         */
        // 有参构造 Byte(byte value)
        /*
         * public Byte(byte value) {
         *         this.value = value;
         *     }
         */
        // 有参构造 Byte(String s)
        /*
         * public Byte(String s) throws NumberFormatException {
         *         this.value = parseByte(s, 10);
         *     }
         * 底层调用parseByte方法以十进制为基准转换为Byte类型
         */
        Byte b2 = new Byte("2");
        System.out.println(b2.byteValue());
        // 获取Byte包装类的 byte值 byte byteValue()
        /*
         * public byte byteValue() {
         *         return value;
         *     }
         */
        // short shortValue() 获取Byte强转为short的值
        /*
         * public short shortValue() {
         *         return (short)value;
         *     }
         */
        // int intValue() 获取Byte转int的值
        /*
         * public int intValue() {
         *         return (int)value;
         *     }
         */
        // long longValue() 获取Byte转long的值
        /*
         * public long longValue() {
         *         return (long)value;
         *     }
         */
        // float floatValue() 获取Byte转float的值
        /*
         * public float floatValue() {
         *         return (float)value;
         *     }
         */
        // double doubleValue() 获取Byte转double的值
        /*
         * public double doubleValue() {
         *         return (double)value;
         *     }
         */
        // String toString() Byte 转为int后使用Integer.toString(int value) 转为String
        /*
         * public String toString() {
         *         return Integer.toString((int)value);
         *     }
         */
        // int hashCode() 返回Byte对象的HashCode值
        /*
         * @Override
         *     public int hashCode() {
         *         return Byte.hashCode(value);
         *     }
         */
        // 类方法 static int hashCode(byte value) 获取byte的HashCode值
        /*
         * public static int hashCode(byte value) {
         *         return (int)value;
         *     }
         */
        // boolean equals(Object obj) 判断对象是否是Byte类型 ? 返回value值比较 : false
        /*
         * public boolean equals(Object obj) {
         *         if (obj instanceof Byte) {
         *             return value == ((Byte)obj).byteValue();
         *         }
         *         return false;
         *     }
         */
        // int compareTo(Byte anotherByte) 调用static int compare(byte x, byte y)
        /*
         * public int compareTo(Byte anotherByte) {
         *         return compare(this.value, anotherByte.value);
         *     }
         * public static int compare(byte x, byte y) {
         *         return x - y;
         *     }
         */
        // static int compare(byte x, byte y) 返回byte的差值
        /*
         * public static int compare(byte x, byte y) {
         *         return x - y;
         *     }
         */
        // static int toUnsignedInt(byte x) Byte转换为无符号的int值
        /*
         * public static int toUnsignedInt(byte x) {
         *         return ((int) x) & 0xff;
         *     }
         * 通过无符号转换将参数转换为int 。
         * 在无符号转换为一个int ，所述的高阶24位int是零和低位8位都等于的比特byte的参数。
         * 因此，零byte和正byte值映射到数值上相等的int值，负byte值映射到等于输入加2 8的int值
         */
        System.out.println(Byte.toUnsignedInt(new Byte("-1"))); // 255  ((int) x) & 0xff; 将高24位全部变成0，低8位保持不变
        System.out.println(Byte.toUnsignedInt(new Byte("1"))); // 1
        // static long toUnsignedLong(byte x) Byte转换为无符号的long值
        /*
         * public static long toUnsignedLong(byte x) {
         *         return ((long) x) & 0xffL;
         *     }
         */
        System.out.println(Byte.toUnsignedLong(new Byte("-1"))); // 255 ((long) x) & 0xffL;
        System.out.println(Byte.toUnsignedLong(new Byte("1"))); // 1
        // public static final int SIZE = 8; 二进制表示byte值的位数 补码形式
        System.out.println(Byte.SIZE); // 8
        // public static final int BYTES = SIZE / Byte.SIZE; 当前类型所占字节数
        System.out.println(Byte.BYTES); // 1
        // private static final long serialVersionUID = -7183698231559129828L; 序列化参数ID
    }
}
