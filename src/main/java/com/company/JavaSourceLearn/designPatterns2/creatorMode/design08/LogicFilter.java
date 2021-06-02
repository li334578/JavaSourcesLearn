package com.company.JavaSourceLearn.designPatterns2.creatorMode.design08;

import java.util.List;
import java.util.Map;

/**
 * @Author: liwenbo
 * @Date: 2021年05月27日
 * @Description: 节点逻辑过滤接口
 */
public interface LogicFilter {
    /**
     * 逻辑决策器器
     *
     * @param matterValue          决策值
     * @param treeNodeLineInfoList 决策节点
     * @return 下⼀一个节点Id
     */
    Long filter(String matterValue, List<TreeNodeLink>
            treeNodeLineInfoList);

    /**
     * 获取决策值
     *
     * @param decisionMatter 决策物料料
     * @return 决策值
     */
    String matterValue(Long treeId, String userId, Map<String, String>
            decisionMatter);

}
