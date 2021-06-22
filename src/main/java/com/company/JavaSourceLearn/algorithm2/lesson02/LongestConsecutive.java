package com.company.JavaSourceLearn.algorithm2.lesson02;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : leetCode@128
 * @date : 2021-06-06 17:21:38
 */
public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        UnionFind unionFind = new UnionFind(nums);
        for (int v : nums) {
            unionFind.merge(v, v - 1);
        }
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num - unionFind.find(num));
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 2, 4};
        LongestConsecutive l = new LongestConsecutive();
        System.out.println(l.longestConsecutive(nums));
    }

    class UnionFind {
        private Map<Integer, Integer> maps;

        public UnionFind(int[] nums) {
            maps = new HashMap<>();
            for (int num : nums) {
                maps.put(num, num);
            }
        }

        public Integer find(Integer x) {
            Integer integer;
            if (maps.get(x) == null) {
                maps.put(x, x);
                return x;
            }

            if (x.equals(maps.get(x))) {
                integer = x;
            } else {
                integer = find(maps.get(x));
                // 路径压缩
                maps.put(x, integer);
            }
            return integer;
        }

        public void merge(int x, int y) {
            maps.put(x, find(y));
        }
    }
}
