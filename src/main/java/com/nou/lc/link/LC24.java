package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * 两两交换节点
 */
public class LC24 {

    public ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode a = dummy;

        while(a.next!=null && a.next.next!=null){

            // first step , 定义三个指针变量
            ListNode b  = a.next;
            ListNode c = b.next;

            // second step : 为什么更新顺序是按照从前往后
            a.next = c;
            b.next = c.next;
            c.next = b;

            // third step : 开启下一个循环，但是为什么正确的是 a=b; 之前自己写成 a= c;
            a = c;

        }

        return dummy.next;

    }


}
