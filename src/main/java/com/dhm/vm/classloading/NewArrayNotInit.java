package com.dhm.vm.classloading;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/2/5 9:55
 * 被动使用类字段演示二：
 * 通过数组定义来引用类，不会触发此类的初始化
 */
public class NewArrayNotInit {
    public static void main(String[] args) {
        SuperClass[] sca = new SuperClass[10];
    }
}