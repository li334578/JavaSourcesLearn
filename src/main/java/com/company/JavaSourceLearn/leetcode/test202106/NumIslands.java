package com.company.JavaSourceLearn.leetcode.test202106;

import java.util.*;

/**
 * @Author: liwenbo
 * @Date: 2021年06月09日
 * @Description: 200. 岛屿数量
 */
public class NumIslands {

    public static void main(String[] args) {
        NumIslands nu = new NumIslands();
        char[][] grid = {
                {'1','1','1'},
                {'0','1','0'},
                {'1','1','1'}
        };
        System.out.println(nu.numIslands(grid));
    }

    public int numIslands(char[][] grid) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] == '1') {
                if (grid[Math.max(i - 1, 0)][0] == '1') {
                    map.put(i + "," + 0, Math.max(i - 1, 0) + "," + 0);
                } else {
                    map.put(i + "," + 0, i + "," + 0);
                }
            }
        }
        for (int i = 0; i < grid[0].length; i++) {
            if (grid[0][i] == '1') {
                if (grid[0][Math.max(i - 1, 0)] == '1') {
                    map.put(0 + "," + i, 0 + "," + Math.max(i - 1, 0));
                } else {
                    map.put(0 + "," + i, 0 + "," + i);
                }
            }
        }
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    if (grid[i - 1][j] == '1') {
                        map.put(i + "," + j, (i - 1) + "," + j);
                        continue;
                    }
                    if (grid[i][j - 1] == '1') {
                        map.put(i + "," + j, i + "," + (j - 1));
                        continue;
                    }
                    map.put(i + "," + j, i + "," + j);
                }
            }
        }
        // findRoot
        Set<String> counter = new HashSet<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    counter.add(findRoot(map, i + "," + j));
                }
            }
        }
        return counter.size();
    }

    public String findRoot(Map<String, String> map, String node) {
        return Objects.equals(map.get(node), node) ? node : findRoot(map, map.get(node));
    }
}
