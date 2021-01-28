package com.company.designPatterns.factoryPatterns;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 测试类
 * @date : 2021-01-28 21:16:45
 */
public class Test {
    public static void main(String[] args) {
        SenderFactory senderFactory = new SenderFactory();
        Sender mail = senderFactory.getInstance("mail");
        mail.send();
        Sender sortMsg = senderFactory.getInstance("SortMsg");
        sortMsg.send();
    }
}
