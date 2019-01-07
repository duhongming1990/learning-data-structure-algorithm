package com.dhm.vm.btrace;

import java.util.Random;

/**
 * @Author duhongming
 * @Email 935720334@qq.com
 * @Date 2019/1/6 13:47
 */
public class Calculator {
    private int c = 1;

    public int add(int a, int b) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a + b;
    }

    /**
     * BTraceDemo调用Calculator的add方法对两个随机数进行相加，代码如下。
     * @param args
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Random random = new Random();
        while (true) {
            System.out.println(calculator.add(random.nextInt(10), random.nextInt(10)));
        }
    }
}

