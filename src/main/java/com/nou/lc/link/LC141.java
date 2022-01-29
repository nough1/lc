package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * 环形链表问题
 * https://leetcode.com/problems/linked-list-cycle/
 * 双指针的变种-快慢指针，相遇的思路
 */
public class LC141 {

    public boolean hasCycle(ListNode head) {


        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null){

            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                return true ;
            }

        }
        return false;
    }

}
