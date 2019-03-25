package com.dhm.algorithm.sort;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author duhongming
 * @Email 935720334@qq.com
 * @Date 2019/1/1 15:23
 *
 * 直接选择排序
 */
@Slf4j
public class StraightSelectSort {

    public static void main(String[] args) {
        int[] data = {5,2,6,0,3,9,1,7,4,8};
        sort(data);
    }

    public static void sort(int[] data) {
        System.out.println("排序前 = " + JSON.toJSONString(data));
        int count1 = 0, count2 = 0;
        for (int i = 0; i < data.length - 1; i++) {
            int temp = i;
            //先不急交换，先找到每次最小的位置。
            for (int j = i + 1; j < data.length; j++) {
                count1++;
                if (data[i] > data[j]) {
                    temp = j;
                }
            }
            //一样的话，不需要交换
            if (temp != i) {
                count2++;
                data[i] = data[i] ^ data[temp];
                data[temp] = data[i] ^ data[temp];
                data[i] = data[i] ^ data[temp];
            }
        }
        log.debug("总共进行了{}次比较，进行了{}次移动！", count1, count2);
        System.out.println("排序后 = " + JSON.toJSONString(data));
    }
}
