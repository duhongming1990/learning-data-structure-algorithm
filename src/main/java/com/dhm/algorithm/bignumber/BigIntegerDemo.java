package com.dhm.algorithm.bignumber;

import java.math.BigInteger;

/**
 * @author duhongming
 * @version 1.0
 * @description 可以让超过Integer范围内的数据进行运算
 * @date 2019-08-17 20:55
 */
public class BigIntegerDemo {
    public static void main(String[] args) {
        //使用String类型的构造方法
        BigInteger bigInteger1 = new BigInteger("-10");
        BigInteger bigInteger2 = new BigInteger("3");

        // +
        BigInteger add = bigInteger1.add(bigInteger2);
        System.out.println("add.toString() = " + add.toString());
        // -
        BigInteger subtract = bigInteger1.subtract(bigInteger2);
        System.out.println("subtract.toString() = " + subtract.toString());
        // *
        BigInteger multiply = bigInteger1.multiply(bigInteger2);
        System.out.println("multiply.toString() = " + multiply.toString());
        // /
        BigInteger divide = bigInteger1.divide(bigInteger2);
        System.out.println("divide.toString() = " + divide.toString());

        // 取余
        String remainder = bigInteger1.remainder(bigInteger2).toString();
        System.out.println("remainder = " + remainder);
        // 取模
        String mod = bigInteger1.mod(bigInteger2).toString();
        System.out.println("mod = " + mod);
        
        BigInteger[] divideAndRemainder = bigInteger1.divideAndRemainder(bigInteger2);
        // /
        System.out.println("divideAndRemainder[0].toString() = " + divideAndRemainder[0].toString());
        // 取余
        System.out.println("divideAndRemainder[1].toString() = " + divideAndRemainder[1].toString());

        //借助大数的加减乘除BigInteger，只需设置Long.MAX_VALUE即可
        BigInteger bigLongMax = new BigInteger(String.valueOf(Long.MAX_VALUE));
        BigInteger result = bigLongMax.add(new BigInteger("1"))
                .multiply(bigLongMax)
                .divide(new BigInteger("2"));
        System.out.println("result = " + result);


    }
}