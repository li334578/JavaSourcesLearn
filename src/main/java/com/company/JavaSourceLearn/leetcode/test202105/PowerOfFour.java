package com.company.JavaSourceLearn.leetcode.test202105;

import lombok.Data;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-05-31 20:17:05
 */
public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        if (n == 1) return true;
        if (n < 4) return false;
        n = n % 4;
        if (n == 0) return true;

        return isPowerOfFour(n);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1.val < l2.val) {

        }

        return null;
    }

    public static void main(String[] args) {
        PowerOfFour powerOfFour = new PowerOfFour();
        boolean powerOfFour1 = powerOfFour.isPowerOfFour(8);
        System.out.println(powerOfFour1);

        String string = "1.1.1.1";
//        String all = string.replaceAll("\\.", "[.]");
//        System.out.println(all);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            stringBuilder.append(string.charAt(i) == '.' ? "[.]" : string.charAt(i));
        }
        System.out.println(stringBuilder.toString());
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
