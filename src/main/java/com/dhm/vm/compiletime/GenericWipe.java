package com.dhm.vm.compiletime;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/2/9 13:23
 */
public class GenericWipe {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("hello", "你好");
        map.put("how are you?", "吃了没？");
        System.out.println(map.get("hello"));
        System.out.println(map.get("how are you?"));
    }

}