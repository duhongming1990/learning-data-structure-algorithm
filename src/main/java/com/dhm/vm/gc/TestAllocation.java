package com.dhm.vm.gc;

/**
 * 对象优先在Eden分配(已验证)
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/1/3 14:06
 *
 * 限制java堆大小为20M，年轻代为10M，Eden为8M，两个survivor分别为1M
 * -verbose:gc -Xms20m -Xmx20m -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC
 */
public class TestAllocation {

    public static final int _1M = 1 * 1024 * 1024;

    public static void main(String[] args) {
        byte[] allocation1, allocation2, allocation3,allocation4;
        allocation1 = new byte[2 * _1M];
        allocation2 = new byte[2 * _1M];
        allocation3 = new byte[2 * _1M];
        allocation4 = new byte[4 * _1M];//出现一次Minor GC
    }
}