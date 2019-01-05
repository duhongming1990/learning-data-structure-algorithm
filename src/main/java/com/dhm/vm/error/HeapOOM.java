package com.dhm.vm.error;

import java.util.ArrayList;
import java.util.List;

/**
 * Java堆溢出(已验证)
 *
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/1/2 9:47
 *
 * 限制Java堆的大小为10M,出现OOM时Dump出当前内存堆转储快照
 * -Xms10m -Xmx10m -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {
    static class OOMObject{}

    public static void main(String[] args) {
        List<OOMObject> oomObjects = new ArrayList<>();
        while (true){
            oomObjects.add(new OOMObject());
        }
    }
}