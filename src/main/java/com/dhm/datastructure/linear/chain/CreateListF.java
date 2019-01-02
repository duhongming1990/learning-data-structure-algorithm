package com.dhm.datastructure.linear.chain;

import com.alibaba.fastjson.JSON;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2018/10/31 16:23
 * 头插法
 */
public class CreateListF {
    public static void main(String[] args) {
        Node node0 = new Node(0,0,0,null);

        Node node1 = new Node(1,1,1,null);
        node1.setNode(node0);

        Node node2 = new Node(2,2,2,null);
        node2.setNode(node1);

        Node node3 = new Node(3,3,3,null);
        node3.setNode(node2);

        System.out.println("JSON.toJSONString(node3) = " + JSON.toJSONString(node3));

        //头插法
        Node temp = null;
        for (int i = 0; i <5 ; i++) {
            Node node = new Node(i,i,i,null);
            node.setNode(temp);
            temp = node;
        }

        System.out.println("JSON.toJSONString(temp) = " + JSON.toJSONString(temp));
    }
}