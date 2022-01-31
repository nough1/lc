package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * rotate link list
 * https://leetcode.com/problems/rotate-list/
 * date : 2022.01.31 14:52
 * 思路 : 找到需要修改的点 , 然后进行 next 修改,总共需要修改4个节点的指针
 */
public class LC61 {

    public ListNode rotateRight(ListNode head, int k) {

        if(head==null){
            return head;
        }

        // 计算链表的长度
        int n=0;
        ListNode current = head;
        ListNode tail = null ;
        while (current!=null){

            n++;
            tail = current;
            current = current.next;

        }

        k = k%n;

        // 找到 第 n-k个元素
        int index = 0 ;
        int nkPosition = n-k-1;
        current = head;
        while(current!=null && index<nkPosition){

            current = current.next;
            index++;

        }

        // 第一个子链表尾节点设置为空,修改头节点

        tail.next = head;
        head = current.next;
        current.next = null ;

        return head;

    }
}
