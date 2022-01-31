package com.nou.lc.link;

import com.nou.lc.structure.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/copy-list-with-random-pointer/
 * copy list with random pointer
 * 添加日期，便于后续回顾
 * date:01-31 10:43
 * 思路一: 在某一个节点后面复制新的小弟节点 , 然后复制 random , 然后将新链表串联起来（ 从老的链表中删除恢复 ）
 * 思路二: 哈希表解决，遍历两次 , 因为一次循环无法拿到所有的数据结构 , next ,random
 */
public class LC138 {

    // 思路二解法

    public Node copyRandomList(Node head) {

        // 第一次循环遍历，进行值复制
        Node current = head;
        Map<Node,Node> oldToCopyMap = new HashMap<>();
        while (current!=null){

            Node copyNode= new Node(current.val);
            oldToCopyMap.put(current,copyNode);
            current = current.next;

        }

        // 第二次循环遍历 , 进行 next 和 random 指向复制

        current = head;

        while (current!=null){

            Node nextNodeCopy = oldToCopyMap.get(current.next);
            oldToCopyMap.get(current).next = nextNodeCopy;
            Node randomCopy = oldToCopyMap.get(current.random);
            oldToCopyMap.get(current).random = randomCopy;
            current = current.next;

        }
        return oldToCopyMap.get(head);
    }

}
