package com.dhm.vm.gc;

/**
 * 对象动态年龄判断
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/1/3 15:28
 *
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=15  -XX:+PrintTenuringDistribution
 */
public class TestTenuringThreshold2 {
    public static final int _1M = 1 * 1024 * 1024;

    public static void main(String[] args) {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[_1M / 4];   // allocation1+allocation2大于survivo空间一半
        allocation2 = new byte[_1M / 4];
        allocation3 = new byte[4 * _1M];
        allocation4 = new byte[4 * _1M];
        allocation4 = null;
        allocation4 = new byte[4 * _1M];
    }
}