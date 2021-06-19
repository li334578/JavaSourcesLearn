package com.company.JavaSourceLearn.designPatterns2.creatorMode.design12;

/**
 * @Author: liwenbo
 * @Date: 2021年06月01日
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        AgentClass agentClass = new AgentClass();
        Person person1 = new Person("李磊");
        Person person2 = new Person("韩梅梅");
        agentClass.setPerson(person1);
        agentClass.byMyCar();
        agentClass.setPerson(person2);
        agentClass.byMyCar();
    }
}
