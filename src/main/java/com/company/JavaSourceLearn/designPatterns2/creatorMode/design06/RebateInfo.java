package com.company.JavaSourceLearn.designPatterns2.creatorMode.design06;

import lombok.Data;

import java.util.Date;

/**
 * @Author: liwenbo
 * @Date: 2021年05月25日
 * @Description: 统一mq消息体
 */
@Data
public class RebateInfo {
    private String userId; // ⽤用户ID
    private String bizId; // 业务ID
    private Date bizTime; // 业务时间
    private String desc; // 业务描述
}
