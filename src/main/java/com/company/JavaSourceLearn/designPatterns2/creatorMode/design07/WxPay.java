package com.company.JavaSourceLearn.designPatterns2.creatorMode.design07;

import java.math.BigDecimal;

/**
 * @Author: liwenbo
 * @Date: 2021年05月27日
 * @Description:
 */
public class WxPay extends Pay {

    public WxPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        return null;
    }
}
