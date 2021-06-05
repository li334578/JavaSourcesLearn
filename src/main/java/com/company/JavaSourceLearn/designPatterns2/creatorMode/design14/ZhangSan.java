package com.company.JavaSourceLearn.designPatterns2.creatorMode.design14;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author: liwenbo
 * @Date: 2021年06月02日
 * @Description:
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ZhangSan extends Person implements Action {


    public ZhangSan(String name) {
        super.setName(name);
    }

    @Override
    public void showName() {
        System.out.println(super.getName());
    }

    /**
     * 表白方法
     */
    @Override
    public void showLove() {
        System.out.println("张三会表白");
    }
}
