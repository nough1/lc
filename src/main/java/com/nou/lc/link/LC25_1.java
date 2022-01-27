package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 *  k组翻转链表
 */
public class LC25_1 {

    public ListNode reverseKGroup(ListNode head, int k){

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode p = dummy;

        while (true) {


            ListNode q = p;
            for (int i = 0; i < k; i++) {

                if (q != null) {
                    q = q.next;
                }
            }

            if (q == null) {
                return dummy.next;
            }

            ListNode a = p.next;
            ListNode b = a.next;

            // 一个组内翻转

            for(int i=0;i<k-1;i++){

                ListNode c = b.next;
                b.next = a ;
                // 临时存储 b 后面的节点 .
                a = b;
                b = c ;

            }
            // 组内首节点 next 调整
            ListNode c = p.next;
            c.next = b;

            // 组前节点的 next 调整

            p.next = a;

            // 指针移动到组内的最后一个 .

            p = c;

        }
    }
}
