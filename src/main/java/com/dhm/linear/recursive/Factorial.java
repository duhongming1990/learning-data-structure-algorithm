package com.dhm.linear.recursive;

/**
 * @Author duhongming
 * @Email 935720334@qq.com
 * @Date 2018/11/6 21:26
 * 阶乘:
 * n的值传入是5，那么：
 * factorial(5) = 5 * factorial(4);
 * factorial(4) = 4 * factorial(3);
 * factorial(3) = 3 * factorial(2);
 * factorial(2) = 2 * factorial(1);
 * factorial(1) = 1 * factorial(0);
 */
public class Factorial {
    public static void main(String[] args) {
        int factorial = factorial(5);
        System.out.println("factorial = " + factorial);
    }

    private static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        } else if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
