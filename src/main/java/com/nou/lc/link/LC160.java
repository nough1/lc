package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * 相交链表,思路如果想到的话，比较简单,通过走路相遇的算法可以解决
 */
public class LC160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode p = headA;
        ListNode q = headB;

        while (p!=q){

            p = ( p!=null ? p.next:headB );
            q = (q!=null?q.next:headA);

        }

        return p ;
    }

    /**
     * 获取相交的节点
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNodeNew(ListNode headA, ListNode headB) {

        ListNode a = headA , b= headB;
        while (a!=b){

            a = a!=null?a.next:headB;
            b = b!=null?b.next:headA;

        }

        return a;
    }

}
