package com.dhm;

import com.alibaba.fastjson.JSON;

/**
 * @Author duhongming
 * @Email 935720334@qq.com
 * @Date 2018/12/17 20:24
 */
public class BaseSortAlgorithm {

    /**
     * 冒泡排序
     * @param data
     * @return
     */
    public static int[] bubbleSort(int[] data) {
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = data.length - 1; j > i; j--) {
                if (data[j - 1] > data[j]) {
                    data[j - 1] = data[j - 1] ^ data[j];
                    data[j] = data[j - 1] ^ data[j];
                    data[j - 1] = data[j - 1] ^ data[j];
                }
            }
        }
        long end1 = System.currentTimeMillis();
        System.out.println("bubbleSort cost = " + (end1 - start1));
        return data;
    }

    /**
     * 直接选择排序
     * @param data
     * @return
     */
    public static int[] straightSelectSort(int[] data) {
        long start2 = System.currentTimeMillis();
        int k;
        for (int i = 0; i < data.length - 1; i++) {
            k = i;
            for (int j = i; j < data.length; j++) {
                if (data[k] > data[j]) {
                    k = j;
                }
            }
            if (k != i) {
                data[i] = data[i] ^ data[k];
                data[k] = data[i] ^ data[k];
                data[i] = data[i] ^ data[k];
            }
        }
        long end2 = System.currentTimeMillis();
        System.out.println("straightSelectSort cost = " + (end2 - start2));
        return data;
    }

    /**
     * 插入排序
     * @param data
     * @return
     */
    public static int[] insertSelect(int[] data) {
        long start3 = System.currentTimeMillis();
        int temp=0;
        for (int i = 0; i < data.length; i++) {
            temp = data[i];
            int j = i+1;
            while (j > 0 && data[j] > temp) {
                data[j] = data[j - 1];
                j--;
            }
            data[j] = temp;
        }
        long end3 = System.currentTimeMillis();
        System.out.println("insertSelect cost = " + (end3 - start3));
        return data;
    }

    public static void main(String[] args) {
        //输入数据
//        int[] data = new int[]{12,22,43,2,54,67,8,11,3,4,76,87,5};
//        int[] data = new int[]{34,23,2,1,-4};
        int[] data = new int[]{2,4,1,0};
//        int[] data = new int[100000];
//        for (int i = 0; i < 100000; i++) {
//            data[i] = 100000 - i;
//        }


//        int[] bubbleSort = BaseSortAlgorithm.bubbleSort(data);
//        int[] straightSelectSort = BaseSortAlgorithm.straightSelectSort(data);
        int[] insertSelect = BaseSortAlgorithm.insertSelect(data);
        System.out.println("JSON.toJSONString(sortData) = " + JSON.toJSONString(insertSelect));
    }
}
