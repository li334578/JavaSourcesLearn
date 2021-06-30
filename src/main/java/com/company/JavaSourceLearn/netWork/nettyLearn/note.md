# Netty

## NIO

## 网络编程

C/S 两个线程之间的通信 通过指定端口通信 服务端一直在等待 one by one

```
serverSocket.accept(); // 阻塞 等待客户端连接
```

BIO 多线程版本 获取到一个客户端连接是 开启一个新线程进行处理。

或者用线程池来处理。

 NIO Non Block IO(New IO) 

```
Selector 通道的管理器

ServerSocketChannel(ServerSocket):只关心客户端连接事件

SocketChannel(Socket关心读事件、写事件、读写事件

SelectionKey 事件集合

ByteBuffer

多路复用
Reactor
```



