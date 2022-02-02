package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * delete node in a linked list
 * 思路是将当前的节点换成下一个节点的值，然后改成删除下一个节点
 */
public class LC237 {

    public void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;


    }
}
