package main.java.com.company.JavaSourceLearn.sources.JavaLang.wrapperClass.float_test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : Float类
 * @date : 2020-12-24 21:12:20
 */
public class FloatExample1 {
    public static void main(String[] args) {
        // 构造函数
        // Float(float value)
        // Float(double value)
        // Float(String s)
        // 转字符串方法
        // static String toString(float f)
        // 进制转换方法
        // static String toHexString(float f) 16进制
        // 字符串转Long
        // static Float valueOf(String s)
        // 装箱方法
        //  static Float valueOf(float f)
        // 字符串转float
        /*
         * public static float parseFloat(String s) throws NumberFormatException {
         *         return FloatingDecimal.parseFloat(s);
         *     }
         */
        // 判断v是不是NAN 负数的平方根为NAN
        /*
         * public static boolean isNaN(float v) {
         *         return (v != v);
         *     }
         */
        double i = -1;
        System.out.println(Float.isNaN((float) Math.sqrt(i)));
        // 判断v是否为正无穷或者负无穷
        /*
         * public static boolean isInfinite(float v) {
         *         return (v == POSITIVE_INFINITY) || (v == NEGATIVE_INFINITY);
         *     }
         */
        // 判断f是否为数字
        /*
         * public static boolean isFinite(float f) {
         *         return Math.abs(f) <= FloatConsts.MAX_VALUE;
         *     }
         */
        // 判断是否为NAN
        /*
         * public boolean isNaN() {
         *         return isNaN(value);
         *     }
         */
        Float sqrt = (float) Math.sqrt(i);
        System.out.println(sqrt);
        System.out.println(sqrt.isNaN());
        // 判断是否是正无穷或者负无穷
        /*
         * public boolean isInfinite() {
         *         return isInfinite(value);
         *     }
         */
        // 继承自Object的方法
        // 转字符串
        /*
         * public String toString() {
         *         return Float.toString(value);
         *     }
         */
        // 获取HashCode
        /*
         * public int hashCode() {
         *         return Float.hashCode(value);
         *     }
         */
        // 比较方法
        /*
         * public boolean equals(Object obj) {
         *         return (obj instanceof Float)
         *                && (floatToIntBits(((Float)obj).value) == floatToIntBits(value));
         *     }
         */
        // 继承自Number
        // 转byte  byte byteValue()
        // 转short  short shortValue()
        // 转int  int intValue()
        // 转long  long longValue()
        // 转float  float floatValue()
        // 转double  double doubleValue()
        // 获取hashCode static int hashCode(float value)
        // float转int static int floatToIntBits(float value)
        // int转float static float intBitsToFloat(int bits)
        System.out.println(Float.intBitsToFloat(1));
        // public static native int floatToRawIntBits(float value);
        // 该方法主要是将一个浮点数转成IEEE 754标准的二进制形式对应的整型数。
        // 比较方法
        //  int compareTo(Float anotherFloat)
        /*
         * public int compareTo(Float anotherFloat) {
         *         return Float.compare(value, anotherFloat.value);
         *     }
         */
        // static int compare(float f1, float f2)
        /*
         * public static int compare(float f1, float f2) {
         *         if (f1 < f2)
         *             return -1;           // Neither val is NaN, thisVal is smaller
         *         if (f1 > f2)
         *             return 1;            // Neither val is NaN, thisVal is larger
         *
         *         // Cannot use floatToRawIntBits because of possibility of NaNs.
         *         int thisBits    = Float.floatToIntBits(f1);
         *         int anotherBits = Float.floatToIntBits(f2);
         *
         *         return (thisBits == anotherBits ?  0 : // Values are equal
         *                 (thisBits < anotherBits ? -1 : // (-0.0, 0.0) or (!NaN, NaN)
         *                  1));                          // (0.0, -0.0) or (NaN, !NaN)
         *     }
         */
        // 求和方法 static float sum(float a, float b)
        // 取最大值 static float max(float a, float b)
        // 取最小值 static float min(float a, float b)
        // 一个常数，保持float类型的正无穷大
        // public static final float POSITIVE_INFINITY = 1.0f / 0.0f;
        // 一个常数，保持float类型的负无穷大
        //  public static final float NEGATIVE_INFINITY = -1.0f / 0.0f;
        // NAN public static final float NaN = 0.0f / 0.0f;
        // 最大值 public static final float MAX_VALUE = 0x1.fffffeP+127f; // 3.4028235e+38f
        // 用来表示最小标准值 一个常数，保持float型的最小正正规值2^-126
        // public static final float MIN_NORMAL = 0x1.0p-126f; // 1.17549435E-38f
        // 用来表示浮点数最小值 一个常量，它持有float类型的最小正非零值2 -149
        // public static final float MIN_VALUE = 0x0.000002P-126f; // 1.4e-45f
        // 用来表示指数的最大值
        // public static final int MAX_EXPONENT = 127;
        // 用来表示指数的最小值
        // public static final int MIN_EXPONENT = -126;
        System.out.println(Float.SIZE); // 32位
        System.out.println(Float.BYTES); // 4字节
        System.out.println(Float.TYPE); // float
        // private final float value; 属性
        // serialVersionUID 序列化id
    }
}
