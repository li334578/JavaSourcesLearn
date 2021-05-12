package com.company.JavaSourceLearn.jvmLesson;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-05-10 20:53:15
 */
public class CLassLoaderTest {
    public static void main(String[] args) {
        // bootstrap classLoader $java_home/jre/lib/rt.jar
        System.out.println(new CLassLoaderTest().getClass().getClassLoader().getParent().getParent());
        // extension classLoader $java_home/jre/lib/ext/*.jar
        System.out.println(new CLassLoaderTest().getClass().getClassLoader().getParent());
        // System classLoader $CLASSPATH
        System.out.println(new CLassLoaderTest().getClass().getClassLoader());
        System.out.println("-----------------");
        System.out.println(new Object().getClass().getClassLoader());
    }
}
