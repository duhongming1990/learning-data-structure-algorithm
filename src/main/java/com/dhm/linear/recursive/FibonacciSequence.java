package com.dhm.linear.recursive;

/**
 * @Author duhongming
 * @Email 935720334@qq.com
 * @Date 2018/11/6 21:04
 * 斐波那契数列:
 *          0，当n=0
 * F(n) =   1，当n=1
 *          F(n-1)+F(n-2)，当n>1
 */
public class FibonacciSequence {
    public static void main(String[] args) {
        int fib = fib(12);
        System.out.println("fib = " + fib);
    }

    private static int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        } else if (n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
