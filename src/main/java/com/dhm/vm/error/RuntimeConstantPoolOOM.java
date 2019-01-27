package com.dhm.vm.error;

import java.util.ArrayList;
import java.util.List;

/**
 * 运行时常量池溢出(验证不通过)
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/1/2 11:13
 *
 * JDK 1.8中 PermSize 和 MaxPermSize 已经无效
 * -XX:PermSize=2M -XX:MaxPermSize=2M
 *
 * JDK 1.8使用元空间（ Metaspace ）替代了永久代（ PermSize ）
 * -XX:MetaspaceSize=5m -XX:MaxMetaspaceSize=5m
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args) {

        String str1 = new StringBuilder("中国").append("钓鱼岛").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);


        //使用List保持常量池的引用，防止Full GC回收常量池行为。
        List<String> strings = new ArrayList<>();
        //2M的PermSize在Integer范围内足够产生OOM了
        int i = 0;
        while (true) {
            strings.add(String.valueOf(i++).intern());
        }
    }


}