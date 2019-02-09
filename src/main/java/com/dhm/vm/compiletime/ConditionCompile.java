package com.dhm.vm.compiletime;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/2/9 14:46
 */
public class ConditionCompile {
    public static void main(String[] args) {

        if (true) {
            System.out.println("block 1");
        } else {
            System.out.println("block 2");
        }

        // 编译器将会提示“Unreachable code”
//        while (false) {
//            System.out.println("");
//        }

    }



}