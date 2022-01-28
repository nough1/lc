package com.nou.lc.link;

import com.nou.lc.ListNode;

/**
 * reorder singly link list
 * https://leetcode.com/problems/reorder-list/
 */
public class LC143 {

    // 思路,将两个链表拼接起来
    public void reorderList(ListNode head) {

        if(head==null || head.next==null){
            return ;
        }

        // find the first part start and end position , second part
        // start and end position

        // fist part end node
        ListNode pre = null ;

        // second part start node
        ListNode slow = head;


        ListNode fast = head;
        while (fast!=null && fast.next!=null){

            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        pre.next = null ;

        // 后面的链表进行反转

        ListNode reverseNode =  reverse(slow);

        printLinkList(head);
        printLinkList(reverseNode);

        // 两部分进行合并

        merge(head,reverseNode);
    }

    public void printLinkList(ListNode head){

        ListNode currentNode = head;
        while (currentNode!=null){


            System.out.println(currentNode.val);
            currentNode = currentNode.next;

        }

    }

    /**
     * 链表反转
     * @param head
     */
    public ListNode reverse(ListNode head){

        if(head==null || head.next==null){
            return head ;
        }

        ListNode pre = null ;
        ListNode current = head;
        while(current!=null){

            ListNode oldNextNode = current.next;
            current.next = pre;
            pre = current;
            current = oldNextNode;
        }

        return  pre;
    }

    /**
     * 将链表的两个部分进行合并
     * @param l1
     * @param l2
     */
    public void merge(ListNode l1,ListNode l2){

        if(l1==null){
            return;
        }
        while (l1!=null){

            ListNode oldL1NextNode = l1.next;
            ListNode oldL2NextNode = l2.next;
            l1.next = l2;
            //这里为什么要这样写 .
            if(oldL1NextNode==null){
                break;
            }
            l2.next = oldL1NextNode;
            l1 = oldL1NextNode;
            l2 = oldL2NextNode;
        }
    }

}
