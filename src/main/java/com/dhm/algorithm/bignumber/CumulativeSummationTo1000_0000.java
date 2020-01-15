package com.dhm.algorithm.bignumber;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author duhongming
 * @version 1.0
 * @description 1+2+3......+1000_0000=？
 * @date 2019-08-11 10:29
 */
@Slf4j
public class CumulativeSummationTo1000_0000 {
    private static final int SUM_NUMBER = 1000_0000;
    @Test
    public void test1() {
        long startTime = System.nanoTime();
        long result = 0;
        for (int i = 1; i <= SUM_NUMBER; i++) {
            result += i;
        }
        long endTime = System.nanoTime();
        log.info("cost time:{}ns,result:{}", endTime - startTime, result);
    }
    @Test
    public void test2() {
        long startTime = System.nanoTime();
        long result = (1L + SUM_NUMBER) * SUM_NUMBER / 2;
        long endTime = System.nanoTime();
        log.info("cost time:{}ns,result:{}", endTime - startTime, result);
    }
}
