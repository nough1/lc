package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * partition list
 * date: 2022-01-31 15:24\
 * 思路:遍历链表，进行分堆，然后再进行合并堆
 * 修正 : 变量名修改，更容易理解
 */
public class LC86 {

    public ListNode partition(ListNode head, int x) {


        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode current = head;

        ListNode leftTail = new ListNode(-1);

        ListNode leftHead = leftTail;

        ListNode rightTail = new ListNode(-1);
        ListNode rightHead = rightTail;

        while (current!=null){

            if(current.val<x){

                leftTail.next = current;
                leftTail = leftTail.next;

            }else{

                rightTail.next = current;
                rightTail = rightTail.next;
            }
            current = current.next;
        }

        leftTail.next = rightHead.next;
        rightTail.next = null;
        return leftHead.next;
    }
}
