# learning-data-structure-algorithm

## 学习数据结构和算法

课程序号 | 课程编码 | 课程名称
---|---|---
1 | introduction | [第一讲 数据结构和算法绪论](01-introduction.md)
2 | linear | [第二讲 线性表](02-linear.md)
3 | tree | [第三讲 树](03-tree.md)
4 | graph | [第四讲 图](04-graph.md)
5 | algorithm | [第五讲 算法](05-algorithm.md)
6 | vm | [第六讲 深入Java虚拟机](06-vm.md)

## JDK源码分析
1. [ArrayList/Vector 的底层分析](https://github.com/duhongming1990/JCSprout/blob/master/MD/ArrayList.md)
2. [LinkedList 底层分析](https://github.com/duhongming1990/JCSprout/blob/master/MD/LinkedList.md)
3. [HashMap 底层分析](https://github.com/duhongming1990/JCSprout/blob/master/MD/HashMap.md)
4. [HashSet 底层分析](https://github.com/duhongming1990/JCSprout/blob/master/MD/collection/HashSet.md)
5. [LinkedHashMap 底层分析](https://github.com/duhongming1990/JCSprout/blob/master/MD/collection/LinkedHashMap.md)

## 二进制基础
### 1 二进制、八进制、十进制、十六进制
    二进制是Binary，简写为B
    八进制是Octal，简写为O，标志的开头用0表示，用0~7的数字表示；
    十进制为Decimal，简写为D，标志的开头用0x表示，用数字0~9、A~F
    十六进制为Hexadecimal，简写为H
Binary | Octal | Decimal |  Hexadecimal
:---:|:---:|:---:|:---:
0000 | 0 | 0 | 0
0001 | 1 | 1 | 1
0010 | 2 | 2 | 2
0011 | 3 | 3 | 3
0100 | 4 | 4 | 4
0101 | 5 | 5 | 5
0110 | 6 | 6 | 6
0111 | 7 | 7 | 7
1000 | 10 | 8 | 8
1001 | 11 | 9 | 9
1010 | 12 | 10 | A
1011 | 13 | 11 | B
1100 | 14 | 12 | C
1101 | 15 | 13 | D
1110 | 16 | 14 | E
1111 | 17 | 15 | F
10000 | 20 | 16 | 10

## 2 二进制位运算
    &与：两位全为1，结果才为1
    |或：只要有一个为1，结果就为1
    ^异或：两个相应位为“异”（值不同），则该位结果为1，否则为0
    ~反码：将0变成1，1变成0；
    <<左移：全部左移，左边的二进制丢弃，右边补0；
    >>右移：全部右移，正数左补0，负数左补1，右边丢弃；
    >>>无符号右移：右移后左边用零来填充；
    负数以其正值的补码形式表示（反码加1称为补码）

## 3 两个变量交换值的方法
    1、借助第三个变量来实现
    C=A；A=B；B=C；
    2、利用加减法实现两个变量的交换
    A=A+B；B=A-B；A=A-B；
    3、用位异或运算来实现，也是效率最高
    原理：利用一个数异或本身等于0和异或运算符合交换率。
    A=A^B；B=A^B；A=A^B；


