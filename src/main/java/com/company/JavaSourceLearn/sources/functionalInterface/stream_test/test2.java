package com.company.JavaSourceLearn.sources.functionalInterface.stream_test;

import java.util.Scanner;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-10-16 17:44:50
 */
public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = 0;
        if (x >= 0 && x < 10) {
            y = x;
        } else if (x >= 10 && x < 20) {
            y = x * 2 + 1;
        } else if (x >= 20 && x < 30) {
            y = x * 3 + x + 1;
        }
        System.out.println(y);
    }
}
