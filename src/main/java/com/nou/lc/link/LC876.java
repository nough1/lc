package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * https://leetcode.com/problems/middle-of-the-linked-list/
 * date : 2022-02-01 11:05
 * 思路: 快慢指针
 */
public class LC876 {

    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast!=null && fast.next!=null){

            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }
}
