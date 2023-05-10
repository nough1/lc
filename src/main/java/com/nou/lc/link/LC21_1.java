package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * review the question before the interview
 *
 * https://leetcode.com/problems/merge-two-sorted-lists/solutions/9715/java-1-ms-4-lines-codes-using-recursion/?orderBy=most_votes
 *
 * 这个题目居然有两种解法，之前没发现 .
 *
 * 但是迭代的写法自己居然想不起啥写了
 *
 */
public class LC21_1 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // use two point to solve this

        ListNode dummy = new ListNode();
        ListNode current = dummy;
        ListNode l1 = list1;
        ListNode l2 = list2;

        while (l1!=null && l2!=null){


            if(l1.val>l2.val){
                current.next = l2;
                l2 = l2.next;
            }else{
                current.next = l1;
                l1 = l1.next;
            }

            current = current.next;

        }

        current.next = l1!=null?l1:l2;

        return dummy.next;
    }
}
