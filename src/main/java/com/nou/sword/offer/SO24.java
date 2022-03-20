package com.nou.sword.offer;

import com.nou.lc.ListNode;

public class SO24 {

    public ListNode reverseList(ListNode head) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode currentNode = head;
        ListNode preNode = null ;
        while (currentNode !=null){

            ListNode originalNextNode = currentNode.next;

            currentNode.next = preNode;

            preNode = currentNode;

            currentNode = originalNextNode ;

        }
        dummy.next = preNode;
        return dummy.next;
    }
}
