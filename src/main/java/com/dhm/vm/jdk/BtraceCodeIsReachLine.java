package com.dhm.vm.jdk;

import com.sun.btrace.annotations.*;

import static com.sun.btrace.BTraceUtils.println;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/1/7 18:29
 */
@BTrace
public class BtraceCodeIsReachLine {


    /**
     * 类完全限定名
     */
    private static final String CLAZZ = "sunbox.core.action.system.AnnounceAction";

    /**
     * 方法名
     */
    private static final String METHOD = "getAnnounceList";

    /**
     * 代码行号
     */
    private static final int LINE_NUM = 84;

    /**
     * 监控代码是否到达了某类的某一行
     * @param probeClassName
     * @param probeMethodName
     */
    @OnMethod(clazz = CLAZZ, location = @Location(value = Kind.LINE, line = LINE_NUM))
    public static void codeIsReachLine(@ProbeClassName String probeClassName,
                               @ProbeMethodName String probeMethodName,
                               int line) {
        println(probeClassName + "." + probeMethodName + " reach line:"+line);
    }
}