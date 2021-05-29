package com.company.JavaSourceLearn.designPatterns2.creatorMode.design04.util;

import com.company.JavaSourceLearn.designPatterns2.creatorMode.design04.AnswerQuestion;
import com.company.JavaSourceLearn.designPatterns2.creatorMode.design04.ChoiceQuestion;
import com.company.JavaSourceLearn.designPatterns2.creatorMode.design04.QuestionBank;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: liwenbo
 * @Date: 2021年05月23日
 * @Description: 试卷创建
 */
public class PaperFactory {
    private QuestionBank questionBank = new QuestionBank();

    public PaperFactory() {
        Map<String, String> map01 = new HashMap<String, String>();
        map01.put("A", "JAVA2 EE");
        map01.put("B", "JAVA2 Card");
        map01.put("C", "JAVA2 ME");
        map01.put("D", "JAVA2 HE");
        map01.put("E", "JAVA2 SE");
        Map<String, String> map02 = new HashMap<String, String>();
        map02.put("A", "JAVA程序的main⽅方法必须写在类⾥里里⾯面");
        map02.put("B", "JAVA程序中可以有多个main⽅方法");
        map02.put("C", "JAVA程序中类名必须与⽂文件名⼀样");
        map02.put("D", "JAVA程序的main⽅方法中如果只有⼀条语句句，可以不⽤用{}(⼤大括号)括起来");
        Map<String, String> map03 = new HashMap<String, String>();
        map03.put("A", "变量量由字⺟母、下划线、数字、$符号随意组成；");
        map03.put("B", "变量量不不能以数字作为开头；");
        map03.put("C", "A和a在java中是同⼀一个变量量；");
        map03.put("D", "不同类型的变量量，可以起相同的名字；");
        Map<String, String> map04 = new HashMap<String, String>();
        map04.put("A", "STRING");
        map04.put("B", "x3x;");
        map04.put("C", "void");
        map04.put("D", "de$f");
        Map<String, String> map05 = new HashMap<String, String>();
        map05.put("A", "31");
        map05.put("B", "0");
        map05.put("C", "1");
        map05.put("D", "2");
        questionBank.append(new ChoiceQuestion("JAVA所定义的版本中不包括", map01, "D"))
                .append(new ChoiceQuestion("下列说法正确的是", map02, "A"))
                .append(new ChoiceQuestion("变量命名规范说法正确的是", map03, "B"))
                .append(new ChoiceQuestion("以下()不是合法的标识符", map04, "C"))
                .append(new ChoiceQuestion("表达式(11+3*8)/4%3的值是", map05, "D"))
                .append(new AnswerQuestion("小红⻢和小黑马生的小⻢几条腿", "4条腿"))
                .append(new AnswerQuestion("铁棒打头疼还是木棒打头疼", "头最疼"))
                .append(new AnswerQuestion("什么床不能睡觉", "牙床"))
                .append(new AnswerQuestion("为什么好马不吃回头草", "后面的草没了"));
    }

    /**
     * 创建试卷
     *
     * @param candidate 考生
     * @param number    考生号
     * @return 试卷
     */
    public String createPaper(String candidate, String number) throws CloneNotSupportedException {
        QuestionBank newQuestionBank = questionBank.clone();
        newQuestionBank.setCandidate(candidate);
        newQuestionBank.setNumber(number);
        return newQuestionBank.toString();
    }
}
