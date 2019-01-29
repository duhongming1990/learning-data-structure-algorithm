package com.dhm.vm.gc;

/**
 * 大对象直接进入老年代(已验证)
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/1/3 14:54
 *
 * 对象超过10M 时直接进入老年代
 * -verbose:gc -Xms20m -Xmx30m -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=3145728 -XX:+UseSerialGC
 */
public class TestPretenureSizeThreshold {
    public static final int _1M = 1 * 1024 * 1024;

    public static void main(String[] args) {
        byte[] allocation1;
        allocation1 = new byte[10 * _1M];//直接分配在老年代中
    }
}