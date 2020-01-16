package com.dhm.algorithm.bignumber;

import java.text.DecimalFormat;

/**
 * @author duhongming
 * @version 1.0
 * @description TODO
 * @date 2019-08-19 21:30
 */
public class DecimalFormatDemo {

    private static final DecimalFormat DECIMAL_FORMAT_ERROR = new DecimalFormat(",###.00");
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat(",##0.00");

    public static void main(String[] args) {
        String resultError = DECIMAL_FORMAT_ERROR.format(0.25);
        System.out.println("resultError = " + resultError);

        String result = DECIMAL_FORMAT.format(0.25);
        System.out.println("result = " + result);

        resultError = DECIMAL_FORMAT_ERROR.format(100.25);
        System.out.println("resultError = " + resultError);

        result = DECIMAL_FORMAT.format(100.25);
        System.out.println("result = " + result);

        resultError = DECIMAL_FORMAT_ERROR.format(10000.25);
        System.out.println("resultError = " + resultError);

        result = DECIMAL_FORMAT.format(10000.25);
        System.out.println("result = " + result);

    }
}
