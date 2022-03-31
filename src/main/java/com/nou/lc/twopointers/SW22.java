package com.nou.lc.twopointers;

import com.nou.lc.ListNode;

/**
 * the kth node from the bottom
 */
public class SW22 {

    public ListNode getKthFromEnd(ListNode head, int k) {

        ListNode fast = head;
        ListNode slow = head ;

        // fast go first k step , execute k times ( 0-k-1)
        int position = 0;
        while (fast!=null && position<k){

            fast = fast.next;
            position++;

        }

        while (fast!=null && slow!=null){

            fast = fast.next;
            slow = slow.next;

        }
        return slow;
    }
}
