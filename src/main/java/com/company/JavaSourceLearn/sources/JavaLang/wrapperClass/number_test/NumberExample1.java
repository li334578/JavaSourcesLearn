package main.java.com.company.JavaSourceLearn.sources.JavaLang.wrapperClass.number_test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : Number类
 * @date : 2020-12-15 21:11:28
 */
public class NumberExample1 {
    public static void main(String[] args) {
        // 基础数据类型 byte sort int long float double boolean char
        // Number是所有包装类的父类

        Double d1 = 2.1d;
        Double d2 = 2.9d;
        Float f1 = 3.1f;
        Float f2 = 3.9f;
        /*
         * public abstract int intValue();
         * 转换为int后的值，其中涉及到值的舍入或截断 去尾法
         * 有使用intValue()方法的子类
         * AtomicInteger Integer的原子类 synchronized
         * AtomicLong
         * BigDecimal
         * BigInteger
         * Byte
         * Double
         * DoubleAccumulator Double的原子类
         * DoubleAdder Double的原子类
         * Float
         * Integer
         * Long
         * LongAccumulator Long的原子类
         * LongAdder Long的原子类
         * Short
         */
        System.out.println(d1.intValue());
        System.out.println(d2.intValue());
        System.out.println(f1.intValue());
        System.out.println(f2.intValue());
        /*
         * public abstract int intValue();
         * 转换为long后的值，其中涉及到数值的舍入或截断 去尾法
         */
        System.out.println(d1.longValue());
        System.out.println(d2.longValue());
        System.out.println(f1.longValue());
        System.out.println(f2.longValue());
        /*
         * public abstract float floatValue();
         * 转换为float后的值，其中涉及到数值的舍入
         */
        System.out.println(d1.floatValue());
        /*
         * public abstract double doubleValue();
         * 转换为double后的值，其中涉及到数值的舍入
         */

        /*
         * public byte byteValue() {
         *   return (byte)intValue();
         * }
         * 调用intValue()方法后强转为byte类型
         */

        /*
         * public short shortValue() {
         *   return (short)intValue();
         * }
         * 调用intValue()方法后强转为short类型
         */

    }


}
