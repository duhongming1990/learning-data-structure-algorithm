package com.dhm.algorithm.bignumber;

/**
 * @author duhongming
 * @version 1.0
 * @description 1+2+3......+1000=？
 * @date 2019-08-11 10:29
 */
public class CumulativeSummationTo1000 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <= 1000; i++) {
            result += i;
        }
        System.out.println("result = " + result);
    }
}
