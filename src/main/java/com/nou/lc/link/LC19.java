package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * remove nth node from end of list
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * 思路1: 先遍历一次 , 计算链表的长度 , 然后计算正向的位置.
 */
public class LC19 {


    public ListNode removeNthFromEnd(ListNode head, int n) {

        // 第一步:计算链表的长度
        int length = 0 ;
        ListNode current = head;
        while (current!=null){

            length++;
            current = current.next;

        }

        System.out.println("length:"+length);
        // 第二步 : 计算倒数第 k 个的正向位置

        int position = length-n;

        int index = 0;


        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        current = dummy;
        while (current!=null){

            // 这个在前面还是在后面影响很大，没有想清楚，得模拟下.
            if(index>=position){
                break;
            }
            current = current.next;
            index++;

        }
        System.out.println("index:"+index+current);
        current.next=current.next.next;

        return dummy.next;
    }
}
