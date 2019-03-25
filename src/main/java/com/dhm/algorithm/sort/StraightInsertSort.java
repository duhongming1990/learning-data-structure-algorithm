package com.dhm.algorithm.sort;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author duhongming
 * @Email 935720334@qq.com
 * @Date 2019/1/5 19:14
 *
 * 直接插入排序
 */
@Slf4j
public class StraightInsertSort {

    public static void main(String[] args) {
        int[] data = {5, 2, 6, 0, 3, 9, 1, 7, 4, 8};
        sort(data);
    }

    public static void sort(int[] data) {
        System.out.println("排序前 = " + JSON.toJSONString(data));
        int count1 = 0;
        for (int i = 1; i < data.length; i++) {
            int temp = data[i];
            int j = i - 1;
            while (j >= 0 && temp < data[j]) {
                data[j + 1] = data[j];
                count1++;
                j--;
            }
            data[j + 1] = temp;
        }
        log.debug("总共进行了{}次移动！", count1);
        System.out.println("排序后 = " + JSON.toJSONString(data));
    }
}
