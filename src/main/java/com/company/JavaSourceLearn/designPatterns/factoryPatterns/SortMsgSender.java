package main.java.com.company.JavaSourceLearn.designPatterns.factoryPatterns;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 短信发送
 * @date : 2021-01-28 21:12:44
 */
public class SortMsgSender implements Sender {

    @Override
    public void send() {
        System.out.println("短信类");
    }
}
