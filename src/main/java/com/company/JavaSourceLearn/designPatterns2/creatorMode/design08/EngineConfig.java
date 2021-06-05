package com.company.JavaSourceLearn.designPatterns2.creatorMode.design08;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: liwenbo
 * @Date: 2021年05月27日
 * @Description:
 */
public class EngineConfig {
    static Map<String, LogicFilter> logicFilterMap;
    static {
        logicFilterMap = new ConcurrentHashMap<>();
        logicFilterMap.put("userAge", new UserAgeFilter());
        logicFilterMap.put("userGender", new UserGenderFilter());
    }
    public Map<String, LogicFilter> getLogicFilterMap() {
        return logicFilterMap;
    }
    public void setLogicFilterMap(Map<String, LogicFilter> logicFilterMap)
    {
        this.logicFilterMap = logicFilterMap;
    }
}
