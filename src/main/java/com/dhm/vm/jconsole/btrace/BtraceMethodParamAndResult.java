package com.dhm.vm.jconsole.btrace;

import com.sun.btrace.AnyType;
import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.*;

import static com.sun.btrace.BTraceUtils.println;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/1/7 19:15
 */
@BTrace
public class BtraceMethodParamAndResult {

    /**
     * 类完全限定名
     */
    private static final String CLAZZ = "sunbox.core.util.io.DownLoadUtility";

    /**
     * 方法名
     */
    private static final String METHOD = "downloadOSSFile";


    /**
     * 所有入参及返回值
     * @param self
     * @param result
     */
    @OnMethod(clazz = CLAZZ,method = METHOD,location=@Location(Kind.RETURN))
    public static void printMethodRunTime(@Self Object self, String urlStr,
                                          @Return AnyType result ){
        println("token: " + urlStr);
        println("result = " + result);
        println();
    }


}