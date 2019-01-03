package com.dhm.vm.error;

import java.util.ArrayList;
import java.util.List;

/**
 * 运行时常量池溢出
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/1/2 11:13
 *
 * JDK 1.8中 PermSize 和 MaxPermSize 已经无效
 * -XX:PermSize=10M -XX:MaxPermSize=10M
 *
 * JDK 1.8使用元空间（ Metaspace ）替代了永久代（ PermSize ）
 * -XX:MetaspaceSize=2m -XX:MaxMetaspaceSize=2m
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args) {
        //使用List保持常量池的引用，防止Full GC回收常量池行为。
        List<String> strings = new ArrayList<>();
        //2M的PermSize在Integer范围内足够产生OOM了
        int i = 0;
        while (true) {
            strings.add(String.valueOf(i++).intern());
        }
    }
}