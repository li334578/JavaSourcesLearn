package com.company.leetcode.test202102;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 1266. 访问所有点的最小时间
 * @date : 2021-02-03 20:09:11
 */
public class MinTimeToVisitAllPoints {

    public int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int abs1 = Math.abs(points[i][0] - points[i + 1][0]);
            int abs2 = Math.abs(points[i][1] - points[i + 1][1]);
            result = result + Math.max(abs1, abs2);
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] points = {{1, 1}, {3, 4}, {-1, 0}};
        MinTimeToVisitAllPoints minTimeToVisitAllPoints = new MinTimeToVisitAllPoints();
        System.out.println(minTimeToVisitAllPoints.minTimeToVisitAllPoints(points));
    }
}
