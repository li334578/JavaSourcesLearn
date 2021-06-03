package com.company.JavaSourceLearn.designPatterns2.creatorMode.design14;

import lombok.Data;

/**
 * @Author: liwenbo
 * @Date: 2021年06月02日
 * @Description:
 */
@Data
public abstract class Person {

    private String name;

    public abstract void showName();
}
