package com.dhm.vm.jdk;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/1/7 11:43
 */


import com.sun.btrace.annotations.*;

import static com.sun.btrace.BTraceUtils.*;

@BTrace

public class MethodRunTime {

    /**
     * 类完全限定名
     */
    private static final String CLAZZ = "sunbox.core.hsf.impl.SysManageServiceImpl";

    /**
     * 方法名
     */
    private static final String METHOD = "getMerchantOrgsByPOuCode";

    /**
     * 监控某一个方法的执行时间
     *
     * @param probeClassName
     * @param probeMethodName
     * @param duration
     */
    @OnMethod(clazz = CLAZZ,
            method = METHOD,
            location = @Location(Kind.RETURN))

    public static void printMethodRunTime(@ProbeClassName String probeClassName,
                                          @ProbeMethodName String probeMethodName,
                                          @Duration long duration) {
        println(probeClassName + "." + probeMethodName + ",cost time:" + duration / 1000000 + " ms");
    }

    /**
     * 监控某一个方法内的外部方法调用情况并打印出响应时间大于 5 MS 的外部调用方法名执行时间
     *
     * @param self
     * @param instance
     * @param targetMethodOrField
     * @param duration
     */
    @OnMethod(clazz = CLAZZ,
            method = METHOD,
            location = @Location(value = Kind.CALL, clazz = "/.*/", method = "/.*/", where = Where.AFTER))

    public static void printMethodRunTime(@Self Object self,
                                          @TargetInstance Object instance,
                                          @TargetMethodOrField String targetMethodOrField,
                                          @Duration long duration) {

        //如果耗时大于 5 毫秒则打印出来 这个条件建议加 否则打印的调用函数太多 具体数值可以自己调控
        if (duration > 5000000) {
            println(instance + "." + targetMethodOrField + ",cost time:" + duration / 1000000 + " ms");
        }
    }


    /**
     * 监控接口中某一个方法的执行时间
     *
     * @param probeClassName
     * @param probeMethodName
     * @param duration
     */
    @OnMethod(clazz = "+sunbox.core.hsf.api.SysManageService", method = METHOD, location = @Location(Kind.RETURN))
    public static void printInterfaceMethodRunTime(@ProbeClassName String probeClassName,
                                                   @ProbeMethodName String probeMethodName,
                                                   @Duration long duration) {
        println(probeClassName + "." + probeMethodName + ",cost time:" + duration / 1000000 + " ms");
    }


    /**
     * 正则监控某个方法的执行时间
     *
     * @param probeClassName
     * @param probeMethod
     * @param duration
     */
    @OnMethod(clazz = "/sunbox.core.hsf.*/", method = "/.*/", location = @Location(Kind.RETURN))
    public static void printMethodRunTimeRegex(@ProbeClassName String probeClassName,
                                               @ProbeMethodName String probeMethod,
                                               @Duration long duration) {

        println(probeClassName + "." + probeMethod + ",cost time: " + duration / 1000000 + " ms.");
    }


}
