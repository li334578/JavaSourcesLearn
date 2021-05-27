package com.company.JavaSourceLearn.designPatterns2.creatorMode.design04;

import com.company.JavaSourceLearn.designPatterns2.creatorMode.design04.util.Topic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/**
 * @Author: liwenbo
 * @Date: 2021年05月23日
 * @Description:
 */
public class QuestionBank implements Cloneable {
    private String candidate; // 考生
    private String number; // 考号
    private ArrayList<ChoiceQuestion> choiceQuestions = new ArrayList<>();
    private ArrayList<AnswerQuestion> answerQuestions = new ArrayList<>();

    public QuestionBank append(ChoiceQuestion choiceQuestion) {
        choiceQuestions.add(choiceQuestion);
        return this;
    }

    public QuestionBank append(AnswerQuestion answerQuestion) {
        answerQuestions.add(answerQuestion);
        return this;
    }

    public String getCandidate() {
        return candidate;
    }

    public void setCandidate(String candidate) {
        this.candidate = candidate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ArrayList<ChoiceQuestion> getChoiceQuestions() {
        return choiceQuestions;
    }

    public void setChoiceQuestions(ArrayList<ChoiceQuestion> choiceQuestions) {
        this.choiceQuestions = choiceQuestions;
    }

    public ArrayList<AnswerQuestion> getAnswerQuestions() {
        return answerQuestions;
    }

    public void setAnswerQuestions(ArrayList<AnswerQuestion> answerQuestions) {
        this.answerQuestions = answerQuestions;
    }

    @Override
    public QuestionBank clone() throws CloneNotSupportedException {
        QuestionBank questionBank = (QuestionBank) super.clone();
        questionBank.choiceQuestions = (ArrayList<ChoiceQuestion>)
                choiceQuestions.clone();
        questionBank.answerQuestions = (ArrayList<AnswerQuestion>)
                answerQuestions.clone();
        // 题目乱序
        Collections.shuffle(questionBank.choiceQuestions);
        Collections.shuffle(questionBank.answerQuestions);
        // 答案乱序
        for (ChoiceQuestion choiceQuestion : questionBank.choiceQuestions) {
            Topic random = Topic.random(choiceQuestion.getOptions(), choiceQuestion.getKey());
            choiceQuestion.setOptions(random.getOptions());
            choiceQuestion.setKey(random.getKey());
        }
        return questionBank;
    }

    @Override
    public String toString() {
        StringBuilder detail = new StringBuilder("考⽣生：" + candidate +
                "\r\n" +
                "考号：" + number + "\r\n" +
                "--------------------------------------------\r\n" +
                "⼀一、选择题" + "\r\n\n");
        for (int idx = 0; idx < choiceQuestions.size(); idx++) {
            detail.append("第").append(idx +
                    1).append("题：").append(choiceQuestions.get(idx).getName()).append("\r\n");
            Map<String, String> option =
                    choiceQuestions.get(idx).getOptions();
            for (String key : option.keySet()) {
                detail.append(key).append("：").append(option.get(key)).append("\r\n");
                ;
            }
            detail.append("答案：").append(choiceQuestions.get(idx).getKey()).append("\r\n\n");
        }
        detail.append("⼆二、问答题" + "\r\n\n");
        for (int idx = 0; idx < answerQuestions.size(); idx++) {
            detail.append("第").append(idx +
                    1).append("题：").append(answerQuestions.get(idx).getName()).append("\r\n");
            detail.append("答案：").append(answerQuestions.get(idx).getKey()).append("\r\n\n");
        }
        return detail.toString();
    }
}
