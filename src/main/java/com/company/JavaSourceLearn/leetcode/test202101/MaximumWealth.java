package main.java.com.company.JavaSourceLearn.leetcode.test202101;

import java.util.Arrays;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 1672. 最富有客户的资产总量
 * @date : 2021-01-29 20:17:23
 */
public class MaximumWealth {
    /**
     * 给你一个 m x n 的整数网格 accounts ，其中 accounts[i][j] 是第 i 位客户在第 j 家银行托管的资产数量。返回最富有客户所拥有的 资产总量 。
     * <p>
     * 客户的 资产总量 就是他们在各家银行托管的资产数量之和。最富有客户就是 资产总量 最大的客户。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/richest-customer-wealth
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param accounts
     * @return
     */
    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts).map(item -> Arrays.stream(item).sum()).max(Integer::compareTo).orElse(0);
    }

    public static void main(String[] args) {
        MaximumWealth maximumWealth = new MaximumWealth();
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println(maximumWealth.maximumWealth(accounts));
    }
}
