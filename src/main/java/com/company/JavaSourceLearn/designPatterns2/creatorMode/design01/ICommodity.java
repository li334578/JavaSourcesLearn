package com.company.JavaSourceLearn.designPatterns2.creatorMode.design01;

import java.util.Map;

/**
 * @Author: liwenbo
 * @Date: 2021年05月21日
 * @Description:
 */
public interface ICommodity {

    /**
     * 奖品发放
     *
     * @param uId         用户ID
     * @param commodityId 奖品ID
     * @param bizId       业务ID
     * @param extMap      扩展字段 收货地址
     * @throws Exception 异常
     */
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
