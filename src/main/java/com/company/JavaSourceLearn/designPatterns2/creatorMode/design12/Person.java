package com.company.JavaSourceLearn.designPatterns2.creatorMode.design12;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: liwenbo
 * @Date: 2021年06月01日
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements BuyCar {
    private String name;

    @Override
    public void byMyCar() {
        System.out.println(name + "买车");
    }
}
