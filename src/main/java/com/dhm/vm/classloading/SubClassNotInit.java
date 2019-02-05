package com.dhm.vm.classloading;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/2/5 9:47
 * 被动使用类字段演示一：
 * 通过子类引用父类的静态字段，不会导致子类初始化
 * -XX:+TraceClassLoading
 */
public class SubClassNotInit {
    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }
}

class SuperClass {
    static {
        System.out.println("SuperClass init！");
    }

    public static int value = 123;
}

class SubClass extends SuperClass {
    static {
        System.out.println("SubClass init！");
    }
}