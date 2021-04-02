package main.java.com.company.JavaSourceLearn.sources.JavaLang.wrapperClass.double_test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : Double类
 * @date : 2020-12-24 21:43:24
 */
public class DoubleExample1 {
    public static void main(String[] args) {
        // 构造函数
        // Double(double value)
        // Double(String s)
        // double转String
        // static String toString(double d)
        // double转十六进制String
        // static String toHexString(double d)
        // String转Double
        // static Double valueOf(String s)
        // 装箱方法 static Double valueOf(double d)
        // String转double static double parseDouble(String s)
        // 判断是否为NAN static boolean isNaN(double v)
        // 判断是否为NAN boolean isNaN()
        // 判断是否为无穷数 static boolean isInfinite(double v)
        // 判断是否是数 static boolean isFinite(double d)
        // 继承自Object
        // Double转String String toString()
        // 取HashCode int hashCode()
        // 比较方法 boolean equals(Object obj)
        /*
         * public boolean equals(Object obj) {
         *         return (obj instanceof Double)
         *                && (doubleToLongBits(((Double)obj).value) ==
         *                       doubleToLongBits(value));
         *     }
         */
        // 继承自Number
        // 转byte byte byteValue()
        // 转short short shortValue()
        // 转int int intValue()
        // 转long long longValue()
        // 转float float floatValue()
        // 转double double doubleValue()
        // 获取HashCode
        /*
         * public static int hashCode(double value) {
         *         long bits = doubleToLongBits(value);
         *         return (int)(bits ^ (bits >>> 32));
         *     }
         */
        // double转long static long doubleToLongBits(double value)
        // double转long static public static native long doubleToRawLongBits(double value);
        // long转double public static native double longBitsToDouble(long bits);
        // 比较方法
        /*
         * public int compareTo(Double anotherDouble) {
         *         return Double.compare(value, anotherDouble.value);
         *     }
         */
        /*
         * public static int compare(double d1, double d2) {
         *         if (d1 < d2)
         *             return -1;           // Neither val is NaN, thisVal is smaller
         *         if (d1 > d2)
         *             return 1;            // Neither val is NaN, thisVal is larger
         *
         *         // Cannot use doubleToRawLongBits because of possibility of NaNs.
         *         long thisBits    = Double.doubleToLongBits(d1);
         *         long anotherBits = Double.doubleToLongBits(d2);
         *
         *         return (thisBits == anotherBits ?  0 : // Values are equal
         *                 (thisBits < anotherBits ? -1 : // (-0.0, 0.0) or (!NaN, NaN)
         *                  1));                          // (0.0, -0.0) or (NaN, !NaN)
         *     }
         */
        // 求和 static double sum(double a, double b)
        // 取最大值 static double max(double a, double b)
        // 取最小值 static double mix(double a, double b)
        // 正无穷 public static final double POSITIVE_INFINITY = 1.0 / 0.0;
        // 负无穷 public static final double NEGATIVE_INFINITY = -1.0 / 0.0;
        // NAN public static final double NaN = 0.0d / 0.0;
        // 最大值 public static final double MAX_VALUE = 0x1.fffffffffffffP+1023;
        // 用来表示最小标准值 public static final double MIN_NORMAL = 0x1.0p-1022;
        // 最小值 public static final double MIN_VALUE = 0x0.0000000000001P-1022;
        // 指数最大值 public static final int MAX_EXPONENT = 1023;
        // 指数最小值 public static final int MIN_EXPONENT = -1022;
        System.out.println(Double.SIZE); // 64位
        System.out.println(Double.BYTES); // 8字节
        System.out.println(Double.TYPE); // double
        // private final float value; 属性
        // serialVersionUID 序列化id
    }
}
