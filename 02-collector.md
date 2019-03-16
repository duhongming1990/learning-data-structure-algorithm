# 02-collector

## 第二讲 集合

# HashMap集锦

## 漫画：什么是HashMap？
URL:  https://mp.weixin.qq.com/s/HzRH9ZJYmidzW5jrMvEi4w

    余数分组：
    index =  HashCode（Key） &  （Length - 1）
    
    反观长度16或者其他2的幂，Length-1的值是所有二进制位全为1，这种情况下，index的结果等同于HashCode后几位的值。只要输入的HashCode本身分布均匀，Hash算法的结果就是均匀的。
   
## 漫画：高并发下的HashMap
URL:  https://mp.weixin.qq.com/s/dzNq50zBQ4iDrOAhM4a70A 

    1.Hashmap在插入元素过多的时候需要进行Resize，Resize的条件是
    HashMap.Size   >=  Capacity * LoadFactor。
    
    2.Hashmap的Resize包含扩容和ReHash两个步骤，ReHash在并发的情况下可能会形成链表环。


## 漫画：什么是ConcurrentHashMap？
URL:  https://mp.weixin.qq.com/s/1yWSfdz0j-PprGkDgOomhQ

    Case1：不同Segment的并发写入（可以并发执行）
    Case2：同一Segment的一写一读（可以并发执行）
    Case3：同一Segment的并发写入（阻塞）
    
    Get方法：
    1.为输入的Key做Hash运算，得到hash值。
    2.通过hash值，定位到对应的Segment对象
    3.再次通过hash值，定位到Segment当中数组的具体位置。
    
    
    Put方法：
    1.为输入的Key做Hash运算，得到hash值。
    2.通过hash值，定位到对应的Segment对象
    3.获取可重入锁
    4.再次通过hash值，定位到Segment当中数组的具体位置。
    5.插入或覆盖HashEntry对象。
    6.释放锁。
    
    为什么这样设计呢？这种思想和乐观锁悲观锁的思想如出一辙。
    为了尽量不锁住所有Segment，首先乐观地假设Size过程中不会有修改。当尝试一定次数，才无奈转为悲观锁，锁住所有Segment保证强一致性。
    

## 漫画：什么是红黑树？
URL:  https://mp.weixin.qq.com/s/jz1ajDUygZ7sXLQFHyfjWA

## Java7/8 中的 HashMap 和 ConcurrentHashMap 全解析
URL:  http://www.importnew.com/28263.html


## JDK源码分析
1. [ArrayList/Vector 的底层分析](https://github.com/duhongming1990/JCSprout/blob/master/MD/ArrayList.md)
2. [LinkedList 底层分析](https://github.com/duhongming1990/JCSprout/blob/master/MD/LinkedList.md)
3. [HashMap 底层分析](https://github.com/duhongming1990/JCSprout/blob/master/MD/HashMap.md)

HashMap遍历的那些坑：
```java
    //建议
    for (Map.Entry<String, String> entry : map.entrySet()) {
        System.out.println(entry.getKey() + ":" + entry.getValue());
    }
        
    //JDK8强烈建议
    map.forEach((key,value)->{
        System.out.println(key + ":" + value);
    });
```

4. [HashSet 底层分析](https://github.com/duhongming1990/JCSprout/blob/master/MD/collection/HashSet.md)
5. [LinkedHashMap 底层分析](https://github.com/duhongming1990/JCSprout/blob/master/MD/collection/LinkedHashMap.md)

扩展（缓存与路由算法）：

    漫画：什么是LRU算法？
    https://mp.weixin.qq.com/s/h_Ns5HY27NmL_odCYLgx_Q
    总结：
    LRU算法：Least Recently Used 最近最少使用算法
    LinkedHashMap：在HashMap的基础上又维护了一个双向链表
    LinkedHashMap linkedHashMap = new LinkedHashMap(16,0.75f,true);