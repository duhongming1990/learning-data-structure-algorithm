package com.dhm.problem;

/**
 * @author duhongming
 * @version 1.0
 * @description 魔术师发牌问题
 * @date 2020-02-16 19:00
 */
public class MagicPokerProblem {

    public static void cratemMagicPoker() {
        //只有一个元素的循环链表
        LinkPoker first = new LinkPoker(1);
        LinkPoker last;
        first.nextData = first;
        //组建13个这样的元素循环链表
        last = first;
        for (int i = 2; i < 14; i++) {
            LinkPoker add = new LinkPoker();
            add.nextData = first;
            last.nextData = add;
            last = add;
        }

        //开始写入数据
        //从2开始
        LinkPoker now = first;
        for (int orderCount = 2; orderCount < 14; orderCount++) {
            int i = 1;
            LinkPoker temp = now.nextData;
            while (true) {
                //先判断是不是0
                //如果是o 可以执行插入
                if (temp.data == 0) {
                    //是否相等
                    if (i == orderCount) {
                        temp.data = i;
                        now = temp;
                        i = 1;
                        break;
                    }
                    i++;
                }
                temp = temp.nextData;
            }
        }
        int j = 1;
        LinkPoker p1 = first;
        while (j < 14) {
            System.out.print(p1.data + "|");
            p1 = p1.nextData;
            j++;
        }
    }

    public static void main(String[] args) {
        cratemMagicPoker();
    }
}

class LinkPoker {
    int data;
    LinkPoker nextData;

    public LinkPoker(int data) {
        this.data = data;
    }

    public LinkPoker() {

    }
}

