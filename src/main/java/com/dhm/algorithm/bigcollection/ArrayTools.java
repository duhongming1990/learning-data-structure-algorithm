package com.dhm.algorithm.bigcollection;

import java.util.*;

/**
 * @author vitem
 * @date 2017-07-15
 */
public class ArrayTools {

    /**
     * 返回a-b的新List.
     */
    public static <T> List<T> minus(final Collection<T> a, final Collection<T> b) {
        //将被减数用链表储存，防止因为频繁扩容影响性能
        List<T> subtractedNumbers = new LinkedList<>();
        //将减数用Map储存，用于快速查询，查看复杂度为O(1)
        Set<T> minusNumbers = new HashSet<>(b);
        //整体复杂度为O(n)
        for (T t : a) {
            if (!minusNumbers.contains(t)) {
                subtractedNumbers.add(t);
            }
        }
        return subtractedNumbers;
    }

    public static void main(String[] args) {

        for (int j = 1; j <= 10; j++) {
            List<Long> a = new ArrayList<>();
            for (long i = 0; i < j * 100000; i++) {
                a.add(i);
            }

            List<Long> b = new ArrayList<>();
            for (long i = 0; i < j * 100000; i++) {
                b.add(i + 2);
            }

            long startTime = System.currentTimeMillis();
            List<Long> minusResult = minus(a, b);
            System.out.println("minus result = " + minusResult);
            long endTime = System.currentTimeMillis();

            System.out.println("records:" + j * 1000000 + ",cost time: " + (endTime - startTime) + "ms");
        }
    }
}
