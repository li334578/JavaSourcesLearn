package com.company.JavaSourceLearn.sources.JavaLang.stringClass.Object_test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : Object
 * @date : 2021-01-01 20:26:58
 */
public class ObjectExample1 {
    public static void main(String[] args) {
        // native方法说明该方法不是由Java语言实现的
        // 本地方法，C/C++在DLL中实现，通过JNI调用
        // 静态代码块 类初始化的时候调用该方法 类初始化调用此方法
        /*
         * private static native void registerNatives();
         *     static {
         *         registerNatives();
         *     }
         */
        // 获取类的类型
        // public final native Class<?> getClass();
        // 获取hashCode方法
        // public native int hashCode();
        // 比较是否为同一对象
        /*
         * public boolean equals(Object obj) {
         *         return (this == obj);
         *     }
         */
        // 创建并返回此对象的副本。
        // protected native Object clone() throws CloneNotSupportedException;
        // toString方法 类名@hashCode
        /*
         * public String toString() {
         *         return getClass().getName() + "@" + Integer.toHexString(hashCode());
         *     }
         */
        // 唤醒正在此对象监视器上等待的单个线程。
        // 如果任何线程正在等待此对象，则选择其中一个线程被唤醒。
        // 选择是任意的，由实施决定。
        // public final native void notify();
        // 唤醒等待此对象监视器的所有线程。 线程通过调用wait方法之一等待对象的监视器。
        // public final native void notifyAll();
        // 导致当前线程等待它被唤醒，通常是通知或中断。
        // public final native void wait(long timeout) throws InterruptedException;
        // 导致当前线程等待它被唤醒，通常是通知或中断 ，或者直到经过一定量的实时。
        /*
         * public final void wait(long timeout, int nanos) throws InterruptedException {
         *         if (timeout < 0) {
         *             throw new IllegalArgumentException("timeout value is negative");
         *         }
         *
         *         if (nanos < 0 || nanos > 999999) {
         *             throw new IllegalArgumentException(
         *                                 "nanosecond timeout value out of range");
         *         }
         *
         *         if (nanos > 0) {
         *             timeout++;
         *         }
         *
         *         wait(timeout);
         *     }
         */
        // 导致当前线程等待它被唤醒，通常是通知或中断
        /*
         * public final void wait() throws InterruptedException {
         *         wait(0);
         *     }
         */
        // 资源回收方法
        // 当垃圾收集确定没有对该对象的更多引用时，由对象上的垃圾收集器调用。
        // 子类重写finalize方法以处置系统资源或执行其他清理。
        // protected void finalize() throws Throwable { }
    }
}
