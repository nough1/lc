package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * 206 递归写法
 * https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class LC206_RECURSIVE {

    public ListNode reverseList(ListNode head){

        ListNode newHead = null;
        return reverse(head,newHead);

    }

    public ListNode reverse(ListNode head,ListNode newHead){

        if(head==null){
            return newHead ;
        }
        ListNode headNextNode = head.next;
        head.next = newHead;
        newHead = head;
        head = headNextNode;

        return  reverse(head,newHead);

    }
}
