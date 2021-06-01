package com.company.JavaSourceLearn.designPatterns2.creatorMode.design07;

/**
 * @Author: liwenbo
 * @Date: 2021年05月27日
 * @Description: 密码支付
 */
public class PayCypher implements IPayMode{
    @Override
    public boolean security(String uId) {
        return false;
    }
}
