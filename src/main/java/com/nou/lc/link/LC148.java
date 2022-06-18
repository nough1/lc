package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * 排序链表
 * https://leetcode.com/problems/sort-list/
 * 解题思路 : 归并排序递归解法 ,先拆成两部分，然后进行合并 , 但是这个是 o(n) 的空间，
 * 所以需要使用 bottom up  的做法.
 */
public class LC148 {

    public ListNode sortList(ListNode head) {

        if(head==null||head.next==null){
            return head;
        }

        // split two part
        ListNode left = head;
        ListNode right = getMid(head);
        ListNode temp = right.next;
        right.next=null;
        right = temp;
        left = sortList(left);
        right = sortList(right);

        return merge(left,right) ;
    }

    public ListNode merge(ListNode left,ListNode right){

        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        while (left!=null && right!=null){

            if(left.val< right.val){

                tail.next = left;
                left = left.next;

            }else{

                tail.next = right;
                right = right.next;

            }
            tail = tail.next;
        }

        if(left!=null){

            tail.next = left;

        }

        if(right!=null){
            tail.next = right;
        }

        return dummy.next;
    }

    public ListNode getMid(ListNode head){

        ListNode slow = head,fast = slow.next;

        while (fast!=null && fast.next!=null){

            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
