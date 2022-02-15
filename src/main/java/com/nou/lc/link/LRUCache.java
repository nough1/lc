package com.nou.lc.link;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/lru-cache/
 * LRU cache
 * 思路 :
 *
 */
public class LRUCache {

    // 定义双链表的节点

    class LinkNode{

        int val;
        int key;
        LinkNode left;
        LinkNode right;

        LinkNode(int key,int val){
            this.val = val;
            this.key = key;
        }

    }

    LinkNode head;
    LinkNode tail;

    Map<Integer,LinkNode> nodeMap = new HashMap<>();

    int capacity ;


    public LRUCache(int capacity) {

        this.capacity = capacity;
        head = new LinkNode(-1,-1);
        tail = new LinkNode(-1,-1);
        head.right = tail;
        tail.left = head;
    }

    public int get(int key) {

        if(!nodeMap.containsKey(key)){
            return -1;
        }

        // 更新数据结构（ 节点的时间戳 )
        LinkNode linkNode = nodeMap.get(key);
        remove(linkNode);
        insertTail(linkNode);
        return linkNode.val;
    }


    public void put(int key, int value) {

        if(nodeMap.containsKey(key)){

            // 更新节点的值
            LinkNode linkNode = nodeMap.get(key);
            linkNode.val = value;
            remove(linkNode);
            insertTail(linkNode);

        }else{

            if(nodeMap.size()==capacity){

                // 容量满了之后，需要删除一个节点
                LinkNode linkNode = tail.left;
                remove(linkNode);
                nodeMap.remove(linkNode.key);

            }
            LinkNode linkNode = new LinkNode(key,value);
            insertTail(linkNode);
            nodeMap.put(key,linkNode);
        }


    }

    public void remove(LinkNode linkNode){

        linkNode.left.right = linkNode.right;
        linkNode.right.left = linkNode.left;

    }

    public void insertTail(LinkNode linkNode){

        linkNode.right = head.right;
        linkNode.left = head;
        head.right.left = linkNode;
        head.right = linkNode;

    }
}
