package com.company.designPatterns.factoryPatterns;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 工厂类
 * @date : 2021-01-28 21:14:07
 */
public class SenderFactory {
    public Sender getInstance(String name) {
        if (name.equals("mail")) {
            return new MailSender();
        }
        if (name.equals("SortMsg")) {
            return new SortMsgSender();
        }
        return null;
    }
}
