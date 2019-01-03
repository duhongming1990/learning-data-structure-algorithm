package com.dhm.vm.gc;

/**
 *
 * 空间分配担保
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/1/3 15:34
 *
 * -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:-HandlePromotionFailure
 */
public class TestHandlePromotion {

    public static final int _1M = 1 * 1024 * 1024;

    public static void main(String[] args) {
        byte[] allocation1, allocation2, allocation3, allocation4, allocation5, allocation6, allocation7;
        allocation1 = new byte[2 * _1M];
        allocation2 = new byte[2 * _1M];
        allocation3 = new byte[2 * _1M];
        allocation1 = null;
        allocation4 = new byte[2 * _1M];
        allocation5 = new byte[2 * _1M];
        allocation6 = new byte[2 * _1M];
        allocation4 = null;
        allocation5 = null;
        allocation6 = null;
        allocation7 = new byte[2 * _1M];
    }
}