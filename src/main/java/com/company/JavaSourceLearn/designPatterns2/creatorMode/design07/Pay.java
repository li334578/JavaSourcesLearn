package com.company.JavaSourceLearn.designPatterns2.creatorMode.design07;

import java.math.BigDecimal;

/**
 * @Author: liwenbo
 * @Date: 2021年05月27日
 * @Description:
 */
public abstract class Pay {
    protected IPayMode payMode;

    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
