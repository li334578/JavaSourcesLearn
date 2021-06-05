package com.company.JavaSourceLearn.designPatterns2.creatorMode.design08;

import java.util.Map;

/**
 * @Author: liwenbo
 * @Date: 2021年05月27日
 * @Description:
 */
public class TreeEngineHandle extends EngineBase {
    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        // 决策流程
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId,
                decisionMatter);
        // 决策结果
        return new EngineResult(userId, treeId, treeNode.getTreeNodeId(),
                treeNode.getNodeValue());
    }
}
