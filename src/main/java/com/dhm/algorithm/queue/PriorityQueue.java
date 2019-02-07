package com.dhm.algorithm.queue;

import com.dhm.datastructure.tree.BinaryHeap;

import java.util.Arrays;

/**
 * @Author duhongming
 *  * @Email 19919902414@189.cn
 *  * @Date 2019/2/7 19:47
 * 优先级队列
 */
public class PriorityQueue {

    private int[] array;
    private int size;

    public PriorityQueue() {
        //队列初始长度16
        array = new int[16];
    }

    /**
     * 入队
     *
     * @param element 入队元素
     */
    public void enQueue(int element) {
        if (size > array.length) {
            resize();
        }
        array[size++] = element;
        BinaryHeap.upAdjustByMaxHeap(array,size);
    }

    /**
     * 出队
     */
    public int deQueue() throws Exception {
        if (size <= 0) {
            throw new Exception("the queue is empty !");
        }
        //获取堆顶元素
        int head = array[0];
        //最后一个元素移动到堆顶
        array[0] = array[--size];
        //堆顶元素下沉调整
        BinaryHeap.downAdjustByMaxHeap(array, 0, size);
        return head;
    }

    private void resize() {
        //队列容量翻倍
        int newSize = this.size * 2;
        this.array = Arrays.copyOf(this.array, newSize);

    }

    public static void main(String[] args) throws Exception {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.enQueue(3);
        priorityQueue.enQueue(5);
        priorityQueue.enQueue(10);
        priorityQueue.enQueue(2);
        priorityQueue.enQueue(7);
        System.out.println("出队元素：" + priorityQueue.deQueue());
        System.out.println("出队元素：" + priorityQueue.deQueue());
    }

}