package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * 合并两个有序链表
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * 思路 : 二路归并算法
 */
public class LC21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummyNode = new ListNode(-1);
        ListNode tail = dummyNode;
        while (list1!=null && list2!=null){

            if(list1.val<list2.val){
                tail.next = list1;
                list1 = list1.next;
            }else{
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;

        }

        if(list1!=null){
            tail.next = list1;
        }
        if(list2!=null){
            tail.next = list2;
        }

        return dummyNode.next;
    }
}
