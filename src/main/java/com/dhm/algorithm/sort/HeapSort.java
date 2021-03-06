package com.dhm.algorithm.sort;

import com.dhm.datastructure.tree.BinaryHeap;

import java.util.Arrays;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/1/24 11:26
 *
 * 堆排序
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 6, 5, 7, 8, 9, 10, 0};
        heapSort(array);
        System.out.println("Arra = " + Arrays.toString(array));
    }
    public static void heapSort(int[] arrays){

        for (int i = arrays.length/2-1; i >=0 ; i--) {
            BinaryHeap.downAdjustByMaxHeap(arrays,i,arrays.length);
        }

        for (int i = arrays.length-1; i >0; i--) {
            int temp = arrays[0];
            arrays[0] = arrays[i];
            arrays[i] = temp;
            BinaryHeap.downAdjustByMaxHeap(arrays,0,i);
        }

    }
}