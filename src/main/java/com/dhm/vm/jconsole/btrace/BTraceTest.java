package com.dhm.vm.jconsole.btrace;

import com.sun.btrace.annotations.*;

import static com.sun.btrace.BTraceUtils.*;

/**
 * @Author duhongming
 * @Email 935720334@qq.com
 * @Date 2019/1/6 13:44
 *
 * btrace 36109 /Users/admin/JavaProject/learning-data-structure-algorithm/src/main/java/com/dhm/vm/btrace/BTraceTest.java
 */
@BTrace
public class BTraceTest {
    private static long count;
    static{
//        println("---------------------------JVM properties:---------------------------");
//        printVmArguments();
//        println("---------------------------System properties:------------------------");
//        printProperties();
//        println("---------------------------OS properties:----------------------------");
//        printEnv();
//        exit();
    }

//    @OnMethod(
//            clazz = "com.dhm.vm.jconsole.btrace.Calculator",
//            method = "add",
//            location = @Location(Kind.RETURN)
//    )
//    public static void trace1(int a, int b, @Return int sum) {
//        println("trace1:a=" + a + ",b=" + b + ",sum=" + sum);
//    }

//    @OnMethod(
//            clazz = "com.dhm.vm.jconsole.btrace.Calculator",
//            method = "add",
//            location = @Location(Kind.RETURN)
//    )
//    public static void trace2(@Duration long duration) {
//        println(strcat("duration(nanos): ", str(duration)));
//        println(strcat("duration(s): ", str(duration / 1000000000)));
//    }

//    @OnMethod(
//            clazz = "com.dhm.vm.jconsole.btrace.Calculator",
//            method = "add",
//            location = @Location(value = Kind.CALL, clazz = "/.*/", method = "sleep")
//    )
//    public static void trace3(@ProbeClassName String pcm, @ProbeMethodName String pmn,
//                              @TargetInstance Object instance, @TargetMethodOrField String method) {
//        println(strcat("ProbeClassName: ", pcm));
//        println(strcat("ProbeMethodName: ", pmn));
//        println(strcat("TargetInstance: ", str(instance)));
//        println(strcat("TargetMethodOrField : ", str(method)));
//        println(strcat("count: ", str(++count)));
//    }
//
//    @OnTimer(6000)
//    public static void trace4() {
//        println(strcat("trace4:count: ", str(count)));
//    }

    @OnMethod(
            clazz = "com.dhm.vm.jconsole.btrace.Calculator",
            method = "add",
            location = @Location(Kind.RETURN)
    )
    public static void trace5(@Self Object calculator) {
        println(get(field("com.dhm.vm.jconsole.btrace.Calculator", "c"), calculator));
    }
//
//    @OnTimer(4000)
//    public static void traceMemory() {
//        println("heap:");
//        println(heapUsage());
//        println("no-heap:");
//        println(nonHeapUsage());
//    }
//
//    @OnTimer(4000)
//    public static void trace6() {
//        deadlocks();
//    }

}
