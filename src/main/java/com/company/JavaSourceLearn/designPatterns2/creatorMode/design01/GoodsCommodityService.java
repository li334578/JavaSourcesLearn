package com.company.JavaSourceLearn.designPatterns2.creatorMode.design01;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @Author: liwenbo
 * @Date: 2021年05月21日
 * @Description:
 */
@Slf4j
public class GoodsCommodityService implements ICommodity {
    /**
     * 奖品发放
     *
     * @param uId         用户ID
     * @param commodityId 奖品ID
     * @param bizId       业务ID
     * @param extMap      扩展字段 收货地址
     * @throws Exception 异常
     */
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        log.info("实物奖品发放...");
    }
}
