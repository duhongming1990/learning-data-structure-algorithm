package com.dhm.vm.classloading;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/2/5 10:59
 */
public class FieldResolution {
    interface Interface0 {
        int A = 0;
    }

    interface Interface1 extends Interface0 {
        int A = 1;
    }

    interface Interface2 {
        int A = 2;
    }

    static class Parent implements Interface1 {
        public static int A = 3;
    }

    static class Sub extends Parent implements Interface2 {
        //注释掉，接口和父类同时存在字段A，编译器将拒绝编译
        public static int A = 4;
    }

    public static void main(String[] args) {
        System.out.println(Sub.A);
    }

}