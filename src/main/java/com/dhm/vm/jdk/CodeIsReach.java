package com.dhm.vm.jdk;

import com.sun.btrace.AnyType;
import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.*;

import java.lang.reflect.Field;

import static com.sun.btrace.BTraceUtils.*;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/1/7 14:14
 */
public class CodeIsReach {
    /**
     * 类完全限定名
     */
    private static final String CLAZZ = "sunbox.core.hsf.impl.SysManageServiceImpl";

    /**
     * 方法名
     */
    private static final String METHOD = "getMerchantOrgsByPOuCode";


    /**
     * 所有入参及返回值
     * @param self
     * @param token
     * @param ouCode
     * @param orgType
     * @param result
     */
    @OnMethod(clazz = CLAZZ,method = METHOD,location=@Location(Kind.RETURN))
    public static void printMethodRunTime(@Self Object self,String token, String ouCode,Integer orgType,
                                          @Return AnyType result ){
        println("token: " + token + " ,ouCode: " + ouCode + " ,orgType: " + orgType);
        println("result = " + BTraceUtils.get(BTraceUtils.field("sunbox.core.vo.ResponseVo","result"), result));
        println("status = " + BTraceUtils.get(BTraceUtils.field("sunbox.core.vo.ResponseVo","status"), result));
        println();
    }

    @OnMethod(clazz = CLAZZ,method = METHOD,location=@Location(Kind.ENTRY))
    public static void printMethodRunTime(@Self Object self,String json,
                                          @Return AnyType result ){
        println("json: " + json);
        println("result = " + BTraceUtils.get(BTraceUtils.field("sunbox.core.vo.ResponseVo","result"), result));
        println("status = " + BTraceUtils.get(BTraceUtils.field("sunbox.core.vo.ResponseVo","status"), result));
        println();
    }

    @OnMethod(clazz = CLAZZ,method = METHOD,location=@Location(Kind.ENTRY))
    public static void printMethodRunTime(@Self Object self,@Return AnyType result){
        Object sysOrg = BTraceUtils.field("sunbox.core.vo.sys.SysManageAction","sysOrg");
        println("ouCode = " + BTraceUtils.get(BTraceUtils.field("sunbox.core.vo.sys.Organization","ouCode"), sysOrg));
        println();
    }

    @OnMethod(clazz = CLAZZ,method = METHOD,location=@Location(Kind.RETURN))
    public static void printMethodRunTime(
                                        @ProbeClassName String probeClassName,
                                        @ProbeMethodName String probeMethodName,
                                        @Self Object self,
                                        AnyType[] args,
                                        @Return AnyType result ){
        BTraceUtils.println(self);
        println(probeClassName + "." + probeMethodName);
        BTraceUtils.printArray(args);
        BTraceUtils.println(result);
        println("result = " + BTraceUtils.get(BTraceUtils.field("sunbox.core.vo.ResponseVo","result"), result));
        println("status = " + BTraceUtils.get(BTraceUtils.field("sunbox.core.vo.ResponseVo","status"), result));
        println();
    }

    @OnMethod(clazz = "java.lang.System", method = "gc")
    public static void onSystemGC(){
        println("entered System.gc()");
        jstack();
    }
}