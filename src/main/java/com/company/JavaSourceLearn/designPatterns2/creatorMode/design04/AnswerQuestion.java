package com.company.JavaSourceLearn.designPatterns2.creatorMode.design04;

/**
 * @Author: liwenbo
 * @Date: 2021年05月23日
 * @Description:
 */
public class AnswerQuestion {
    private String name; // 题目
    private String key; // 答案

    public AnswerQuestion() {
    }

    public AnswerQuestion(String name, String key) {
        this.name = name;
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
