package com.company.designPatterns.factoryPatterns;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 邮件发送
 * @date : 2021-01-28 21:11:58
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("邮件类");
    }
}
