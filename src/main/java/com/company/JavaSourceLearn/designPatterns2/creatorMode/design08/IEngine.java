package com.company.JavaSourceLearn.designPatterns2.creatorMode.design08;

import java.util.Map;

/**
 * @Author: liwenbo
 * @Date: 2021年05月27日
 * @Description: 决策引擎接⼝
 */
public interface IEngine {
    EngineResult process(final Long treeId, final String userId, TreeRich
            treeRich, final Map<String, String> decisionMatter);
}
