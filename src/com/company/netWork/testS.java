package com.company.netWork;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * @Author: liwenbo
 * @Date: 25/3/2021
 * @Description: TCP server
 */
public class testS {

    public static void main(String[] args) throws Exception {
        Random random = new Random();
        // 设置端口号
        int port = 33453;
        // 输入流
        boolean flag = true;
        ServerSocket serverSocket = new ServerSocket(port);
        Socket accept = serverSocket.accept();
        InputStream inputStream;
        while (flag) {
            inputStream = accept.getInputStream();
            // 设置缓冲区
            byte[] bytes = new byte[1024 * 50];
            // 获取实际数据及数据的大小
            int len = inputStream.read(bytes);
            String message = new String(bytes, 0, len);
            // 获取发送者的ip地址
            String sourceIP = serverSocket.getInetAddress().getHostAddress();
            System.out.println("收到来自" + sourceIP + "的消息，内容为：" + message);
            // 回复消息
            OutputStream outputStream = accept.getOutputStream();
            if (message.equals("close")) {
                flag = false;
                outputStream.write("close".getBytes());
            } else {
                outputStream.write(("success->" + random.nextInt(100)).getBytes());
            }
            outputStream.flush();
        }
        accept.close();
        serverSocket.close();
    }
}
