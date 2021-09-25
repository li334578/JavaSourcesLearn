package com.company.JavaSourceLearn.netWork.nioLearn;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-09-25 13:39:01
 */
public class FileChannelAcceptTest {
    public static void main(String[] args) throws Exception {
        int port = 9876;
        ByteBuffer buffer = ByteBuffer.wrap("hello world".getBytes());
        ServerSocketChannel channel = ServerSocketChannel.open();
        channel.socket().bind(new InetSocketAddress(port));
        channel.configureBlocking(false);
        while (true) {
            System.out.println("waiting for connections");
            SocketChannel accept = channel.accept();
            if (accept == null) {
                System.out.println("no have connection");
                Thread.sleep(2000);
            } else {
                System.out.println("Incoming connection from : " + accept.socket().getRemoteSocketAddress());
                buffer.rewind();
                accept.write(buffer);
                accept.close();
            }
        }
    }
}
