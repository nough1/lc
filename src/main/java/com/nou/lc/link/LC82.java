package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii/
 * 删除排序链表中的循环元素II
 * 思路: 两层循环，遍历每一个节点，然后循环遍历子元素相等的情况，进行后移, 这道题还是比较难写的
 * 还是得多练 .
 */
public class LC82 {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode currentNode = dummy;
        while (currentNode.next!=null){

            ListNode firstNode = currentNode.next;
            ListNode secondNode = currentNode.next.next;

            // 找到第一个不相等的节点 .
            while(secondNode!=null && firstNode.val==secondNode.val){
                secondNode = secondNode.next;
            }

            if(firstNode.next==secondNode){

                // 下一个是无重复的情况,继续往后面遍历 .

                currentNode = currentNode.next;

            }else{

                // 下一个是有重复的情况,删除重复的元素

                currentNode.next = secondNode;
            }

        }

        return dummy.next;
    }
}
