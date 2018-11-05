package com.dhm.problem;

import com.alibaba.fastjson.JSON;

import java.util.LinkedList;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2018/10/31 17:10
 */
public class JosephusProblem {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 1; i <= 41; i++) {
            list.add(i);
        }
        System.out.println("JSON.toJSONString(list) = " + JSON.toJSONString(list));
        Integer first = list.getFirst();
        Integer last = list.getLast();

        for (int i = 0; i < list.size(); i++) {
            int temp = i+1;
            if((temp)%3==0){
                System.out.println("list.get(i) = " + list.get(i));
            }
        }

        System.out.println("JSON.toJSONString(list) = " + JSON.toJSONString(list));
    }
}