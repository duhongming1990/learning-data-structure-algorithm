package com.dhm.algorithm.sort;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author duhongming
 * @Email 935720334@qq.com
 * @Date 2019/1/1 14:23
 */
@Slf4j
public class BubbleSort {

    public static void main(String[] args) {
        int[] data1 = {5, 2, 6, 0, 3, 9, 1, 7, 4, 8};
        sortBySilk(data1);
        int[] data2 = {5, 2, 6, 0, 3, 9, 1, 7, 4, 8};
        sortByAuthentic(data2);
        int[] data3 = {5, 2, 6, 0, 3, 9, 1, 7, 4, 8};
        sortByOptimization(data3);
    }

    /**
     * 屌丝版
     * 依次让0，1，2，3.....第i个数与i+1,i+2,i+3...直到length-1个数进行比较。
     *
     * @param data
     */
    public static void sortBySilk(int[] data) {
        System.out.println("排序前 = " + JSON.toJSONString(data));
        int count1 = 0, count2 = 0;
        //注意：data.length - 1
        for (int i = 0; i < data.length - 1; i++) {
            //注意：i+1
            for (int j = i + 1; j < data.length; j++) {
                count1++;
                if (data[i] > data[j]) {
                    count2++;
                    //用位异或运算来实现，也是效率最高
                    data[i] = data[i] ^ data[j];
                    data[j] = data[i] ^ data[j];
                    data[i] = data[i] ^ data[j];
                }
            }
        }
        log.debug("总共进行了{}次比较，进行了{}次移动！", count1, count2);
        System.out.println("排序后 = " + JSON.toJSONString(data));
    }

    /**
     * 正宗版
     * 依次从最下面进行，两两相邻比较。
     *
     * @param data
     */
    public static void sortByAuthentic(int[] data) {
        System.out.println("排序前 = " + JSON.toJSONString(data));
        int count1 = 0, count2 = 0;
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = data.length - 1; j > i; j--) {
                count1++;
                if (data[j - 1] > data[j]) {
                    count2++;
                    //用位异或运算来实现，也是效率最高
                    data[j - 1] = data[j - 1] ^ data[j];
                    data[j] = data[j - 1] ^ data[j];
                    data[j - 1] = data[j - 1] ^ data[j];
                }
            }
        }
        log.debug("总共进行了{}次比较，进行了{}次移动！", count1, count2);
        System.out.println("排序后 = " + JSON.toJSONString(data));
    }

    /**
     * 优化版
     * 依次从最下面进行，两两相邻比较，并可以提早结束。
     *
     * @param data
     */
    public static void sortByOptimization(int[] data) {
        System.out.println("排序前 = " + JSON.toJSONString(data));
        int count1 = 0, count2 = 0;
        boolean isCompared = false;
        for (int i = 0; i < data.length - 1 && !isCompared; i++) {
            for (int j = data.length - 1; j > i; j--) {
                count1++;
                isCompared = true;
                if (data[j - 1] > data[j]) {
                    count2++;
                    isCompared = false;
                    //用位异或运算来实现，也是效率最高
                    data[j - 1] = data[j - 1] ^ data[j];
                    data[j] = data[j - 1] ^ data[j];
                    data[j - 1] = data[j - 1] ^ data[j];
                }
            }
        }
        log.debug("总共进行了{}次比较，进行了{}次移动！", count1, count2);
        System.out.println("排序后 = " + JSON.toJSONString(data));
    }
}
