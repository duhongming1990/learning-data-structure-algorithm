package com.dhm.algorithm.sort;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author duhongming
 * @Email 935720334@qq.com
 * @Date 2019/1/5 20:02
 */
@Slf4j
public class ShellSort {
    public static void main(String[] args) {
        int[] data = {5, 2, 6, 0, 3, 9, 1, 7, 4, 8};
        sort(data);
    }

    public static void sort(int[] data) {
        System.out.println("排序前 = " + JSON.toJSONString(data));
        int gap = data.length;
        int count1 = 0;
        do {
            gap = gap/3+1;
            for (int i = gap; i < data.length; i++) {
                int temp = data[i];
                int j = i - gap;
                while (j >= 0 && temp < data[j]) {
                    data[j + gap] = data[j];
                    count1++;
                    j-=gap;
                }
                data[j + gap] = temp;
            }
        }while(gap>1);
        log.debug("总共进行了{}次移动！", count1);
        System.out.println("排序后 = " + JSON.toJSONString(data));
    }
}
