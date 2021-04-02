package main.java.com.company.JavaSourceLearn.algorithm;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 斐波那契数列 F(0)=0，F(1)=1, F(n)=F(n - 1)+F(n - 2)
 * @date : 2021-02-23 21:39:56
 */
public class Fibonacci {

    public int recursionFibonacci(int n) {

        if (n <= 2) {
            if (n == 0) {
                return 0;
            } else if (n < 0) {
                throw new RuntimeException("Cannot be less than 0");
            } else {
                return 1;
            }
        } else {
            return recursionFibonacci(n - 1) + recursionFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Fibonacci fun = new Fibonacci();
        for (int i = 0; i < 10; i++) {
            System.out.println(fun.recursionFibonacci(i));
        }
    }
}
