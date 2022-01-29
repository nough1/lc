package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * 环形链表二
 * https://leetcode.com/problems/linked-list-cycle-ii/
 * 思路:本质上是利用了数学的思想来解决 . 在相遇了之后把快指针放到头部继续走就
 * 可以再次相遇
 */
public class LC142 {

    public ListNode detectCycle(ListNode head) {

        // 第一步 : 利用快慢指针找出相遇点 .
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){

            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                break;
            }
        }

        if(fast==null||fast.next==null){
            return null ;
        }

        // 第二步 : 将快指针调整为头节点，继续走
        fast = head;

        while (fast!=slow){

            fast = fast.next;
            slow = slow.next;

        }
        return slow;
    }

}
