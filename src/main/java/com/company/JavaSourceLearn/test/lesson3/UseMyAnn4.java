package com.company.JavaSourceLearn.test.lesson3;

import com.company.JavaSourceLearn.springLearn.module.lesson3.Ann4;

import java.util.Map;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-06 21:05:43
 */
@Ann4("用在了类上")
public class UseMyAnn4<@Ann4("用在了类变量类型V1上") V1, @Ann4("用在了类变量类型V2上") V2> {

    private Map<@Ann4("用在了泛型类型上") String, Integer> map;

    public <@Ann4("用在了参数上") T> String m1(String name) {
        return null;
    }

}
