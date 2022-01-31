package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * swap nodes in pairs
 * https://leetcode.com/problems/swap-nodes-in-pairs/
 * key point : must note that the point direction .
 */
public class LC24_1 {

    public ListNode swapPairs(ListNode head) {


        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode current = dummy;
        ListNode a = dummy.next;

        while (a!=null && a.next!=null){

            ListNode b = a.next;
            current.next = b;
            a.next = b.next;
            b.next = a;

            current = current.next.next;
            a = current.next;

        }

        return dummy.next;
    }


}
