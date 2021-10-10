package com.company.JavaSourceLearn.netWork.nioLearn;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-10-05 14:38:00
 */
public class BufferTest2 {

    @Test
    public void testMethod1() {
        IntBuffer intBuffer = IntBuffer.allocate(10);
        for (int i = 0; i < intBuffer.capacity(); i++) {
            intBuffer.put(i);
        }
        // 创建子缓冲区
        intBuffer.position(3);
        intBuffer.limit(7);
        IntBuffer slice = intBuffer.slice();
        for (int i = 0; i < slice.capacity(); i++) {
            int j = slice.get();
            slice.put(i, j * 10);
        }
        intBuffer.position(0);
        intBuffer.limit(intBuffer.capacity());
        while (intBuffer.hasRemaining()) {
            System.out.println(intBuffer.get());
        }
    }

    @Test
    public void testMethod2() {
        IntBuffer intBuffer = IntBuffer.allocate(10);
        for (int i = 0; i < intBuffer.capacity(); i++) {
            intBuffer.put(i);
        }
        // 创建只读缓冲区
        IntBuffer readOnlyBuffer = intBuffer.asReadOnlyBuffer();
        for (int i = 0; i < intBuffer.capacity(); i++) {
            int j = intBuffer.get(i);
            intBuffer.put(i, j * 2);
        }
        readOnlyBuffer.position(0);
        readOnlyBuffer.limit(intBuffer.capacity());
        // 获取只读缓冲区
        while (readOnlyBuffer.hasRemaining()) {
            System.out.println(readOnlyBuffer.get());
        }
    }

    @Test
    public void testMethod3() throws Exception {
        String inFilePath = "E:\\data\\a.txt";
        FileInputStream fileInputStream = new FileInputStream(inFilePath);
        FileChannel inChannel = fileInputStream.getChannel();
        String outFile = "E:\\data\\b.txt";
        FileOutputStream fileOutputStream = new FileOutputStream(outFile);
        FileChannel outChannel = fileOutputStream.getChannel();
        // 创建直接缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(1024);
        for (; ; ) {
            byteBuffer.clear();
            int read = inChannel.read(byteBuffer);
            if (read == -1) {
                break;
            }
            byteBuffer.flip();
            outChannel.write(byteBuffer);
        }
        inChannel.close();
        outChannel.close();
    }

    @Test
    public void testMethod4() throws Exception {
        RandomAccessFile randomAccessFile = new RandomAccessFile("E:\\data\\c.txt", "rw");
        FileChannel channel = randomAccessFile.getChannel();
        MappedByteBuffer mbb = channel.map(FileChannel.MapMode.READ_WRITE, 0, 1024);
        mbb.put(0, (byte) 97);
        mbb.put(1023, (byte) 122);
        channel.close();
    }
}
