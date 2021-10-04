package com.company.JavaSourceLearn.netWork.nioLearn;

import org.junit.jupiter.api.Test;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.charset.Charset;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-10-03 09:53:05
 */
public class DatagramChannelTest {

    @Test
    public void sendMethod() throws Exception {
        DatagramChannel datagramChannel = DatagramChannel.open();
        SocketAddress socketAddress = new InetSocketAddress("127.0.0.1",9999);
        while (true) {
            ByteBuffer byteBuffer = ByteBuffer.wrap("hello world 你好啊".getBytes("UTF-8"));
            datagramChannel.send(byteBuffer, socketAddress);
            System.out.println("已完成发送");
            Thread.sleep(1000);
        }
    }

    @Test
    public void receiveMethod() throws Exception {
        DatagramChannel datagramChannel = DatagramChannel.open();
        SocketAddress socketAddress = new InetSocketAddress(9999);
        datagramChannel.bind(socketAddress);
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        while (true) {
            byteBuffer.clear();
            SocketAddress receive = datagramChannel.receive(byteBuffer);
            byteBuffer.flip();
            System.out.println(receive.toString());
            System.out.println(Charset.forName("UTF-8").decode(byteBuffer));
        }
    }
}
