package com.dhm.vm.jconsole;

import java.util.ArrayList;
import java.util.List;

/**
 * Java堆溢出
 *
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/1/2 9:47
 *
 * 限制Java堆的大小为10M,出现OOM时Dump出当前内存堆转储快照
 * -Xms10m -Xmx10m -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapMonitor {
    static class OOMObject{
        public byte[] placeholder = new byte[64*1024];
    }

    public static void main(String[] args) throws InterruptedException {
        fillHeap(10000);
    }

    public static void fillHeap(int num) throws InterruptedException {
        List<OOMObject> oomObjects = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Thread.sleep(50);
            oomObjects.add(new OOMObject());
        }
        System.gc();
    }
}