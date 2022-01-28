package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * https://leetcode-cn.com/problems/reverse-linked-list/
 * reverse link list
 */
public class LC206_1 {

    public ListNode reverseList(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }

        ListNode currentNode = head;
        ListNode preNode = null;
        while (currentNode!=null){

            ListNode temp = currentNode.next;
            currentNode.next = preNode;
            preNode = currentNode;
            currentNode = temp ;


        }

        return preNode;
    }
}
