package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * 删除排序链表中的重复元素
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 * 思路: 链表遍历 ,
 */
public class LC83 {

    public ListNode deleteDuplicates(ListNode head) {

        if(head==null||head.next==null){
            return head;
        }


        ListNode newLinkList = head;

        ListNode tail = head;

        // 遍历列表 , 将不存在的插入到新链表的尾部
        ListNode current = head.next;
        while (current!=null) {

            if(tail.val!=current.val){
                tail.next = current;
                tail = tail.next;
            }
            current = current.next;

        }
        tail.next = null;
        return newLinkList;
    }
}
