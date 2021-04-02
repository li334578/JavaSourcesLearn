package main.java.com.company.JavaSourceLearn.leetcode.test202102;


/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 1662. 检查两个字符串数组是否相等
 * @date : 2021-02-03 20:34:24
 */
public class ArrayStringsAreEqual {

    public boolean arrayStringsAreEqual1(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }

    public static void main(String[] args) {
        String[] strings = {"hello", "world"};
        System.out.println(String.join("", strings));
    }
}
