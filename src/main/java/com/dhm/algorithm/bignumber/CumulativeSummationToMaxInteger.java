package com.dhm.algorithm.bignumber;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author duhongming
 * @version 1.0
 * @description 1+2+3......+(2^31-1)=？
 * @date 2019-08-11 10:29
 */
@Slf4j
public class CumulativeSummationToMaxInteger {
    private static final int SUM_NUMBER = Integer.MAX_VALUE;
    @Test
    public void test2() {
        long result = (1L + SUM_NUMBER) * SUM_NUMBER / 2;
        log.info("result:{}", result);
    }
}
