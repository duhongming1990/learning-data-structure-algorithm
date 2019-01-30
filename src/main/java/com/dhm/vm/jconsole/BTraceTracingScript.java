package com.dhm.vm.jconsole;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/1/30 11:25
 */
/* BTrace Script Template */
import com.sun.btrace.annotations.*;
import static com.sun.btrace.BTraceUtils.*;

@BTrace
public class BTraceTracingScript {
    @OnMethod(
            clazz="com.dhm.vm.jconsole.BTraceTest",
            method="add",
            location=@Location(Kind.RETURN)
    )

    public static void func(@Self com.dhm.vm.jconsole.BTraceTest instance, int a, int b, @Return int result) {
        println("调用堆栈:");
        jstack();
        println(strcat("方法参数A:",str(a)));
        println(strcat("方法参数B:",str(b)));
        println(strcat("方法结果:",str(result)));
    }
}