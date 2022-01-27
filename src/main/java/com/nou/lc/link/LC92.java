package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 *
 * 这个需要动脑思考比较多，因为涉及的细节比较多 .可以通过画图工具进行画图解决,但是又一个思路是进行拆解，比如先把 m->n 的进行翻转，然后再进行左右
 * 端点的调整 .
 */
public class LC92 {

    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head==null){
            return null ;
        }

        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;


        return dummyNode.next;

    }
}
