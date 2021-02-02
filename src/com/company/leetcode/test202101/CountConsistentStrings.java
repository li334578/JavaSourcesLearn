package com.company.leetcode.test202101;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 1684. 统计一致字符串的数目
 * @date : 2021-01-30 13:43:02
 */
public class CountConsistentStrings {

    public int countConsistentStrings(String allowed, String[] words) {
        String[] split = allowed.split("");
        int count = 0;
        for (String word : words) {
            for (String s : split) {
                word = word.replaceAll(s, "");
            }
            if (word.isEmpty()) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountConsistentStrings consistentStrings = new CountConsistentStrings();
        String[] strings = {"ad", "bd", "aaab", "baa", "badab"};
        System.out.println(consistentStrings.countConsistentStrings("ab", strings));
    }
}
