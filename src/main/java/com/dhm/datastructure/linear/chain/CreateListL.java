package com.dhm.datastructure.linear.chain;

import com.alibaba.fastjson.JSON;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2018/10/31 16:28
 * 尾插法
 */
public class CreateListL {
    public static void main(String[] args) {
        Node node = new Node(0, 0, 0,
                new Node(1, 1, 1,
                        new Node(2, 2, 2, null)
                )
        );
        System.out.println("JSON.parseObject(node) = " + JSON.toJSONString(node));

        Node node0 = new Node(0, 0, 0, null);
        Node node1 = new Node(1, 1, 1, null);
        node0.setNode(node1);
        Node node2 = new Node(2, 2, 2, null);
        node0.getNode().setNode(node2);
        Node node3 = new Node(3, 3, 3, null);
        node0.getNode().getNode().setNode(node3);
        System.out.println("JSON.parseObject(node0) = " + JSON.toJSONString(node0));

        //尾插法
        Node head = new Node(0,0,0,null);
        for (int i = 1; i < 5; i++) {
            Node foot = new Node(i,i,i,null);
            Node temp = getEndNode(head);
            temp.setNode(foot);
        }
        System.out.println("JSON.parseObject(head) = " + JSON.toJSONString(head));
    }

    public static Node getEndNode(Node node){
        Node temp = node;
        if(node.getNode()!=null){
            temp = getEndNode(node.getNode());
        }
        return temp;
    }
}