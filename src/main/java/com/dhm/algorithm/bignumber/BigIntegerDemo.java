package com.dhm.algorithm.bignumber;

import java.math.BigInteger;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/1/18 13:41
 *
 * 可以让超过Integer范围内的数据进行运算
 */
public class BigIntegerDemo {
    public static void main(String[] args) {

        BigInteger bigInteger1 = new BigInteger("-"+Integer.MAX_VALUE+"0");
        BigInteger bigInteger2 = new BigInteger("3");

        BigInteger add = bigInteger1.add(bigInteger2);
        BigInteger substrct = bigInteger1.subtract(bigInteger2);
        BigInteger multiply = bigInteger1.multiply(bigInteger2);
        BigInteger divide = bigInteger1.divide(bigInteger2);

        int remainder = bigInteger1.remainder(bigInteger2).intValue();
        BigInteger[] divideAndRemainder = bigInteger1.divideAndRemainder(bigInteger2);
        int mod = bigInteger1.mod(bigInteger2).signum();

    }
}