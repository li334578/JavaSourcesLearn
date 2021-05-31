package com.company.JavaSourceLearn.designPatterns2.creatorMode.design06;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: liwenbo
 * @Date: 2021年05月25日
 * @Description: 第三方订单
 */
@Data
public class POPOrderDelivered {
    private String uId; // ⽤用户ID
    private String orderId; // 订单号
    private Date orderTime; // 下单时间
    private Date sku; // 商品
    private Date skuName; // 商品名称
    private BigDecimal decimal; // ⾦金金额
}
