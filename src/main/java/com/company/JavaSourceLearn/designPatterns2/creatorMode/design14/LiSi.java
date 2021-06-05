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
public class LiSi extends Person implements Action {

    public LiSi(String name) {
        super.setName(name);
    }

    /**
     * 表白方法
     */
    @Override
    public void showLove() {
        System.out.println("李四会表白");
    }

    @Override
    public void showName() {
        System.out.println(super.getName());
    }
}
