package main.java.com.company.JavaSourceLearn.sources.JavaLang.wrapperClass.boolean_test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : Boolean
 * @date : 2020-12-29 20:44:30
 */
public class BooleanExample1 {
    public static void main(String[] args) {
        // 构造方法
        // public Boolean(boolean value)
        // Boolean(String s)
        Boolean b1 = new Boolean("true"); // true 别的都是false
        System.out.println(b1);
        // String转boolean
        /*
         * public static boolean parseBoolean(String s) {
         *         return ((s != null) && s.equalsIgnoreCase("true"));
         *     }
         */
        // 拆箱 boolean booleanValue()
        // 装箱 static Boolean valueOf(boolean b)
        // String转Boolean static Boolean valueOf(String s)
        // boolean转String
        /*
         * public static String toString(boolean b) {
         *         return b ? "true" : "false";
         *     }
         */
        // 继承自Object
        // String toString() 转String
        // int hashCode() hashCode
        // boolean equals(Object obj) 比较
        // HashCode
        /*
         * public static int hashCode(boolean value) {
         *         return value ? 1231 : 1237;
         *     }
         */
        // 获取System的Property属性的boolean值 static boolean getBoolean(String name)
        // int compareTo(Boolean b)
        // static int compare(boolean x, boolean y)
        /*
         * public static int compare(boolean x, boolean y) {
         *         return (x == y) ? 0 : (x ? 1 : -1);
         *     }
         */
        // 取boolean值的与
        // static boolean logicalAnd(boolean a, boolean b)
        // 取boolean值的或
        // static boolean logicalOr(boolean a, boolean b)
        // 取boolean值的异或
        // static boolean logicalXor(boolean a, boolean b)
        // 包装Boolean的true属性
        // static final Boolean TRUE
        // 包装Boolean的false属性
        // static final Boolean FALSE
        System.out.println(Boolean.TYPE);
        // value属性
        // private final boolean value;
        // 序列化参数
        //  static final long serialVersionUID = -3665804199014368530L;
    }
}
