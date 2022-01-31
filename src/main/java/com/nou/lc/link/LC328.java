package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * odd even linked list
 * https://leetcode.com/problems/odd-even-linked-list/
 * date : 2022.01.31 14:11
 * 思路: 维护两个子链表
 */
public class LC328 {

    public ListNode oddEvenList(ListNode head) {

        if(head==null||head.next==null){
            return head;
        }

        ListNode oh = head,ot=oh;
        ListNode eh =  head.next, et = eh;
        ListNode current = head.next.next;

        while (current!=null){

            ot.next = current;
            ot = ot.next;
            current = current.next;
            if(current!=null) {
                et.next = current;
                et = et.next;
                current = current.next;
            }
        }
        ot.next = eh;
        System.out.println(et.next.val);
        // 关键点，这一步设置为空，一定要，因为实际上是在原有的链表基础上，所以每一个节点的 next 都需要做修改
        et.next = null ;
        return oh;
    }
}
