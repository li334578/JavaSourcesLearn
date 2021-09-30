package com.company.JavaSourceLearn.netWork.nioLearn;

import cn.hutool.core.util.StrUtil;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-09-19 15:02:20
 */
public class FileChannelTest {
    public static void main(String[] args) throws Exception {
        testMethod1();
        testMethod2();
        testMethod3();
        testMethod4();
    }

    private static void testMethod1() throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("E:\\data\\1.txt", "rw");
        FileChannel channel = randomAccessFile.getChannel();
        // 分配bytebuffer的空间
        ByteBuffer byteBuffer = ByteBuffer.allocate(6);
        int read = channel.read(byteBuffer);
        // 读取到-1说明文件结束
        while (read != -1) {
            System.out.println(StrUtil.format("本此读取到的文件大小为:{}", read));
            // 转换为输出流
            byteBuffer.flip();
            while (byteBuffer.hasRemaining()) {
                // 文件还有内容 char
                System.out.println((char) byteBuffer.get());

            }
            // 清空缓冲区
            byteBuffer.clear();
            read = channel.read(byteBuffer);
        }
        randomAccessFile.close();
        System.out.println("end ....");
    }

    private static void testMethod2() throws IOException {
        RandomAccessFile accessFile = new RandomAccessFile("E:\\data\\2.txt", "rw");
        FileChannel channel = accessFile.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.clear();
        byte[] bytes = "have a good day honey".getBytes();
        for (int i = 0; i < bytes.length; i += 10) {
            byteBuffer.put(bytes, i, Math.min(bytes.length - i, 10));
            byteBuffer.flip();
            while (byteBuffer.hasRemaining()) {
                channel.write(byteBuffer);
            }
            byteBuffer.clear();
        }
//        channel.force(false);
        accessFile.close();
    }

    private static void testMethod3() throws IOException {
        RandomAccessFile accessFile1 = new RandomAccessFile("E:\\data\\3.txt", "rw");
        FileChannel fromChannel = accessFile1.getChannel();
        RandomAccessFile accessFile2 = new RandomAccessFile("E:\\data\\4.txt", "rw");
        FileChannel toChannel = accessFile2.getChannel();
        fromChannel.transferTo(0, fromChannel.size(), toChannel);
    }


    private static void testMethod4() throws IOException {
        RandomAccessFile accessFile1 = new RandomAccessFile("E:\\data\\3.txt", "rw");
        FileChannel fromChannel = accessFile1.getChannel();
        RandomAccessFile accessFile2 = new RandomAccessFile("E:\\data\\4.txt", "rw");
        FileChannel toChannel = accessFile2.getChannel();
        toChannel.transferFrom(fromChannel,0, fromChannel.size());
    }
}
