package com.company.JavaSourceLearn.netWork.nioLearn;

import org.junit.jupiter.api.Test;

import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-10-05 15:36:39
 */
public class SelectorTest1 {
    @Test
    public void testMethod1() throws Exception {
        // selector
        Selector selector = Selector.open();
        // 通道
        ServerSocketChannel socketChannel = ServerSocketChannel.open();
        // 设置非阻塞
        socketChannel.configureBlocking(false);
        // 绑定
        socketChannel.bind(new InetSocketAddress(9999));
        // 注册
        socketChannel.register(selector, SelectionKey.OP_ACCEPT);
        // 查询
        Set<SelectionKey> keys = selector.selectedKeys();
        Iterator<SelectionKey> iterator = keys.iterator();
        while (iterator.hasNext()) {
            SelectionKey key = iterator.next();
            if (key.isAcceptable()) {

            } else if (key.isConnectable()) {

            } else if (key.isReadable()) {

            } else if (key.isWritable()) {

            } else if (key.isValid()) {

            }
            iterator.remove();
        }
    }
}
