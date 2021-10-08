package com.company.JavaSourceLearn.netWork.nioLearn;

import cn.hutool.core.date.DateUtil;
import org.junit.jupiter.api.Test;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-10-05 15:50:24
 */
public class SelectorTest2 {
    @Test
    public void testMethod1() throws Exception {
        SocketChannel channel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 8080));
        channel.configureBlocking(false);
        ByteBuffer allocate = ByteBuffer.allocate(1024);
        allocate.put(DateUtil.now().getBytes());
        allocate.flip();
        channel.write(allocate);
        channel.close();
    }

    @Test
    public void testMethod2() throws Exception {
        ServerSocketChannel channel = ServerSocketChannel.open();
        channel.configureBlocking(false);
        ByteBuffer allocate = ByteBuffer.allocate(1024);
        channel.bind(new InetSocketAddress(8080));
        Selector selector = Selector.open();
        channel.register(selector, SelectionKey.OP_ACCEPT);
        while (selector.select() > 0) {
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();
            while (iterator.hasNext()) {
                SelectionKey key = iterator.next();
                if (key.isAcceptable()) {
                    SocketChannel accept = channel.accept();
                    accept.configureBlocking(false);
                    accept.register(selector, SelectionKey.OP_READ);
                } else if (key.isConnectable()) {

                } else if (key.isReadable()) {
                    SocketChannel channel1 = (SocketChannel) key.channel();
                    int len;
                    while ((len = channel1.read(allocate)) > 0) {
                        allocate.flip();
                        System.out.println(new String(allocate.array(), 0, len));
                        allocate.clear();
                    }
                } else if (key.isWritable()) {

                } else if (key.isValid()) {

                }
                iterator.remove();
            }
        }

    }
}
