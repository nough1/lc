package com.nou.lc;

/**
 * 注意的一个点 ： l1 跟 l2 注意要移动
 */
public class LC2 {

    // 243  + 465
    public ListNode addTwoNumbers(ListNode l1,ListNode l2){


        int forward= 0;
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (l1!=null || l2!=null||forward==1){

            if(l1!=null){
                forward+=l1.val;
                l1= l1.next;
            }
            if(l2!=null){
                forward+=l2.val;
                l2 =l2.next;
            }
            current.next = new ListNode(forward%10);
            current = current.next;
            forward = forward/10;

        }

        return dummy.next;

    }
}
