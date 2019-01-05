package com.dhm.vm.error;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * 本机直接内存溢出(未验证)
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/1/2 11:49
 *
 * -Xmx20m -XX:MaxDirectMemorySize=10m
 */
public class DirectMemoryOOM {

    public static final int _1M = 1 * 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true) {
            unsafe.allocateMemory(_1M);
        }
    }
}