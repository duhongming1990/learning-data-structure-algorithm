package com.dhm.vm.classloading;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/1/8 16:25
 */
public class NotInitialization {

//    public static void main(String[] args) {
//        System.out.println(SubClass.value);
//    }


    /**
     * 被动使用类字段演示二：
     * 通过数组定义来引用类，不会触发此类的初始化
     **/
//    public static void main(String[] args) {
//        SuperClass[] sca = new SuperClass[10];
//    }

    public static void main(String[] args) {
        System.out.println(ConstClass.HELLOWORLD);
    }
}

/**
 * 被动使用类字段演示一：
 * 通过子类引用父类的静态字段，不会导致子类初始化
 **/
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

/**
 * 被动使用类字段演示三：
 * 常量在编译阶段会存入调用类的常量池中，本质上并没有直接引用到定义常量的类，因此不会触发定义常量的类的初始化。
 **/
class ConstClass {
    static {
        System.out.println("ConstClass init！");
    }

    public static final String HELLOWORLD = "hello world";
}