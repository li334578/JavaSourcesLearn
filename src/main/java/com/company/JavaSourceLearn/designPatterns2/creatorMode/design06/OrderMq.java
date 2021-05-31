package com.company.JavaSourceLearn.designPatterns2.creatorMode.design06;

import lombok.Data;

import java.util.Date;

/**
 * @Author: liwenbo
 * @Date: 2021年05月25日
 * @Description:
 */
@Data
public class OrderMq {
    private String uid; // ⽤用户ID
    private String sku; // 商品
    private String orderId; // 订单ID
    private Date createOrderTime; // 下单时间
}
