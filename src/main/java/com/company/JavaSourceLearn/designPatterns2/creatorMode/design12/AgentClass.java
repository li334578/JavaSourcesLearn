package com.company.JavaSourceLearn.designPatterns2.creatorMode.design12;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: liwenbo
 * @Date: 2021年06月01日
 * @Description: agent
 */
@Data
@NoArgsConstructor
public class AgentClass implements BuyCar {

    private Person person;

    public AgentClass(Person person) {
        this.person = person;
    }

    @Override
    public void byMyCar() {
        System.out.println("买保险");
        person.byMyCar();
        System.out.println("上车牌");
    }
}
