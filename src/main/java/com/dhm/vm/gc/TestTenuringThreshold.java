package com.dhm.vm.gc;

/**
 * 长期存活对象进入老年代
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/1/3 15:14
 *
 * -verbose:gc -Xms20m -Xmx20m -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=1 -XX:+PrintTenuringDistribution
 */
public class TestTenuringThreshold {
    public static final int _1M = 1 * 1024 * 1024;

    public static void main(String[] args) {

        byte[] allocation1, allocation2, allocation3;

        allocation1 = new byte[_1M / 4];  //262144 什么时候进入老年代决定于XX:MaxTenuringThreshold设置
        allocation2 = new byte[4 * _1M]; //4194304
        allocation3 = new byte[4 * _1M];
        allocation3 = null;
        allocation3 = new byte[4 * _1M];
    }
}