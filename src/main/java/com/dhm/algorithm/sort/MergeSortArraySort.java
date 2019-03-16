package com.dhm.algorithm.sort;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/3/15 9:26
 * <p>
 * 分区顺序消息队列合并为全局顺序消息队列
 */
public class MergeSortArraySort {

    public static void main(String[] args) {
//        int[] a = {1, 3, 5, 7, 9};
//        int[] b = {2, 4, 6, 8, 10};
//        int[] result = mergeArray(a, b);

        int[] a = {1, 3, 5, 7, 9};
        int[] b = {12, 14, 16, 18, 110};
        int[] result = mergeArray(a, b);
    }

    /**
     * @param arr1
     * @param arr2
     * @return
     *
     * 合并两个有序数组
     */
    private static int[] mergeArray(int[] arr1, int[] arr2) {
        //若两个Arr中其中一个Arr的都比另一个大，则能直接合成
        if (arr1[arr1.length - 1] <= arr2[0]) {
            return connectArr(arr1, arr2);
        }
        if (arr2[arr2.length - 1] <= arr1[0]) {
            return connectArr(arr2, arr1);
        }
        //取FirstArr的第一个元素与SecondArr的第一个元素比较,小的一方，放入ResultArr,并使其索引+1，继续比较，直到最后
        int[] temp = new int[arr1.length + arr2.length];
        int tempIndex = 0, arrIndex1 = 0, arrIndex2 = 0;
        while (arrIndex1 < arr1.length && arrIndex2 < arr2.length) {
            if (arr1[arrIndex1] >= arr2[arrIndex2]) {
                temp[tempIndex++] = arr2[arrIndex2++];
            } else {
                temp[tempIndex++] = arr1[arrIndex1++];
            }
        }
        //其中一方的数组已经全部遍历，将余下的数组部分写入ResultArr,全部遍历完毕则因为IndexOfXX++的原因应该是正好等于Arr.Length
        while (arrIndex1 < arr1.length) {
            temp[tempIndex++] = arr1[arrIndex1++];
        }
        while (arrIndex2 < arr2.length) {
            temp[tempIndex++] = arr2[arrIndex2++];
        }
        return temp;
    }

    /**
     * @param FirstArr
     * @param SecondArr
     * @return
     *
     * 收尾相连两个有序数组
     */
    public static int[] connectArr(int FirstArr[], int SecondArr[]) {
        int[] ResultArr = new int[FirstArr.length + SecondArr.length];
        System.arraycopy(FirstArr, 0, ResultArr, 0, FirstArr.length);
        System.arraycopy(SecondArr, 0, ResultArr, FirstArr.length, SecondArr.length);
        return ResultArr;
    }
}