package com.company.JavaSourceLearn.netWork.nioLearn;

import java.nio.ByteBuffer;
import java.nio.channels.Pipe;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-10-09 19:50:20
 */
public class PipeTest {

    public static void main(String[] args) throws Exception {
        Pipe pipe = Pipe.open();
        // 获取sink通道
        Pipe.SinkChannel sinkChannel = pipe.sink();
        // 创建缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        byteBuffer.put("hello world".getBytes());
        byteBuffer.flip();
        sinkChannel.write(byteBuffer);
        // 获取source管道
        Pipe.SourceChannel sourceChannel = pipe.source();
        byteBuffer.flip();
        int read = sourceChannel.read(byteBuffer);
        System.out.println(new String(byteBuffer.array(), 0, read));
        // 关闭通道
        sinkChannel.close();
        sourceChannel.close();
    }
}
