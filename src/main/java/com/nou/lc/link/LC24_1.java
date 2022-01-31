package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * swap nodes in pairs
 * https://leetcode.com/problems/swap-nodes-in-pairs/
 * key point : must note that the point direction .
 * 注意赋值的先后关系
 */
public class LC24_1 {

    public ListNode swapPairs(ListNode head) {


        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode current = dummy;


        while (current.next!=null && current.next.next!=null){

            ListNode a = current.next;
            ListNode b = a.next;
            current.next = b;
            a.next = b.next;
            b.next = a;

            current = current.next.next;

        }

        return dummy.next;
    }


}
