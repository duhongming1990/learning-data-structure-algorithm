package com.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2018/12/2 12:45
 *
 * 虚引用 PhantomReference
 *
 * 从PhantomReference类的源代码可以知道，它的get()方法无论何时返回的都只会是null。
 * 所以单独使用虚引用时，没有什么意义，需要和引用队列ReferenceQueue类联合使用。
 * 当执行Java GC时如果一个对象只有虚引用，就会把这个对象加入到与之关联的ReferenceQueue中。
 */
public class PhantomReferenceTest {
    public static final int M = 1024*1024;

    public static void printlnMemory(String tag){
        Runtime runtime = Runtime.getRuntime();
        System.out.println("\n"+tag+":");
        System.out.println(runtime.freeMemory()/M+"M(free)/" + runtime.totalMemory()/M+"M(total)");
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=26;i<=28;i++) {
            stringBuilder.append(
                    "INSERT INTO sys_int_log_drds SELECT user_id,user_name,package_name,module_name,func_name,exception,`status`,error_info,channel_type,operat_name,remote_addr,create_time\n" +
                            "FROM sys_int_log where create_time like '2019-02-"+String.format("%02d",i)+"%';\n");
        }

        System.out.println(stringBuilder.toString());


//        PhantomReferenceTest.printlnMemory("1.原可用内存和总内存");
//        byte[] object = new byte[10*PhantomReferenceTest.M];
//        PhantomReferenceTest.printlnMemory("2.实例化10M的数组后");
//
//        //建立虚引用
//        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
//        PhantomReference<Object> phantomReference = new PhantomReference<>(object,referenceQueue);
//
//        PhantomReferenceTest.printlnMemory("3.建立虚引用后");
//        System.out.println("phantomReference : "+phantomReference);
//        System.out.println("phantomReference.get() : "+phantomReference.get());
//        System.out.println("referenceQueue.poll() : "+referenceQueue.poll());
//
//        //断开byte[10*PhantomReferenceTest.M]的强引用
//        object = null;
//        PhantomReferenceTest.printlnMemory("4.执行object = null;强引用断开后");
//
//        System.gc();
//        PhantomReferenceTest.printlnMemory("5.GC后");
//        System.out.println("phantomReference : "+phantomReference);
//        System.out.println("phantomReference.get() : "+phantomReference.get());
//        System.out.println("referenceQueue.poll() : "+referenceQueue.poll());
//
//        //断开虚引用
//        phantomReference = null;
//        System.gc();
//        PhantomReferenceTest.printlnMemory("6.断开虚引用后GC");
//        System.out.println("phantomReference : "+phantomReference);
//        System.out.println("referenceQueue.poll() : "+referenceQueue.poll());
    }
}