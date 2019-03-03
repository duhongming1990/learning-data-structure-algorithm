package com.dhm.datastructure.linear.recursive;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/3/3 19:48
 * Java中的应用：
 * JSON属性递归遍历
 */
@Slf4j
public class JsonRecursion {

    public static void main(String[] args) {
        parse(JSON.parse(""));
    }

    private static void parse(Object object) {
        if (object instanceof JSONObject) {
            log.info("JSONObject:{}", object.toString());
        } else if (object instanceof JSONArray) {
            JSONArray jsonArray = (JSONArray) object;
            for (int i = 0; i < jsonArray.size(); i++) {
                parse(jsonArray.getJSONObject(i));
            }
            log.info("JSONArray:{}\n", object.toString());
        }
    }
}