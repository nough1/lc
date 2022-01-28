package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * reorder singly link list
 * https://leetcode.com/problems/reorder-list/
 */
public class LC143 {

    // 思路,将两个链表拼接起来
    public void reorderList(ListNode head) {

        if(head==null || head.next==null){
            return ;
        }

        // find the first part start and end position , second part
        // start and end position

        // fist part end node
        ListNode pre = null ;

        // second part start node
        ListNode slow = head;


        ListNode fast = head;
        while (fast!=null && fast.next!=null){

            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        pre.next = null ;

        // 后面的链表进行反转

        reverse(slow);

        // 两部分进行合并

        merge(head,slow);
    }

    /**
     * 链表反转
     * @param head
     */
    public void reverse(ListNode head){

        if(head==null || head.next==null){
            return;
        }

        ListNode pre = null ;
        ListNode current = head;
        while(current!=null){

            pre = current;
            current.next.next = current;
            current = current.next;
        }

    }

    /**
     * 将链表的两个部分进行合并
     * @param l1
     * @param l2
     */
    public void merge(ListNode l1,ListNode l2){

        if(l1==null){
            return;
        }
        while (l1!=null){



        }
    }

}
