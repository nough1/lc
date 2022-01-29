package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * 删除排序链表中的重复元素
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 * 思路: 链表遍历 , 下面是比较精简的写法,通过循环控制变量移动，
 */
public class LC83 {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode currentNode = head;
        while (currentNode!=null && currentNode.next!=null){

            if(currentNode.val==currentNode.next.val){
                currentNode.next = currentNode.next.next;
            }else{
                currentNode = currentNode.next;
            }

        }
        return head;
    }
}
