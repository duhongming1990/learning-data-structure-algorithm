package com.dhm.vm.jconsole;

/**
 * @Author duhongming
 * @Email 935720334@qq.com
 * @Date 2019/1/6 12:06
 */
public class DeadLockMonitor {
    /**
     * 线程死锁等待演示
     */
    static class SyncAddRunnable implements Runnable{
        
        int a,b;
        public SyncAddRunnable(int a,int b){
            this.a = a;
            this.b = b;
        }

        @Override
        public void run() {
            synchronized (Integer.valueOf(a)){
                synchronized (Integer.valueOf(b)){
                    System.out.println("a+b = " + a+b);
                }
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            new Thread(new SyncAddRunnable(1,2)).start();
            new Thread(new SyncAddRunnable(2,1)).start();
        }
    }
}
