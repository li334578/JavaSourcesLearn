package main.java.com.company.JavaSourceLearn.leetcode.test202102;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 1614. 括号的最大嵌套深度
 * @date : 2021-02-01 20:45:29
 */
public class MaxDepth {

    public int maxDepth(String s) {
        if (!s.contains("(")) {
            return 0;
        }
        String[] split = s.split("");
        int result = 0;
        int temp = 0;
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("(")) {
                temp++;
            } else if (split[i].equals(")")) {
                temp--;
            }
            result = Math.max(result,temp);
        }
        return result;
    }

    public int maxDepth2(String s) {
        int result = 0;
        int temp = 0;
        for (char c : s.toCharArray()) {
            if (c=='('){
                temp++;
            }
            if (c==')'){
                temp--;
            }
            result = Math.max(result,temp);
        }
        return result;
    }

    public static void main(String[] args) {
        MaxDepth maxDepth = new MaxDepth();
        System.out.println(maxDepth.maxDepth("(1+(2*3)+((8)/4))+1"));
        System.out.println(maxDepth.maxDepth("()(()())"));
    }
}
