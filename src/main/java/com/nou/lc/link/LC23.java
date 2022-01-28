package com.nou.lc.link;

import com.nou.lc.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * k 路归并
 * https://leetcode.com/problems/merge-k-sorted-lists/
 * 实际上是查找K 个数里的最小值的问题，使用最小堆可以做到 logk 的时间复杂度.
 */
public class LC23 {

    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(new Comparator<ListNode>() {

            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }


        });

        // 1. 初始化 .
        for(ListNode listNode:lists){

            if(listNode!=null) {
                priorityQueue.add(listNode);
            }


        }

        // 2.初始化新链表

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        while (!priorityQueue.isEmpty()){

            ListNode listNode = priorityQueue.poll();
            tail.next = listNode;
            tail = tail.next;
            if(listNode.next!=null){
                priorityQueue.add(listNode.next);
            }
        }
        return dummy.next;
    }

}
