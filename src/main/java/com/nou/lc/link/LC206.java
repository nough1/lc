package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * 反转链表,有两种思路，一种是递归，还有一种是迭代 .
 */
public class LC206 {

    public ListNode reverseList(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }

        ListNode a = head;
        ListNode b = head.next;
        while(b!=null){

            ListNode c = b.next;
            b.next = a;
            a = b;
            b = c;

        }
        head.next = null ;
        return a;
    }
}
