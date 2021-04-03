package com.company.JavaSourceLearn.leetcode.test202101;

import java.util.Arrays;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 1476. 子矩形查询
 * @date : 2021-01-29 21:06:08
 */
public class SubrectangleQueries {
    private int[][] rectangle;

    public int[][] getRectangle() {
        return rectangle;
    }

    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                rectangle[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return rectangle[row][col];
    }

    public static void main(String[] args) {
        int[][] ints = {{1, 2, 1}, {4, 3, 4}, {3, 2, 1}, {1, 1, 1}};
        SubrectangleQueries subrectangleQueries = new SubrectangleQueries(ints);
        subrectangleQueries.updateSubrectangle(0, 0, 3, 2, 5);
        System.out.println(Arrays.deepToString(subrectangleQueries.getRectangle()));
    }
}
