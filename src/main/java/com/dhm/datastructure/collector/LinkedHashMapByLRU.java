package com.dhm.datastructure.collector;

import java.util.LinkedHashMap;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/3/5 14:58
 */
public class LinkedHashMapByLRU {
    public static void main(String[] args) {
        /**
         * LinkedHashMap 的排序方式有两种：
         * •根据写入顺序排序。
         * •根据访问顺序排序。
         *
         * 其中根据访问顺序排序时，每次 get 都会将访问的值移动到链表末尾，这样重复操作就能得到一个按照访问顺序排序的链表。
         */
        LinkedHashMap<String,String> linkedHashMap =
                new LinkedHashMap<>(16,0.75f,true);
    }
}