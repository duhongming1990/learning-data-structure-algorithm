package com.dhm.vm;

import lombok.extern.slf4j.Slf4j;

/**
 * Java虚拟机栈和本地方法栈溢出
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/1/2 10:20
 * <p>
 * 减少栈内存容量为128k
 * -Xss128k
 */
@Slf4j
public class JavaVMStackSOF {
    private int stackDepth = 1;

    public void stackLeak() {
        stackDepth++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF javaVMStackSOF = new JavaVMStackSOF();
        try {
            javaVMStackSOF.stackLeak();
        } catch (StackOverflowError stackOverflowError) {
            log.error("stack depth:{}", javaVMStackSOF.stackDepth);
            throw stackOverflowError;
        }
    }
}