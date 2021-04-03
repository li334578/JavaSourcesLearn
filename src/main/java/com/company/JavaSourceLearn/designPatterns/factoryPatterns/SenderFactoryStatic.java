package com.company.JavaSourceLearn.designPatterns.factoryPatterns;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 静态工厂类
 * @date : 2021-01-28 21:24:03
 */
public class SenderFactoryStatic {
    public static Sender getMailInstance() {
        return new MailSender();
    }


    public static Sender getSortMsgInstance() {
        return new SortMsgSender();
    }
}
