package com.company.leetcode.test202102;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 1528. 重新排列字符串
 * @date : 2021-02-02 20:39:03
 */
public class RestoreString {

    public String restoreString(String s, int[] indices) {
        // 结果数组
        char[] result = new char[indices.length];
        for (int j = 0; j < indices.length; j++) {
            result[indices[j]] = s.charAt(j);
        }
        return new String(result);
    }

    public static void main(String[] args) {
        RestoreString restoreString = new RestoreString();
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString.restoreString("codeleet", indices));
    }
}
