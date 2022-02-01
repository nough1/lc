package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * merge in between list
 * https://leetcode.com/problems/merge-in-between-linked-lists/
 * date:2022-02-01 15:31
 * 思路: 先找到 a b, 两个的位置，然后调整指针即可 .
 */
public class LC1669 {

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {


        ListNode start = list1;

        int index = 0;
        while (start!=null && index<(a-1)){

            start = start.next;
            index++;
        }



        ListNode end = start.next;

        start.next = list2;

        index = 0;
        while (end!=null && index<(b-a)){

            end = end.next;
            index++;
        }

        ListNode current = list2;

        while (current.next!=null){

            current = current.next;

        }

        current.next = end.next;

        return list1;

    }


}
