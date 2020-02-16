package com.dhm.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author duhongming
 * @version 1.0
 * @description 约瑟夫问题
 * @date 2020-02-16 19:01
 */
public class JosephusProblem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入参与总人数:");
        Integer partCount = scanner.nextInt();

        System.out.println("请输入间隔标记数:");
        Integer signNumber = scanner.nextInt();

        handleJosephusProblem(partCount, signNumber);

        scanner.close();
    }

    private static void handleJosephusProblem(Integer partCount, Integer signNumber) {
        // 初始化参与总人数
        List<Integer> peoples = new ArrayList<>(partCount);
        for (Integer i = 1; i <= partCount; i++) {
            peoples.add(i);
        }

        // 从第k个开始计数
        int k = 0;
        while (peoples.size() > 0) {
            k = k + signNumber;
            // 第m人的索引位置
            k = k % peoples.size() - 1;
            // 判断是否到队尾
            if (k == -1) {
                System.out.println("要杀死的人 = " + peoples.get(peoples.size() - 1));
                peoples.remove(peoples.size() - 1);
                k = 0;
            } else {
                System.out.println("要杀死的人 = " + peoples.get(k));
                peoples.remove(k);
            }
        }
    }
}