package com.company.JavaSourceLearn.designPatterns2.creatorMode.design01;

import java.util.HashMap;

/**
 * @Author: liwenbo
 * @Date: 2021年05月21日
 * @Description:
 */
public class Test {

    public static void main(String[] args) throws Exception {
        StoreFactory.getCommodity(3)
                .sendCommodity("", "", "", new HashMap<String, String>());
    }
}
