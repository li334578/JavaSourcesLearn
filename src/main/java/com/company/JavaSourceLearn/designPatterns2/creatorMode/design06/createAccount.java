package com.company.JavaSourceLearn.designPatterns2.creatorMode.design06;

import lombok.Data;

import java.util.Date;

/**
 * @Author: liwenbo
 * @Date: 2021年05月25日
 * @Description: 注册开户
 */
@Data
public class createAccount {
    private String number; // 开户编号
    private String address; // 开户地
    private Date accountDate; // 开户时间
    private String desc; // 开户描述
}
