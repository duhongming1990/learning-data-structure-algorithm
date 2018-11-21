package com.dhm.binary;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2018/11/21 15:56
 */
@Slf4j
public class VariableExchange {

    /**
     * 1、借助第三个变量来实现
     */
    @Test
    public void thirdVariable(){
        int A = 5;
        int B = 10;
        int C;
        C = A;
        A = B;
        B = C;
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }

    /**
     * 2、利用加减法实现两个变量的交换
     */
    @Test
    public void plusAndMinus(){
        int A = 5;
        int B = 10;
        A = A+B;
        B = A-B;
        A = A-B;
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }


    /**
     * 3、用位异或运算来实现，也是效率最高
     */
    @Test
    public void XOR(){
        int A = 5;
        int B = 10;
        A = A^B;
        B = A^B;
        A = A^B;
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }


}