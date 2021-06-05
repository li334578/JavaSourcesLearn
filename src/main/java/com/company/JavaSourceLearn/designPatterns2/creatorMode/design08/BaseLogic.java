package com.company.JavaSourceLearn.designPatterns2.creatorMode.design08;

import java.util.List;
import java.util.Map;

/**
 * @Author: liwenbo
 * @Date: 2021年05月27日
 * @Description:
 */
public abstract class BaseLogic implements LogicFilter {
    /**
     * 逻辑决策器器
     *
     * @param matterValue          决策值
     * @param treeNodeLineInfoList 决策节点
     * @return 下⼀一个节点Id
     */
    @Override
    public Long filter(String matterValue, List<TreeNodeLink> treeNodeLineInfoList) {
        for (TreeNodeLink nodeLine : treeNodeLineInfoList) {
            if (decisionLogic(matterValue, nodeLine)) return
                    nodeLine.getNodeIdTo();
        }
        return 0L;
    }

    /**
     * 获取决策值
     *
     * @param treeId
     * @param userId
     * @param decisionMatter 决策物料料
     * @return 决策值
     */
    @Override
    public abstract String matterValue(Long treeId, String userId, Map<String, String> decisionMatter);

    private boolean decisionLogic(String matterValue, TreeNodeLink
            nodeLink) {
        switch (nodeLink.getRuleLimitType()) {
            case 1:
                return matterValue.equals(nodeLink.getRuleLimitValue());
            case 2:
                return Double.parseDouble(matterValue) >
                        Double.parseDouble(nodeLink.getRuleLimitValue());
            case 3:
                return Double.parseDouble(matterValue) <
                        Double.parseDouble(nodeLink.getRuleLimitValue());
            case 4:
                return Double.parseDouble(matterValue) <=
                        Double.parseDouble(nodeLink.getRuleLimitValue());
            case 5:
                return Double.parseDouble(matterValue) >=
                        Double.parseDouble(nodeLink.getRuleLimitValue());
            default:
                return false;
        }
    }
}
