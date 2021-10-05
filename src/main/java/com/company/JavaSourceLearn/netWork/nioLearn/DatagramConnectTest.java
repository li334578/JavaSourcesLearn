package com.company.JavaSourceLearn.netWork.nioLearn;

import org.junit.jupiter.api.Test;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.charset.Charset;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-10-03 10:09:08
 */
public class DatagramConnectTest {
    @Test
    public void connMethod() throws Exception {
        DatagramChannel datagramChannel = DatagramChannel.open();
        datagramChannel.bind(new InetSocketAddress(9999));
        datagramChannel.connect(new InetSocketAddress("127.0.0.1", 9999));
        datagramChannel.write(ByteBuffer.wrap("发送数据".getBytes("UTF-8")));
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        while (true) {
            byteBuffer.clear();
            datagramChannel.read(byteBuffer);
            byteBuffer.flip();
            System.out.println(Charset.forName("UTF-8").decode(byteBuffer));
        }

    }
}
