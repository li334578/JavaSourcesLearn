package com.company.JavaSourceLearn.netWork.nioLearn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-10-10 10:42:37
 */
public class FileLockTest {

    /**
     * 文件锁是进程级别的 不是线程级别的
     * 文件锁可以解决多个进程并发访问但不能解决多个线程并发访问
     */

    public static void main(String[] args) throws Exception {
        String input = "hello world";
        ByteBuffer byteBuffer = ByteBuffer.wrap(input.getBytes());
        String fp = "E:\\data\\x.txt";
        Path path = Paths.get(fp);
        FileChannel open = FileChannel.open(path, StandardOpenOption.WRITE, StandardOpenOption.APPEND);
        // lock 阻塞方法 当文件锁不可用时 当前线程会被挂起
        // trylock 非阻塞方法 当文件锁不可用时 trylo+ck为共享锁
        FileLock fileLock = open.tryLock(0, Long.MAX_VALUE, false);
        System.out.println("共享锁" + fileLock.isShared());
        open.write(byteBuffer);
        open.close();
        System.out.println("写操作完成");
        readPrint(fp);
    }

    public static void readPrint(String path) throws Exception {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println("    " + line);
            line = bufferedReader.readLine();
        }
        fileReader.close();
        bufferedReader.close();
    }
}
