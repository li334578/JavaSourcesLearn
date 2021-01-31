package com.company.designPatterns.factoryPatterns;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 新工厂类
 * @date : 2021-01-28 21:19:37
 */
public class SenderFactoryNew {
    public Sender getMailInstance() {
        return new MailSender();
    }


    public Sender getSortMsgInstance() {
        return new SortMsgSender();
    }
}
