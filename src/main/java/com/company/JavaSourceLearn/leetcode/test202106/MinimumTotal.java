package com.company.JavaSourceLearn.leetcode.test202106;

import java.util.List;

/**
 * @Author: liwenbo
 * @Date: 2021年06月16日
 * @Description: 120. 三角形最小路径和
 */
public class MinimumTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (List<Integer> integers : triangle) {

        }
        return 0;
    }

    public int getMinNum(List<Integer> list, Integer index) {
        Integer result;
        if (index == null) {
            // 求整个list的最小值
            result = list.stream().min(Integer::compareTo).get();
        } else {
            if (index + 1 > list.size()) {
                return list.get(index);
            }
            result = list.get(index) > list.get(index + 1) ? list.get(index + 1) : list.get(index);
        }
        return result;
    }
}
