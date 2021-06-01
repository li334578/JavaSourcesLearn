package com.company.JavaSourceLearn.designPatterns2.creatorMode.design07;

/**
 * @Author: liwenbo
 * @Date: 2021年05月27日
 * @Description: 刷脸支付
 */
public class PayFaceMode implements IPayMode{
    @Override
    public boolean security(String uId) {
        return false;
    }
}
