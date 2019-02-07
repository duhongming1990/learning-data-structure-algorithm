package com.dhm.vm.classcode;

import java.io.Serializable;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/2/7 18:11
 */
public class Overload {

    //1. char类型的数据
    public static void sayHello(char arg) {
        System.out.println("hello char");
    }

    //2. 发生了一次自动类型转换
    public static void sayHello(int arg) {
        System.out.println("hello int");
    }

    //3. 发生了两次自动类型转换，按照char->int->long->float->double,而到byte和short是转型不安全的。
    public static void sayHello(long arg) {
        System.out.println("hello long");
    }

    //4. 发生了一次自动装箱
    public static void sayHello(Character arg) {
        System.out.println("hello Character");
    }

    //5. 自动装箱之后发现还是找不到装箱类，但是找到了装箱类实现了的接口类型
    public static void sayHello(Serializable arg) {
        System.out.println("hello Serializable");
    }

    //6. char装箱后转型为父类了，继承关系从下往上搜索
    public static void sayHello(Object arg) {
        System.out.println("hello Object");
    }

    //7. 变长参数优先级是最低的
    public static void sayHello(char... arg) {
        System.out.println("hello char ...");
    }

    public static void main(String[] args) {
        sayHello('a');
    }

}