package com.company.JavaSourceLearn.jvmLesson.lesson02;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 测试堆栈溢出
 * @date : 2021-07-11 20:49:12
 */
public class StackOverflowTest {
    static int count = 0;

    static void redo() {
        count++;
        redo();
    }

    public static void main(String[] args) {
        try {
            redo();
        } catch (Throwable t) {
            t.printStackTrace();
            System.out.println(count);
        }
    }
}
