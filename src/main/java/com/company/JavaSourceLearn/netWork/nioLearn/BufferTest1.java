package com.company.JavaSourceLearn.netWork.nioLearn;

import org.junit.jupiter.api.Test;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-10-05 14:10:50
 */
public class BufferTest1  {

    @Test
    public void testMethod1() throws Exception {
        RandomAccessFile accessFile = new RandomAccessFile("E:\\data\\1.txt", "rw");
        FileChannel channel = accessFile.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        int readLen = channel.read(byteBuffer);
        while (readLen != -1) {
            // 说明读取到了数据
            byteBuffer.flip();
            while (byteBuffer.hasRemaining()) {
                System.out.println((char) byteBuffer.get());
            }
            byteBuffer.clear();
            readLen = channel.read(byteBuffer);
        }
        channel.close();
    }

    @Test
    public void testMethod2() {
        IntBuffer intBuffer = IntBuffer.allocate(8);
        for (int i = 0; i < intBuffer.capacity(); i++) {
            intBuffer.put(2 * (i + 1));
        }
        intBuffer.flip();
        while (intBuffer.hasRemaining()) {
            System.out.println(intBuffer.get());
        }
    }
}
