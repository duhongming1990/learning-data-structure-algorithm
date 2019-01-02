package com.dhm.datastructure.linear.chain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2018/10/23 14:28
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Node {
    /**
     * hash值
     */
    private int hash;
    /**
     * 键
     */
    private Object key;
    /**
     * 值
     */
    private Object value;
    /**
     * 下一个节点
     */
    private Node node;
}