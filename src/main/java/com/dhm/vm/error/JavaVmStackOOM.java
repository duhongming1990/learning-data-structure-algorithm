package com.dhm.vm.error;

/**
 * Java虚拟机栈和本地方法栈溢出
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/1/2 10:31
 *
 * 减少栈内存容量为2M
 * -Xss2M
 */
public class JavaVmStackOOM {

    private void dontstop(){
        while (true) {

        }
    }

    public void stackLeakByThead(){

        while (true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontstop();
                }
            });
            thread.start();
        }

    }

    public static void main(String[] args) {
        JavaVmStackOOM javaVmStackOOM = new JavaVmStackOOM();
        javaVmStackOOM.stackLeakByThead();
    }



}