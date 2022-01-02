package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * 链表 k 组反转 ,
 * 这个题目有两个理解误区
 * 一个是在内部反转的时候， before ,after 的操作，必须借助相对变量 , 而不是用 a = a.next 这种
 * 第二个坑一组之后是在 a , b 最终的指向位置的理解 .
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
