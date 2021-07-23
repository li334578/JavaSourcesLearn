package com.company.JavaSourceLearn.jvmLesson.lesson01;

import java.io.FileInputStream;
import java.lang.reflect.Method;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 自定义类加载器
 * @date : 2021-07-11 15:59:09
 */
public class MyClassLoaderTest extends ClassLoader {

    private String classPath;

    public MyClassLoaderTest(String classPath) {
        this.classPath = classPath;
    }

    private byte[] loadByte(String name) throws Exception {
        name = name.replaceAll("\\.", "/");
        FileInputStream fis = new FileInputStream(classPath + "/" + name.concat(".class"));
        int len = fis.available();
        byte[] data = new byte[len];
        fis.read(data);
        fis.close();
        return data;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            byte[] data = loadByte(name);
            // defineClass 将一个字节数组转换为class对象，这个字节数组是class文件读取后最终的字节数组
            return defineClass(name, data, 0, data.length);
        } catch (Exception e) {
            throw new ClassNotFoundException();
        }
    }

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        synchronized (getClassLoadingLock(name)) {
            // First, check if the class has already been loaded
            Class<?> c = findLoadedClass(name);
            if (c == null) {
                long t0 = System.nanoTime();

                // If still not found, then invoke findClass in order
                // to find the class.
                long t1 = System.nanoTime();
                // 指定自己的代码走自己的类加载方法
                if (name.startsWith("com.company")) {
                    c = findClass(name);
                } else {
                    // object 等Java的类走原有的方法
                    c = this.getParent().loadClass(name);
                }

                // this is the defining class loader; record the stats
                sun.misc.PerfCounter.getParentDelegationTime().addTime(t1 - t0);
                sun.misc.PerfCounter.getFindClassTime().addElapsedTimeFrom(t1);
                sun.misc.PerfCounter.getFindClasses().increment();
            }
            if (resolve) {
                resolveClass(c);
            }
            return c;
        }
    }

    public static void main(String[] args) throws Exception {
        // 初始化自定义类加载器 会先初始化父类ClassLoader 其中会把自定义类加载器的父加载器设置为应用程序类加载器AppClassLoader
        MyClassLoaderTest classLoaderTest = new MyClassLoaderTest("E:/test");
        Class clazz = classLoaderTest.loadClass("com.company.bean.Student1");
        Object obj = clazz.newInstance();
        Method method = clazz.getDeclaredMethod("toString", null);
        method.invoke(obj, null);
        System.out.println(clazz.getClassLoader().getClass().getName());
    }
}
