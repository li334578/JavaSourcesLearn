package com.company.netWork;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author: liwenbo
 * @Date: 25/3/2021
 * @Description: TCP client
 */
public class testC {

    public static void main(String[] args) throws Exception {
        // 获取本机id
        InetAddress localHost = InetAddress.getLocalHost();
        String ip = localHost.getHostAddress();
        int port = 33453;
        // 创建socket对象
        Socket socket = new Socket(ip, port);
        OutputStream outputStream = socket.getOutputStream();
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        while (flag) {
            String message = scanner.nextLine();
            outputStream.write(message.getBytes());
            outputStream.flush();
            // 获取客户端返回的消息
            InputStream inputStream = socket.getInputStream();
            byte[] bytes = new byte[1024 * 50];
            int len = inputStream.read(bytes);
            String receiveMessage = new String(bytes, 0, len);
            System.out.println("客户端收到的消息为" + receiveMessage);
            if (receiveMessage.equals("close")) {
                flag = false;
            }
            inputStream.close();
        }

        outputStream.close();
        socket.close();
    }
}
