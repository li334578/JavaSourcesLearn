package com.company.JavaSourceLearn.designPatterns2.creatorMode.design07;

import java.math.BigDecimal;

/**
 * @Author: liwenbo
 * @Date: 2021年05月27日
 * @Description:
 */
public class Test {
    public static void main(String[] args) {

        Pay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("yy", "xx", new BigDecimal("2.0"));
    }

}
