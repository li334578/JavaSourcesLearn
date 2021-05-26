package com.company.JavaSourceLearn.designPatterns2.creatorMode.design01;

/**
 * @Author: liwenbo
 * @Date: 2021年05月21日
 * @Description:
 */
public class StoreFactory {
    public static ICommodity getCommodity(Integer commodityType) {
        if (commodityType == null) return null;
        if (commodityType == 1) return new CouponCommodityService();
        if (commodityType == 2) return new GoodsCommodityService();
        if (commodityType == 3) return new CardCommodityService();
        throw new RuntimeException("不存在的类型");
    }
}
