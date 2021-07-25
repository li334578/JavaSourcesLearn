package com.company.JavaSourceLearn.jvmLesson.lesson01;

import sun.misc.Launcher;

import java.net.URL;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-07-11 15:10:29
 */
public class TestJDKClassLoader {
    public static void main(String[] args) {
        // bootstrap classLoader
        System.out.println(String.class.getClassLoader());
        // extension classLoader ExtClassLoader
        System.out.println(com.sun.crypto.provider.DESKeyFactory.class.getClassLoader());
        // System classLoader AppClassLoader
        System.out.println(TestJDKClassLoader.class.getClassLoader());
        System.out.println();

        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        ClassLoader extClassLoader = systemClassLoader.getParent();
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(systemClassLoader);
        System.out.println(extClassLoader);
        System.out.println(bootstrapClassLoader);
        // bootstrapClassLoader 加载以下文件
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL urL : urLs) {
            System.out.println(urL);
        }
        System.out.println("============================");
        // extClassLoader 加载以下文件
        System.out.println(System.getProperty("java.ext.dirs"));
        System.out.println("============================");
        // appClassLoader 加载以下文件
        System.out.println(System.getProperty("java.class.path"));

    }

}
