package com.company.sources.wrapperClass.enum_test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : enum
 * @date : 2020-12-30 21:12:48
 */
public class EnumExample1 {
    //    Enum
    public static void main(String[] args) {
        // 受保护的构造方法
        /*
         * protected Enum(String name, int ordinal) {
         *         this.name = name;
         *         this.ordinal = ordinal;
         *     }
         */
        // name 名称
        /*
         * public final String name() {
         *         return name;
         *     }
         */
        // ordinal 顺序
        /*
         * public final int ordinal() {
         *         return ordinal;
         *     }
         */
        // toString返回枚举名称
        /*
         * public String toString() {
         *         return name;
         *     }
         */
        // 枚举比较判断是否为同一对象
        /*
         * public final boolean equals(Object other) {
         *         return this==other;
         *     }
         */
        // 枚举常量的HashCode值
        /*
         * public final int hashCode() {
         *         return super.hashCode();
         *     }
         */
        // 枚举clone方法 枚举是单例的 clone会抛出CloneNotSupportedException
        /*
         * protected final Object clone() throws CloneNotSupportedException {
         *         throw new CloneNotSupportedException();
         *     }
         */
        // 比较方法 比较枚举的顺序值 只能枚举常量相互比较
        /*
         * public final int compareTo(E o) {
         *         Enum<?> other = (Enum<?>)o;
         *         Enum<E> self = this;
         *         if (self.getClass() != other.getClass() && // optimization
         *             self.getDeclaringClass() != other.getDeclaringClass())
         *             throw new ClassCastException();
         *         return self.ordinal - other.ordinal;
         *     }
         */
        // 返回枚举类类对象
        /*
         * public final Class<E> getDeclaringClass() {
         *         Class<?> clazz = getClass();
         *         Class<?> zuper = clazz.getSuperclass();
         *         return (zuper == Enum.class) ? (Class<E>)clazz : (Class<E>)zuper;
         *     }
         */
        // 获取枚举类enumType中名称为name的枚举实例，其他实例不受影响
        // static <T extends Enum<T>> T valueOf(Class<T> enumType,String name)
        // enum classes cannot have finalize methods. 枚举单例不可被回收
        // 枚举不可反序列化
        /*
         * private void readObject(ObjectInputStream in) throws IOException,
         *         ClassNotFoundException {
         *         throw new InvalidObjectException("can't deserialize enum");
         *     }
         *
         *     private void readObjectNoData() throws ObjectStreamException {
         *         throw new InvalidObjectException("can't deserialize enum");
         *     }
         */
        // private final String name; 枚举实例名称
        // private final int ordinal; 枚举实例值

    }
}
