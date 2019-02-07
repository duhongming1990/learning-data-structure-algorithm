package com.dhm.datastructure.tree;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/1/23 17:25
 */
public class BinaryHeap {

    public static void main(String[] args) {

        int[] array = new int[]{1, 3, 2, 6, 5, 7, 8, 9, 10, 0};
        upAdjustByMinHeap(array,array.length);
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));

        array = new int[]{7, 1, 3, 10, 5, 2, 8, 9, 6};
        buildHeap(array);
        System.out.println("JSON.toJSONString(array) = " + JSON.toJSONString(array));
    }

    /**
     * 构建堆
     *
     * @param array 待调整的堆
     */
    private static void buildHeap(int[] array) {
        //从最后一个非叶子节点(array.length / 2 - 1)开始，依次下沉调整
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            downAdjustByMinHeap(array, i,array.length);
        }
    }

    /**
     * 上浮调整
     *
     * @param array 待调整的最小堆
     */
    public static void upAdjustByMinHeap(int[] array,int length) {

        int childIndex = length - 1;
        int parentIndex = (childIndex - 1) / 2;

        // temp保存父节点值，用于最后的赋值
        int temp = array[childIndex];

        while (parentIndex > 0 && temp < array[parentIndex]) {
            //把子节点的值赋值给父节点
            array[childIndex] = array[parentIndex];
            childIndex = parentIndex;
            parentIndex = (parentIndex - 1) / 2;
        }
        //把父节点的值赋值给子节点
        array[childIndex] = temp;
    }

    /**
     * 上浮调整
     *
     * @param array 待调整的最大堆
     */
    public static void upAdjustByMaxHeap(int[] array,int length) {

        int childIndex = length - 1;
        int parentIndex = (childIndex - 1) / 2;

        // temp保存父节点值，用于最后的赋值
        int temp = array[childIndex];

        while (childIndex > 0 && temp >= array[parentIndex]) {
            //把子节点的值赋值给父节点
            array[childIndex] = array[parentIndex];
            childIndex = parentIndex;
            parentIndex = (parentIndex - 1) / 2;
        }
        //把父节点的值赋值给子节点
        array[childIndex] = temp;
    }

    /**
     * 下沉调整
     *
     * @param array       待调整的最小堆
     * @param parentIndex 要下沉的父节点
     * @param length      堆的有效大小
     */
    public static void downAdjustByMinHeap(int[] array, int parentIndex, int length) {

        // temp保存父节点值，用于最后的赋值
        int temp = array[parentIndex];

        for (int childIndex = 2 * parentIndex + 1; childIndex < length; childIndex = 2 * childIndex + 1) {

            // 如果有右孩子，且右孩子小于左孩子的值，则定位到右孩子
            if (childIndex + 1 < length && array[childIndex] > array[childIndex + 1]) {
                childIndex++;
            }

            // 如果父节点小于任何一个孩子的值，直接跳出
            if (temp < array[childIndex]) {
                break;
            }

            //把子节点的值赋值给父节点
            array[parentIndex] = array[childIndex];
            parentIndex = childIndex;
        }

        //把父节点的值赋值给子节点
        array[parentIndex] = temp;
    }

    /**
     * 下沉调整
     *
     * @param array       待调整的最大堆
     * @param parentIndex 要下沉的父节点
     * @param length      堆的有效大小
     */
    public static void downAdjustByMaxHeap(int[] array, int parentIndex, int length) {

        // temp保存父节点值，用于最后的赋值
        int temp = array[parentIndex];

        for (int childIndex = 2 * parentIndex + 1; childIndex < length; childIndex = 2 * childIndex + 1) {

            // 如果有右孩子，且右孩子大于左孩子的值，则定位到右孩子
            if (childIndex + 1 < length && array[childIndex+1] >= array[childIndex]) {
                childIndex++;
            }

            // 如果父节点大于等于任何一个孩子的值，直接跳出
            if (temp >= array[childIndex]) {
                break;
            }

            //把子节点的值赋值给父节点
            array[parentIndex] = array[childIndex];
            parentIndex = childIndex;
        }

        //把父节点的值赋值给子节点
        array[parentIndex] = temp;
    }
}