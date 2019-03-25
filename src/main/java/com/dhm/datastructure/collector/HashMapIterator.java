package com.dhm.datastructure.collector;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/3/5 14:38
 */
public class HashMapIterator {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap(16);

        //建议
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        //建议
        Iterator<Map.Entry<String, String>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, String> entry = entryIterator.next();
            System.out.println(entry.getKey() + entry.getValue());
        }

        //禁止
        for (String key : map.keySet()) {
            System.out.println(key  + ":" + map.get(key));
        }

        //禁止
        Iterator<String> stringIterator = map.keySet().iterator();
        while(stringIterator.hasNext()){
            String key = stringIterator.next();
            System.out.println(key  + ":" + map.get(key));
        }

        //JDK8强烈建议
        map.forEach((key,value)->{
            System.out.println(key + ":" + value);
        });


    }
}