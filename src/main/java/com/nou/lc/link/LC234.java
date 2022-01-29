package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * 回文链表
 * https://leetcode.com/problems/palindrome-linked-list/
 *
 * 思路 : 将后半部分进行反转,然后一一比对,
 *
 */
public class LC234 {

    public boolean isPalindrome(ListNode head) {

        if(head==null||head.next==null){
            return true;
        }

        // 第一步，找到中间节点的位置 ，分成两个链表 , 第一个是 head -> preSlow , 第二个是 slow 到 fast
        ListNode preSlow = null ;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){

            preSlow = slow;
            slow = slow.next;
            fast = fast.next.next;

        }

        preSlow.next = null ;

        // 第二步，将后面的链表进行反转

        ListNode changeNode = slow.next;
        ListNode preNode = slow ;
        while(changeNode!=null){

            ListNode originalChangeNodeNextNode = changeNode.next;
            changeNode.next = preNode;

            preNode = changeNode;

            changeNode = originalChangeNodeNextNode;

        }

        // 遍历两个链表
        ListNode l1 = head;
        ListNode l2 = preNode;
        while (l1!=null && l2!=null){

            if(l1.val==l2.val){
                l1 = l1.next;
                l2 = l2.next;
            }else{
                return false;
            }

        }
        if(l1==null||l2==null){
            return true;
        }
        return false;
    }
}
