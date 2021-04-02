package main.java.com.company.JavaSourceLearn.leetcode.test202101;

import java.util.Arrays;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 十-二进制数的最少数目
 * @date : 2021-01-29 20:52:00
 */
public class MinPartitions {

    public int minPartitions(String n) {
        return Arrays.stream(n.split("")).mapToInt(Integer::parseInt).max().orElse(0);
    }

    public int minPartitions2(String n) {
        String[] split = n.split("");
        int max = 0;
        for (String s : split) {
            if (Integer.parseInt(s) > max) {
                max = Integer.parseInt(s);
            }
        }
        return max;
    }

    public int minPartitions3(String n) {
        char max = 0;
        for (char c : n.toCharArray()) {
            if (c > max) {
                max = c;
            }
        }
        return Integer.parseInt(String.valueOf(max));
    }

    public int minPartitions4(String n) {
        int max = 0;
        for (char c : n.toCharArray()) {
            max = Math.max(c,max);
        }
        return Integer.parseInt(String.valueOf(Character.valueOf((char) max)));
    }

    public static void main(String[] args) {
        MinPartitions minPartitions = new MinPartitions();
        System.out.println(minPartitions.minPartitions("27346209830709182346"));
        System.out.println(minPartitions.minPartitions2("27346209830709182346"));
        System.out.println(minPartitions.minPartitions3("27346209830709182346"));
        System.out.println(minPartitions.minPartitions4("27346209830709182346"));
    }
}
