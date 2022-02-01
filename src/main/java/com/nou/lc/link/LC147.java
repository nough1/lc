package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * insertion sort list
 * https://leetcode.com/problems/insertion-sort-list/
 * date:2022-01-31 15:48
 * 思路: 先理解插入排序的概念 , 然后遍历每一个元素,当发现顺序不对时，开始找到
 * 插入的正确位置
 */
public class LC147 {

    public ListNode insertionSortList(ListNode head) {


        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode pre = dummy;
        ListNode current = head;

        while(current!=null){

            // 找到正确的位置 .
            if(current.next!=null && current.next.val<current.val){

                // 找到正确的位置进行插入

                while (pre.next!=null && pre.next.val<current.next.val){

                    pre = pre.next;
                }


                ListNode temp = pre.next;
                pre.next = current.next;
                current.next = current.next.next;
                pre.next.next = temp;

                pre = dummy;

            }else{
                current = current.next;
            }

        }
        return dummy.next;
    }

}
