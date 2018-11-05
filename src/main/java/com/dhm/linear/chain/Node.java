package com.dhm.linear.chain;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2018/10/23 14:28
 */
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

    public Node(int hash, Object key, Object value, Node node) {
        this.hash = hash;
        this.key = key;
        this.value = value;
        this.node = node;
    }

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }
}