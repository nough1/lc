package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * partly reverse singly linked list
 * https://leetcode.com/problems/reverse-linked-list-ii/
 * 思路 : 这道题实际上用到了很多链表的基础知识，比如反转 ,
 */
public class LC92_1 {

    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        // 第一步，先进行 m 到 n 之间的节点进行反转 .

        ListNode leftNode = head;

        for(int i=0;i<left-2;i++){

            leftNode = leftNode.next;

        }

        // 第二步骤 : 反转 left 到 right

        if(left==right){
            return dummy.next;
        }

        ListNode changeNode = leftNode.next.next;
        ListNode preNode = leftNode.next;
        ListNode originalNextNode = null;

        for(int i=0;i<right-left;i++){

            originalNextNode = changeNode.next;
            changeNode.next = preNode;
            preNode = changeNode;
            changeNode = originalNextNode;
        }

        // 第三步 : 修改头部两个的指针
        leftNode.next.next = originalNextNode;
        leftNode.next = preNode;
        return dummy.next;
    }
}
