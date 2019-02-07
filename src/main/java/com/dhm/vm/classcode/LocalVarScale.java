package com.dhm.vm.classcode;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/2/6 15:57
 * -verbose:gc
 */
public class LocalVarScale {
    public static void main(String[] args) {
        {
            byte[] placeholder = new byte[64 * 1024 * 1024];
        }
        //int a = 0;
        System.gc();
    }
}