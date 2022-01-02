package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * 链表 k 组反转
 */
public class LC25 {

    public ListNode reverseKGroup(ListNode head, int k) {


        // 定义虚拟头节点
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode groupHeadBeforeNode = dummy;
        while(groupHeadBeforeNode!=null) {

            // 1. 遍历判断是否 有 k 个

            ListNode current = groupHeadBeforeNode;
            for (int i = 0; i < k; i++) {

                if (current == null) {
                    break;
                }
                current = current.next;

            }



            if(current==null){
                return dummy.next;
            }

            // 2. 组内k 个元素遍历反转

            ListNode pre = groupHeadBeforeNode.next;
            ListNode after = pre.next;
            for(int i=0;i<k-1;i++){

                // 修改之前要临时保存，因为指向已经发生变化
                ListNode temp = after.next;
                after.next = pre;
                // 这里写的有问题 problem
                //pre = pre.next;
                pre = after;
                after = temp;

            }

            // 3.这里有坑
            ListNode temp = groupHeadBeforeNode.next;
            temp.next = after;
            groupHeadBeforeNode.next = pre;
            groupHeadBeforeNode = temp;


        }


        return dummy.next;

    }
}
